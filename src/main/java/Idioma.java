import java.util.LinkedList;

public interface Idioma {
    
    public String saludar(CuentaCliente cliente);

    public String completarCompra(boolean correcta);

    public String despedir(CuentaCliente cliente);


    public String fechaEntrega(int[] fecha);

    public String mostrarOfertas(LinkedList<Producto> ofertas);
}
