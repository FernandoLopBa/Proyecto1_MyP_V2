
 /**
 * Representa la sucursal en Mexico
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @author 
 * @version 1
 */
public class TiendaMexico extends Sucursal{

   public TiendaMexico() {
        idioma = new Espanol();
		moneda = new Peso();
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