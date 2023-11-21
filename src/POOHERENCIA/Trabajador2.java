package POOHERENCIA;

import java.util.Scanner;

public class Trabajador2 extends Persona2 { //Trabajador2 hereda de Persona2

    private String cargo;

    public Trabajador2() {
        super();
        System.out.println("Constructor del Trabajador2");
    }
    public String getCargo() {//Getter
        return cargo;
    }
    public void setCargo(String cargo) {//Setter
        this.cargo = cargo;
    }

    @Override //Con esto indicamos que el método se sobrescribe
    public void leer() {
        Scanner entrada = new Scanner(System.in);
        super.leer(); //Se llama al método leer de Persona2
        System.out.println("Cargo: ");
        cargo = entrada.nextLine();
    }
}

/*Como ya hemos señalado, cuando en una clase derivada sobrescribe un método de una clase base,
se oculta el método de la clase base y todas sus sobrecargas en esta. Por esta razón,
para ejecutar el método leer() de Persona, se debe escribir super.leer();

Una clase derivada puede declarar de nuevo un atributo heredado
(si se trata de un atributo public o protected en la clase base).
En este caso, el atributo de la clase base quedará oculto por el de la clase derivada.
Para acceder a un atributo de la clase base que ha quedado oculto en la clase derivada,
se escribe:

super.atributo;

Cuando una clase hereda, solo recibe los métodos y los atributos, no hereda los
constructores, motivo por el que cada clase derivada poseerá sus propios constructores.
La clase base es la encargada de inicializar sus atributos, mientras que la clase derivada
se encarga de inicializar solo los suyos.

El constructor por defecto de la clase derivada llama al constructor por defecto
de la clase base. La instrucción para invocar al constructor por defecto de la
clase base es:

super();

En las clases derivadas, todos los constructores contienen de forma implícita la
instrucción super() como primera instrucción.
 */