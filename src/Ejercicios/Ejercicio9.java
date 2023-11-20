package Ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe lo que quieras: ");
        String texto = scanner.nextLine();
        int resultado = contarVocales(texto);
        System.out.println("Número de vocales: " + resultado);
    }
    public static int contarVocales(String texto) {
        int contador = 0;

        for(int i = 0; i < texto.length(); i++){
            if (texto.charAt(i) == 'a' ||texto.charAt(i) == 'e' ||texto.charAt(i) == 'i' ||texto.charAt(i) == 'o' ||
                    texto.charAt(i) == 'u' ){
                contador = contador +1;
            }
            System.out.println(texto.charAt(i));
        }


        return contador;
    }
}
