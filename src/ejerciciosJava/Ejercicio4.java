package ejerciciosJava;

import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio4 {
    public static Logger log =
            Logger.getLogger(Ejercicio4.class.getName());

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // declarar variables de datos del ticket
        String[] producto = new String[3];
        int[] unidad = new int[3];
        double[] precioUnidad = new double[3];
        double[] total = new double[3];

        log.info("Ingresa los siguientes datos de 3 productos:");
        for (int i=0; i<3; i++){
            log.info("Nombre del producto: " );
            producto[i] = sc.next();

            log.info("Cantidad de unidades:");
            unidad[i] = sc.nextInt();

            log.info("Precio por unidad:");
            precioUnidad[i] = sc.nextDouble();

            total[i] = unidad[i] * precioUnidad[i];
        }

        // mostrar todos los tickets y su información
        for (int j = 0; j < 3; j++){
            System.out.println("Ticket N° " + (j + 1) + "\n");

            System.out.println(producto[j]);
            System.out.println("Unidades: " + unidad[j]);
            System.out.println("Precio por unidad: " + precioUnidad[j] + "\n");

            System.out.println("Total del ticket: " + total[j] + "\n -----");
        }
    }
}
