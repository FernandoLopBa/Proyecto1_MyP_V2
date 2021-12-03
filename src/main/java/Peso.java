package main.java;

public class Peso implements Divisa{

    private static float equivalencia = (float)1;

    @Override
    public float getEquivalencia() {
        return equivalencia;
    }

    @Override
    public float getEquialencia(float peso) {
        return peso/equivalencia;
    }
}