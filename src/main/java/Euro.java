public class Euro implements Divisa{

    private static float equivalencia = (float)24.06;

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
        return String.format("€ %.2f EURO", getEquivalencia(peso));
    }
}