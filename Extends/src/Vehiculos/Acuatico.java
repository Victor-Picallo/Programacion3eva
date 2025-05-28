package Vehiculos;

public class Acuatico extends Vehiculo implements Motor {

    public Acuatico(int velocidadActual, int velocidadMaxima) {
        super(velocidadActual, velocidadMaxima);
    }

    void acelerar(int velocidad) {
        int velo = this.velocidadActual + velocidad;
        if(velo > velocidadMaxima) {
            System.out.println("Supera la velocidad maxima permitida");
        } else {
            this.velocidadActual = velo;
        }
    }

    void frenar(int velocidad) {
        int velo = this.velocidadActual - velocidad;
        if(velo < 0) {
            System.out.println("No puedes frenar mas");
        } else {
            this.velocidadActual = velo;
        }
    }

    public int calculaRevolucionesMotor(int fuerza, int radio) {
        return (fuerza * radio);
    }
}
