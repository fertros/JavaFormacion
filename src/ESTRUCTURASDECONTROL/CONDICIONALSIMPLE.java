package ESTRUCTURASDECONTROL;

import java.util.Scanner;

public class CONDICIONALSIMPLE {
    public static void main(String[] args) {
        int dia;
        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Cuantos días tiene febrero este año? ");
        dia = entrada.nextInt();
        if(dia==29){
            System.out.println("Este año es bisiesto");
        } else if (dia<28||dia>31){
            System.out.println("No me has dicho bien los días!");
        }
        else {
            System.out.println("No es bisiesto!");
        }
        System.out.println("Lo habitual es que febrero tenga 28 días!");

    }
}
