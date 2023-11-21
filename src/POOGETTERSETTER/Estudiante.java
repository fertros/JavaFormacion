package POOGETTERSETTER;

public class Estudiante {
    //Variables de la clase
    private String nombre;
    private String apellido;
    private String correo;

    public String getNombre() { //Getter
        return nombre;
    }
    public void setNombre(String nombre) { //Setter
        this.nombre = nombre;
    }
    public String getApellido() { //Getter
        return apellido;
    }
    public void setApellido(String apellido) { //Setter
        this.apellido = apellido;
    }
    public String getCorreo() { //Getter
        return correo;
    }
    public void setCorreo(String correo) { //Setter
        this.correo = correo;
    }
}

/*Vamos a explicar este ejemplo paso a paso:
Por un lado, creamos la clase Estudiante, que contiene variables o atributos propios.
Dentro de esta clase, también se han creado varios métodos setters y getters para recoger
los valores que se asignen a las variables, así como para devolverlos.
En la clase Ejemplos, que es la que contiene el método main y, por tanto,
donde comenzará la ejecución del código, se ha creado un objeto de tipo Estudiante
llamado estudiante1.

Mediante los métodos creados anteriormente en la clase Estudiante, se pueden asignar los
valores correspondientes a los atributos del objeto.
Del mismo modo, con los métodos getters creados, se pueden recuperar los valores
almacenados para mostrarlos o emplearlos en otras funciones que, eventualmente,
se pudieran crear.

En Java, se utilizará frecuentemente la palabra reservada this: se trata de un operador
que hace referencia al objeto actual.
 */
