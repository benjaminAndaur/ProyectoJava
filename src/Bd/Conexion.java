
package Bd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Benjamin Andaur
 */
public class Conexion {
    public Connection obtenerConexion(){
        
        Connection conexion = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebabd", "root", "Andaurmarciel_2004");
            System.out.println("Conexion exitosa");      
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error de la clase conexion"+ e.getMessage());
        }
        return conexion;
    }
}
