import java.util.Iterator;
import java.util.Scanner;
public class CuentaCliente{

    private String nombreUsuario;
    private String contrasena;

    private String nombreReal;
    private int telefono;
    private String pais;
    private String direccion;
    private double saldo;

    private String oferta = "";

    private Tarjeta tarjeta;
    private Carrito carrito;

    public CuentaCliente(Cliente c, String nombreUsuario, String contrasena){
        this.nombreReal = c.getNombre();
        this.telefono = c.getTelefono();
        this.pais= c.getPais();
        this.direccion = c.getDireccion();
        
        this.nombreReal = nombreUsuario;
        this.contrasena = contrasena;
        carrito = new Carrito();
    }


    public void vincula(Tarjeta tarjeta){
        this.tarjeta = tarjeta;
        this.saldo = tarjeta.getDinero();
    }


    public void agrega(Producto producto){
        if(producto != null)
        carrito.agrega(producto);
    }

    
    public void elimina(Producto producto){
        carrito.elimina(producto);
    }

    public void actualiza(String oferta){
        this.oferta= oferta;
    }

 
    public String getUsuario(){
        return nombreUsuario;
    }

    public String getContrasena(){
        return contrasena;
    }

    public String getNombreReal(){
        return nombreReal;
    }

    public int getTelefono(){
        return telefono;
    }

    public String getPais(){
        return pais;
    }

    public String getDireccion(){
        return direccion;
    }

    public double getSaldo(){
        return saldo;
    }

    public String mostrarCarro(){
        String res = "";
        Iterator<Producto> it = carrito.getIterator();
        while(it.hasNext()){
            Producto p = it.next();
            res+=p.toString();
        }
        return res;

    }

    public boolean paga(Scanner sc){
        int total = 0;
        Iterator<Producto> it = carrito.getIterator();
        while(it.hasNext()){
            Producto p = it.next();
            total+=p.getPrecio();
        }
        InterfazBanco proxy = new ClienteProxy(tarjeta);
        boolean bandera = proxy.saca(sc, total);
        return bandera;
    }   

    public boolean checaContrasenia(String intento){
	return contrasena.equals(intento);
    }
    
}
