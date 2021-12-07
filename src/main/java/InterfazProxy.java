/**
 * Interfaz para el manejo del dinero del cliente
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @author López Balcazar Fernando
 * @version 1
 */

public interface InterfazProxy{

    /**
     * Saca el dinero de la cuenta del cliente verificando que tenga suficiente saldo
     * @param cuenta la cuenta a modifcar
     * @param monto el monto a sacar
     * @return true si tuvo suficiente saldo, false en otro caso
     */
    public boolean saca(CuentaCliente cuenta, float monto);

    /**
     * Mete el dinero de la cuenta del cliente
     * @param cuenta la cuenta a modifcar
     * @param monto el monto a meter
     * @return true si la operacion fue exitosa
     */

    public boolean mete(CuentaCliente cuenta, float monto);

}
