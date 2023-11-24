package Ejericio28;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<persona> listapersona = new ArrayList<>();
        for (int i = 0; i < 1; i++) {
            persona persona1 = new persona();
            persona1.setNombre(scanner.nextLine());
            persona1.setApellido(scanner.nextLine());
            persona1.setEdad(Integer.parseInt(scanner.nextLine()));
            persona1.setGenero(scanner.nextLine());
            listapersona.add(persona1);
        }

    retornarNombregenero(listapersona);
    float mediaEdad = retornarPromedioEdades(listapersona);
        System.out.println("La edad media es " + mediaEdad);
    }


    public static void retornarNombregenero(List<persona> lista){
        System.out.println(lista);
    }
    public static int retornarPromedioEdades(List<persona> lista){
        int contador = 0;
        int suma = 0;
        for (Ejericio28.persona persona : lista) {
            suma += persona.getEdad();
            contador++;
        }
        return  suma/contador;
    }
}
