package ejerciciosjava;

import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio7 {
  public static final Logger log =
      Logger.getLogger(Ejercicio7.class.getName());

  public static void main(String[] args) {

    int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int[] cantMes = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    String[] mes = new String[12];
    mes[0] = "Enero";
    mes[1] = "Febrero";
    mes[2] = "Marzo";
    mes[3] = "Abril";
    mes[4] = "Mayo";
    mes[5] = "Junio";
    mes[6] = "Julio";
    mes[7] = "Agosto";
    mes[8] = "Septiembre";
    mes[9] = "Octubre";
    mes[10] = "Noviembre";
    mes[11] = "Diciembre";

    int num;

    Scanner sc = new Scanner(System.in);
    log.info("Ingrese el número del mes:");
    num = sc.nextInt();

    for (int i = 0; i < 12; i++) {
      if (num == cantMes[i]) {
        log.info("El mes " + mes[i] + " tiene " + dias[i] + " dias");
      }
    }
  }
}
