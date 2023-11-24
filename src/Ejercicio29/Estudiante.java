package Ejercicio29;

import java.util.HashSet;
import java.util.Set;

public class Estudiante {
    private String nombre;
    private int nEstudiante;
    private Set<String> nombresCurso;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getnEstudiante() {
        return nEstudiante;
    }

    public void setnEstudiante(int nEstudiante) {
        this.nEstudiante = nEstudiante;
    }

    public Set<String> getNombresCurso() {
        return nombresCurso;
    }

    public void setNombresCurso(Set<String> nombresCurso) {
        this.nombresCurso = nombresCurso;
    }

    public Estudiante(String nombre, int nEstudiante) {
        this.nombre = nombre;
        this.nEstudiante = nEstudiante;
        this.nombresCurso = new HashSet<>();
    }
    public void agregarCurso(String curso){
        nombresCurso.add(curso);
    }
    public void eliminarCurso(String curso){
        if(nombresCurso.isEmpty()) {
            System.out.println("La lista esta vacia");
        }else if (nombresCurso.contains(curso)){
                nombresCurso.remove(curso);
        }else{
            System.out.println("Este estudiante no esta en este curso");
        }
    }
    public void mostrarCursos(){
        System.out.println("los cursos de "+ getNombre() + " son: " + nombresCurso);
    }
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", nestudiante=" + nEstudiante +
                ", curso=" + nombresCurso + "]";
    }

}
