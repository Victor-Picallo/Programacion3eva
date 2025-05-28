package Mascotas;

public class GatoPeloCorto extends Gato {

    enum razas{
        azulRuso,
        britanico,
        manx,
        devonRex
    }

    private razas PeloCorto;

    public GatoPeloCorto(String nombre, int edad, String color, double saltoAltura, double saltoLargura, razas PeloCorto) {
        super(nombre, edad, color, saltoAltura, saltoLargura);
        PeloCorto = PeloCorto;
    }

    @Override
    public String toString() {
        return super.toString() + "raza= " + PeloCorto;
    }

    @Override
    public String sonido() {
        return super.sonido() + " y son monos";
    }
}

