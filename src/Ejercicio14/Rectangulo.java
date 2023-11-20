package Ejercicio14;

public class Rectangulo extends Figura{
    private int base;
    private int altura;

    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura= altura;
    }
    @Override
    public double area(){
        return base * altura;
    }
    @Override
    public double perimetro(){
        return (2*base)+(2*altura);
    }
}
