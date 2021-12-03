package main.java;

import java.util.LinkedList;

public class Espanol implements Idioma{

    @Override
    public String saludar(CuentaCliente cliente) {
        return "Bienvenido, " + cliente.getNombreReal() + "!!!";
    }

    @Override
    public String completarCompra(boolean correcta) {
        if(correcta)
            return "Compra completada correctamente!!!";
        else
            return "No se pudo completar su compra :(";
    }

    @Override
    public String depedir(CuentaCliente cliente) {
        return "Hasta luego, vuelva pronto, " + cliente.getNombreReal();
    }

    @Override
    public String fechaEntrega(int[] fecha) {
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo",
                          "junio", "julio", "agosto", "septiembre",
                          "octubre", "noviembre", "diciembre"};

        return String.format("Fecha estimada de entrega el %d de %s del %d."
                                , fecha[0], meses[fecha[1]], fecha[2]);
    }

    @Override
    public String mostrarOfertas(LinkedList<Producto> ofertas) {
        return "";
    }
}
