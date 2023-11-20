package Ejercicio15;

public class Empleado {
    public String nombre;
    public int edad;
    public static float salario;

    // Constructor
    public Empleado(String nombre, int edad, float salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    // Métodos de acceso para el atributo 'nombre'
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos de acceso para el atributo 'edad'
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Métodos de acceso para el atributo 'salario'
    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public static void main(String[] args) {
        EmpleadoTiempoParcial empleado1 = new EmpleadoTiempoParcial("Guillermo",34,1300,34);

        empleado1.salariomes();
        System.out.println(empleado1.getEdad()+" "+ empleado1.getSalario()+" "+empleado1.getNombre()
        +" "+empleado1.salariomes());
    }
}