/**
 * Representa la sucursal en Mexico
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @author López Balcazar Fernando
 * @version 1
 */
public class TiendaMexico extends Sucursal{

	/**
	 * Constructor de la clase TiendaMexico
	 */
    public TiendaMexico() {
        idioma = new Espanol();
		moneda = new Peso();
		super.carga(new CatalogoCheems());
	}
    
    @Override
    public void creaDescuentos(){
        super.reiniciaDescuentos();
        super.crearDescuentos("Abarrotes");
    }

    @Override
    public Divisa getDivisa(){
        return moneda;
    }

}
