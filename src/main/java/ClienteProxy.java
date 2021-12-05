import java.util.Scanner;

public class ClienteProxy implements InterfazBanco{

    private Tarjeta tarjeta;

    public ClienteProxy(Tarjeta tarjeta){
        this.tarjeta = tarjeta;
    }

    public boolean saca(double monto){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la clave de tu tarjeta: ");
        String clave = sc.nextLine();
        if(tarjeta.getContrasena().equals(clave)){
            sc.close();
            return tarjeta.saca(monto);
            
        }        
        System.out.println("Emergencia 911 hombre con ataque cardiaco");
        sc.close();
        return false;
    }

    public void mete(double monto){
        tarjeta.mete(monto);
    }

}
