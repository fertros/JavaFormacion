package Ejercicio19;


import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {

        // Crear un objeto Scanner para leer desde la consola
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número entero de más de una cifra
        System.out.print("Ingrese un número entero de más de una cifra: ");
        int numero = scanner.nextInt();

        // Verificar si el número es capicúa
        if (esCapicua(numero)) {
            System.out.println("El número " + numero + " es capicúa.");
        } else {
            System.out.println("El número " + numero + " no es capicúa.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Método para verificar si un número es capicúa
    private static boolean esCapicua(int numero) {
        int original = numero;
        int invertido = 0;

        while (numero > 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero /= 10;
        }

        // El número es capicúa si el número original es igual al número invertido
        return original == invertido;
    }
}




