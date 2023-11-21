package EJERCICIOS;
import java.util.Scanner;

public class EJERCICIO4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contadorEspacios = 0;

        System.out.println("Inserta caracteres o frases completas (introduce '.' para finalizar):");

        while (true) {
            String entrada = scanner.nextLine();

            // Verificar si el usuario quiere salir
            if (entrada.equals(".")) {
                break;
            }

            // Contar espacios en la entrada
            for (int i = 0; i < entrada.length(); i++) {
                if (entrada.charAt(i) == ' ') {
                    contadorEspacios++;
                }
            }
        }
        System.out.println("Número total de espacios introducidos: " + contadorEspacios);
        scanner.close();
    }
}


