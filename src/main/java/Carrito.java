import java.util.LinkedList;
import java.util.Iterator;

public class Carrito{

    private LinkedList<Producto> productos;

    public Carrito(){
        productos = new LinkedList<>();
    }

    public void agrega(Producto producto){
        //if (producto != null)
        productos.add(producto);
    }

    public void elimina(Producto producto){
        productos.remove(producto);
    }

    public Iterator<Producto> getIterator(){
        return productos.iterator();
    }
}