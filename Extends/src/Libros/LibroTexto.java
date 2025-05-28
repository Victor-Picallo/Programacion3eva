package Libros;

public class LibroTexto extends Libro {

    //Atributos nuevos
    protected String curso;

    //Constructor
    public LibroTexto(String titulo, String autor, String curso) {
        super(titulo, autor);
        this.curso = curso;
    }

    //Getters y Setters
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    //toString
    @Override
    public String toString() {
        return "LibroTexto{" + "titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + ", curso=" + curso + '}';
    }
}