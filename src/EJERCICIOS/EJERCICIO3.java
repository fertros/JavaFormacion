package EJERCICIOS;
import java.util.Scanner;

public class EJERCICIO3 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

            // Pedir al usuario que introduzca las notas
         System.out.println("Introduce la nota de Matemáticas:");
         double matematicas = scanner.nextDouble();

         System.out.println("Introduce la nota de Física:");
         double fisica = scanner.nextDouble();

         System.out.println("Introduce la nota de Química:");
         double quimica = scanner.nextDouble();

         System.out.println("Introduce la nota de Lenguaje:");
         double lenguaje = scanner.nextDouble();

         System.out.println("Introduce la nota de Historia:");
         double historia = scanner.nextDouble();

         // Calcular la media de las notas
         double media = (matematicas + fisica + quimica + lenguaje + historia) / 5;

         // Indicar el rango de la nota final
         System.out.println("Nota media: " + media);

         if (media >= 0 && media < 3) {
             System.out.println("Rango: Muy deficiente");
         } else if (media >= 3 && media < 5) {
             System.out.println("Rango: Insuficiente");
         } else if (media >= 5 && media < 6) {
             System.out.println("Rango: Suficiente");
         } else if (media >= 6 && media < 7) {
             System.out.println("Rango: Bien");
         } else if (media >= 7 && media < 9) {
             System.out.println("Rango: Notable");
         } else if (media >= 9 && media <= 10) {
             System.out.println("Rango: Sobresaliente");
         } else {
             System.out.println("Error: La nota ingresada no es válida");
         }
         scanner.close();
     }
}
