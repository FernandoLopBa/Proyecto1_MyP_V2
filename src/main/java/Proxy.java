import java.util.Scanner;
/**
 * Representante para manejar el dinero del cliente
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @author López Balcazar Fernando
 * @version 1
 */

public class Proxy implements InterfazProxy{
    //Tarjeta que va a realizar las operaciones sobre el cliente
    Tarjeta tarjeta;

    public Proxy(Tarjeta tarjeta){
        this.tarjeta = tarjeta;
    }

    /**
     * Saca el dinero de la cuenta del cliente verificando que tenga suficiente saldo
     * @param cuenta la cuenta a modifcar
     * @param monto el monto a sacar
     * @return true si tuvo suficiente saldo, false en otro caso
     */
    @Override
    public boolean saca(CuentaCliente cuenta, float monto){
        Scanner sc = new Scanner(System.in);
        System.out.print("PIN: ");
        //solicita la contrasena
        String clave = sc.nextLine();
        if(cuenta.getNoCuenta().equals(clave)){
            return tarjeta.saca(cuenta, monto);
        }        
        //sc.close();
        return false;
    }


    /**
     * Saca el dinero de la cuenta del cliente verificando que tenga suficiente saldo
     * @param cuenta la cuenta a modifcar
     * @param monto el monto a sacar
     * @return true si tuvo suficiente saldo, false en otro caso
     */
    @Override
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
