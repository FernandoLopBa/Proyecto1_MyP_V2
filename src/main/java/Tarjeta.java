package main.java;

public class Tarjeta{

    private String nombre;
    private String usuario;
    private String contrasena;
    private double dinero;

    public String getDinero(){
        return nombre;
    }

    public String getUsuario(){
        return usuario;
    }

    public String getContrasena(){
        return contrasena;
    }

    public void saca(double monto){
        this.dinero = monto;
    }

}