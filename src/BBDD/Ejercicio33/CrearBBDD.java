package BBDD.Ejercicio33;

import java.sql.*;

public class CrearBBDD {

    public static void main(String[] args) {

        Connection con = null;
        String Url = "jdbc:mysql://localhost:3306";

        try {
            con = DriverManager.getConnection(Url, "root", "root");
            Statement stmt = con.createStatement();
            stmt.execute("CREATE DATABASE GestionClientes;");
            System.out.println("Base de datos creada correctamente");

        } catch (SQLException e) {
            System.out.println("Error de conexion" + e.toString());
        }finally {
            try{
                //Cerrar posibles conexiones
                if (con!=null) con.close();
            }catch (Exception e){
                System.out.println("Error al cerrar la aplicaion"+ e.toString());
            }
        }
    }
}
