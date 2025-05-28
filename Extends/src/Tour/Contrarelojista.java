package Tour;

public class Contrarelojista extends Ciclista {

    // Atributo que define la velocidad máxima de un contrarrelojista
    private double velocidadMaxima;

    public Contrarelojista(int identificador, String nombre, double
            velocidadMaxima) {
        super(nombre, identificador);
        this.velocidadMaxima = velocidadMaxima;
    }

    protected double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    protected void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }


    @Override
    public String toString() {
        return super.toString()+"\nContrarelojista [velocidadMáxima=" + velocidadMaxima + "]";
    }

    /**
     * Método que devuelve el tipo de ciclista
     * @return Un valor String con el texto “Es un constrarrelojista”
     */
    protected String imprimirTipo() {
        return "Es un constrarrelojista";
    }

    //Metodo correr con modificaciones
    @Override
    public void correr() {
        super.correr();
        double tiempo = this.getTiempoAcumulado();
        tiempo = tiempo - this.velocidadMaxima * 0.33;
        this.setTiempoAcumulado(tiempo);
    }
}
