package main.java;

import java.util.LinkedList;

public class English implements Idioma{

    @Override
    public String saludar(CuentaCliente cliente) {
        return "Welcome, " + cliente.getNombreReal() + "!!!";
    }

    @Override
    public String completarCompra(boolean correcta) {
        if(correcta)
            return "Purchase completed succesfully!!!";
        else
            return "Purchase NOT completed correctly!!!";
    }

    @Override
    public String depedir(CuentaCliente cliente) {
        return "Come back soon, " + cliente.getNombreReal() + " :)";
    }

    @Override
    public String fechaEntrega(int[] fecha) {
        String[] monts = {"January", "February", "March", "April", "May",
                          "June", "July", "August", "September", 
                          "October", "November", "December"};
        return String.format("Estimated delivery date: %s %d, %d.",
                            monts[fecha[1]], fecha[0], fecha[2]);
    }

    @Override
    public String mostrarOfertas(LinkedList<Producto> ofertas) {
        return null;
    }
}
