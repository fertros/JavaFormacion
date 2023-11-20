package EstructuraDeControl;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero;

        do{
            System.out.println("ingresa un numero positivo");
            numero = scanner.nextInt();
            if(numero <= 0){
                System.out.println("ingresa un numero positivo");
            }
        }while (numero <=0);
            System.out.println("Es un numero positivo");


    }
}
