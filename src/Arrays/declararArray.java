package Arrays;

import java.util.Scanner;

public class declararArray {
    public static void main(String[] args) {
        int[] notas = new int[2];
        double[] Temperatura;

        Scanner teclado = new Scanner(System.in);

        int[] notas2 = new int[3];
        for (int i = 0; i < notas2.length ; i++) {
            System.out.println("introduce la nota " + i);
            notas2[i] = Integer.parseInt(teclado.nextLine());
        }
        //acceder a las notas de un array
        for (int i = 0; i < notas.length -1; i++) {
            System.out.println("la nota " + i + "es" + notas2[i]);

        }

        for (int num: notas2){
            System.out.println(num);
        }
    }


}
