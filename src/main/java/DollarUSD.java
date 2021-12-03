package main.java;

public class DollarUSD implements Divisa{

    private static float equivalencia = (float)21.27;

    @Override
    public float getEquivalencia() {
        return equivalencia;
    }

    @Override
    public float getEquialencia(float peso) {
        return peso/equivalencia;
    }
}