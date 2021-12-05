import java.util.Scanner;
public class Proxy implements InterfazProxy{

    Tarjeta tarjeta;

    public Proxy(Tarjeta tarjeta){
        this.tarjeta = tarjeta;
    }

    public boolean saca(CuentaCliente cuenta, float monto){
        Scanner sc = new Scanner(System.in);
        System.out.print("PIN: ");
        String clave = sc.nextLine();
        if(cuenta.getNoCuenta().equals(clave)){
            return tarjeta.saca(cuenta, monto);
        }        
        //sc.close();
        return false;
    }


    public boolean mete(CuentaCliente cuenta, float monto){
        Scanner sc = new Scanner(System.in);
        System.out.print("PIN: ");
        String clave = sc.nextLine();
        if(cuenta.getNoCuenta().equals(clave)){
            return tarjeta.mete(cuenta, monto);
        }        
        //sc.close();
        return false;
    }

}
