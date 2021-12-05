import java.util.Iterator;
import java.util.LinkedList;

public class Catalogo{
    private LinkedList<Producto> productos;

    public Catalogo(){
        productos = new LinkedList<Producto>();
    }

    public void agrega(int codigoBarras, String nombre, String descripcion,
                        int precio, Departamento departamento){
        Producto p = new Producto(codigoBarras, nombre, descripcion, precio, departamento);
        agrega(p);
    }

    public void agrega(Producto p){
        productos.add(p);
    }

    public void elimina(Producto producto){
        productos.remove(producto);
    }

    public Iterator<Producto> getIterator(){
        return productos.iterator();
    }

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