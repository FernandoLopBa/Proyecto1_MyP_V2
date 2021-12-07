/**
 * Clase que representa el Idioma
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @author López Balcazar Fernando
 * @version 1
 */
public interface Idioma {
    
    /**
     * Se encarga de saludar en su idioma al cliente 
     * @param cliente cliente a saludar
     * @return el saludo al cliente
     */
    public String saludar(CuentaCliente cliente);


    /**
     * Se despide del cliente en su idioma 
     * @return la desdesdida al cliente 
     */
    public String despedir(CuentaCliente cliente);


    /**
     * Muestra un mensaje para que el cliente introduzca su contrasena
     * @return mensaje para que el cliente introduzca su contrasena
     */
    public String introduzcaContasena();


    /**
     * Muestra un mensaje de que el cliente puso mal la contrasena y 
     * el numero de intentos que le quedan
     * @param intentos numero de intentos para poner bien la contrasena 
     * @return el mensaje del numero de intentos que le quedan al cliente 
     */
    public String fallarContrasena(int intentos);


    /**
     * Muestra el menu de inicio en su idioma al cliente
     * @return muestra el menu en el idioma del cliente
     */
    public String menuInicio();


    /**
     * Imprime un mensaje en el idioma del cliente para cuando vaya 
     * a realizar una compra 
     * @return mensaje para cuando el cliente vaya a realizar una compra
     */
    public String comprar();    


    /**
     * Dependiendo del valor del paramtro, imprime un mensaje en el idioma 
     * del cliente que dice si la compra fue completada correctamente o no
     * @param correcta es true si la compra fue completada correctamente o
     * false si no lo fue
     * @return mensaje que dice si la compra fue completada correctamente o no
     */
    public String completarCompra(boolean correcta);


    /**
     * Muestra un mensaje en el idioma del cliente con la oferta de un producto
     * @param nombre el nombre del cliente al que se le ofrece la oferta
     * @param producto el producto que tiene la oferta
     * @param descuento el descuento que tiene el producto
     * @return el mensaje con la oferta de un producto
     */
    public String mostrarOferta(String nombre, String producto, int descuento);


    /**
     * Muestra al cliente la fecha de entrega de su compra
     * @param fecha la fecha de entrega de la compra
     * @return un mensaje con la fecha de entrega
     */
    public String fechaEntrega(int[] fecha);


    /**
     * Imprime un mensaje en el idioma del cliente para que haga su eleccion
     * @return el mensaje para que el cliente haga su eleccion
     */
    public String eleccion();


    /**
     * Muestra un mensaje al cliente en su idioma que su eleccion es invalida
     * @return mensaje de eleccion invalida al cliente 
     */
    public String eleccionInvalida();


}
