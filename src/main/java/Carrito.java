package main.java;
import java.util.LinkedList;
import java.util.Iterator;

public class Carrito{

    private CuentaCliente cuenta;
    private LinkedList<Producto> productos;

    public Carrito(CuentaCliente cuenta){
        this.cuenta = cuenta;

    }

    public void agrega(Producto producto){
        productos.add(producto);
    }

    public void elimina(Producto producto){
        productos.remove(producto);
    }

    public Iterator<Producto> getIterator(){
        return productos.iterator();
    }
}