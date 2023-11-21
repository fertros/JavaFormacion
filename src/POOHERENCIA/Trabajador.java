package POOHERENCIA;

public class Trabajador extends Persona {
    //Trabajor hereda de persona
    private String cargo;
    public String getCargo() { //Getter
        return cargo;
    }
    public void setCargo(String cargo) {//Setter
        this.cargo=cargo;
    }
}

/*En este ejemplo, se ha creado una clase Persona (cuyos atributos son nombre y dni),
así como sus respectivos métodos getter y setter.

Por otro lado, se ha creado otra clase, llamada Trabajador, que hereda de la clase Persona.
Cualquier objeto nuevo que se cree en esta clase Trabajador, ya contará con los atributos
nombre y dni, así como con sus métodos correspondientes, ya que los hereda de la clase Persona,
que será su clase base o su superclase.

Paralelamente, la clase Trabajador cuenta con un atributo propio, que es cargo,
y con sus métodos getter y setter para poder establecer y recuperar el valor que se le otorgue.

Como ya hemos señalado, esta nueva clase, aunque dentro de su bloque de instrucciones no se
indique, ya contará con los mismos atributos y métodos de la clase padre.
Sin embargo, la clase padre (Persona) no podrá contar con los atributos ni los métodos
de su subclase (Trabajador).

Los métodos heredados de la clase base se pueden sobrescribir (modificar o redefinir)
en las clases derivadas. En la clase derivada, el método se debe escribir con el mismo nombre,
número y tipo de parámetros, así como con el mismo tipo de retorno, que en la clase base.
De lo contrario, estaríamos sobrecargando el método, no redefiniéndolo.

El método sobrescrito puede presentar un modificador de acceso menos restrictivo que el de
la clase base. Si, por ejemplo, el método heredado es protected, se puede redefinir como public,
pero no como private, porque se trataría de un acceso más restrictivo que el asignado en la
clase base.

Cuando en una clase derivada se redefine un método de una clase base,
se oculta el método de la clase base y todas sus sobrecargas en esta.
Si queremos acceder al método de la clase base que ha quedado oculto en la clase derivada,
utilizaremos:

super.metodo();

Si queremos evitar que un método de la clase base sea modificado en la clase derivada,
debemos declararlo como método final. Por ejemplo:

public final void metodo() {

Veamos un ejemplo con la clase Trabajador 2: vamos a añadir a la clase Persona un método leer() para introducir
los valores, por medio del teclado, a los atributos de la clase.

 */


