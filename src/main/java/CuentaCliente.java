package main.java;

import java.util.Iterator;
import java.util.LinkedList;

public class CuentaCliente{

    private String nombreUsuario;
    private String contrasena;
    private String nombreReal;
    private int telefono;
    private String nacionalidad;
    private Cliente cliente;
    private InterfazBanco tarjeta;
    private int saldo;
    private Carrito carrito;


    public void agrega(Producto producto){
        carrito.agrega(producto);
    }

    
    public void elimina(Producto producto){
        carrito.elimina(producto);
    }

    public String getNombreReal(){
        return nombreReal;
    }

    public String mostrarCarro(){
        String res = "";
        Iterator<Producto> it = carrito.getIterator();
        while(it.hasNext()){
            Producto p = it.next();
            res+=p.toString();
        }
        return res;

    }

    public void paga(int total){

    }
}