package ejerciciosJava;

import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio7 {
    public static Logger log =
            Logger.getLogger(Ejercicio7.class.getName());

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] cantMes = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        String[] mes = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};

        int num;

        log.info("Ingrese el número del mes:");
        num = sc.nextInt();

        for(int i = 0; i < 12; i++){
            if(num == cantMes[i]){
                log.info("El mes " + mes[i] + " tiene " + dias[i] + " dias");
            }
        }
    }
}
