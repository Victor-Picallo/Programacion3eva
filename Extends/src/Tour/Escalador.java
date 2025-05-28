package Tour;

public class Escalador extends Ciclista {


    // Atributo que define la acelaración promedio de un escalador
    private double aceleracionPromedio;
    // Atributo que define el grado de rampa soportado por un escalador
    private double gradoRampa;

    public Escalador(int identificador, String nombre, double
            aceleracionPromedio, double gradoRampa) {
        super(nombre, identificador);
        this.aceleracionPromedio = aceleracionPromedio;
        this.gradoRampa = gradoRampa;
    }

    protected double getAceleracionPromedio() {
        return aceleracionPromedio;
    }

    protected void setAceleracionPromedio(double
                                                  aceleracionPromedio) {
        this.aceleracionPromedio = aceleracionPromedio;
    }

    protected double getGradoRampa() {
        return gradoRampa;
    }

    protected void setGradoRampa(double gradoRampa) {
        this.gradoRampa = gradoRampa;
    }


    @Override
    public String toString() {
        return super.toString() + "\nEscalador [aceleraciónPromedio=" + aceleracionPromedio + ", gradoRampa=" + gradoRampa + "]";
    }

    /**
     * Método que devuelve el tipo de ciclista
     *
     * @return Un valor String con el texto “Es un escalador”
     */
    protected String imprimirTipo() {
        return "Es un escalador";
    }

    //Modificar el atributo tiempo que hereda de ciclista
    @Override
    public void correr() {
        double tiempo = 50.0 + Math.random() * 20;
        tiempo = tiempo - this.aceleracionPromedio*1.2 - this.gradoRampa*0.35;
        this.setTiempoAcumulado(tiempo);
    }
}

