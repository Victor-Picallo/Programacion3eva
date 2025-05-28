package Mascotas;

public class Mascota {

    //Atributos que sean COMUNES a TODAS las mascotas
    //Todos estos animales tienen un nombre, una edad y un color

    protected String nombre;
    protected int edad;
    protected String color;

    //Constructor
    public Mascota(String nombre, int edad, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
    }

    //Getter & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //toString
    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", color='" + color + '\'' +
                '}';
    }

    //Metodos aplicables a todas las mascotas
    public String sonido() {
        return "Hago un sonido generico";
    }


}
