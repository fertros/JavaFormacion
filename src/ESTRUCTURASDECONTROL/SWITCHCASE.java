package ESTRUCTURASDECONTROL;

import java.util.Scanner;

public class SWITCHCASE {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("a. Opción a");
        System.out.println("b. Opción b");
        System.out.println("c. Opción c");
        System.out.println("d. Opción d");

        System.out.println("Introduce una opción: ");

        String opcion = teclado.nextLine();

        switch (opcion) {
            case "a":
                System.out.println("Has escogido la a");
                break;
            case "b":
                System.out.println("Has escogido la b");
                break;
            case "c":
                System.out.println("Has escogido la c");
                break;
            case "d":
                System.out.println("Has escogido la d");
                break;
            default:
                System.out.println("Era entre a y d!");

                System.out.println("Terminó el switch-case");

        }
    }
}