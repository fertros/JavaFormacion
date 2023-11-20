package Ejercicio17;

class Administrador implements Autenticable{

    private String usuario;

    private String contrasenia;
    public Administrador(String nombreUsuario, String contrasenia){
        this.usuario = nombreUsuario;
        this.contrasenia = contrasenia;
    }


    @Override
    public boolean autenticar() {
        return contrasenia.equals("Admin");
    }
}
