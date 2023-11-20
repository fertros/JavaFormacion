package Ejercicio17;

class Usuario implements Autenticable{
    private String nombreUsuario;
    private String contrasenia;

    public Usuario(String nombreUsuario, String contrasenia){
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
    }

    @Override
    public boolean autenticar() {
        return contrasenia.equals("1234");
    }
}
