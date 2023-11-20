package EstructuraDeControl;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("a. Opcion a");
        System.out.println("b. Opcion b");
        System.out.println("c. Opcion c");
        System.out.println("d. Opcion d");

        System.out.println("Introduce una opción");

        String opcion = teclado.nextLine();

        switch (opcion){
            case "a":
                System.out.println("Has escojido la a");
                break;
            case "b":
                System.out.println("Has escojido la b");
                break;
            case "c":
                System.out.println("Has escojido la c");
                break;
            default:
                System.out.println("Escribe una letra entre a y d");
        }
        
    }
}
