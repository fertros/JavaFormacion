package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe un texto, escribe '.' para finalizar");

        do{
            String entrada = scanner.nextLine();


            // Cuenta la cantidad de espacios en la entrada
            int cantidadEspacios = 0;
            for (char caracter : entrada.toCharArray()) {
                if (Character.isWhitespace(caracter)) {
                    cantidadEspacios++;
                }
            }

            // Muestra el texto ingresado y la cantidad de espacios
            System.out.println("Texto ingresado: " + entrada);
            System.out.println("Cantidad de espacios: " + cantidadEspacios);

            if (entrada.endsWith(".")){
                System.out.println("Programa finalizado");
                break;
            }
        } while (true);

            // Cierra el scanner al finalizar
            scanner.close();

    }
}
