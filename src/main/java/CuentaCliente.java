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

    public String mostrarCarro(Divisa divisa){
        String res = "";
        Iterator<Producto> it = carrito.getIterator();
        while(it.hasNext()){
            Producto p = it.next();
            res+=p.mostrarProducto((divisa))+"\n";
        }
        return res;

    }

    public boolean paga(Divisa divisa){
        //mustra el cambio devuelto
        float cambio = divisa.getEquivalencia(saldo);
        System.out.println("Antes: "+cambio);

        //el total de la compra
        float total = 0;
        Iterator<Producto> it = carrito.getIterator();
        while(it.hasNext()){
            Producto p = it.next();
            if(p.getDescuento() > 0 ) total += p.precioPostDescuento();
            else total += p.getPrecio();
        }
        //solo pa mostrar el total en la respectiva divisa
        float cambio2 = divisa.getEquivalencia(total);
        System.out.println("Total: "+cambio2);
        System.out.println("PIN: "+getNoCuenta());
        //pero hacemos las cuentas con el dinero "real"
        InterfazProxy proxy = new Proxy(new Tarjeta());
        boolean exito = proxy.saca(this, total);
        //mostramos el total
        System.out.println("Ahora: "+divisa.getEquivalencia(saldo));
        System.out.println(exito);
        return exito;

    }   


    public boolean checaContrasenia(String intento){
	return contrasena.equals(intento);
    }
    
}
