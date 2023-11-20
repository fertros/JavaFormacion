package Ejercicio18;

public class EmpleadoAsalariado implements Empleado {
    private String nombre;
    private int SalarioMensual;

    public EmpleadoAsalariado(String nombre, int SalarioMensual){
        this.nombre = nombre;
        this.SalarioMensual = SalarioMensual;
    }
    @Override
    public int CalcularSalario() {
        return SalarioMensual;
    }

    @Override
    public String informacionEmpleado() {
        return nombre + SalarioMensual;
    }

}