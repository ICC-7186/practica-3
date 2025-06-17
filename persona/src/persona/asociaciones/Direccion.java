package persona.asociaciones;

import persona.enumeraciones.Estado;

/**
 * Representa una Direcci&oacute;n.
 * @author Grupo Programaci&oacute;n 2025-2
 * @version 1.1
 */
public class Direccion {
    
    private String calle; // Calle de la direcci&oacute;n
    private int numero; // N&uacute;mero de la direcci&oacute;n
    private String colonia; // Colonia de la direcci&oacute;n
    private String codigoPostal; // C&oacute;digo postal de la direcci&oacute;n
    private String municipio; // Municipio de la direcci&oacute;n
    private Estado estado; // Estado de la direcci&oacute;n

    /**
     * Constructor por omisi&oacute;n que inicializa una direcci&oacute;n vac&iacute;a.
     */
    public Direccion() {
        this("", 0, "", "", "", Estado.DD);
    }

    /**
     * Constructor con par&aacute;metros para inicializar una direcci&oacute;n con todos los atributos.
     * @param calle {@code <String>} : Calle de la direcci&oacute;n.
     * @param numero {@code <int>} : N&uacute;mero de la direcci&oacute;n.
     * @param colonia {@code <String>} : Colonia de la direcci&oacute;n.
     * @param codigoPostal {@code <String>} : C&oacute;digo postal de la direcci&oacute;n.
     * @param municipio {@code <String>} : Municipio de la direcci&oacute;n.
     * @param estado {@code <Estado>} : Estado de la direcci&oacute;n.
     */
    public Direccion(String calle, int numero, String colonia, String codigoPostal, 
                     String municipio, Estado estado) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.codigoPostal = codigoPostal;
        this.municipio = municipio;
        this.estado = estado;
    }

    /**
     * Constructor de copia para inicializar una direcci&oacute;n a partir de otra.
     * @param otra {@code <Direccion>} : Direcci&oacute;n a copiar.
     */
    public Direccion(Direccion otra) {
        this(otra.calle, otra.numero, otra.colonia, otra.codigoPostal, 
             otra.municipio, otra.estado);
    }

    /**
     * Obtiene la calle de la direcci&oacute;n.
     * @return {@code <String>} : La calle de la direcci&oacute;n.
     */
    public String obtenerCalle() {
        return calle;
    }

    /**
     * Establece la calle de la direcci&oacute;n.
     * @param calle {@code <String>} : La nueva calle de la direcci&oacute;n.
     */
    public void asignarCalle(String calle) {
        this.calle = calle;
    }

    /**
     * Obtiene el n&uacute;mero de la direcci&oacute;n.
     * @return {@code <int>} : El n&uacute;mero de la direcci&oacute;n.
     */
    public int obtenerNumero() {
        return numero;
    }

    /**
     * Establece el n&uacute;mero de la direcci&oacute;n.
     * @param numero {@code <int>} : El nuevo n&uacute;mero de la direcci&oacute;n.
     */
    public void asignarNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Obtiene la colonia de la direcci&oacute;n.
     * @return {@code <String>} : La colonia de la direcci&oacute;n.
     */
    public String obtenerColonia() {
        return colonia;
    }

    /**
     * Establece la colonia de la direcci&oacute;n.
     * @param colonia {@code <String>} : La nueva colonia de la direcci&oacute;n.
     */
    public void asignarColonia(String colonia) {
        this.colonia = colonia;
    }

    /**
     * Obtiene el c&oacute;digo postal de la direcci&oacute;n.
     * @return {@code <String>} : El c&oacute;digo postal de la direcci&oacute;n.
     */
    public String obtenerCodigoPostal() {
        return codigoPostal;
    }

    /**
     * Establece el c&oacute;digo postal de la direcci&oacute;n.
     * @param codigoPostal {@code <String>} : El nuevo c&oacute;digo postal de la direcci&oacute;n.
     */
    public void asignarCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    /**
     * Obtiene el municipio de la direcci&oacute;n.
     * @return {@code <String>} : El municipio de la direcci&oacute;n.
     */
    public String obtenerMunicipio() {
        return municipio;
    }

    /**
     * Establece el municipio de la direcci&oacute;n.
     * @param municipio {@code <String>} : El nuevo municipio de la direcci&oacute;n.
     */
    public void asignarMunicipio(String municipio) {
        this.municipio = municipio;
    }

    /**
     * Obtiene el estado de la direcci&oacute;n.
     * @return {@code <Estado>} : El estado de la direcci&oacute;n.
     */
    public Estado obtenerEstado() {
        return estado;
    }

    /**
     * Establece el estado de la direcci&oacute;n.
     * @param estado {@code <Estado>} : El nuevo estado de la direcci&oacute;n.
     */
    public void asignarEstado(Estado estado) {
        this.estado = estado;
    }

    /**
     * Compara dos direcciones para verificar si son iguales.
     * @param o {@code <Object>} : Direcci&oacute;n a comparar.
     * @return {@code <boolean>} : {@code true} si los objetos son iguales, {@code false} de lo contrario.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Direccion direccion = (Direccion) o;
        return numero == direccion.numero && calle.equals(direccion.calle) &&
                colonia.equals(direccion.colonia) && codigoPostal.equals(direccion.codigoPostal) &&
                municipio.equals(direccion.municipio) && estado == direccion.estado;
    }

    /**
     * Devuelve una representaci&oacute;n en cadena de caracteres del objeto.
     * @return {@code <String>} : Cadena que representa el objeto.
     */
    @Override
    public String toString() {
        return calle + " " +  numero + "\n" +
               colonia + ", " + codigoPostal + "\n" +
               municipio + ", " + estado;
    }
}

