package Ejercicio15;

public class EmpleadoTiempoCompleto extends Empleado{

    public EmpleadoTiempoCompleto(String nombre, int edad, float salario,String cargo) {
        super(nombre, edad, salario);
    }

//metodos
    public double salariomes(){
    return salario*1.1;
    }
}
