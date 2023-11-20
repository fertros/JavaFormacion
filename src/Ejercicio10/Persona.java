package Ejercicio10;

public class Persona {
    //Variables de la clase.
    private  String nombre;

    private String apellido;

    private String DNI;

    private String FechaNacimiento;

    //Constructor para la persona

    Persona(String nom ,String ape, String dni, String Fecha){
        nombre = nom;
        apellido = ape;
        DNI = dni;
        FechaNacimiento = Fecha;
    }

    //Metodo para  imprimir

    public void imprimir(){
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(DNI);
        System.out.println(FechaNacimiento);
    }

    public static void main(String[] args) {

        Persona persona1 = new Persona("guillermo","Romero","44554","24/9/1991");

        persona1.imprimir();
    }
}

