package LamdasYStream;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio31 {
    public String nombre;
    public int edad;
    public String ciudad;

    public Ejercicio31(String nombre, int edad, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public static void main(String[] args) {
        List<Ejercicio31> empleados = new ArrayList<>();
        empleados.add(new Ejercicio31("Guillermo",34,"Madrid"));
        empleados.add(new Ejercicio31("María",25,"Barcelona"));
        empleados.add(new Ejercicio31("Pedro",25,"Barcelona"));
        empleados.add(new Ejercicio31("María",25,"Barcelona"));
        empleados.add(new Ejercicio31("María",25,"Barcelona"));

        empleados.stream()
                .filter(empleado -> empleado.getEdad() > 25)
                .forEach(empleado -> System.out.println(empleado.getNombre()));

        //Transfomar el resultado para mostrar la ciudad y el nombre de los mayores de 25
        empleados.stream()
               .filter(empleado -> empleado.getEdad() > 25)
               .map(empleado -> empleado.getCiudad() + " " + empleado.getNombre())
               .forEach(System.out::println);


    }


}
