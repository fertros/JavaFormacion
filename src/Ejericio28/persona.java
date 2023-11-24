package Ejericio28;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class persona {
    private String Nombre;
    private String Apellido;
    private String Genero;
    private int edad;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
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

    public persona(String nombre, String apellido, String genero, int edad) {
        Nombre = nombre;
        Apellido = apellido;
        Genero = genero;
        this.edad = edad;
    }
    public persona() {

    }

    @Override
    public String toString() {
        return "Persona [nombre=" + Nombre + ", edad=" + edad + ", genero=" + Genero + ", apellido=" + Apellido + "]";
    }



}
