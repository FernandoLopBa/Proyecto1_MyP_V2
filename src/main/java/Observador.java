import java.util.LinkedList;
/**
 * Interfaz para observador
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @author López Balcazar Fernando
 * @version 1
 */

public interface Observador{
    /**
     * Actualiza la informacion que tiene el cliente sobre los descuentos
     * @param ofertas las ofertas del sujeto
     * @param idioma el idioma en que se va a presentar
     */
    public void actualiza(LinkedList<Producto> ofertas, Idioma idioma);
}