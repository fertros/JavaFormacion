package Ejercicio21;

import java.util.Arrays;
import java.util.OptionalInt;

public class Temperaturas {
    public static void main(String[] args) {
        int[] temp = {15,21,32,17,23,32,29};

        int TempMedia = MediaTemp(temp);
        System.out.println("La Temperatura media es : " + TempMedia);
        OptionalInt TempMax = MaxTemp(temp);
        System.out.println("La Temperatura maxima es : " + TempMax);
        int TemMediana = Mediana(temp);
        System.out.println("La Temperatura mediana es : " + TemMediana);

    }



    public static int MediaTemp(int[] temp){
        int sumar = 0;
        for (int i : temp) {
            sumar += i;
        }
        return sumar / temp.length;
    }
    public static OptionalInt MaxTemp(int[] temp){
        return Arrays.stream(temp).max();
    }
    public static int Mediana(int[] temp){
        Arrays.sort(temp);
        int longitud = temp.length;
        if(longitud%2 == 0){
            int indice = longitud/2 -1;
            int indie2 = longitud/2;
            return temp[indice] + temp[indie2] /2;
        }else{
            int indicecentral = longitud/2;
            return temp[indicecentral];
        }
    }
}
