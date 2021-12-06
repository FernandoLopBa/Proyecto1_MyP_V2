import java.util.LinkedList;

/**
 * Representa la sucursal en USA
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @author 
 * @version 1
 */
public class TiendaUSA extends Sucursal{

    /**
	 * Constructor de la clase TiendaUSA
     * Manda a llamar carga de la clase padre para crear el catalogo
     */
   public TiendaUSA() {
        idioma = new English();
		moneda = new DollarUSD();
        clientes = new LinkedList<CuentaCliente>();
		super.carga(new CatalogoCheems());
	}
  
    /**
     * Crea los descuentos de electronica
     */
    @Override
    public void creaDescuentos(){
        super.reiniciaDescuentos();
        super.crearDescuentos("Electronica");
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