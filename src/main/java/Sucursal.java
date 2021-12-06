import java.util.LinkedList;
import java.lang.Math;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;
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

    public abstract Divisa getDivisa();

    public String getCatalogo(){
        String res = "";
        Iterator<Producto> it = catalogo.values().iterator();
        while(it.hasNext()){
            Producto p = it.next();
            res+=p.mostrarProducto(getDivisa())+"\n";
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

    public abstract void creaDescuentos();

    public void crearDescuentos(String departamento){
        Iterator<Producto> it = catalogo.values().iterator();
        while(it.hasNext()){
            Producto p = it.next();
            int descuento;
            if(p.getDepartamento().getDepartamento().equals(departamento)){
                descuento = (int)(Math.random()*3);
                if(descuento % 3 == 0){
                    descuento = (int)(Math.random()*10+1)*5;
                    p.setDescuento(descuento);
                }
            }else{
                descuento = (int)(Math.random()*3);
                if(descuento % 7 == 0){
                    descuento = (int)(Math.random()*10+1)*5;
                    p.setDescuento(descuento);
                }
            }
        }
    }

    public void reiniciaDescuentos(){
        Iterator<Producto> it = catalogo.values().iterator();
        while(it.hasNext()){
            Producto p = it.next();
            p.setDescuento(0);
        }
    }

    public void cargaCheems(){
    	carga(new CatalogoCheems());
    }

    public Producto busca(int barras){
        return catalogo.get(barras);
    }


    public String comprar(CuentaCliente cliente){
        System.out.println(idioma.comprar());
        Scanner sc = new Scanner(System.in);
        int cb = sc.nextInt();
        do{
            Producto p = busca(cb);
            cliente.agrega(p);
            cb = sc.nextInt();
        }while(cb!=0);
        //sc.close();
        boolean bandera = cliente.paga(getDivisa()); //regresa un booleano
        if(bandera) System.out.println(fechaEntrega());
        return completarCompra(bandera);
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

    public String introduzcaContrasena(){
        return idioma.introduzcaContasena();
    }

    public String fallarContrasena(int intentos){
        return idioma.fallarContrasena(intentos);
    }

    public String menuInicio(){
        return idioma.menuInicio();
    }

    public String eleccion(){
        return idioma.eleccion();
    }

    public String eleccionInvalida(){
        return idioma.eleccionInvalida();
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

    public void notifica(){
        Iterator<Producto> it = catalogo.values().iterator();
        while(it.hasNext()){
            Producto p = it.next();
            if(p.getDescuento() > 0){
                for(CuentaCliente c : clientes){
                    System.out.println(c.getNombreReal() + ", tenemos ofertas en "
                    + p.getNombre() + " del " + p.getDescuento() + "%%");
                }
            }
        }
    }

}