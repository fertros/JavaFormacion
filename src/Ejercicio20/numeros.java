package Ejercicio20;

import java.util.Arrays;

public class numeros {
    public static void main(String[] args) {
        String[] listaResultados = new String[20];

        for (int i = 0; i < listaResultados.length; i++) {
            int numero = i + 1;

            if (numero % 3 == 0 && numero % 5 == 0) {
                listaResultados[i] = "FizzBuzz";
            } else if (numero % 3 == 0) {
                listaResultados[i] = "Fizz";
            } else if (numero % 5 == 0) {
                listaResultados[i] = "Buzz";
            } else {
                listaResultados[i] = Integer.toString(numero);
            }
        }

        System.out.println(Arrays.toString(listaResultados));
    }
}