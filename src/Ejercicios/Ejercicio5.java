package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Escribe un numero: ");
        Scanner entrada = new Scanner(System.in);
        String nAmstrong = entrada.nextLine();

        //String nAmstrong = String.valueOf(entrada);

        int longitud = nAmstrong.length();
        System.out.println("longitud" + longitud);
        double suma = 0;
        for (int i = 0; i< longitud;i++){
            String letra = String.valueOf(nAmstrong.charAt(i));

            suma += Math.pow(Double.parseDouble(letra),longitud);
            System.out.println(suma);
        }

        int nAmstrongint = Integer.parseInt(nAmstrong);
        if(nAmstrongint == suma){
            System.out.println("Es un numero de Amstrong");
        }else{
            System.out.println("No es un numero de amstrong");
        }
    }
}
