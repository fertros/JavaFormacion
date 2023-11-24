package LamdasYStream;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio32 {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);
        numeros.add(10);
        numeros.add(11);
        numeros.add(12);
        numeros.add(13);
        numeros.add(14);
        numeros.add(15);
        numeros.add(16);
        numeros.add(17);
        numeros.add(18);
        numeros.add(19);
        numeros.add(20);
        numeros.add(21);
        //1. Filtra los números pares.
        numeros.stream()
              .filter(numero -> numero % 2 == 0)
              .forEach(System.out::println);
        //2. Eleva al cuadrado cada número filtrado.
        numeros.stream()
             .filter(numero -> numero % 2 == 0)
             .map(numero -> numero * numero)
             .forEach(System.out::println);
        //3. Eleva al cubo cada número filtrado.
        numeros.stream()
             .filter(numero -> numero % 2 == 0)
             .map(numero -> numero * numero)
             .map(numero -> Math.pow(numero, 3))
             .forEach(System.out::println);



    }
}
