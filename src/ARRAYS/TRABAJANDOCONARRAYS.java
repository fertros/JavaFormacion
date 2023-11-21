package ARRAYS;

public class TRABAJANDOCONARRAYS {
    public static void main(String[] args) {
        // Declaración de un array de tipo int de 5 elementos
        int[] notas = new int[5];

        // El elemento que ocupa la posición 2 tiene el valor 6
        notas[2] = 6;

        // La variable a tendrá el mismo valor que la posición 2
        int a = notas[2];

        // Muestra la longitud del array
        System.out.println(notas.length);

        // Ejemplo de inicialización de arrays
        String[] ciudades = {"Madrid", "Berlín", "Tokio", "El Cairo"};
        double[] temperaturas = {6.7, 4.5, 9.9, 5.1};
        boolean[] resultados = {true, true, false, false, false, true};

        // Ejemplo de recorrido de un array utilizando for
        String[] ciudadesArray = {"Madrid", "Berlín", "Tokio", "San José", "El Cairo"};
        for (int i = 0; i < ciudadesArray.length; i++) {
            // Imprime cada valor del Array
            System.out.println(ciudadesArray[i]);
        }

        // Ejemplo de recorrido de un array utilizando for mejorado (Java 5 en adelante)
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
            System.out.println("Elemento " + i + ": " + numeros[i]);
        }
        for (int num : numeros) {
            System.out.println(num + " ");
        }

        // Ejemplo de concatenación de strings
        String texto1 = "Me gusta";
        String texto2 = " estudiar Java";
        texto2 = texto1 + texto2;
        System.out.println(texto2);
        // El resultado sería: "Me gusta estudiar Java"

        String texto="Java";

        //Crea un array con una letra en cada posición
        char[]letras=texto.toCharArray();
        char[]vocales= {'a','e','i','o','u'};

        //Crea un String con las letras aeiou
        String s=new String(vocales);
    }
}