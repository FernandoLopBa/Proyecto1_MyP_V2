
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
		super.carga(new CatalogoCheems());
	}
  
    @Override
    public Divisa getDivisa(){
        return moneda;
    }

	public void aplicaDesc(){
        
    }

	public void notifica(){
        if(descuento >0){
            for(CuentaCliente c: clientes){
                c.actualiza("Tenemos descuento en electronica!");
            }
        }
    }

}