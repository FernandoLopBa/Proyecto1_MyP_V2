import java.util.Iterator;
import java.util.LinkedList;
/**
 * Clase con que representa la informacion de un Cliente
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @author López Balcazar Fernando
 * @version 1
 */
public class CuentaCliente implements Observador{

    private String nombreUsuario;
    private String contrasena;

    private String nombreReal;
    private int telefono;
    private String pais;
    private String direccion;

    private float saldo;

    private String oferta = "";

    private String noCuenta;
    private Carrito carrito;

    /**
     * Constructor de la clase CuentaCliente
     */
    public CuentaCliente(Cliente c, String nombreUsuario, String contrasena, 
                        String noCuenta, float saldo){
        this.nombreReal = c.getNombre();
        this.telefono = c.getTelefono();
        this.pais= c.getPais();
        this.direccion = c.getDireccion();
        
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.noCuenta = noCuenta;
        this.saldo = saldo;

        carrito = new Carrito();
    }


    /**
     * Obtiene el nombre real del cliente
     * @return el nombre real del cliente
     */
    public String getNombreReal(){
        return nombreReal;
    }
    

    /**
     * Obtiene el numero de telefono del cliente
     * @return el numero de telefono del cliente
     */
    public int getTelefono(){
        return telefono;
    }

    
    /**
     * Obtiene el pais del cliente
     * @return el pais del cliente
     */
    public String getPais(){
        return pais;
    }


    /**
     * Obtiene la direccion del cliente
     * @return la direccion del cliente
     */
    public String getDireccion(){
        return direccion;
    }


    /**
     * Obtiene el nombre de usuario del cliente
     * @return el nombre de usuario del cliente
     */
    public String getUsuario(){
        return nombreUsuario;
    }


    /**
     * Obtiene la contrasena del cliente
     * @return la contrasena del cliente
     */
    public String getContrasena(){
        return contrasena;
    }


    /**
     * Obtiene el numero de cuenta del cliente
     * @return el numero de cuenta del cliente
     */
    public String getNoCuenta(){
        return noCuenta;
    }


    /**
     * Obtiene el saldo del cliente
     * @return el saldo del cliente
     */
    public float getSaldo(){
        return saldo;
    }


    /**
     * Cambia el saldo del cliente
     * @param nuevo saldo del cliente
     */
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }


    /**
     * Agrega un producto al carrito de compras
     * @param producto el producto a agregar al carrito
     */
    public void agrega(Producto producto){
        if(producto != null)
        carrito.agrega(producto);
    }


    /**
     * Elimina un producto al carrito de compras
     * @param producto el producto a eliminar al carrito
     */
    public void elimina(Producto producto){
        carrito.elimina(producto);
    }

    
    /**
     * Actualiza la informacion que tiene el cliente sobre los descuentos
     * @param ofertas las ofertas del sujeto
     * @param idioma el idioma en que se va a presentar
     */
    @Override
    public void actualiza(LinkedList<Producto> ofertas, Idioma idioma){
        for(Producto p : ofertas){
            System.out.println(idioma.mostrarOferta(nombreReal, p.getNombre(), p.getDescuento()));
        }
    }


    /**
     * Metodo que se encarga de mostrar una oferta 
     * @return la oferta 
     */
    public String mostrarOferta(){
        return oferta;
    }


    /**
     *
     */
    public String mostrarCarro(Divisa divisa){
        String res = "";
        Iterator<Producto> it = carrito.getIterator();
        while(it.hasNext()){
            Producto p = it.next();
            res+=p.mostrarProducto((divisa))+"\n";
        }
        return res;

    }


    /**
     * 
     */
    public boolean paga(Divisa divisa){
        //el total de la compra
        float total = 0;
        Iterator<Producto> it = carrito.getIterator();
        //vamos sumando el precio comprando si tiene descuento
        while(it.hasNext()){
            Producto p = it.next();
            if(p.getDescuento() > 0 ) total += p.precioPostDescuento();
            else total += p.getPrecio();
        }
        //mostramos el carro
        System.out.println(mostrarCarro(divisa));
        
        //System.out.println("\t\t\t\t"+cambio2);
        // System.out.println("PIN: "+getNoCuenta());
        //pero hacemos las cuentas con el dinero "real"
        InterfazProxy proxy = new Proxy(new Tarjeta());
        boolean exito = proxy.saca(this, total);
        //mostramos el total
//        System.out.println("Ahora: "+divisa.getEquivalencia(saldo));
//        System.out.println(exito);
        carrito.vacia();
        return exito;
    }   

    
    /**
     * Verifica si la contrasena que pasa como parametro es correcta
     * @param intento el intento de poner bien la contrasena 
     * @return devuelve true si es correcta y false si no lo es
     */
    public boolean checaContrasenia(String intento){
    	return contrasena.equals(intento);
    } 
}
