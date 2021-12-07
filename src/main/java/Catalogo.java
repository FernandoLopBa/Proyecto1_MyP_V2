import java.util.Iterator;
import java.util.LinkedList;
/**
 * Representa un catalogo para la sucursal
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @author López Balcazar Fernando
 * @version 1
 */
public class Catalogo{
    //la lista de prodcutos del catalogo
    private LinkedList<Producto> productos;

    public Catalogo(){
        productos = new LinkedList<Producto>();
    }

    /**
     * Agrega un prodcuto a la lista de prodcutos del catalogo
     * @param codigo de barras el codido de barras del prodcuto
     * @param nombre el nombre del prodcuto
     * @param descripcion la descripcion del prodcuto
     * @param precio el precio del producto
     * @param departamento el departamento del producto
     */
    public void agrega(int codigoBarras, String nombre, String descripcion,
                        int precio, Departamento departamento){
        Producto p = new Producto(codigoBarras, nombre, descripcion, precio, departamento);
        agrega(p);
    }

    /**
     * Agrega un producto al catalogo
     * @param p el prodcuto a agregar 
     */
    public void agrega(Producto p){
        productos.add(p);
    }

    /**
     * Agrega un producto al catalogo
     * @param p el prodcuto a agregar 
     */
    public void elimina(Producto p){
        productos.remove(p);
    }

    
    /** 
     * Devuelve un iterador para iterar el iterable
     * @return una instancia de Iterator
     */
    public Iterator<Producto> getIterator(){
        return productos.iterator();
    }


    /**
     * Representacion en cadena de un producto
     * @return la representacion en cadena
     */
    @Override
    public String toString(){
        String res = "";
        Iterator<Producto> it = getIterator();
        while(it.hasNext()){
            Producto p = it.next();
            res+=p.toString();
        }
        return res;
    }
    
}