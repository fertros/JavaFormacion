package Ejercicio15;

public class EmpleadoTiempoParcial extends Empleado {
    public double horas;

    public EmpleadoTiempoParcial(String nombre, int edad, float salario, double horas) {
        super(nombre, edad, salario);
        this.horas = horas;
    }

    public double salariomes() {
        double tarifaHora = 4.5;
        return horas * tarifaHora;
    }
}
