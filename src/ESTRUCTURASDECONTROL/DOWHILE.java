package ESTRUCTURASDECONTROL;

import java.util.Scanner;

public class DOWHILE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        do {

            System.out.print("Ingresa un número positivo: ");

            numero = scanner.nextInt();
            if (numero <= 0) {
                System.out.println("¡Error! Debes ingresar un número positivo.");
            }
        } while (numero <= 0);
        System.out.println("¡Has ingresado un número positivo!");
    }
}
