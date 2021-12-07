import java.util.Iterator;
/**
 * Un catalogo especial para la sucursal
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @author López Balcazar Fernando
 * @version 1
 */
public class CatalogoCheems extends Catalogo{
    /** Catalogo cheems especial*/
    private Catalogo catalogo;

    public CatalogoCheems(){
        catalogo = new Catalogo();
        // Creamos una instancia de cada departamento.
        Departamento comida = new DepaComida();
        Departamento electronica = new DepaElectronica();
        Departamento electrodomesticos = new DepaElectrodomestico();
        // Creación de los productos, primero comida
        catalogo.agrega(2012,"Antrax pediátrico","Suplemento infantil",60,comida);
        catalogo.agrega(2013,"Detergente","comestible",40,comida);
        catalogo.agrega(2014,"Aguarras","bebible",90,comida);
        catalogo.agrega(2015,"Canicas","bonbochas",60,comida);
        catalogo.agrega(4393,"Huesitos","recalentado de Pujol",2100,comida);
        //electronica
        catalogo.agrega(1247,"Tenedor metálico","Tomacorriente",25,electronica);
        catalogo.agrega(4202,"iClone","Teléfono hintelijente",50000,electronica);
        catalogo.agrega(4245,"Ecsbocs Juan","Consolador de entretenimiento",9000,electronica);
        catalogo.agrega(3423,"Mairo pati","Videojuego", 1504, electronica);
        catalogo.agrega(6136,"Aletsa","Secretaria virual",900,electronica);
        //electrodomesticos
        catalogo.agrega(6804,"Lavaropas","ps lava la ropa",8000,electrodomesticos);
        catalogo.agrega(9850,"Planropa","ps plancharopa",7500,electrodomesticos);
        catalogo.agrega(7150,"Orno","Pa' recalentado",8000,electrodomesticos);
        catalogo.agrega(4890,"Lanpara","Mucha lus",9000,electrodomesticos);
        catalogo.agrega(6750,"Aspira a Dora","maquina de ruido infernal",5000,electrodomesticos);
    }

    /**
     * Representacion en cadena del catalogo
     * @return la representacion en cadena del catalogo
     */
    @Override
    public String toString(){
        return catalogo.toString();
    }


    /**
     * Devuelve un iterador para iterar el iterable xd
     * @return una instancia de Iterator
     */
    @Override
    public Iterator<Producto> getIterator(){
        return catalogo.getIterator();
    }


}
