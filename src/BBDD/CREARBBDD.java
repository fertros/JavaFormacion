package BBDD;

//Crear una base de datos
//        Establecemos la conexión.
//        Definimos en un bloque try – catch la sentencia para crear la base de datos.
//        Ejecutamos esa sentencia.
//        Cerramos la conexión con la base de datos.

import java.sql.*;
public class CREARBBDD {

    public static void main(String[] args) {

        Connection con = null;
        String Url = "jdbc:mysql://localhost:3306";

        try {
            con = DriverManager.getConnection(Url,"root","root");
            Statement stmt = con.createStatement();
            stmt.execute("CREATE DATABASE JORGE2;");
            System.out.println("Base de datos creada correctamente");

        } catch (SQLException e){
            System.out.println("Error en la conexion: "+e.toString());

        } finally {
            try {
                //Cerramos posibles conexiones abiertas
                if(con!=null) con.close();

            } catch (Exception e) {
                System.out.println(
                        "Error al cerrar la conexion "+e.toString());
            }
        }
    }
}