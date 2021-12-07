/**
 * Clase que representa el Idioma English
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @author López Balcazar Fernando
 * @version 1
 */
public class English implements Idioma{

    /**
     * Se encarga de saludar en su idioma al cliente 
     * @param cliente cliente a saludar
     * @return el saludo al cliente
     */
    @Override
    public String saludar(CuentaCliente cliente) {
        return "Welcome, " + cliente.getNombreReal() + "!!!";
    }

    /**
     * Se despide del cliente en su idioma 
     * @return la desdesdida al cliente 
     */
    @Override
    public String despedir(CuentaCliente cliente) {
        return "Come back soon, " + cliente.getNombreReal() + " :)";
    }

    /**
     * Muestra un mensaje para que el cliente introduzca su contrasena
     * @return mensaje para que el cliente introduzca su contrasena
     */
    @Override
    public String introduzcaContasena(){
	return "Insert password: ";
    }

    /**
     * Muestra un mensaje de que el cliente puso mal la contrasena y 
     * el numero de intentos que le quedan
     * @param intentos numero de intentos para poner bien la contrasena 
     * @return el mensaje del numero de intentos que le quedan al cliente 
     */
    @Override
    public String fallarContrasena(int intentos){
	return "Invalid password. " + intentos + " left...";
    }

    /**
     * Muestra el menu de inicio en su idioma al cliente
     * @return muestra el menu en el idioma del cliente
     */
    @Override
    public String menuInicio(){
	return "What action do you want to do?\t0) Finish\n" + 
		"\t\t\t\t1) See catalog\t2) Buy";
    }
/**
     * Imprime un mensaje en el idioma del cliente para cuando vaya 
     * a realizar una compra 
     * @return mensaje para cuando el cliente vaya a realizar una compra
     */
    @Override
    public String comprar(){
        return "Choice your products  and 0 to finish: ";
    }

    /**
     * Dependiendo del valor del paramtro, imprime un mensaje en el idioma 
     * del cliente que dice si la compra fue completada correctamente o no
     * @param correcta es true si la compra fue completada correctamente o
     * false si no lo fue
     * @return mensaje que dice si la compra fue completada correctamente o no
     */
    @Override
    public String completarCompra(boolean correcta) {
        if(correcta)
            return "Purchase completed succesfully!!!";
        else
            return "Purchase NOT completed correctly!!!";
    }

    /**
     * Muestra un mensaje en el idioma del cliente con la oferta de un producto
     * @param nombre el nombre del cliente al que se le ofrece la oferta
     * @param producto el producto que tiene la oferta
     * @param descuento el descuento que tiene el producto
     * @return el mensaje con la oferta de un producto
     */
    @Override
    public String mostrarOferta(String nombre, String producto, int descuento) {
        return String.format("%s, we have %d%% off in %s",
		    nombre, descuento, producto);
    }

    /**
     * Muestra al cliente la fecha de entrega de su compra
     * @param fecha la fecha de entrega de la compra
     * @return un mensaje con la fecha de entrega
     */
    @Override
    public String fechaEntrega(int[] fecha) {
        String[] monts = {"January", "February", "March", "April", "May",
                          "June", "July", "August", "September", 
                          "October", "November", "December"};
        return String.format("Estimated delivery date: %s %d, %d.",
                            monts[fecha[1]], fecha[0], fecha[2]);
    }

    /**
     * Imprime un mensaje en el idioma del cliente para que haga su eleccion
     * @return el mensaje para que el cliente haga su eleccion
     */
    @Override
    public String eleccion(){
	    return "Enter your choice: ";
    }

    /**
     * Muestra un mensaje al cliente en su idioma que su eleccion es invalida
     * @return mensaje de eleccion invalida al cliente 
     */
    @Override
    public String eleccionInvalida(){
    	return "Invalid choice...";
    }
}
