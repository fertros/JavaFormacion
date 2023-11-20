package Ejercicio16;

public class Lector {
    public String nombre;

    public int id;

    public Libro[] librosPrestados;
    private int librosPrestadosCount;

    public Lector (String nombre,int id,int maxLibrosPrestados){
        this.nombre = nombre;
        this.id = id;
        this.librosPrestados = new Libro[maxLibrosPrestados];
        this.librosPrestadosCount = 0;
    }

    public String getNombre (){return nombre;}
    public void setNombre(String nombre){this.nombre = nombre;}

    public int getId (){return  id;}
    public void setId(int id){this.id = id;}

    //Metodo prestar un libro

    public void prestarLibro(Libro libro){
        if (librosPrestadosCount < librosPrestados.length){
        librosPrestados[librosPrestadosCount] = libro;
        librosPrestadosCount++;
        }else{
            System.out.println("No se prestan mas libros" + nombre);
        }

        //Metodo devolver libro

    }



}
