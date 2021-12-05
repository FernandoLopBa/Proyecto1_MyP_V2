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

    public String getNombre(){
        return nombre;
    }

    public int getTelefono(){
        return telefono;
    }

    public String getDireccion(){
        return direccion;
    }

    public String getPais(){
        return pais;
    }

}
