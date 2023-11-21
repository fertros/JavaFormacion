package POOCONSTRUCTOR;

public class PrincipalVehiculo {
    public static void main(String[] args) {

        /* Creamos objetos del tipo Vehiculo y gracias al constructor
        * asignamos los valores a cada variable de los vehiculos */

        Vehiculo coche1=new Vehiculo(4,50,5);
        Vehiculo coche2=new Vehiculo(5,75,6);
        coche1.Autonomia();

        //Mostramos la autonomia de los vehículos con el método creado
        System.out.println("Autonomia del coche1= "+coche1.Autonomia());
        System.out.println("Autonomia del coche2= "+coche2.Autonomia());
        }
    }

/* En este ejemplo, contamos con dos clases, una principal, denominada PrincipalVehiculo,
y otra llamada Vehiculo. Dentro de esta última clase, se han declarado unas variables y
se ha creado un constructor, de modo que cada vez que creemos un objeto de la clase Vehiculo
tendremos que introducir los valores que solicita por defecto, inicializando así los
atributos del objeto. Dentro de la misma clase, se ha creado un método denominado autonomía
que realiza una operación devolviendo su resultado.

Por otro lado, en la clase PrincipalVehiculo se han creado dos objetos de tipo Vehiculo
y se ha definido un constructor que nos solicita que ingresemos los valores de las variables
a la hora de crearlos. Una vez creados los objetos, podemos llamar al método autonomía para
que el programa nos devuelva el resultado correspondiente a cada uno de los objetos.
 */