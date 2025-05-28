package Libros;

public class LibroTextoUni extends LibroTexto{

    //nuevos atributos
    private String facultad;

    //Constructor
    public LibroTextoUni(String titulo, String autor, String curso, String facultad) {
        super(titulo, autor, curso);
        this.facultad = facultad;
    }

    //Getters y Setters
    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    //toString
    @Override
    public String toString() {
        return "LibroTextoUni{" + "titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + ", curso=" + curso + ", facultad=" + facultad + '}';
    }
}