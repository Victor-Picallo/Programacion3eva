package Libros;

public class Novela extends Libro {

    //Atributos nuevos
    enum genero {
        HISTORICA, ROMANTICA, POLICIACA, REALISTA, CIENCIA_FICCION, AVENTURA
    }

    ;

    private genero generoNovela;

    //Constructor
    public Novela(String titulo, String autor, genero name) {
        super(titulo, autor);
        this.generoNovela = name;
    }

    //Getters y Setters


    public genero getGeneroNovela() {
        return generoNovela;
    }

    public void setGeneroNovela(genero generoNovela) {
        this.generoNovela = generoNovela;
    }

    //toString
    @Override
    public String toString() {
        return "Novela{" + "titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + ", generoNovela=" + generoNovela + '}';
    }
}
