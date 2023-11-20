package POOGETTERSETTER;

public class PrinciparlEstudiante {
    public static void main(String[] args) {

        //Creamos un objeto de la clase estudiante
        Estudiante estudiante1 = new Estudiante();

        //Se ingresan los valores llamando al método con el punto
        estudiante1.setNombre("Pedro");
        estudiante1.setApellido("Conesa");
        estudiante1.setCorreo("correodepedro@conesa.com");

        //Ahora podemos obtener los datos llamando al método
        System.out.println(estudiante1.getNombre());
        System.out.println(estudiante1.getApellido());
        System.out.println(estudiante1.getCorreo());
    }
}