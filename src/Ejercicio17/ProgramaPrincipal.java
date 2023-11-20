package Ejercicio17;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("guillermo", "12345");
        Administrador administrador1 = new Administrador("Admin", "Admin");

        usuario1.autenticar();
    }



}
