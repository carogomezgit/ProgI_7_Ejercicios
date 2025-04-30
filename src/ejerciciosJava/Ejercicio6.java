package ejerciciosJava;

import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio6 {

    public static Logger log =
            Logger.getLogger(Ejercicio6.class.getName());

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] vector1 = new String[5];
        String[] vector2 = new String[5];

        log.info("Introduce 5 cadenas de caracteres:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Elemento " + (i + 1) + ": ");
            vector1[i] = sc.next();
        }
        System.out.println("Primer vector");
        for (int j = 0; j < 5; j++){
            System.out.println(vector1[j]);
        }

        // copiar los elementos en orden inverso al segundo vector
        for (int k = 0; k < 5; k++) {
            vector2[k] = vector1[4-k];
        }

        // mostrar el segundo vector con orden inverso
        System.out.println("Segundo vector orden inverso:");
        for (int l = 0; l < 5; l++) {
            System.out.println(vector2[l]);
        }
    }
}
