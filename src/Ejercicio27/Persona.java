package Ejercicio27;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Persona {
    private String Nombre;
    private String Apellido1;
    private String Apellido2;
    private String Genero;
    private int edad;

    public Persona(String Nombre, String Apellido1, String Apellido2, String Genero, int edad) {
        this.Nombre = Nombre;
        this.Apellido1 = Apellido1;
        this.Apellido2 = Apellido2;
        this.Genero = Genero;
        this.edad = edad;
    }
    @Override
    public String toString() {
        return "Persona [nombre=" + Nombre + ", edad=" + edad + ", genero=" + Genero + ", apellido1=    " + Apellido1 +
                ", apellido2=" + Apellido2 + "]";
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public void setApellido1(String apellido1) {
        Apellido1 = apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public void setApellido2(String apellido2) {
        Apellido2 = apellido2;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static void main(String[] args) {
        List<Persona> listapersona  = new ArrayList<>();

        Persona persona1 = new Persona("guillermo","Romero","Lorenzo","M",32);
        Persona persona2 = new Persona("guillermo","Romero","Lorenzo","M",34);
        Persona persona3 = new Persona("guillermo","Romero","Lorenzo","M",23);
        Persona persona4 = new Persona("guillermo","Romero","Lorenzo","M",76);
        Persona persona5 = new Persona("guillermo","Romero","Lorenzo","M",34);
        Persona persona6 = new Persona("guillermo","Romero","Lorenzo","M",15);
        Persona persona7 = new Persona("guillermo","Romero","Lorenzo","M",31);
        Persona persona8 = new Persona("guillermo","Romero","Lorenzo","M",6);

        listapersona.add(persona1);
        listapersona.add(persona2);
        listapersona.add(persona3);
        listapersona.add(persona4);
        listapersona.add(persona5);
        listapersona.add(persona6);
        listapersona.add(persona7);
        listapersona.add(persona8);

        listapersona.sort(Comparator.comparingInt(Persona::getEdad));
        for(Persona persona : listapersona) {
            System.out.println(persona.toString());
        }

    }
}