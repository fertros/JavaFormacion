package BBDD;

import java.sql.*;
import java.util.Properties;

public class CRUD {

    public static void main(String[] args) {

        Connection con = null;
        String Url = "jdbc:mysql://localhost:3306/JORGE";

        Properties prop = new Properties();
        prop.put("user", "root"); //"User", "Nombre de Usuario"
        prop.put("password", "123123123"); //"Password", "Contraseña"

        // INSERT

        try {
            con = DriverManager.getConnection(Url, prop);

        } catch (SQLException e) {
            System.out.println("Ha ocurrido un error "+e.toString());

        } finally {
            try {
                PreparedStatement stmt = null;
                String sentencia = "INSERT INTO programacion "
                        + "(alumno, curso) "
                        + "VALUES ('Nombre de Alumno','Curso del alumno');";
                stmt = con.prepareStatement(sentencia);
                stmt.execute();
                stmt.close();
            } catch (SQLException e) {
                System.out.println("Error en la ejecución "
                        +e.getErrorCode()+" "+e.getMessage());
            }
        }

        // SELECT
        try {
            con = DriverManager.getConnection(Url, prop);
        } catch (SQLException e) {
            System.out.println("Ha ocurrido un error "+e.toString());
        } finally {
            try {
                PreparedStatement stmt = null;
                String sentencia = "SELECT * FROM programacion";
                stmt = con.prepareStatement(sentencia);
                stmt.execute();
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    String nombre = rs.getString(1); //Indicamos el nº de columna
                    String curso = rs.getString(2);  //Indicamos el nº de columna
                    System.out.println(nombre+" "+curso);
                }
                stmt.close();
            } catch (SQLException e) {
                System.out.println("Error en la ejecución "
                        +e.getErrorCode()+" "+e.getMessage());
            }
        }

        // UPDATE
        try {
            PreparedStatement stmt = null;
            String sentencia = "UPDATE programacion SET curso='JAVA'"
                    + " WHERE alumno='Nombre de Alumno'";
            stmt = con.prepareStatement(sentencia);
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            System.out.println("Error en la ejecución "
                    +e.getErrorCode()+" "+e.getMessage());
        }

        // DELETE
        try {
            PreparedStatement stmt = null;
            String sentencia = "DELETE FROM programacion"
                    + " WHERE alumno='Nombre de Alumno'";
            stmt = con.prepareStatement(sentencia);
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            System.out.println("Error en la ejecución "
                    +e.getErrorCode()+" "+e.getMessage());
        }
    }
}