import java.util.LinkedList;

public interface Idioma {
    
    public String saludar(CuentaCliente cliente);

    public String menuInicio();

    public String eleccion();

    public String introduzcaContasena();

    public String fallarContrasena(int intentos);

    public String completarCompra(boolean correcta);

    public String despedir(CuentaCliente cliente);

    public String eleccionInvalida();

    public String fechaEntrega(int[] fecha);

    public String mostrarOferta(String nombre, String producto, int descuento);

    public String comprar();
}
