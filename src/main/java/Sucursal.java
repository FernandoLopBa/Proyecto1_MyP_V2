import java.lang.Math;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
/**
 * Representa la sucursal de tiendas Cheemsmart
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @author López Balcazar Fernando
 * @version 1
 */
public abstract class Sucursal implements Sujeto{
    
    /* Clientes de la sucursal. */
    protected LinkedList<CuentaCliente> clientes;  
    /* Catalogo de productos. */  
    protected Hashtable<Integer, Producto> catalogo;

    /* Lista de ofertas usada para implementar Observer. */
    protected LinkedList<Producto> ofertas = new LinkedList<>();

    /* Descuento del producto. */
    protected int descuento;

    /* Idioma que maneja la sucursal. */
    protected Idioma idioma;
    /* Moneda manejada en la sucursal. */
    protected Divisa moneda;

    /* Fecha ''actual'' de la sucursal. */
    private static int[] fecha = {6, 11, 2021};

    /**
     *  Regresa la divisa que se maneja en la sucursal.
     *  @return la divisa que se maneja en la sucursal. 
     */
    public abstract Divisa getDivisa();

    /**
     * Regresa el catálogo que tiene la sucursal.
     * @return el catálogo que tiene la sucursal.
     */
    public String getCatalogo(){
        String res = "";
        Iterator<Producto> it = catalogo.values().iterator();
        while(it.hasNext()){
            Producto p = it.next();
            res+=p.mostrarProducto(getDivisa())+"\n";
        }
        return res;
    }

    /**
     * Carga un catálogo en la sucursal.
     * @param catal el catálogo a cargar.
     */
    public void carga(Catalogo catal){
        catalogo = new Hashtable<>();
        Iterator<Producto> it = catal.getIterator();
        while(it.hasNext()){
            Producto p = it.next();
            catalogo.put(p.getCB(), p);
        }
    }

    /**
     * Método abstracto para crear descuentos con preferencia.
     */
    public abstract void creaDescuentos();

    /**
     * Crea los descuentos con preferencia hacía un departamento.
     * @param departamento el departamento que tiene preferencia. 
     */
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
                    ofertas.add(p);
                }
            }else{
                descuento = (int)(Math.random()*3);
                if(descuento % 7 == 0){
                    descuento = (int)(Math.random()*10+1)*5;
                    p.setDescuento(descuento);
                    //En caso de querer únicamente las ofertas de ese departamento comentar esta línea.
                    ofertas.add(p);
                }
            }
        }
        this.notifica();
        System.out.println("");
    }

    /**
     * Reinicia los descuentos de todos los productos.
     */
    public void reiniciaDescuentos(){
        Iterator<Producto> it = catalogo.values().iterator();
        while(it.hasNext()){
            Producto p = it.next();
            p.setDescuento(0);
        }
        ofertas.clear();;
    }

    /**
     * Carga el catálogo principal que se usará para este proyecto.
     */
    public void cargaCheems(){
    	carga(new CatalogoCheems());
    }

    /**
     * Busca un artículo en el catálogo.
     * @param barras el código de barras que se usará en la búsqueda.
     * @return el producto que coincida con el código de barras.
     */
    public Producto busca(int barras){
        return catalogo.get(barras);
    }

    /**
     * Agrega productos al carrito del cliente y efectua el pago al terminar.
     * @param cliente el cliente que llevará a cabo la compra.
     * @return una cadena con el estado de la compra..
     */
    public String comprar(CuentaCliente cliente){
        System.out.println(idioma.comprar());
        Scanner sc = new Scanner(System.in);
        int cb = sc.nextInt();
        do{
            Producto p = busca(cb);
            cliente.agrega(p);
            cb = sc.nextInt();
        }while(cb!=0);
        boolean bandera = cliente.paga(getDivisa()); //regresa un booleano
        if(bandera) System.out.println(fechaEntrega());
        return completarCompra(bandera);
    }

    /**
     * Se encarga de saludar en su idioma al cliente 
     * @param cliente cliente a saludar
     * @return el saludo al cliente
     */
    public String saludar(CuentaCliente cliente){
        return idioma.saludar(cliente);
    }

    /**
     * Se despide del cliente en su idioma 
     * @return la desdesdida al cliente 
     */
    public String despedir(CuentaCliente cliente){
        return idioma.despedir(cliente);
    }

    /**
     * Muestra un mensaje para que el cliente introduzca su contrasena
     * @return mensaje para que el cliente introduzca su contrasena
     */
    public String introduzcaContrasena(){
        return idioma.introduzcaContasena();
    }

    /**
     * Muestra un mensaje de que el cliente puso mal la contrasena y 
     * el numero de intentos que le quedan
     * @param intentos numero de intentos para poner bien la contrasena 
     * @return el mensaje del numero de intentos que le quedan al cliente 
     */
    public String fallarContrasena(int intentos){
        return idioma.fallarContrasena(intentos);
    }

    /**
     * Muestra el menu de inicio en su idioma al cliente
     * @return muestra el menu en el idioma del cliente
     */
    public String menuInicio(){
        return idioma.menuInicio();
    }

    /**
     * Dependiendo del valor del paramtro, imprime un mensaje en el idioma 
     * del cliente que dice si la compra fue completada correctamente o no
     * @param correcta es true si la compra fue completada correctamente o
     * false si no lo fue
     * @return mensaje que dice si la compra fue completada correctamente o no
     */
    public String completarCompra(boolean correcta){
        return idioma.completarCompra(correcta);
    }

    /**
     * Crea una fecha estimada de entrega.
     * @return la cadena con la fecha de entrega estimada.
     */
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

    /**
     * Imprime un mensaje en el idioma del cliente para que haga su eleccion
     * @return el mensaje para que el cliente haga su eleccion
     */
    public String eleccion(){
        return idioma.eleccion();
    }

    /**
     * Muestra un mensaje al cliente en su idioma que su eleccion es invalida
     * @return mensaje de eleccion invalida al cliente 
     */
    public String eleccionInvalida(){
        return idioma.eleccionInvalida();
    }

    /**
     * Registra a un cliente en la sucursal.
     * @param cliente el cliente a registrar.
     */
    @Override
    public void registrar(CuentaCliente cliente){
        clientes.add(cliente);
    }

    /**
     * Elimina a un cliente en la sucursal.
     * @param cliente el cliente a remover.
     */
    @Override
    public void elimina(CuentaCliente cliente){
        clientes.remove(cliente);
    }

    /**
     * Notifica a los clientes de la sucursal siguiendo el patrón Observer.
     */
    @Override
    public void notifica(){
        System.out.println("");
        Iterator<CuentaCliente> it = clientes.iterator();
        while(it.hasNext()){
            CuentaCliente cliente = it.next();
            cliente.actualiza(ofertas, idioma);
        }
    }

}