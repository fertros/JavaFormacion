package EJERCICIOS;
import java.util.Scanner;
public class EJERCICIO1 {
     public static void main(String[] args) {
            // Crear un objeto Scanner para leer la entrada del usuario
            Scanner scanner = new Scanner(System.in);

            // Pedir al usuario que ingrese el peso en la Tierra
            System.out.print("Ingrese el peso en la Tierra (en kilos): ");
            double pesoEnLaTierra = scanner.nextDouble();

            // Calcular el peso en la Luna (17% de la gravedad en la Tierra)
            double pesoEnLaLuna = pesoEnLaTierra * 0.17;

            // Mostrar el resultado
            System.out.println("Un peso de " + pesoEnLaTierra + " kilos en la Tierra equivale a "
                    + pesoEnLaLuna + " kilos en la Luna.");

            // Cerrar el Scanner para evitar fugas de recursos
            scanner.close();
        }
    }

