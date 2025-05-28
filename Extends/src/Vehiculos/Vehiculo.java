package Vehiculos;

public abstract class Vehiculo {

    int velocidadActual;
    int velocidadMaxima;

    Vehiculo(int velocidadActual, int velocidadMaxima) {
        this.velocidadActual = velocidadActual;
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "velocidadActual=" + velocidadActual +
                ", velocidadMaxima=" + velocidadMaxima +
                '}';
    }

    abstract void acelerar(int velocidad);

    abstract void frenar(int velocidad);
}
