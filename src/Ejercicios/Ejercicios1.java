package Ejercicios;

import java.util.Scanner;

public class Ejercicios1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu peso");
        int peso = Integer.parseInt(entrada.nextLine());

        final double i = 1.7;
        double pesoluna = peso / i;
        System.out.println("TU PESO EN LA LUNA ES:" + pesoluna);

        //cerrar Scanner
        entrada.close();
    }
}
