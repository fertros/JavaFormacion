package Ejercicios;


import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce los cupones");
        int totalCupones = Integer.parseInt(scanner.nextLine());

        int cuponesRestantes = totalCupones;

        // Calcula el número de barras de caramelo que se pueden obtener
        int barrasDeCaramelo = cuponesRestantes / 10;
        cuponesRestantes %= 10;

        // Calcula el número de chicles que se pueden obtener con los cupones restantes
        int chicles = cuponesRestantes / 3;
        cuponesRestantes %= 3;

        // Muestra los resultados
        System.out.println("Barras de caramelo: " + barrasDeCaramelo);
        System.out.println("Chicles: " + chicles);
        System.out.println("Cupones restantes: " + cuponesRestantes);
    }
}

