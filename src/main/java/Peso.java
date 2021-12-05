public class Peso implements Divisa{

    private static float equivalencia = (float)1;

    @Override
    public float getEquivalencia() {
        return equivalencia;
    }

    @Override
    public float getEquivalencia(float peso) {
        return peso/equivalencia;
    }

    @Override
    public String getEquivalenciaCadena(float peso){
        return String.format("$ %.2f MXN", getEquivalencia(peso));
    }
}