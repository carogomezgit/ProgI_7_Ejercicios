package ejerciciosjava;

import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio1 {

  public static final Logger log =
      Logger.getLogger(Ejercicio1.class.getName());

  public static void main(String[] args) {
    // lista de estudiantes
    String[] alumno = new String[5];
    alumno[0] = "Carolina";
    alumno[1] = "Serena";
    alumno[2] = "Julieta";
    alumno[3] = "Denise";
    alumno[4] = "Luz";

    // lista de notas de estudiantes
    int[] nota = {7, 8, 10, 6, 9};

    String nombreAlumno;

    /**  agregar nombres de estudiantes y notas manualmente
         * for(int i=0; i<nota.length; i++) {
         *  log.info("Ingresa el nombre del estudiante, luego su nota correspondiente");
         *  alumno[i] = sc.next();
         *  nota[i] = sc.nextInt();
         *  }
        */
    Scanner sc = new Scanner(System.in);

    log.info("Ingrese el nombre del estudiante para consultar su nota");
    nombreAlumno = sc.next();

    for (int i = 0; i < nota.length; i++) {
      if ((nombreAlumno.equalsIgnoreCase(alumno[i]))) // esto ignora la regla de Upper/Lower case
        log.info("La nota de " + alumno[i] + " es " + nota[i]);
    }
  }
}