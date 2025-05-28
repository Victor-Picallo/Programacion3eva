package Mascotas;

public class PerroPequeno extends Perro {

    enum razas {
        caniche,
        yorkshireTerrier,
        schnauzer,
        chihuahua,
    }

    private razas Pequeno;

    //Constructor
    public PerroPequeno(String nombre, int edad, String color, double peso, boolean muerde, razas pequeno) {
        super(nombre, edad, color, peso, muerde);
        Pequeno = pequeno;
    }

    //ToString
    @Override
    public String toString() {
        return super.toString() + " raza= " + Pequeno;
    }

    //Adaptamos sonido
    @Override
    public String sonido() {
        return super.sonido() + " y estos son juguetones";
    }
}


