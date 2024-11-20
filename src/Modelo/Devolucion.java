
package Modelo;

import java.util.Date;

/**
 *
 * @author BENJAMIN ANDAUR
 */
public class Devolucion {
    private int id;                
    private int idPrestamo;          
    private Date fechaDevolucion;   

    public Devolucion() {
    }

    public Devolucion(int id, int idPrestamo, Date fechaDevolucion) {
        this.id = id;
        this.idPrestamo = idPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    @Override
    public String toString() {
        return "Devolucion{" + "id=" + id + ", idPrestamo=" + idPrestamo + ", fechaDevolucion=" + fechaDevolucion + '}';
    }
    
}
