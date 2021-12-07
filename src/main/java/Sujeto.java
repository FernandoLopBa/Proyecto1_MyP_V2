/**
 * Interfaz para el Sujeto
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @author López Balcazar Fernando
 * @version 1
 */

public interface Sujeto{

    /**
     * Registra la cuenta de cliente a la lista del sujeto
     * @param cuenta la cuenta a registrar
     */
    public void registrar(CuentaCliente cuenta);

    /**
     * Elimina la cuenta del cliente de la lista del sujeto
     * @param cuenta la cuenta a eliminar
     */
    public void elimina(CuentaCliente cuenta);

    /**
     * Notifica las ofertas a los clientes de la lista
     */
    public void notifica();
}