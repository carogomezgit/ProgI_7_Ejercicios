package ejerciciosjava;

import java.util.logging.Logger;

public class Ejercicio5 {
  public static final Logger log =
      Logger.getLogger(Ejercicio5.class.getName());

  public static void main(String[] args) {

    int[] vectorNumeros = new int[10];

    for (int i = 0; i < vectorNumeros.length; i++) {
      vectorNumeros[i] = (int) (Math.random() * 10 + 1);
      System.out.println(vectorNumeros[i]);
    }

    for (int i = 0; i < vectorNumeros.length; i++) {
      log.info("Elemento " + (i + 1));
      int numero = vectorNumeros[i];
      int cuadrado = numero * numero;
      int cubo = numero * numero * numero;
      log.info("Numero entero: " + numero);
      log.info("Numero al cuadrado: " + cuadrado);
      log.info("Numero al cubo: " + cubo);
    }
  }
}