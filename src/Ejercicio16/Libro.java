package Ejercicio16;

public class Libro {
    public String titulo;

    public String autor;
    public int añoPublicacion;
    public boolean disponible;

    public Libro(String titulo,String autor, int añoPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.disponible = true;

    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getAñoPublicacion(){
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion){this.añoPublicacion = añoPublicacion;}

    public boolean getDisponible(){return disponible;}

    public void setDisponible(boolean disponible){this.disponible = disponible;}



}
