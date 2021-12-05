public abstract class Departamento{
    public abstract String getDepartamento();

    public abstract int getDescuento();

    public abstract boolean tieneDescuento();

    public String getCadenaDescuento(){
        if(getDescuento() > 0)
            return "";
        return String.format("Departamento de %s tiene el %d%% de descuento!!!",
         getDepartamento(),getDescuento());
    }
}