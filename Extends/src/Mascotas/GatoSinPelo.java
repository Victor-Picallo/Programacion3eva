package Mascotas;

public class GatoSinPelo extends Gato {

    enum razas{
        esfinge,
        elfo,
        donskoy,
    }

    private razas SinPelo;

    public GatoSinPelo(String nombre, int edad, String color, double saltoAltura, double saltoLargura, razas sinPelo) {
        super(nombre, edad, color, saltoAltura, saltoLargura);
        SinPelo = sinPelo;
    }

    @Override
    public String toString() {
        return super.toString() + "raza= " + SinPelo;
    }

    @Override
    public String sonido() {
        return super.sonido() + " y dan grimilla";
    }
}
