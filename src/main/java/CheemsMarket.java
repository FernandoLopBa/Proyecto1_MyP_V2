import java.util.Scanner;
import java.util.LinkedList;

public class CheemsMarket {
    /**Creacion de los clientes */
    private static Cliente rosa = new Cliente("Rosa",551311767,
    "Tennyson 133, Polanco, Miguel Hidalgo, 11570, Ciudad de México, CDMX", "Mexico");
    private static Cliente arturo = new Cliente("Arturo",557354953,
    "Dakota s/n, Nápoles, Benito Juárez, 03810, Ciudad de México, CDMX", "Espana");
    private static Cliente ricardo = new Cliente("Ricardo", 557639448,
    "Montañas Calizas 210, Lomas de Chapultepec, Miguel Hidalgo, 11000, Ciudad de México, CDMX", "USA");
    
    /**Creacion de las cuentas */
    private static CuentaCliente cuentaRosa = new CuentaCliente(rosa, 
    "Tsunakidevilla", "contrasenadeCuenta", "123456", 5000);
    private static CuentaCliente cuentaArturo = new CuentaCliente(arturo,
    "R2D2", "cuenta123", "clave123", 8000);
    private static CuentaCliente cuentaRicardo = new CuentaCliente(ricardo, 
    "Ricchie", "misterio123", "lamassegura", 9000);

    /* Creación de las sucursales. */
    private static Sucursal tiendaMx = new TiendaMexico();
    private static Sucursal tiendaUSA = new TiendaUSA();
    private static Sucursal tiendaEs = new TiendaEspana();
    
    private static LinkedList<Sucursal> sucursales = new LinkedList<>();


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int eleccion;
        CuentaCliente cliente = null;
        Sucursal sucursal = null;

        tiendaMx.registrar(cuentaRosa);
        tiendaEs.registrar(cuentaArturo);
        tiendaUSA.registrar(cuentaRicardo);

        sucursales.add(tiendaEs);
        sucursales.add(tiendaMx);
        sucursales.add(tiendaUSA);

        actualizaSucursales();
        
        do{
            System.out.println("\n¡¡¡BIENVENID@ A CHEEMSMART!!!\n");
            System.out.println("Le pedimos que se identifique");
            System.out.println("Elija su usuario/ Pick a user:\t0) Terminar/Finish");
            System.out.println("\t\t\t\t1) Rosa \t2) Arturo\t3) Ricardo");
	    System.out.printf("Elección/ Your choice: ");
            eleccion = in.nextInt();
            switch(eleccion){
                case 0:
                    System.exit(0);
                case 1:
                    cliente = cuentaRosa;
                    break;
                case 2:
                    cliente = cuentaArturo;
                    break;
                case 3:
                    cliente = cuentaRicardo;
                    break;
                default:
                    System.out.println("Cliente no identificado");
                    System.exit(0);
            }

            if(cliente.getPais() == "Mexico")
                sucursal = tiendaMx;
            else if(cliente.getPais() == "Espana")
                sucursal = tiendaEs;
            else if(cliente.getPais() == "USA")
                sucursal = tiendaUSA;
            else{
                System.out.println("Lo sentimos, no tenemos sucursal disponible");
                System.exit(0);
            }

            System.out.println(sucursal.saludar(cliente));
            String intento;
            for(int i = 0; i < 3; i++){
                System.out.printf(sucursal.introduzcaContrasena());
                intento = in.next();
                if(!cliente.checaContrasenia(intento)){
                    System.out.println(sucursal.fallarContrasena(2-i));
                    if(i == 2)
                        System.exit(0);
                }else
                    break;
            }

            while(eleccion != 0){
                System.out.println(sucursal.menuInicio());
                System.out.print(sucursal.eleccion());
                eleccion = in.nextInt();
                switch(eleccion){
                    case 1: 
                        System.out.println(sucursal.getCatalogo());
                        break;
                    case 2:
                        String s = sucursal.comprar(cliente);
                        System.out.println(s);
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println(sucursal.eleccionInvalida());
                }
            }
            System.out.println(sucursal.despedir(cliente)+"\n");
            eleccion = 1;
        }while(eleccion != 0);
    }

    /**
     * Actualiza las sucursales de la tienda CheemsMarket.
     */
    private static void actualizaSucursales(){
        for(Sucursal s : sucursales){
            s.cargaCheems();
            s.creaDescuentos();
        }
    }
}
