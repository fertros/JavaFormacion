package Ejercicio13;

public class Perro extends Animal {
    private String raza;
    public Perro(String nom, int ed,String raza) {
        super(nom, ed);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public static void main(String[] args) {
        Perro perro1 = new Perro("Tequi", 14,"pitbull");
        System.out.println(perro1.getEdad()+perro1.getNombre()+perro1.getRaza());
    }
}
