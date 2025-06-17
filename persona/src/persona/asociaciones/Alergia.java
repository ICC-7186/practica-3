package persona.asociaciones;

/**
 * Clase {@code Direccion} representa una alergia con un nombre 
 * y tipo espec&iacute;fico.
 * @author Grupo Programaci&oacute;n 2025-2
 * @version 1.1
 */
public class Alergia {
    private String nombre; // Nombre de la alergia
    private String tipo; // Tipo de alergia

    /**
     * Constructor por omisi&oacute;n que inicializa una alergia vac&iacute;a.
     */
    public Alergia() {
        this("", "");
    }

    /**
     * Constructor con par&aacute;metros para inicializar una alergia con todos los atributos.
     * @param nombre {@code <String>} : Nombre de la alergia.
     * @param tipo {@code <String>} : Tipo de alergia.
     */
    public Alergia(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    /**
     * Constructor de copia para inicializar una alergia a partir de otra.
     * @param otra {@code <Alergia>} : Alergia a copiar.
     */
    public Alergia(Alergia otra) {
        this(otra.nombre, otra.tipo);
    }

   /**
     * Obtiene el nombre del objeto.
     * @return {@code <String>} : El nombre del objeto.
     */
    public String obtenerNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del objeto.
     * @param nombre {@code <String>} : El nuevo nombre del objeto.
     */
    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el tipo del objeto.
     * @return {@code <String>} : El tipo del objeto.
     */
    public String obtenerTipo() {
        return tipo;
    }

    /**
     * Establece el tipo del objeto.
     * @param tipo {@code <String>} : El nuevo tipo del objeto.
     */
    public void asignarTipo(String tipo) {
        this.tipo = tipo;
    }


    /**
     * Compara dos alergias para verificar si son iguales.
     * @param o {@code <Object>} : Alergia a comparar.
     * @return {@code <boolean>} : {@code true} si los objetos son iguales, {@code false} de lo contrario.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alergia alergia = (Alergia) o;
        return nombre.equals(alergia.nombre) && tipo.equals(alergia.tipo);
    }

    /**
     * Devuelve una representaci&oacute;n en cadena de caracteres del objeto.
     * @return {@code <String>} : Cadena que representa el objeto
     */
    @Override
    public String toString() {
        return nombre + " (" + tipo + ")";
    }
}
