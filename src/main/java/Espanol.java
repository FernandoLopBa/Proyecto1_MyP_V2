/**
 * Clase que representa el Idioma Espanol
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @author López Balcazar Fernando
 * @version 1
 */
public class Espanol implements Idioma{

    /**
     * Se encarga de saludar en su idioma al cliente 
     * @param cliente cliente a saludar
     * @return el saludo al cliente
     */
    @Override
    public String saludar(CuentaCliente cliente) {
        return "Bienvenido, " + cliente.getNombreReal() + "!!!";
    }

    /**
     * Se despide del cliente en su idioma 
     * @return la desdesdida al cliente 
     */
    @Override
    public String despedir(CuentaCliente cliente) {
        return "Hasta luego, vuelva pronto, " + cliente.getNombreReal();
    }

    /**
     * Muestra un mensaje para que el cliente introduzca su contrasena
     * @return mensaje para que el cliente introduzca su contrasena
     */
    @Override
    public String introduzcaContasena(){
	    return "Introduzca contraseña de la cuenta: ";
    }

    /**
     * Muestra un mensaje de que el cliente puso mal la contrasena y 
     * el numero de intentos que le quedan
     * @param intentos numero de intentos para poner bien la contrasena 
     * @return el mensaje del numero de intentos que le quedan al cliente 
     */
    @Override
    public String fallarContrasena(int intentos){
	    return "Contraseña incorrecta.\nQuedan " + intentos + " intentos";
    }
    
    /**
     * Muestra el menu de inicio en su idioma al cliente
     * @return muestra el menu en el idioma del cliente
     */
    @Override
    public String menuInicio(){
	return "¿Qué acción desea realizar?\t0) Terminar\n" + 
		"\t\t\t\t1) Ver catálogo\t2) Comprar";
    }

    /**
     * Imprime un mensaje en el idioma del cliente para cuando vaya 
     * a realizar una compra 
     * @return mensaje para cuando el cliente vaya a realizar una compra
     */
    @Override
    public String comprar(){
        return "Escoge tus productos por codigo de barras y 0 para finalizar : ";
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
            return "Compra completada correctamente!!!";
        else
            return "No se pudo completar su compra :(";
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
        return String.format("%s, Tenemos %d%% de descuento en %s",
		    nombre, descuento, producto);
    }


    /**
     * Muestra al cliente la fecha de entrega de su compra
     * @param fecha la fecha de entrega de la compra
     * @return un mensaje con la fecha de entrega
     */
    @Override
    public String fechaEntrega(int[] fecha) {
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo",
                          "junio", "julio", "agosto", "septiembre",
                          "octubre", "noviembre", "diciembre"};

        return String.format("Fecha estimada de entrega el %d de %s del %d."
                                , fecha[0], meses[fecha[1]], fecha[2]);
    }

    
    /**
     * Imprime un mensaje en el idioma del cliente para que haga su eleccion
     * @return el mensaje para que el cliente haga su eleccion
     */
    @Override
    public String eleccion(){
	    return "Introduzca su elección: ";
    }


    /**
     * Muestra un mensaje al cliente en su idioma que su eleccion es invalida
     * @return mensaje de eleccion invalida al cliente 
     */
    @Override
    public String eleccionInvalida(){
        return "Eleccion invalida";
    }

}
