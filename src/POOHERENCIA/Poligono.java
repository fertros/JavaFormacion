package POOHERENCIA;

public abstract class Poligono {
    private int lados;

    public Poligono(int lados) {
        this.lados = lados;
    }
    public int getLados() {
        return lados;
    }
    public void setLados(int lados) {
        this.lados = lados;
    }
    //Declaración del método abstracto área
    public abstract double area();
}

/* La clase Poligono contiene un único atributo lados.
Asimismo, se ha declarado como clase abstracta y contiene un método abstracto.
Ahora, a partir de esta clase Poligono, creamos una clase derivada llamada Cuadrado,
que debe implementar el método area(), pues, de lo contrario, también sería una clase abstracta.
 */

