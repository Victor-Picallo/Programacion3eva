package Mascotas;

public class PerroGrande extends Perro {

    enum razas{
        pastorAleman,
        doberman,
        rotweiller
    }

    private razas Grande;

    //Constructor
    public PerroGrande(String nombre, int edad, String color, double peso, boolean muerde, razas grande) {
        super(nombre, edad, color, peso, muerde);
        Grande = grande;
    }

    //ToString
    @Override
    public String toString() {
        return super.toString()+ " raza= " + Grande;
    }

    //Adaptamos sonido
    @Override
    public String sonido() {
        return super.sonido()+ " y estos amedrentan";
    }
}
