package Mascotas;

public class PerroMediano extends Perro {

    enum razas {
        collie,
        dalmata,
        bulldog,
        galgo,
        sabueso
    }

    private razas Mediano;

    //Constructor
    public PerroMediano(String nombre, int edad, String color, double peso, boolean muerde, razas mediano) {
        super(nombre, edad, color, peso, muerde);
        Mediano = mediano;
    }

    //ToString
    @Override
    public String toString() {
        return super.toString() + " raza= " + Mediano;
    }

    //Adaptamos sonido
    @Override
    public String sonido() {
        return super.sonido() + " y estos divierten";
    }
}
