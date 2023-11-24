package BBDD;

// Creación de una tabla
//     Establecemos la conexión.
//     Definimos la sentencia para crear la tabla.
//     Ejecutamos esa sentencia.
//     Si se produce alguna excepción en la ejecución de la sentencia SQL, imprimimos la información.
//     Cerramos la conexión a la base de datos.

import java.sql.*;
import java.util.Properties;

public class CREARTABLAS {
    public static void main(String[] args) {

        Connection con = null;
        String Url = "jdbc:mysql://localhost:3306/JORGE";

        Properties prop = new Properties();
        prop.put("user", "root"); //"User", "Nombre de Usuario"
        prop.put("password", "root"); //"Password", "Nuestro Password"

            try {
                con = DriverManager.getConnection(Url, prop);

            } catch (SQLException e) {
                System.out.println("Ha ocurrido un error "+e.toString());

            } finally {
                try {
                    PreparedStatement stmt = null;
                    String sentencia = "CREATE TABLE programacion ("
                            + "alumno VARCHAR(50),"
                            + " curso VARCHAR(20))";
                    stmt = con.prepareStatement(sentencia);
                    stmt.execute();
                    stmt.close();

                } catch (SQLException e) {
                    System.out.println("Error en la ejecución "
                            +e.getErrorCode()+" "+e.getMessage());
                }
            }
        }
    }
