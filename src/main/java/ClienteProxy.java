import java.util.Scanner;

public class ClienteProxy implements InterfazBanco{

    private Tarjeta tarjeta;

    public ClienteProxy(Tarjeta tarjeta){
        this.tarjeta = tarjeta;
    }

    public boolean saca(Scanner sc, double monto){
        System.out.print("Ingresa la clave de tu tarjeta: ");

        String clave = sc.next();

        if(tarjeta.getContrasena().equals(clave)){
            
            return tarjeta.saca(sc, monto);

        }        
        System.out.println("Emergencia 911 hombre con ataque cardiaco");
        sc.close();
        return false;
    }

    public void mete(double monto){
        tarjeta.mete(monto);
    }

}
