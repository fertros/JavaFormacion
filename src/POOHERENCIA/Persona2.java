package POOHERENCIA;

import java.util.Scanner;

public class Persona2 {
    //Atributos de la clase persona
    private String dni;
    private String nombre;

    public String getNif() {//Getter
        return dni;
    }
    public void setNif(String nif) {//Setter
        this.dni = nif;
    }
    public String getNombre() {//Getter
        return nombre;
    }
    public void setNombre(String nombre) {//Setter
        this.nombre = nombre;
    }
    public void leer() {//Método para leer
        Scanner entrada = new Scanner(System.in);
        System.out.println("DNI: ");
        dni = entrada.nextLine();
        System.out.println("Nombre: ");
        nombre = entrada.nextLine();
    }
}

/*La clase Trabajador, como hemos visto en el ejemplo anterior, es derivada de Persona,
así que ahora heredará también este método leer(), pudiendo usarlo como propio.
No obstante, utilizando este método, solo se leen por teclado dni y nombre.
Por tanto, en la clase Trabajador se debe sobrescribir o modificar este método
heredado para que también se lea el cargo. De este modo, el método leer() de Trabajador
invocará al método leer() de Persona para leer el DNI y el nombre y, a continuación,
se leerá el cargo.

La clase Trabajador con el método leer() sobrescrito queda así:
 */