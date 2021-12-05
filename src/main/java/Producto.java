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

    public String toString(){
        return "- "+getCB()+"\t\t"+getNombre()+"\t\t"+
        getDescripcion()+"\t\t"+getPrecio()+"\t"+getDepartamento().getDepartamento()+"\n";
                                            //regresa el departamento, regresa el String
    }

    public void setPrecio(int precio){
        this.precio = precio;
    }

    public String getNombreDepartamento(){
        return departamento.getDepartamento();
    }
}