package Figuras;

public class Piramide extends FiguraGeometrica {

    private double base;
    private double altura;
    private double apotema;

    public Piramide(double base, double altura, double apotema) {
        this.base = base;
        this.altura = altura;
        this.apotema = apotema;
        this.setVolumen(this.calcularVolumen());
        this.setSuperficie(this.calcularSuperficie());
    }

    public double calcularVolumen() {
        double volumen = (Math.pow(base, 2) * altura) / 3d;
        return volumen;
    }

    public double calcularSuperficie() {
        double areaBase = Math.pow(base, 2);
        double areaLado = base * apotema / 2d;
        return areaBase + 4 * areaLado;
    }
}
