package Ejercicio14;

public class Circulo extends Figura{
    //Atributos
    private double radio;


    //contructor
public Circulo(int radio){
    this.radio = radio;
}

    //Metodo
    @Override
    public double area(){
        return Math.PI * Math.pow(radio,2);
    }
    @Override
    public double perimetro(){
        return Math.PI * (radio *2);
    }

}
