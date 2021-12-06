import java.util.LinkedList;

public class English implements Idioma{

    @Override
    public String saludar(CuentaCliente cliente) {
        return "Welcome, " + cliente.getNombreReal() + "!!!";
    }

    @Override
    public String menuInicio(){
	return "What action do you want to do?\t0) Finish\n" + 
		"\t\t\t\t1) See catalog\t2) Buy";
    }

    @Override
    public String eleccion(){
	    return "Enter your choice: ";
    }

    @Override
    public String introduzcaContasena(){
	return "Insert password: ";
    }

    @Override
    public String fallarContrasena(int intentos){
	return "Invalid password. " + intentos + " left...";
    }

    @Override
    public String eleccionInvalida(){
	return "Invalid choice...";
    }
    
    @Override
    public String completarCompra(boolean correcta) {
        if(correcta)
            return "Purchase completed succesfully!!!";
        else
            return "Purchase NOT completed correctly!!!";
    }

    @Override
    public String despedir(CuentaCliente cliente) {
        return "Come back soon, " + cliente.getNombreReal() + " :)";
    }

    @Override
    public String fechaEntrega(int[] fecha) {
        String[] monts = {"January", "February", "March", "April", "May",
                          "June", "July", "August", "September", 
                          "October", "November", "December"};
        return String.format("Estimated delivery date: %s %d, %d.",
                            monts[fecha[1]], fecha[0], fecha[2]);
    }

    @Override
    public String comprar(){
        return "Choice your products  and 0 to finish: ";
    }

    @Override
    public String mostrarOferta(String nombre, String producto, int descuento) {
        return String.format("%s, we have %d%% off in %s",
		    nombre, descuento, producto);
    }
}
