package ejerciciosJava;

public class Ejercicio5 {

    public static void main(String[] args) {

        int[] vectorNumeros = new int[10];

        for(int i=0; i<vectorNumeros.length; i++){
            vectorNumeros[i] = (int)(Math.random() * 99 + 1);
            System.out.println(vectorNumeros[i]);
        }
    }
}
