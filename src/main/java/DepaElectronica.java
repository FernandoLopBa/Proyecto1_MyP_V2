/**
 * Departamento para los productos
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @author López Balcazar Fernando
 * @version 1
 */

public class DepaElectronica extends Departamento{

    private static String nombre = "Electronica";

    private int descuento;

    /**
     * Regresa el nombre del departamento 
     * @return el nombre del departamento
     */
	@Override
	public String getDepartamento() {
		return nombre;
	}


    /**
     * Regresa el descuento que tiene el departamento
     * @return el descuento del departamento
     */
	@Override
	public int getDescuento() {
		return descuento;
	}


   /**
     * Nos dice si el departamento tiene descuento
     * @return true si el departamento tiene descuento
     */ 
	@Override
	public boolean tieneDescuento() {
		return descuento > 0;
	}


	/**
	 * Cambia el descuento del departamento
	 * @param descueto el nuevo descuento del departamento
	 */
	public void setDescuento(int descuento){
		this.descuento = descuento;
	}

}