import java.util.LinkedList;

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
     * Manda a llamar carga de la clase padre para crear el catalogo
	 */
    public TiendaMexico() {
        idioma = new Espanol();
		moneda = new Peso();
        clientes = new LinkedList<CuentaCliente>();
		super.carga(new CatalogoCheems());
	}
    
    /**
     * Crea los descuentos de Comida
     */
    @Override
    public void creaDescuentos(){
        super.reiniciaDescuentos();
        super.crearDescuentos("Abarrotes");
    }

    /**
     * Regresa la divisa
     * @return la divisa
     */
    @Override
    public Divisa getDivisa(){
        return moneda;
    }

}
