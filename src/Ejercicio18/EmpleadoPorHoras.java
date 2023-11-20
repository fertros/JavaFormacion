package Ejercicio18;

public class EmpleadoPorHoras implements Empleado {
    private String nombre;
    private int TarifaPorHora;
    public EmpleadoPorHoras(String nombre, int TarifaPorHora){
        this.nombre = nombre;
        this.TarifaPorHora = TarifaPorHora;
    }
    @Override
    public int CalcularSalario() {

        return TarifaPorHora;
    }

    @Override
    public String informacionEmpleado() {
        return nombre + TarifaPorHora;
    }
}
