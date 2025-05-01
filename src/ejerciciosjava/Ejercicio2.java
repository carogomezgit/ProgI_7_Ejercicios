package ejerciciosjava;

import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio2 {

  public static final Logger log =
      Logger.getLogger(Ejercicio2.class.getName());

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String texto;
    char letra;
    int veces = 0;

    log.info("Ingrese una palabra");
    texto = sc.nextLine();

    log.info("Ingrese la letra que quiere contar");
    letra = sc.next().charAt(0);

    for (int i = 0; i < texto.length(); i++) {
      if (texto.charAt(i) == letra) {
        veces++;
      }
    }
    log.info("La letra " + letra + " se repite " + veces + " veces");
  }
}
