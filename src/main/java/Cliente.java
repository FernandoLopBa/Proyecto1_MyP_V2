/**
 * Una clase cliente xd no hay mas
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @author López Balcazar Fernando
 * @version 1
 */
public class Cliente{

    private String nombre;
    private int telefono;
    private String direccion;
    private String pais;

    public Cliente(String nombre, int telefono, String direccion, String pais){
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.pais = pais;

    }


    /**
     * Regresa el nombre del cliente
     * @return el nombre del cliente
     */
    public String getNombre(){
        return nombre;
    }


    /**
     * Regresa el telefono del cliente
     * @return el telefono del cliente
     */
    public int getTelefono(){
        return telefono;
    }


    /** 
     * Regresa la direccion del cliente
     * @return la direccion del cliente
     */
    public String getDireccion(){
        return direccion;
    }


    /**
     * Regresa el pais
     * @return el pais
     */
    public String getPais(){
        return pais;
    }

}
