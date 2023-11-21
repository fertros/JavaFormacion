package EJERCICIOS;

import java.util.Scanner;

public class EJERCICIO2 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Paso 1: Pedir al usuario que introduzca 3 números enteros
        System.out.print("Introduce el primer número entero (a): ");
        int a = scanner.nextInt();

        System.out.print("Introduce el segundo número entero (b): ");
        int b = scanner.nextInt();

        System.out.print("Introduce el tercer número entero (c): ");
        int c = scanner.nextInt();

        // Paso 2: Operación 1 a*b/c
        double resultadoOperacion1 = (double) (a * b) / c;
        System.out.println("Resultado de la Operación 1 (a*b/c): " + resultadoOperacion1);

        // Paso 3: Operación 2 (a*c)%b
        int resultadoOperacion2 = (a * c) % b;
        System.out.println("Resultado de la Operación 2 ((a*c)%b): " + resultadoOperacion2);

        // Paso 4: Operación 3 2*(a+c b)/(b*c)
        double resultadoOperacion3 = 2 * ((a + c) / (double) (b * c));
        System.out.println("Resultado de la Operación 3 (2*(a+c)/(b*c)): " + resultadoOperacion3);

        // Paso 5: Operación 4 ((a*c)+(b%a))/a c
        double resultadoOperacion4 = ((a * c) + (b % a)) / (double) (a * c);
        System.out.println("Resultado de la Operación 4 ((a*c)+(b%a))/(a*c): " + resultadoOperacion4);

        // Opcional: Repetir las operaciones con números decimales
        // Paso 1: Pedir al usuario que introduzca 3 números decimales
        System.out.print("Introduce el primer número decimal (a): ");
        double aDecimal = scanner.nextDouble();

        System.out.print("Introduce el segundo número decimal (b): ");
        double bDecimal = scanner.nextDouble();

        System.out.print("Introduce el tercer número decimal (c): ");
        double cDecimal = scanner.nextDouble();

        // Repetir las operaciones con números decimales
        double resultadoOperacion1Decimal = (aDecimal * bDecimal) / cDecimal;
        System.out.println("Resultado de la Operación 1 (a*b/c) con decimales: " + resultadoOperacion1Decimal);

        double resultadoOperacion2Decimal = (aDecimal * cDecimal) % bDecimal;
        System.out.println("Resultado de la Operación 2 ((a*c)%b) con decimales: " + resultadoOperacion2Decimal);

        double resultadoOperacion3Decimal = 2 * ((aDecimal + cDecimal) / (bDecimal * cDecimal));
        System.out.println("Resultado de la Operación 3 (2*(a+c)/(b*c)) con decimales: " + resultadoOperacion3Decimal);

        double resultadoOperacion4Decimal = ((aDecimal * cDecimal) + (bDecimal % aDecimal)) / (aDecimal * cDecimal);
        System.out.println("Resultado de la Operación 4 ((a*c)+(b%a))/(a*c) con decimales: " + resultadoOperacion4Decimal);

        // Cerrar el Scanner para evitar fugas de recursos
        scanner.close();
    }
}

