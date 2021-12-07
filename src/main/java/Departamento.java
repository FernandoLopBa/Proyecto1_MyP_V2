/**
 * Departamento para los productos
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @author López Balcazar Fernando
 * @version 1
 */

public abstract class Departamento{

    /**
     * Regresa el nombre del departamento 
     * @return el nombre del departamento
     */
    public abstract String getDepartamento();


    /**
     * Regresa el descuento que tiene el departamento
     * @return el descuento del departamento
     */
    public abstract int getDescuento();


    /**
     * Nos dice si el departamento tiene descuento
     * @return true si el departamento tiene descuento
     */
    public abstract boolean tieneDescuento();


    /**
     * Nos mustra el desceunto del departamento
     * @return el descuento que hay en el departamento
     */
    public String getCadenaDescuento(){
        if(getDescuento() > 0)
            return "";
        return String.format("Departamento de %s tiene el %d%% de descuento!!!",
         getDepartamento(),getDescuento());
    }
}