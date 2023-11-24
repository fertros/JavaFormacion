package Ejercicio26;


import java.util.ArrayList;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        ArrayList<String> listaNombres = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("------Menu---------------------");
            System.out.println("Agregar un nomnre ne la lista");
            System.out.println("Eliminar un nombre de la lista");
            System.out.println("Imprimir la lista de nombre");
            System.out.println("Buscar un nombre en la lista");
            System.out.println("Salir del programa");
            System.out.println("------- Fin Menu----------------");
        } while (!scanner.hasNextInt());
        {
            System.out.println("Entrada no válida. Ingrese un número.");
            scanner.next();

            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    agregarNombre(listaNombres, scanner);
                    break;
                case 2:
                    eliminarNombre(listaNombres, scanner);
                    break;
                case 3:
                    imprimirNombre(listaNombres);
                    break;
                case 4:
                    buscarNombre(listaNombres, scanner);
                    break;
                case 5:
                    System.out.println("Opcion SALIR activada......corre");
                default:
                    System.out.println("Elige una opcion correcta para el menu mongolo");
            }
        }
        while (opcion != 5) ;
        scanner.close();
    }
    private static void agregarNombre(ArrayList<String> lista, Scanner scanner){
        System.out.println("Introduce un nombre a añadir en la lista");
        String nombre = scanner.nextLine();
        lista.add(nombre);
    }
    private static void eliminarNombre(ArrayList<String> lista, Scanner scanner){
        if(lista.isEmpty()){
            System.out.println("La lista esta vacia melon");
        }else{
            System.out.println("Escribe un nombre para eliminar");
            String nombreEliminar = scanner.nextLine();
            if(lista.remove(nombreEliminar)){
                
            }
        }

    }
    private static void imprimirNombre(ArrayList<String> lista){
        if (lista.isEmpty()) {
            System.out.println("La lista de nombres está vacía.");
        } else {
            System.out.println("Lista de nombres:");
            for (String nombre : lista) {
                System.out.println(nombre);
            }
        }
    }
    private static void buscarNombre(ArrayList<String> lista,Scanner scanner){

    }
}
