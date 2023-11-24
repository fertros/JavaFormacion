package BBDD.Ejercicio33;

import java.sql.*;
import java.util.Properties;
import java.util.Scanner;


public class Consultas {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws SQLException {

        Connection con = null;
        String Url = "jdbc:mysql://localhost:3306/gestionclientes";

        Properties prop = new Properties();
        prop.put("user", "root"); //"User", "Nombre de Usuario"
        prop.put("password", "root"); //"Password", "Nuestro Password"
        try {
            con = DriverManager.getConnection(Url, prop);
        } catch (SQLException e) {
            System.out.println("Error de conexion" + e.toString());
        } finally {
            try {
                PreparedStatement stmt = null;
                String sentencia = "CREATE TABLE IF NOT EXIST clientes("
                        + "id identity (1,1) primary key,"
                        + "nombre VARCHAR(255),"
                        + "apellido VARCHAR(255),"
                        + "edad int)";
                stmt = con.prepareStatement(sentencia);
                stmt.execute();
            } catch (SQLException e) {
                System.out.println("Error" + e.getErrorCode() + " " + e.getMessage());
            }
        }
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("------Menu---------------------");
            System.out.println("1.Agregar un nombre a la tabla");
            System.out.println("2.Leer los clientes de la tabla");
            System.out.println("3.Actualizar un cliente");
            System.out.println("4.Eliminar un cliente");
            System.out.println("5.Salir del programa");
            System.out.println("------- Fin Menu----------------");
        } while (scanner.hasNextInt());
        {
            System.out.println("Entrada no válida. Ingrese un número.");
            scanner.next();

            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    CrearCliente(con);
                    break;
                case 2:
                    leerClientes(con);
                    break;
                case 3:
                    ActualizarCliente(con);
                    break;
                case 4:
                    EliminarCliente(con);
                    break;
                case 5:
                    System.out.println("Opcion SALIR activada......corre");
                default:
                    System.out.println("Elige una opcion correcta para el menu mongolo");
            }

        }

    }

    public static void CrearCliente(Connection con) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre del cliente: ");
        String nombre = scanner.nextLine();
        System.out.println("ingrese apellido cliente");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese edad cliente");
        int edad = scanner.nextInt();

        String sentencia = "INSERT INTO clientes "
                + "(nombre , apellido, edad) "
                + "VALUES (?,?,?);";
        try (PreparedStatement preparedStatement = con.prepareStatement(sentencia)) {
            preparedStatement.setString(1, nombre);
            preparedStatement.setString(1, apellido);
            preparedStatement.setInt(1, edad);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error " + e);
        }

    }


        private static void leerClientes(Connection con) throws SQLException {
            String selectSQL = "SELECT * FROM clientes";
            try (Statement statement = con.createStatement();
                 ResultSet resultSet = statement.executeQuery(selectSQL)) {
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String nombre = resultSet.getString("nombre");
                    String apellido = resultSet.getString("apellido");
                    int edad = resultSet.getInt("edad");
                    System.out.println("ID: " + id + ", Nombre: " + nombre + ", Apellido: " + apellido + ", Edad: " + edad);
                }
            }
        }


    public static void ActualizarCliente(Connection con) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ID del cliente que desea actualizar: ");
        int idCliente = scanner.nextInt();

        System.out.println("¿Qué información desea actualizar?");
        System.out.println("1. Nombre");
        System.out.println("2. Apellido");
        System.out.println("3. Edad");

        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();

        String columnaActualizar = "";
        switch (opcion) {
            case 1:
                columnaActualizar = "nombre";
                break;
            case 2:
                columnaActualizar = "apellido";
                break;
            case 3:
                columnaActualizar = "edad";
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        System.out.print("Ingrese el nuevo valor para " + columnaActualizar + ": ");
        String nuevoValor = scanner.next();

        String updateSQL = "UPDATE clientes SET " + columnaActualizar + " = ? WHERE id = ?";
        try (PreparedStatement preparedStatement = con.prepareStatement(updateSQL)) {
            preparedStatement.setString(1, nuevoValor);
            preparedStatement.setInt(2, idCliente);
            int filasActualizadas = preparedStatement.executeUpdate();
            if (filasActualizadas > 0) {
                System.out.println("Actualización realizada con éxito.");
            } else {
                System.out.println("No se encontró ningún cliente con el ID proporcionado.");
            }
        }
    }


    private static void EliminarCliente(Connection con) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ID del cliente que desea eliminar: ");
        int idCliente = scanner.nextInt();

        String deleteSQL = "DELETE FROM clientes WHERE id = ?";
        try (PreparedStatement preparedStatement = con.prepareStatement(deleteSQL)) {
            preparedStatement.setInt(1, idCliente);
            int filasEliminadas = preparedStatement.executeUpdate();
            if (filasEliminadas > 0) {
                System.out.println("Cliente eliminado con éxito.");
            } else {
                System.out.println("No se encontró ningún cliente con el ID proporcionado.");
            }
        }
    }
}