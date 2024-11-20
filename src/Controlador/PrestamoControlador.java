/**
 *
 * @author benja
 */

package Controlador;
import Bd.Conexion;
import Modelo.Prestamo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class PrestamoControlador {

    public boolean registrarPrestamo(Prestamo prestamo) {
        String sql = "INSERT INTO prestamos (id_usuario, id_libro, fecha_prestamo, fecha_devolucion) VALUES (?, ?, ?, ?)";

        // Obtén la conexión de la clase Conexion
        Conexion conexionBd = new Conexion();
        try (Connection conn = conexionBd.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Configura los parámetros del PreparedStatement
            stmt.setInt(1, prestamo.getIdUsuario());
            stmt.setInt(2, prestamo.getIdLibro());
            stmt.setDate(3, new Date(prestamo.getFechaPrestamo().getTime()));
            stmt.setDate(4, new Date(prestamo.getFechaDevolucion().getTime()));

            // Ejecuta la consulta
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            // Manejo de errores
            JOptionPane.showMessageDialog(null, "Error al registrar préstamo: " + e.getMessage());
            return false;
        }
    }

    public boolean devolverPrestamo(int idUsuario, int idLibroInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
 