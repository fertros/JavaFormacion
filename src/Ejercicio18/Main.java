package Ejercicio18;

public class Main {
    public static void main(String[] args) {

        Empleado[] empleados= {
                new EmpleadoAsalariado("guillermo", 1300),
                new EmpleadoPorHoras("Felipe", (int) 4.4),
                new EmpleadoComision("Jimenez",34)
        };
        for (Empleado empleado : empleados){
            System.out.println(empleado.informacionEmpleado());
        }
    }
}
