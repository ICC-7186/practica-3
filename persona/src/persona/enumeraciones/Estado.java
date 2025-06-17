package persona.enumeraciones;

/**
 * Enumeraci&oacute;n {@code Estado} para representar los estados de México.
 * @author Grupo Programaci&oacute;n 2025-2
 * @version 1.1
 */
public enum Estado {
    
    /**
     * Estado desconocido.
     */
    DD("Desconocido"),
    /**
     * Estado de Aguascalientes.
     */
    AGUASCALIENTES("Aguascalientes"),
    /**
     * Estado de Baja California Norte.
     */
    BAJA_CALIFORNIA("Baja California"),
    /**
     * Estado de Baja California Sur.
     */
    BAJA_CALIFORNIA_SUR("Baja California Sur"),
    /**
     * Estado de Campeche.
     */
    CAMPECHE("Campeche"),
    /**
     * Estado de Chiapas.
     */
    CHIAPAS("Chiapas"),
    /**
     * Estado de Chihuahua.
     */
    CHIHUAHUA("Chihuahua"),
    /**
     * Estado de Coahuila.
     */
    COAHUILA("Coahuila"),
    /**
     * Estado de Colima.
     */
    COLIMA("Colima"),
    /**
     * Estado de Durango.
     */
    DURANGO("Durango"),
    /**
     * Estado de Guanajuato.
     */
    GUANAJUATO("Guanajuato"),
    /**
     * Estado de Guerrero.
     */
    GUERRERO("Guerrero"),
    /**
     * Estado de Hidalgo.
     */
    HIDALGO("Hidalgo"),
    /**
     * Estado de Jalisco.
     */
    JALISCO("Jalisco"),
    /**
     * Estado de Estado de M&eacute;xico.
     */
    MEXICO("Estado de México"),
    /**
     * Estado de Ciudad de M&eacute;xico.
     */
    MEXICO_DF("Ciudad de México (DF)"),
    /**
     * Estado de Michoac&aacute;n.
     */
    MICHOACAN("Michoacán"),
    /**
     * Estado de Morelos.
     */
    MORELOS("Morelos"),
    /**
     * Estado de Nayarit.
     */
    NAYARIT("Nayarit"),
    /**
     * Estado de Nuevo Le&oacute;n.
     */
    NUEVO_LEON("Nuevo León"),
    /**
     * Estado de Oaxava.
     */
    OAXACA("Oaxaca"),
    /**
     * Estado de Puebla.
     */
    PUEBLA("Puebla"),
    /**
     * Estado de Quer&eacute;taro.
     */
    QUERETARO("Querétaro"),
    /**
     * Estado de Quintana Roo.
     */
    QUINTANA_ROO("Quintana Roo"),
    /**
     * Estado de San Luis Potos&iacute;.
     */
    SAN_LUIS_POTOSI("San Luis Potosí"),
    /**
     * Estado de Sinaloa.
     */
    SINALOA("Sinaloa"),
    /**
     * Estado de Sonora.
     */
    SONORA("Sonora"),
    /**
     * Estado de Tabasco.
     */
    TABASCO("Tabasco"),
    /**
     * Estado de Tamaulipas.
     */
    TAMAULIPAS("Tamaulipas"),
    /**
     * Estado de Tlaxcala.
     */
    TLAXCALA("Tlaxcala"),
    /**
     * Estado de Veracruz.
     */
    VERACRUZ("Veracruz"),
    /**
     * Estado de Yucatán.
     */
    YUCATAN("Yucatán"),
    /**
     * Estado de Zacatecas.
     */
    ZACATECAS("Zacatecas"),
    /**
     * Estado fuera de M&eacute;xico.
     */
    NE("Nacido en el Extranjero");

    private final String nombre; // Nombre del estado

    /**
     * Constructor para inicializar el nombre del estado.
     * @param nombre {@code <String>} : Nombre del estado.
     */
    private Estado(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el nombre del estado.
     * @return {@code <String>} : Nombre del estado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna una clave a un estado de M&eacute;xico.
     * @return {@code <String>} : clave de un estado.
     */
    public String establecerClave() {
        String clave = "";
        switch (this) {
            case AGUASCALIENTES:
                clave = "AS";
                break;
            case BAJA_CALIFORNIA:
                clave = "BC";
                break;
            case BAJA_CALIFORNIA_SUR:
                clave = "BS";
                break;
            case CAMPECHE:
                clave = "CC";
                break;
            case CHIAPAS:
                clave = "CS";
                break;
            case CHIHUAHUA:
                clave = "CH";
                break;
            case COAHUILA:
                clave = "CL";
                break;
            case COLIMA:
                clave = "CM";
                break;
            case DURANGO:
                clave = "DG";
                break;
            case GUANAJUATO:
                clave = "GT";
                break;
            case GUERRERO:
                clave = "GR";
                break;
            case HIDALGO:
                clave = "HG";
                break;
            case JALISCO:
                clave = "JC";
                break;
            case MEXICO:
                clave = "MC";
                break;
            case MEXICO_DF:
                clave = "DF";
                break;
            case MICHOACAN:
                clave = "MN";
                break;
            case MORELOS:
                clave = "MS";
                break;
            case NAYARIT:
                clave = "NT";
                break;
            case NUEVO_LEON:
                clave = "NL";
                break;
            case OAXACA:
                clave = "OC";
                break;
            case PUEBLA:
                clave = "PL";
                break;
            case QUERETARO:
                clave = "QT";
                break;
            case QUINTANA_ROO:
                clave = "QR";
                break;
            case SAN_LUIS_POTOSI:
                clave = "SP";
                break;
            case SINALOA:
                clave = "SL";
                break;
            case SONORA:
                clave = "SR";
                break;
            case TABASCO:
                clave = "TC";
                break;
            case TAMAULIPAS:
                clave = "TS";
                break;
            case TLAXCALA:
                clave = "TL";
                break;
            case VERACRUZ:
                clave = "VZ";
                break;
            case YUCATAN:
                clave = "YN";
                break;
            case ZACATECAS        :
                clave = "ZS";
                break;
            case NE:
                clave = "NE";
            default:
                clave = "DD";
                break;
        }
        return clave;
    }

    /**
     * Devuelve una representación en cadena de caracteres del estado,
     * incluyendo el nombre completo.
     * @return {@code <String>} : Cadena que representa el estado con su clave RENAPO
     */
    @Override
    public String toString() {
        return nombre + " (" + name() + ")";
    }
}

