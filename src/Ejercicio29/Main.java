package Ejercicio29;



public class Main {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("guillermo",3423452);
        Estudiante estudiante2 = new Estudiante("guillermo",3423452);
        estudiante1.agregarCurso("mates");
        estudiante1.agregarCurso("lengua");
        estudiante1.agregarCurso("ingles");
        estudiante1.eliminarCurso("mates");
        estudiante1.mostrarCursos();
        System.out.println(estudiante1);


    }
}
