package Ejericio24;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Operaciones {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero para el logaritmo");
        try {
            double entralog = entrada.nextDouble();
            double a = logaritmo(entralog);
            System.out.println("resultadoa" + a);
        } catch (InputMismatchException e) {
            System.out.println("Has metido una letra que eres un paco" + e);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double logaritmo(double i) throws ArithmeticException {
        if (i <= 0) {
            throw new ArithmeticException("Error no pongas negativos");
        }
        return Math.log(i);
    }
    public static double raizcuadrara(double i){
        return Math.sqrt(i);
    }

}
