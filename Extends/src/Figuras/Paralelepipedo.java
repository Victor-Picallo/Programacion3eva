package Figuras;

public class Paralelepipedo extends FiguraGeometrica {

    private double largo;
    private double ancho;
    private double alto;

    public Paralelepipedo(double lar, double anc, double alt) {
        this.largo = lar;
        this.ancho = anc;
        this.alto = alt;
        this.setVolumen(this.calcularVolumen());
        this.setSuperficie(this.calcularSuperficie());
    }

    double calcularVolumen() {
        double vol= this.alto*this.ancho*this.largo;
        return vol;
    }

    double calcularSuperficie() {
        double tapa= this.ancho*this.largo;
        double cara= this.ancho*this.alto;
        double otra= this.largo*this.alto;
        return 2*tapa+2*cara+2*otra;
    }
}
