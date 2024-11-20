
package Modelo;

/**
 *
 * @author BENJAMIN ANDAUR
 */
public class Libro {
    private int id;                
    private String titulo;         
    private String autor;          
    private String editorial;      
    private int anioPublicacion;   
    private String estado;   

    public Libro() {
    }

    public Libro(int id, String titulo, String autor, String editorial, int anioPublicacion, String estado) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.anioPublicacion = anioPublicacion;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Libro{" + "id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial + ", anioPublicacion=" + anioPublicacion + ", estado=" + estado + '}';
    }
    
    
}
