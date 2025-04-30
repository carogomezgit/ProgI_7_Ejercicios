package ejerciciosJava;

import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio8 {
    public static Logger log =
            Logger.getLogger(Ejercicio8.class.getName());

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nota = new int[5];

        log.info("Ingresa las notas manualmente:");
        for(int i = 0; i < 5; i++){
            nota[i] = sc.nextInt();
        }
        // llamar a las funciones
        double promedio = calcularPromedio(nota);
        log.info("El promedio de notas es: " + promedio);
        int notaAlta = mostrarNota(nota);
        log.info("La nota más alta es: " + notaAlta);
    }

    // funcion para calcular promedio de notas
    static double calcularPromedio(int[] nota){
        double sumaNotas = 0;
        for(int j = 0; j < nota.length; j++){
            sumaNotas+=nota[j];
        }
        return sumaNotas/nota.length;
    }

    // funcion para mostrar nota más alta
    static int mostrarNota(int[] nota){
        int numAlto = 0;
        for(int j = 0; j < nota.length; j++){
            if(nota[j] > numAlto)
                numAlto = nota[j];
        }
        return numAlto;
    }
}
