package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final double pulgada = 39.37;
        int contador = 1;
        for(int i = 1 ;i <= 144 ;i++){
            double pulgadas = pulgada * i;
            if(i ==1) {
                System.out.println(contador + " metro son " + pulgadas);
            }else{
                System.out.println(contador + " metros son " + pulgadas);
            }
            contador++;

            if(i % 12 ==0){
                System.out.println("/n");
            }
        }
        entrada.close();
    }
}
