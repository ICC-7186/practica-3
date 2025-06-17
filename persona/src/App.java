import java.time.LocalDate;
import java.util.ArrayList;
import persona.Persona;
import persona.asociaciones.Alergia;
import persona.asociaciones.Direccion;
import persona.asociaciones.Hobby;
import persona.enumeraciones.Genero;
import persona.enumeraciones.Estado;

public class App {
    public static void main(String[] args) {
        Direccion dir = new Direccion("Investigaci\u00f3n Cient\u00edfica", 
                                      3000, 
                                      "C.U", 
                                      "04510", 
                                      "Coyoac\u00e1n", Estado.MEXICO_DF);

        Alergia alg = new Alergia("Nueces", "Alimentaria");

        Hobby h1 = new Hobby("Lectura");

        Hobby h2 = new Hobby("Atletismo");

        Hobby h3 = new Hobby("Canto");

        ArrayList<Alergia> algs = new ArrayList<Alergia>();

        algs.add(alg);

        Persona p1 = new Persona();

        Persona p2 = new Persona("Juan Perez Sosa", 
                                 LocalDate.parse("2005-04-09"), 
                                 Estado.CHIAPAS, 
                                 60.5, 
                                 1.72, 
                                 dir, 
                                 algs, 
                                 Genero.M, 
                                 new Hobby[]{h1,h2,h3});

        Persona p3 = new Persona(p2);

        p3.asignarEstado(Estado.CHIHUAHUA);
        p3.asignarCURP("PESJ050425HCHRSN02");

        System.out.println(p1);
        System.out.println();
        System.out.println(p2);
        System.out.println();
        System.out.println(p3);
        
    }
}
