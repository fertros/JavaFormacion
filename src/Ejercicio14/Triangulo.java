package Ejercicio14;

public class Triangulo extends Figura {
    private int base;
    private int lado3;
    private int lado2;
    private int altura;


    public Triangulo(int base, int lado2, int lado3,int altura){
        this.base =base;
        this.lado2=lado2;
        this.lado3=lado3;
        this.altura=altura;
    }
    public Triangulo(int base,int altura){
        this.base=base;
        this.altura=altura;
    }

    @Override
    public double area(){
        return (double) (base * altura) /2;
    }
    @Override
    public double perimetro(){
        return base+lado2+lado3;
    }
}
