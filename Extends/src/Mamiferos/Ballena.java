package Mamiferos;

public class Ballena extends Mamifero {

    public Ballena(String nombre) {
        super(nombre);
// TODO Auto-generated constructor stub
    }

    private double peso;

    public void amamantarcrias() {
        System.out.println("ballena mama xd");
    }

    @Override
    public String toString() {
        return super.toString() + "ballena [peso=" + peso + ", nombre=" + nombre + "]";
    }
}

