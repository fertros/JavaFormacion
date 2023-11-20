package EstructuraDeControl;

import java.util.Scanner;

public class CondicionalSimple {
    public static void main(String[] args) {

        int dia;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuantos dias tiene febrero este año: ");
        dia = entrada.nextInt();

        if (dia == 29) {
            System.out.println("este año es bisiesto");
        } else if (dia < 28 || dia > 31) {
            System.out.println("No me has dicho ien los dias");
        } else {
            System.out.println("este año no es bisiesto");
        }
        System.out.println("lo nomal es que tenga 28 dias");
    }
}
