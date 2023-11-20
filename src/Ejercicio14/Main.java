package Ejercicio14;

public class Main {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(25);

        circulo1.area();

        Rectangulo rectangulo1 = new Rectangulo(30, 50);

        rectangulo1.area();

        Triangulo triangulo1 = new Triangulo(40, 23, 34, 40);
        triangulo1.area();
        System.out.println(triangulo1.area());
        Triangulo triangulo2 = new Triangulo(34,54);
    }
}
