package POOHERENCIA;

public class Persona {
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

}