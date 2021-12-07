import java.util.Iterator;
import java.util.LinkedList;
/**
 * Un carrito de compras para el cliente
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @author López Balcazar Fernando
 * @version 1
 */
public class Carrito{
    //una lista de productos
    private LinkedList<Producto> productos;

    public Carrito(){
        productos = new LinkedList<>();
    }


    /**
     * Agrega producto a la lista
     * @param producto el producto a agregar
     */
    public void agrega(Producto producto){
        //if (producto != null)
        productos.add(producto);
    }


    /**
     * Eliminamos producto de la lista
     * @param producto el producto a eliminar
     */
    public void elimina(Producto producto){
        productos.remove(producto);
    }


    /**
     * Devuelve un iterator para iterar el iterable
     * @return una instancia de Iterator
     */
    public Iterator<Producto> getIterator(){
        return productos.iterator();
    }


    /**
     * Limpia la lista de productos
     */
    public void vacia(){
        productos.clear();
    }
}