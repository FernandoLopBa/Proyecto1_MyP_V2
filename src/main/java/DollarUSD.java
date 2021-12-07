public class DollarUSD implements Divisa{

    private static float equivalencia = (float)21.27;

    /**
     * Muestra el precio de la divisa
     * @return el precio de la divisa
     */
    @Override
    public float getEquivalencia() {
        return equivalencia;
    }


    /**
     * Muestra la equivalencia del peso en la divisa correspondiente 
     * @param peso el peso a convertir
     * @return la equivalencia en la divisa correspondiente 
     */
    @Override
    public float getEquivalencia(float peso) {
        return peso/equivalencia;
    }

    
    /**
     * Regresa la una cadena con la equivalencia del peso en la divisa correspondiente
     * @param peso el peso a convertir
     * @return la cadena con la equivalencia
     */
    @Override
    public String getEquivalenciaCadena(float peso){
        return String.format("$$ %.2f USD", getEquivalencia(peso));
    }
}