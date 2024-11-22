package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    Connection con;

    public Connection getConnection() {
        try {
            // Asegúrate de usar una zona horaria válida, como UTC
            String url = "jdbc:mysql://localhost:3306/sistemaventa?serverTimezone=UTC";
            String user = "root"; // Usuario de tu base de datos
            String pass = "12345678"; // Contraseña de tu base de datos

            // Establecer la conexión
            con = DriverManager.getConnection(url, user, pass);
            if (con != null) {
                System.out.println("Conexión exitosa a la base de datos");
            }
            return con;
        } catch (SQLException e) {
            System.out.println("Error de SQL: " + e.toString());
        }
        return null;
    }
}