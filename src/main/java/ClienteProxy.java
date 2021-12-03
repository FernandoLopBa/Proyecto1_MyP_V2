package main.java;
import java.util.Scanner;
public class ClienteProxy implements InterfazBanco{

    private Tarjeta tarjeta;

    public ClienteProxy(Tarjeta tarjeta){
        this.tarjeta = tarjeta;
    }

    public void saca(double monto){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la clave de tu tarjeta: ");
        String clave = sc.nextLine();
        if(clave.equals(tarjeta.getContrasena()))
        tarjeta.saca(monto);
        sc.close();

    }

}