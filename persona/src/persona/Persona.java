package persona;

import persona.enumeraciones.Genero;
import persona.enumeraciones.Estado;
import persona.asociaciones.Direccion;
import persona.asociaciones.Alergia;
import persona.asociaciones.Hobby;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Clase {@code Persona} representa una persona con informaci&oacute;n b&aacute;sica y 
 * detalles adicionales.
 * @author Grupo Programaci&oacute;n 2025-2
 * @version 1.2
 * @see Genero
 * @see Estado
 * @see Alergia
 * @see Direccion
 * @see Hobby
 * @since marzo 2025
 */
public class Persona {
    
    // ==================== ATRIBUTOS ====================
    
    private String nombre; // Nombre de una persona.
    private int edad; // Edad de una persona.
    private LocalDate fechaNacimiento; // Fecha de nacimiento de una persona.
    private Estado estado; // Estado donde vive la persona.
    private String curp; // curp de una persona.
    private double peso; // Peso de una persona en kilogramos.
    private double altura; // Altura de una persona en metros.
    private Direccion direccion; // Dirección de una persona.
    private ArrayList<Alergia> alergias; // Alergias de una persona.
    private Genero genero; // Género de una persona.
    private Hobby[] hobbies; // Hoobies de una persona.

    // ==================== METODOS ====================

    // +++++++++++ Constructores +++++++++++

    // -------- por omision --------
    
    /**
     * Constructor por omisi&oacute;n que inicializa una persona vacía.
     */
    public Persona() {
        this("", 0, LocalDate.parse("1111-11-11"), Estado.DD, "", 0.0,
             0.0, new Direccion(), new ArrayList<Alergia>(), Genero.DD, new Hobby[]{null,null,null});
    } // 

    // -------- parametrizado --------
    
