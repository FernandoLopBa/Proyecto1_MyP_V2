/**
 * Interfaz que representa cada Divisa
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @author López Balcazar Fernando
 * @version 1
 */
public interface Divisa {

    /**
     * Muestra el precio de la divisa
     * @return el precio de la divisa
     */
    public float getEquivalencia();


    /**
     * Muestra la equivalencia del peso en la divisa correspondiente 
     * @param peso el peso a convertir
     * @return la equivalencia en la divisa correspondiente 
     */
    public float getEquivalencia(float peso);

    
    /**
     * Regresa la una cadena con la equivalencia del peso en la divisa correspondiente
     * @param peso el peso a convertir
     * @return la cadena con la equivalencia
     */
    public String getEquivalenciaCadena(float peso);
    
}
