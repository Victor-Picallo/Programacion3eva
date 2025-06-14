package Tour;

public class Velocista extends Ciclista {

    private double potenciaPromedio; /* Atributo que define la potencia promedio de un velocista */
    private double velocidadPromedio; /* Atributo que define la velocidad promedio de un velocista */

    public Velocista(int identificador, String nombre, double potenciaPromedio, double velocidadPromedio) {
        super(nombre, identificador);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadPromedio = velocidadPromedio;
    }

    protected double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    protected void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    protected double getvelocidadPromedio() {
        return velocidadPromedio;
    }

    protected void setVelocidadPromedio(double velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }

    @Override
    public String toString() {
        return super.toString() + "\nVelocista [potenciaPromedio=" + potenciaPromedio + ", velocidadPromedio=" + velocidadPromedio + "]";
    }

    /**
     * Método que devuelve el tipo de ciclista
     *
     * @return Un valor String con el texto “Es un velocista”
     */
    protected String imprimirTipo() {
        return "Es un velocista";
    }

    @Override
    public void correr() {
        super.correr();
        double tiempo = this.getTiempoAcumulado();
        tiempo = tiempo - this.potenciaPromedio*2 - this.velocidadPromedio*0.25;
        //Seteamos tiempo de velocista
        this.setTiempoAcumulado(tiempo);
    }
}