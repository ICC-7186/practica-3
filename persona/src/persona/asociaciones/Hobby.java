package persona.asociaciones;

/**
 * Clase {@code Hobbie} para represntar una actividad recreativa.
 * @author Programci&oacute;n 2025-2
 * @version 1.0
 */
public class Hobby {

    private String actividad;

    /**
     * Crea un ejemplar de {@code Hobbie} con una actividad.
     * @param actividad {@code <String>} : acitividad recreativa.
     */
    public Hobby(String actividad) {
        this.actividad = actividad;
    }

    /**
     * Obtiene una actividad recreativa.
     * @return {@code <String>} : una actividad recreativa.
     */
    public String obtenerActividad() {
        return actividad;
    }

    /**
     * Devuelve la actividad en formato de cadena.
     * @return {@code <String>} : actividad recreativa.
     */
    @Override
    public String toString() {
        return actividad;
    }
    
}
