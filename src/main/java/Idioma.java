package main.java;

import java.util.LinkedList;

public interface Idioma {
    
    public String saludar(CuentaCliente cliente);

    public String completarCompra(boolean correcta);

    public String depedir(CuentaCliente cliente);

    public String fechaEntrega(int[] fecha);

    public String mostrarOfertas(LinkedList<Producto> ofertas);
}
