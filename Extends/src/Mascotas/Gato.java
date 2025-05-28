package Mascotas;

public class Gato extends Mascota {

    //Los gatos tienen atributos adicionales como
    protected double saltoAltura;
    protected double saltoLargura;

    //Constructor
    public Gato(String nombre, int edad, String color, double saltoAltura, double saltoLargura) {
        super(nombre, edad, color);
        this.saltoAltura = saltoAltura;
        this.saltoLargura = saltoLargura;
    }

    //ToString
    @Override
    public String toString() {
        return "Gato{" +
                "saltoAltura=" + saltoAltura +
                ", saltoLargura=" + saltoLargura +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    //Adaptar sonido
    @Override
    public String sonido() {
        return "Los gatos maullan y ronronean";
    }
}
