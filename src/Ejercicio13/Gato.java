package Ejercicio13;

public class Gato extends Animal {
    private String colorPelo;

    public Gato(String nom, int ed, String colorPelo) {
        super(nom, ed);
        this.colorPelo = colorPelo;
    }



    public static void main(String[] args) {
        Gato gato1 = new Gato("Wiskas", 10, "Rojo");
        System.out.println(gato1);
    }
}
