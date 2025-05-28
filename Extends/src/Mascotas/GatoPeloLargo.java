package Mascotas;

public class GatoPeloLargo extends Gato {

    enum razas{
        angora,
        himalayo,
        balines,
        somali
    }

    private razas PeloLargo;

    public GatoPeloLargo(String nombre, int edad, String color, double saltoAltura, double saltoLargura, razas PeloLargo) {
        super(nombre, edad, color, saltoAltura, saltoLargura);
        PeloLargo = PeloLargo;
    }

    @Override
    public String toString() {
        return super.toString() + "raza= " + PeloLargo;
    }

    @Override
    public String sonido() {
        return super.sonido() + " y son calurosos";
    }
}

