package ejerciciosjava;

import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio3 {
  public static final Logger log =
      Logger.getLogger(Ejercicio3.class.getName());

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;

    log.info("Ingrese longitud del array");
    n = sc.nextInt();

    int[] num = new int[n];

    // ingresar valores al array
    log.info("Ingrese números enteros al array");
    for (int i = 0; i < num.length; i++) {
      num[i] = sc.nextInt();
    }

    // mostrar arrays
    System.out.println("Orden normal:");
    for (int i = 0; i < num.length; i++) {
      System.out.println(num[i] + "  ");
    }

    System.out.println("Orden invertido:");
    for (int k = num.length - 1; k >= 0; k--) {
      System.out.println(num[k] + "  ");
    }
  }
}
