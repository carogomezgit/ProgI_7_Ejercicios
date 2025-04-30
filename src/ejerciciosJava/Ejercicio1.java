package ejerciciosJava;

import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio1 {

    public static Logger log =
            Logger.getLogger(Ejercicio1.class.getName());

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // lista de estudiantes
        String[] alumno = new String[5];
        alumno[0] = "Carolina";
        alumno[1] = "Serena";
        alumno[2] = "Julieta";
        alumno[3] = "Denise";
        alumno[4] = "Luz";

        // lista de notas de estudiantes
        int[] nota = {7, 8, 10, 6, 9};

        String buscarAlumno;

        // agregar nombres de estudiantes y notas manualmente
        /*
        for(int i=0; i<nota.length; i++) {
            log.info("Ingresa el nombre del estudiante, luego su nota correspondiente");
            alumno[i] = sc.next();
            nota[i] = sc.nextInt();
        }
        */

        log.info("Ingrese el nombre del estudiante para consultar su nota");
        buscarAlumno = sc.next();

        for(int i=0; i<nota.length; i++){
            if ((buscarAlumno.equalsIgnoreCase(alumno[i]))) // esto ignora la regla de Upper/Lower case
                    log.info("La nota de " + alumno[i] + " es " + nota[i]);
        }
    }
}
