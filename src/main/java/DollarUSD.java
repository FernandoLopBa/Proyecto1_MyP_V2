public class DollarUSD implements Divisa{

    private static float equivalencia = (float)21.27;

    @Override
    public float getEquivalencia(float peso) {
        return peso/equivalencia;
    }

    @Override
    public float getEquivalencia() {
        return equivalencia;
    }

    @Override
    public String getEquivalenciaCadena(float peso){
        return String.format("$$ %.2f USD", getEquivalencia(peso));
    }
}