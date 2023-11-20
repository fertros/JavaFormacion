package Ejercicio18;

public class EmpleadoComision implements Empleado{
    private String nombre;
    private int VentasRealizadas;
public EmpleadoComision(String nombre, int VentasRealizadas){
    this.nombre = nombre;
    this.VentasRealizadas = VentasRealizadas;
}

    @Override
    public int CalcularSalario() {
        return VentasRealizadas;
    }

    @Override
    public String informacionEmpleado() {
        return nombre + VentasRealizadas;
    }
}
