package Mamiferos;

public abstract class Mamifero {

    protected String nombre;

    public Mamifero(String nombre) {
        super();
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "mamifero [nombre=" + nombre + "]";
    }

    public abstract void amamantarcrias();


}