    /**
     * Constructor con par&aacute;metros para inicializar una persona con todos los atributos.
     * @param nombre {@code <String>} : Nombre de una persona.
     * @param edad {@code <int>} :  Edad de una persona.
     * @param fechaNacimiento {@code <LocalDate>} :  Fecha de nacimiento de una persona.
     * @param estado {@code <Estado>} : Estado donde vive la persona.
     * @param curp {@code <String>} : CURP de una persona.
     * @param peso {@code <double>} : Peso de una persona.
     * @param altura {@code <double>} : Altura de una persona.
     * @param direccion {@code <Direccion>} : Dirección de una persona.
     * @param alergias {@code <ArrayList<Alergia>>} : Alergias de una persona.
     * @param genero {@code <Genero>} : G&eacute;nero de una persona.
     * @param hobbies {@code <Hobbie[]>} : Hobbies de una persona.
     */
    public Persona(String nombre, int edad, LocalDate fechaNacimiento, 
                   Estado estado, String curp, double peso, double altura, 
                   Direccion direccion, ArrayList<Alergia> alergias, Genero genero, Hobby[] hobbies) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
        this.curp = curp;
        this.peso = peso;
        this.altura = altura;
        this.direccion = direccion;
        this.alergias = alergias;
        this.genero = genero;
        this.hobbies = hobbies;
    }

    // -------- parametrizado --------
    
    /**
     * Constructor con par&aacute;metros para inicializar una persona con todos los atributos.
     * @param nombre {@code <String>} : Nombre de una persona.
     * @param fechaNacimiento {@code <LocalDate>} :  Fecha de nacimiento de una persona.
     * @param estado {@code <Estado>} : Estado donde vive la persona.
     * @param peso {@code <double>} : Peso de una persona.
     * @param altura {@code <double>} : Altura de una persona.
     * @param direccion {@code <Direccion>} : Dirección de una persona.
     * @param alergias {@code <ArrayList<Alergia>>} : Alergias de una persona.
     * @param genero {@code <Genero>} : G&eacute;nero de una persona.
     * @param hobbies {@code <Hobbie[]>} : Hobbies de una persona.
     */
    public Persona(String nombre, LocalDate fechaNacimiento, 
                   Estado estado, double peso, double altura, 
                   Direccion direccion, ArrayList<Alergia> alergias, Genero genero, Hobby[] hobbies) {
        this.nombre = nombre;
        this.edad = calcularEdad(fechaNacimiento);
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
        this.peso = peso;
        this.altura = altura;
        this.direccion = direccion;
        this.alergias = alergias;
        this.genero = genero;
        this.hobbies = hobbies;
        this.curp = generarCURP(nombre, fechaNacimiento);
    }

    // -------- de copia --------

    /**
     * Constructor de copia para inicializar una persona a partir de otra.
     * @param otra Persona a copiar
     */
    public Persona(Persona otra) {
        this(otra.nombre, otra.edad, otra.fechaNacimiento, otra.estado, otra.curp, 
             otra.peso, otra.altura, new Direccion(otra.direccion), 
             otra.alergias, otra.genero, otra.hobbies);
    }

    // +++++++++++ Acceso +++++++++++

    /**
     * Obtiene el nombre de una persona. 
     * @return {@code <String>} El nombre de una persona.
     */
    public String obtenerNombre() {
        return nombre;
    }

    /**
     * Obtiene la edad de una persona.
     * @return {@code <int>} : La edad de una persona.
     */
    public int obtenerEdad() {
        return edad;
    }

    /**
     * Obtiene la fecha de nacimiento de una persona.
     * @return {@code <LocalDate>} : La fecha de nacimiento de una persona.
     */
    public LocalDate obtenerFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Obtiene el estado de una persona.
     * @return {@code <Estado>} : El estado de una persona.
     */
    public Estado obtenerEstado() {
        return estado;
    }

    /**
     * Obtiene el peso de una persona. 
     * @return {@code <double>} : El peso de una persona en kilogramos.
     */
    public double obtenerPeso() {
        return peso;
    }

    /**
     * Obtiene la altura de una persona.
     * @return {@code <double>} : La altura de una persona en metros.
     */
    public double obtenerAltura() {
        return altura;
    }

    /**
     * Obtiene la direcci&oacute;n de una persona.
     * @return {@code <Direccion>} : La dirección de una persona.
     */
    public Direccion obtenerDireccion() {
        return direccion;
    }

    /**
     * Obtiene la alergia de una persona.
     * @return {@code <Alergia>} : La alergia de una persona.
     */
    public ArrayList<Alergia> obtenerAlergias() {
        return alergias;
    }

    /**
     * Obtiene los hobbies de una persona.
     * @return {@code <Hobbie[]>} : Los hobbies de una persona.
     */
    public Hobby[] obtenerHobbies() {
        return hobbies;
    }

    /**
     * Obtiene el g&eacute;nero de una persona.
     * @return {@code <Genero>} : El g&eacute;nero de una persona.
     */
    public Genero obtenerGenero() {
        return genero;
    }

    /**
     * Obtiene la CURP de una persona.
     * @return {@code <String>} : La CURP de una persona.
     */
    public String obtenerCURP() {
        return curp;
    }

    // +++++++++++ Modificacion +++++++++++

    /**
     * Establece el nombre de una persona.
     * @param nombre {@code <String>} : El nuevo nombre de una persona.
     */
    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece la edad de una persona.
     * @param edad {@code <int>} : La nueva edad de una persona.
     */
    public void asignarEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Establece la fecha de nacimiento de una persona.
     * @param fechaNacimiento {@code <LocalDate>} : La nueva fecha de nacimiento de una persona.
     */
    public void asignarFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Establece el estado de una persona.
     * @param estado {@code <Estado>} : El nuevo estado de una persona.
     */
    public void asignarEstado(Estado estado) {
        this.estado = estado;
    }

    /**
     * Establece el peso de una persona.
     * @param peso {@code <double>} : El nuevo peso de una persona en kilogramos.
     */
    public void asignarPeso(double peso) {
        this.peso = peso;
    }

    /**
     * Establece la altura de una persona.
     * @param altura {@code <double>} : La nueva altura de una persona en metros.
     */
    public void asignarAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Establece la direcci&oacute;n de una persona.
     * @param direccion {@code <Direccion>} : La nueva dirección de una persona.
     */
    public void asignarDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /**
     * Establece las alergias de una persona.
     * @param alergias {@code <ArrayList<Alergia>>} : Las nuevas alergias de una persona. 
     */
    public void asignarAlergias(ArrayList<Alergia> alergias) {
        this.alergias = alergias;
    }

    /**
     * Establece el g&eacute;nero de una persona.
     * @param genero {@code <Genero>} : El nuevo g&eacute;nero de una persona.
     */
    public void asignarGenero(Genero genero) {
        this.genero = genero;
    }

    /**
     * Establece los hobbies de una persona.
     * @param hobbies {@code <Hobby[]>} : Los nuevos hobbies de una persona.
     */
    public void asignarHobbies(Hobby[] hobbies) {
        this.hobbies = hobbies;
    }

    /**
     * Establece la CURP de una persona.
     * @param curp {@code <String>} : La nueva CURP de una persona.
     */
    public void asignarCURP(String curp) {
        this.curp = curp;
    }

    // +++++++++++ Implementacion +++++++++++

    // -------- calculadores --------

    /**
     * Calcula el IMC de una persona.
     * @param altura {@code <double>} : Altura de una persona.
     * @param peso {@code <double>} : Peso de una persona.
     * @return {@code <double>} : IMC de una persona.
     */
    public double calcularIMC(double altura, double peso) {
        return redondear(peso / (Math.pow(altura, 2)));
    }
    
    // -------- especiales --------

    /**
     * Resta la edad de dos personas.
     * @param p1 {@code <Persona>} : Primer persona.
     * @param p2 {@code <Persona>} : Segunda persona.
     * @return {@code <int>} : diferencia entre las edades de dos personas.
     */
    public static int compare(Persona p1, Persona p2) {
    	return p1.edad - p2.edad;
    }

    /**
     * Compara dos personas y les da un orden.
     * {@code p1 < p2 -> -1}
     * {@code p1 > p1 -> 1}
     * {@code p1 = p2 -> 0}
     * @param p1 {@code <Persona>} : Primer persona.
     * @param p2 {@code <Persona>} : Segunda Persona.  
     * @return {@code <int>} : Relaci&oacute;n de orden entre dos personas.  
     */
    public static int compareTo(Persona p1, Persona p2) {
        int resta = compare(p1,p2);
        if (resta < 0) {
            return -1;
        } else if (resta > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    /**
     * Compara dos personas para verificar si son iguales.
     * @param o {@code <Object>} : Persona a comparar.
     * @return {@code <boolean>} : {@code true} si los objetos son iguales, {@code false} de lo contrario.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return edad == persona.edad && persona.peso == peso &&
               persona.altura == altura && nombre.equals(persona.nombre) &&
               Objects.equals(fechaNacimiento, persona.fechaNacimiento) &&
               estado.equals(persona.estado) && curp.equals(persona.curp) && direccion.equals(persona.direccion) &&
               alergias.equals(persona.alergias) && genero.equals(persona.genero) &&
               Arrays.equals(hobbies, persona.hobbies);
    }

    /**
     * Devuelve una representación en cadena de caracteres del objeto.
     * @return {@code <String>}: cadena que representa el objeto.
     */
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
                "G: " + genero + "\n" +
                "Edad: " + edad + " a\u00f1os\n" +
                "FechaNacimiento: " + fechaNacimiento + "\n" +
                "Estado: " + estado + "\n" +
                "CURP: " + curp + "\n" +
                "Peso: " + peso + " kg\n" +
                "Altura: " + altura + " m\n" +
                "IMC: " + calcularIMC(altura, peso) + " m/kg\u00b2\n" +
                "Dir: \n" + direccion + "\n" +
                "Alergias: " + alergias + "\n" +
                "Hobbies: " + Arrays.toString(hobbies);
    }

    // +++++++++++ Auxiliares +++++++++++

    /**
     * Limita un n&uacute;mero real a solo dos decimales.
     * @param n {@code <double>} : n&uacute;mero a redondear.
     * @return {@code <double>} : n&uacute;mero redondeado.
     */
    private double redondear(double n){
        return Math.round(n * 100) / 100;
    }

    /**
     * Calcula la edad de una persona a partir de su fecha de nacimiento.
     * @param fechaNacimiento {@code <LocalDate>} : fecha de nacimiento de una persona.
     * @return {@code <int>} : edad actual de una persona.
     */
    private int calcularEdad(LocalDate fechaNacimiento) {
        LocalDate fechaActual = LocalDate.now();
        int edadActual = fechaActual.getYear() - fechaNacimiento.getYear();
        if (!(fechaActual.getDayOfMonth() == fechaNacimiento.getDayOfMonth() && 
            fechaActual.getMonthValue() == fechaNacimiento.getMonthValue())) {
                edadActual -= 1;
            }
        return edadActual;
    }

    /**
     * Genera la Clave Unica de Registro Poblacional de una persona por medio
     * de su nombre y su fecha de nacimiento.
     * @param nombre {@code <String>} : nombre completo de una persona.
     * @param fechaNacimiento {@code <LocalDate>} :  fecha de nacimiento de una persona.
     * @return {@code <String>} : CURP generada para una persona.
     */
    private String generarCURP(String nombre, LocalDate fechaNacimiento) {
        Random rnd = new Random();
        String[] nombreSeparado = nombre.split(" ");
        String apellidoPaterno = nombreSeparado[nombreSeparado.length - 2].toUpperCase();
        String apellidoMaterno = nombreSeparado[nombreSeparado.length - 1].toUpperCase();
        String nombrePila = nombreSeparado[0].toUpperCase();
        String nacimiento = Integer.toString(fechaNacimiento.getYear()).substring(2) +
                            agregarDigito(fechaNacimiento.getMonthValue()) +
                            agregarDigito(fechaNacimiento.getDayOfMonth());
        int numero = rnd.nextInt(10);
        return Character.toString(apellidoPaterno.charAt(0)) + 
               obtenerPrimerVocal(apellidoPaterno) + apellidoMaterno.charAt(0) + 
               nombrePila.charAt(0) + nacimiento + genero.establecerSexo() + 
               estado.establecerClave() + obtenerPrimerConsonante(apellidoPaterno) + 
               obtenerPrimerConsonante(apellidoMaterno) + 
               obtenerPrimerConsonante(nombrePila) + numero + numero;
    }

    /**
     * Agrega un {@code 0} a la izquerda de un n&uacute;mero menor a {@code 10}.
     * @param n {@code <int>} : n&uacute;mero a modificar.
     * @return {@code <String>} : n&uacute;mero {@code n} modificado.
     */
    private String agregarDigito(int n) {
        return (n >= 10) ? Integer.toString(n) : "0" + Integer.toString(n);
    }

    /**
     * Obtiene la primera vocal de una palabra.
     * @param str {@code <String>} : una cadena de texto.
     * @return {@code <char>} : primer vocal de la cadena de texto {@code str}.
     */
    private char obtenerPrimerVocal(String str) {
        String strSinCons = str.replaceAll("[^AEIOU]", "");
        return strSinCons.charAt(0);
    }

    /**
     * Obtiene la primera consonante de una palabra.
     * @param str {@code <String>} : una cadena de texto.
     * @return {@code <char>} : primer consonante de la cadena de texto {@code str}.
     */
    private char obtenerPrimerConsonante(String str) {
        String strSinVocal = str.replaceAll("[^BCDFGHJKLMNPQRSTVWXYZ]", "");
        return strSinVocal.substring(1).charAt(0);
    }
}