package ejerciciosjava;

import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio4 {
  public static final Logger log = Logger.getLogger(Ejercicio4.class.getName());

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // declarar variables de datos del ticket
    String[] producto = new String[3];
    int[] unidad = new int[3];
    double[] precioUnidad = new double[3];
    double total = 0;

    log.info("Ingresa los siguientes datos de 3 productos:");
    for (int i = 0; i < 3; i++) {
      log.info("Nombre del producto: ");
      producto[i] = sc.next();

      log.info("Cantidad de unidades:");
      unidad[i] = sc.nextInt();

      log.info("Precio por unidad:");
      precioUnidad[i] = sc.nextDouble();

      total = unidad[i] * precioUnidad[i];
    }

    // mostrar el ticket y su información
    System.out.println("---- Ticket de compra ---- \n");
    for (int j = 0; j < 3; j++) {
      System.out.println(producto[j]);
      System.out.println("Unidades: " + unidad[j]);
      System.out.println("Precio por unidad: " + precioUnidad[j] + "\n");
    }
    System.out.println("Total: " + total + "\n ----");
  }
}
