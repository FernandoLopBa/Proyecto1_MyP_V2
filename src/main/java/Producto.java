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
    
    /**
     * Regresa el codigo de barras del prodcuto
     * @return el codigo de barras
     */
    public int getCB(){
        return codigoBarras;
    }

    /**
     * Regresa el nombre del prodcuto
     * @return el nombre del producto
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * Regresa la descripcion del producto
     * @return la descripcion del producto
     */
    public String getDescripcion(){
        return descripcion;
    }

    /**
     * Regresa el precio del producto
     * @return el precio del producto  
     */
    public int getPrecio(){
        return precio;
    }

    /**
     * Regresa el departamento del prodcuto
     * @return el departamento
     */
    public Departamento getDepartamento(){
        return departamento;
    }

    /**
     * Regresa el descuento del producto
     * @return el descuento
     */
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
	    return String.format("-%s\t%s\t%s\t%s%s\t%s",
		getCB(), 
        getNombre(), 
        getDescripcion(), 
        divisa.getEquivalenciaCadena(getPrecio()), 
        oferta(divisa), 
        departamento.getDepartamento());
    }
    //cb, nombre, descrip, precio 
    //
}
