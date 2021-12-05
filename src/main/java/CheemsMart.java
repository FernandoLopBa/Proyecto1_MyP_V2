import java.util.Scanner;

public class CheemsMart {
    /**Creacion de los clientes */
    private static Cliente rosa = new Cliente("Rosa",551311767,
    "Tennyson 133, Polanco, Miguel Hidalgo, 11570, Ciudad de México, CDMX", "Mexico");
    private static Cliente arturo = new Cliente("Arturo",557354953,
    "Dakota s/n, Nápoles, Benito Juárez, 03810, Ciudad de México, CDMX", "Espana");
    private static Cliente ricardo = new Cliente("Ricardo", 557639448,
    "Montañas Calizas 210, Lomas de Chapultepec, Miguel Hidalgo, 11000, Ciudad de México, CDMX", "USA");
    
    /**Creacion de las cuentas */
    private static CuentaCliente cuentaRosa = new CuentaCliente(rosa, 
    "Tsunakidevilla", "contrsenadeCuenta");
    private static CuentaCliente cuentaArturo = new CuentaCliente(arturo,
    "R2D2", "cuenta123");
    private static CuentaCliente cuetnaRicardo = new CuentaCliente(ricardo, 
    "Ricchie", "misterio123");
    /**Creacion de las tarjetas */
    private static Tarjeta tarjetaRosa = new Tarjeta(10500, "clave");    
    private static Tarjeta tarjetaArturo = new Tarjeta(9000, "123456789");
    private static Tarjeta tarjetaRicardo = new Tarjeta(5000, "lasmassegura");
    /**Vinculacion de las cuentas con la tarjetas */
    private static void vincula(){
        cuentaRosa.vincula(tarjetaRosa);
        cuentaArturo.vincula(tarjetaArturo);
        cuetnaRicardo.vincula(tarjetaRicardo);
    }

        
        
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int eleccion;
        CuentaCliente cliente;
        Sucursal sucursal;
        
        vincula();
        
        do{
            System.out.println("¡¡¡BIENVENID@ A CHEEMSMART!!!");
            System.out.println("Le pedimos que se identifique");
            System.out.printf("Elija su usuario: 1) Rosa\t2) Arturo\t3) Ricardo");
            eleccion = in.nextInt();
            switch(eleccion){
                case 1:
                    cliente = cuentaRosa;
                    break;
                case 2:
                    cliente = cuentaArturo;
                    break;
                case 3:
                    cliente = cuetnaRicardo;
                    break;
                default:
                    System.out.println("Cliente no identificado");
                    System.exit(1);
            }

            if(cliente.getPais() == "Mexico")
                sucursal = new TiendaMexico();
            else if(cliente.getPais() == "Espana")
                sucursal = new TiendaEspana();
            else if(cliente.getPais() == "USA")
                sucursal = new TiendaUSA();
            else{
                System.out.println("Lo sentimos, no tenemos sucursal disponible");
                System.exit(1);
            }
            
            while(true){
                System.out.println("¿Qué desea hacer?\t0) Terminar");
                System.out.println("\t\t\t1) Ver catálogo\t2) Comprar")
                System.out.printf("Usted desea: ");
                eleccion = in.nextInt();
                switch(eleccion){
                    case 1: 
                        System.out.println(sucursal.getCatalogo());
                        break;
                    case 2:
                        comprar();
                        break;
                    case 0:
                        terminar();
                        break;
                    default:
                        System.out.println("Opción no válida");
                        System.exit(1);
                }
            }
        }while(eleccion != 0);
    }
}