 /**
 * Representa la sucursal en Espana
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @author 
 * @version 1
 */
public class TiendaEspana extends Sucursal{

   public TiendaEspana() {
        idioma = new Espanol();
		moneda = new Euro();
        super.carga(new CatalogoCheems());
	}
   
    @Override
    public Divisa getDivisa(){
        return moneda;
    }

	public void aplicaDesc(){
        
    }

	public void notifica(){}

}