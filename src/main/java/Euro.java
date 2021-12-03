package main.java;

public class Euro implements Divisa{

    private static float equivalencia = (float)24.06;

    @Override
    public float getEquivalencia() {
        return equivalencia;
    }

    @Override
    public float getEquialencia(float peso) {
        return peso/equivalencia;
    }
}