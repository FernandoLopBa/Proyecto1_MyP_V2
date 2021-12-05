import java.util.LinkedList;
import java.lang.Math;
import java.util.Hashtable;
import java.util.Iterator;
/**
 * Representa la sucursal de tiendas Cheemsmart
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @author López Balcazar Fernando
 * @version 1
 */
public abstract class Sucursal implements Sujeto{
    
    //los clientes de la sucursal
    protected LinkedList<CuentaCliente> clientes;    
    protected Hashtable<Integer, Producto> catalogo;
    protected int descuento;

    protected Idioma idioma;
    protected Divisa moneda;

    private static int[] fecha = {2, 11, 2021};


    public String getCatalogo(){
        String res = "";
        Iterator<Producto> it = catalogo.values().iterator();
        while(it.hasNext()){
            Producto p = it.next();
            res+=p.getDescripcion();
        }
        return res;
    }

    public void carga(Catalogo catal){
        catalogo = new Hashtable<>();
        Iterator<Producto> it = catal.getIterator();
        while(it.hasNext()){
            Producto p = it.next();
            catalogo.put(p.getCB(), p);
        }

    }

    public Producto busca(int barras){
        return catalogo.get(barras);
    }

    public String saludar(CuentaCliente cliente){
        return idioma.saludar(cliente);
    }

    public String completarCompra(boolean correcta){
        return idioma.completarCompra(correcta);
    }

    public String despedir(CuentaCliente cliente){
        return idioma.despedir(cliente);
    }

    public String fechaEntrega(){
        int diasEspera = (int)(Math.random()*15);
        fecha[0] += diasEspera;
        if(fecha[0] > 30){
            fecha[0] = fecha[0] % 30;
            fecha[1]++;
        }
        if(fecha[1] > 11){
            fecha[1] = (fecha[1] % 12);
            fecha[2]++;
        }
        return idioma.fechaEntrega(fecha);
    }

    public String mostrarOfertas(LinkedList<Producto> ofertas){
        return idioma.mostrarOfertas(ofertas);
    }

    public void registrar(CuentaCliente cliente){
        clientes.add(cliente);
    }

    public void elimina(CuentaCliente cliente){
        clientes.remove(cliente);
    }


}