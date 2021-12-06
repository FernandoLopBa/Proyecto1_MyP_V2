import java.util.LinkedList;

/**
 * Representa la sucursal en USA
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @author 
 * @version 1
 */
public class TiendaUSA extends Sucursal{

   public TiendaUSA() {
        idioma = new English();
		moneda = new DollarUSD();
        clientes = new LinkedList<CuentaCliente>();
		super.carga(new CatalogoCheems());
	}
  
    @Override
    public void creaDescuentos(){
        super.reiniciaDescuentos();
        super.crearDescuentos("Electronica");
    }

    @Override
    public Divisa getDivisa(){
        return moneda;
    }


	public void notifica(){
        if(descuento >0){
            for(CuentaCliente c: clientes){
                c.actualiza("Tenemos descuento en electronica!");
            }
        }
    }

}