import java.util.Iterator;
//import java.util.Scanner;
public class CuentaCliente{

    private String nombreUsuario;
    private String contrasena;

    private String nombreReal;
    private int telefono;
    private String pais;
    private String direccion;

    private float saldo;

    private String oferta = "";

    //private Tarjeta tarjeta;

    private String noCuenta;
    private Carrito carrito;

    public CuentaCliente(Cliente c, String nombreUsuario, String contrasena, 
                        String noCuenta, float saldo){
        this.nombreReal = c.getNombre();
        this.telefono = c.getTelefono();
        this.pais= c.getPais();
        this.direccion = c.getDireccion();
        
        this.nombreReal = nombreUsuario;
        this.contrasena = contrasena;
        this.noCuenta = noCuenta;
        this.saldo = saldo;

        carrito = new Carrito();
    }


    public String getNoCuenta(){
        return noCuenta;
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

    public float getSaldo(){
        return saldo;
    }

    public void setSaldo(float saldo){
        this.saldo = saldo;
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

    public boolean paga(Divisa divisa){
        float real = divisa.getEquivalencia(saldo);
        System.out.println("$"+real);
        //el precio total de las cosas
        float total = 0;
        Iterator<Producto> it = carrito.getIterator();
        while(it.hasNext()){
            Producto p = it.next();
            total+=p.getPrecio();
        }
        //el precio lo convertimos a la divisa
        float res = divisa.getEquivalencia(total);
        InterfazProxy proxy = new Proxy(new Tarjeta());
        //regresa verdadero si la compra fue exitosa
        System.out.println("Total"+res);
        boolean bandera = proxy.saca(this, res);
        System.out.println("$"+real);
        return bandera;
    }   


    public boolean checaContrasenia(String intento){
	return contrasena.equals(intento);
    }
    
}
