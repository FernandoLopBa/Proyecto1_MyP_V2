public class Producto{
    private int codigoBarras;
    private String nombre;
    private String descripcion;
    private int precio;
    private Departamento departamento;

    public Producto(int codigoBarras, String nombre, String descripcion,
                    int precio, Departamento departamento){
        this.codigoBarras = codigoBarras;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.departamento = departamento;
    }

    public int getCB(){
        return codigoBarras;
    }

    public String getNombre(){
        return nombre;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public int getPrecio(){
        return precio;
    }

    public Departamento getDepartamento(){
        return departamento;
    }

    public void setPrecio(int precio){
        this.precio = precio;
    }

    public String getNombreDepartamento(){
        return departamento.getDepartamento();
    }

    public String mostrarProducto(Divisa divisa){
	    return String.format("-%s\t%s\t%s\t%s\t%s",
		getCB(), getNombre(), getDescripcion(), 
        divisa.getEquivalenciaCadena(getPrecio()), departamento.getDepartamento());
    }
}
