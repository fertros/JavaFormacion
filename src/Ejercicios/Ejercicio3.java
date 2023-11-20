package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce la nota de Matemáticas: ");
        int nota1 = Integer.parseInt(entrada.nextLine());
        System.out.println("Introduce la nota de Física: ");
        int nota2 = Integer.parseInt(entrada.nextLine());
        System.out.println("Introduce la nota de Quimica: ");
        int nota3 = Integer.parseInt(entrada.nextLine());
        System.out.println("Introduce la nota de Lenguaje: ");
        int nota4 = Integer.parseInt(entrada.nextLine());
        System.out.println("Introduce la nota de Historia: ");
        int nota5 = Integer.parseInt(entrada.nextLine());

        float media = (float) (nota1 + nota2 + nota3 + nota4 + nota5) / 5;

        if (media <= 3){
            System.out.println("Muy deficiente");
        }else if(media >= 3 && media <=5){
            System.out.println("Insuficiente");
        }else if(media >=5 && media <=6){
            System.out.println("Sufieciente");
        }else if(media >=6 && media <=7){
            System.out.println("Bien");
        } else if (media >=7 && media <=9) {
            System.out.println("notable");
        } else if (media >=9 && media <= 10) {
            System.out.println("Sobresaliente");
        }
        entrada.close();
    }
}


