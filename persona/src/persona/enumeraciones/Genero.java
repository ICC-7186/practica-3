package persona.enumeraciones;

/**
 * Enumeraci&oacute;n {@code Genero} para representar g&eacute;neros.
 * @author Grupo Programaci&oacute;n 2025-2
 * @version 1.1
 */
public enum Genero {
    /**
     * G&eacute;nero desconocido.
     */
    DD, // Desconocido
    /**
     * G&eacute;nero masculino.
     */
    M, // Masculino
    /**
     * G&eacute;nero Femenino.
     */
    F, // Femenino
    /**
     * G&eacute;nero no binarie u otro.
     */
    X;  // No binarie / Otro

    /**
     * Establece un sexo.
     * @return {@code <String>} : sexo.
     */
    public String establecerSexo() {
        String sexo = "";
        switch (this) {
            case M:
                sexo = "H";
                break;
            case F:
                sexo = "M";
                break;
            case X:
                sexo = "X";
            default:
                sexo = "D";
                break;
        }
        return sexo;
    }
}
