package Mascotas;

public class Perro extends Mascota {

    //Los perros tienen atributos adicionales como
    protected double peso;
    protected boolean muerde;

    //Constructor

    public Perro(String nombre, int edad, String color, double peso, boolean muerde) {
        super(nombre, edad, color);
        this.peso = peso;
        this.muerde = muerde;
    }

    //ToString
    @Override
    public String toString() {
        return "Perro{" +
                "peso=" + peso +
                ", muerde=" + muerde +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    //Adaptar sonido
    @Override
    public String sonido() {
        return "Los perros ladran";
    }
}
