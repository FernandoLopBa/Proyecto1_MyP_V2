public class Producto{
    private int codigoBarras;
    private String nombre;
    private String descripcion;

    private int precio;
    private int descuento = 0;

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

    public int getDescuento(){
        return descuento;
    }

    public float precioPostDescuento(){
        return (float)(precio * (1-descuento*0.01));
    }

    public void setPrecio(int precio){
        this.precio = precio;
    }

    public void setDescuento(int descuento){
        this.descuento = descuento;
    }

    public String getNombreDepartamento(){
        return departamento.getDepartamento();
    }

    public String oferta(Divisa divisa){
        if(descuento > 0)
            return String.format(" => %s (-%d%%)!!!",
                divisa.getEquivalenciaCadena(precioPostDescuento()), getDescuento());
        return "";
    }

    public String mostrarProducto(Divisa divisa){
	    return String.format("-%s\t%s\t%s\t%s%s\t%s\t\t%s",
		getCB(), 
        getNombre(), 
        getDescripcion(), 
        divisa.getEquivalenciaCadena(getPrecio()), 
        "",        
        oferta(divisa), 
        departamento.getDepartamento());
    }
    //cb, nombre, descrip, precio 
    //
}
