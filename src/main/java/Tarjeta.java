/**
 * Representa Tarjeta para manipular el dinero del cliente
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @author López Balcazar Fernando
 * @version 1
 */

public class Tarjeta implements InterfazProxy{

    /**
     * Saca el dinero de la cuenta del cliente verificando que tenga suficiente saldo
     * @param cuenta la cuenta a modifcar
     * @param monto el monto a sacar
     * @return true si tuvo suficiente saldo, false en otro caso
     */
    @Override
    public boolean saca(CuentaCliente cuenta, float monto){

        //System.out.println(cuenta.getSaldo());
        //System.out.println(monto);

        if(cuenta.getSaldo() > monto){
            cuenta.setSaldo(cuenta.getSaldo()-monto);
            return true;
        } 
        return false;
    }


    /**
     * Mete el dinero de la cuenta del cliente
     * @param cuenta la cuenta a modifcar
     * @param monto el monto a meter
     * @return true si la operacion fue exitosa
     */
    @Override
    public boolean mete(CuentaCliente cuenta, float monto){
        cuenta.setSaldo(cuenta.getSaldo()+monto);
        return true;
    }

}
