package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu  primer numero: ");
        int n1 = Integer.parseInt(entrada.nextLine());
        System.out.println("Introduce tu  segundo numero: ");
        int n2 = Integer.parseInt(entrada.nextLine());
        System.out.println("Introduce tu  tercer numero: ");
        int n3 = Integer.parseInt(entrada.nextLine());
        int operacionint = (n1 * n2) / n3;
        System.out.println(operacionint);
        int operacionint1 = (n1 * n2) % n3;
        System.out.println(operacionint1);
        int operacionint2 = (2 * (n1 + n3 - n2)) / (n2 * n3);
        System.out.println(operacionint2);
        int operacionint3 = ((n1 * n3) + (n2 % n1) / n1 - n3);
        System.out.println(operacionint3);

        float operacion = (float) (n1 * n2) / n3;
        System.out.println(operacion);
        float operacion1 = (float) (n1 * n2) % n3;
        System.out.println(operacion1);
        float operacion2 = (float) (2 * (n1 + n3 - n2)) / (n2 * n3);
        System.out.println(operacion2);
        float operacion3 = (float) ((n1 * n3) + (n2 % n1)) / n1 - n3;
        System.out.println(operacion3);
        //Cierre de Scanner
        entrada.close();

    }
}
