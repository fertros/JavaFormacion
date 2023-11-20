package Ejercicio13;

public class Animal {
    private String nombre;

    private int edad;

    public Animal(String nom, int ed) {
        this.nombre = nom;
        this.edad = ed;
    }

    public void setNombre(String nom) {
        this.nombre = nom;
    }
    public String getNombre(){return nombre;}

    public void setEdad(int ed){
        this.edad = ed;
    }
    public int getEdad(){
        return edad;
    }

}
