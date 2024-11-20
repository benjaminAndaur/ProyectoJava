/**
 *
 * @author benja
 */

package Controlador;
import Bd.Conexion;
import Modelo.Devolucion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DevolucionControlador {

    public boolean registrarDevolucion(Devolucion devolucion) {
        String sql = "UPDATE prestamos SET fecha_devolucion = ? WHERE id = ?";

        // Obtén la conexión de la clase Conexion
        Conexion conexionBd = new Conexion();
        try (Connection conn = conexionBd.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Configura los parámetros del PreparedStatement
            stmt.setDate(1, new java.sql.Date(devolucion.getFechaDevolucion().getTime()));
            stmt.setInt(2, devolucion.getIdPrestamo());

            // Ejecuta la consulta
            int filasAfectadas = stmt.executeUpdate();
            if (filasAfectadas > 0) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el préstamo con ID: " + devolucion.getIdPrestamo());
                return false;
            }
        } catch (SQLException e) {
            // Manejo de errores
            JOptionPane.showMessageDialog(null, "Error al registrar devolución: " + e.getMessage());
            return false;
        }
    }
}
