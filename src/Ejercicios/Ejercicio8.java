package Ejercicios;


public class Ejercicio8 {
    public static void main(String[] args) {
        int[] arrayDePrueba = {1, 2, 3, 3, 9, 8, 7, 4, 6, 7, 0, 4, 5};

        for (int i = 0; i < arrayDePrueba.length; i++) {
            for (int j = i + 1; j < arrayDePrueba.length; j++) {
                if (arrayDePrueba[i] == arrayDePrueba[j]) {
                    System.out.println("Atencion numero duplicado " + arrayDePrueba[i]);
                }
            }
        }

    }
}
