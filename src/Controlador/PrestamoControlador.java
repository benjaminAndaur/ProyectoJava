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



public class PrestamoControlador {
    
    public boolean agregar(Prestamo pre){
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            String query ="insert into prestamos(id,id_usuario,id_libro,fecha_prestamo,fecha_devolucion) VALUES (?,?,?,?,?);";
            PreparedStatement stmt= cnx.prepareStatement(query);
            stmt.setInt(1,pre.getId());
            stmt.setInt(2,pre.getIdLibro());
            stmt.setInt(3,pre.getIdUsuario());
            stmt.setDate(4, (Date) pre.getFechaPrestamo());
            stmt.setDate(5, (Date) pre.getFechaDevolucion());
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            
            return true;
        } catch (SQLException e) {
            System.out.println("Error al insertar datos"+ e.getMessage());
            return false;
        }
    }
    
}
 