import java.util.LinkedList;

public class Espanol implements Idioma{

    @Override
    public String saludar(CuentaCliente cliente) {
        return "Bienvenido, " + cliente.getNombreReal() + "!!!";
    }

    @Override
    public String menuInicio(){
	return "¿Qué acción desea realizar?\t0) Terminar\n" + 
		"\t\t\t\t1) Ver catálogo\t2) Comprar";
    }

    @Override
    public String eleccion(){
	    return "Introduzca su elección: ";
    }

    @Override
    public String introduzcaContasena(){
	return "Introduzca contraseña de la cuenta: ";
    }

    @Override
    public String fallarContrasena(int intentos){
	return "Contraseña incorrecta.\nQuedan " + intentos + " intentos";
    }

    @Override
    public String eleccionInvalida(){
	return "Opción no válida...";
    }
    
    @Override
    public String completarCompra(boolean correcta) {
        if(correcta)
            return "Compra completada correctamente!!!";
        else
            return "No se pudo completar su compra :(";
    }

    @Override
    public String despedir(CuentaCliente cliente) {
        return "Hasta luego, vuelva pronto, " + cliente.getNombreReal();
    }

    @Override
    public String fechaEntrega(int[] fecha) {
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo",
                          "junio", "julio", "agosto", "septiembre",
                          "octubre", "noviembre", "diciembre"};

        return String.format("Fecha estimada de entrega el %d de %s del %d."
                                , fecha[0], meses[fecha[1]], fecha[2]);
    }

    @Override
    public String mostrarOferta(String nombre, String producto, int descuento) {
        return String.format("%s, Tenemos %d%% de descuento en %s",
		    nombre, descuento, producto);
    }

    @Override
    public String comprar(){
        return "Escoge tus productos y 0 para finalizar : ";
    }
}
