package EJERCICIOS;
import java.util.Scanner;

public class EJERCICIO5 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         System.out.println("Introduce un número para verificar si es un número de Armstrong:");
         int numero = scanner.nextInt();

         int numOriginal = numero;
         int suma = 0;
         int numCifras = String.valueOf(numero).length();

         while (numero > 0) {
             int digito = numero % 10;
             suma += (int) Math.pow(digito, numCifras);
             numero /= 10;
         }

         if (suma == numOriginal) {
             System.out.println(numOriginal + " es un número de Armstrong.");
         } else {
             System.out.println(numOriginal + " no es un número de Armstrong.");
         }

         scanner.close();
     }
}


