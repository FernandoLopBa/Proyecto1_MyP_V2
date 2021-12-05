import java.util.Scanner;
public class Tarjeta implements InterfazBanco{

    private double dinero;
    private String clave;

    public Tarjeta(double dinero, String clave){
        this.dinero= dinero;
        this.clave = clave;
    }
    
    public boolean saca(Scanner sc, double monto){
        if(dinero<monto) return false;
        dinero -= monto;
        sc.close();
        return true;
    }

    public void mete(double monto){
        dinero += monto;
    }

    public String getContrasena(){
        return clave;
    }
    
    public double getDinero(){
        return dinero;
    }
}
