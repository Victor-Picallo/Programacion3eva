package Libros;

/*definir una clase libro para manejar la informacion asociada a un libro.
 *La informacion de interes son: el titulo el autor y el precio. Losmetodos de interes son:*/
public class Libro {

    protected String titulo;
    protected String autor;
    protected float precio;

    //Constructor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    //toString
    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + '}';
    }

    //Getters y Setters

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
