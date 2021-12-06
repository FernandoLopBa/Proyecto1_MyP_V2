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
    public void creaDescuentos(){
        super.reiniciaDescuentos();
        super.crearDescuentos("Electrodomesticos");
    }

    @Override
    public Divisa getDivisa(){
        return moneda;
    }   

}