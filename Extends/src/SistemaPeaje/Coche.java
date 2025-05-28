package SistemaPeaje;

public class Coche extends Vehiculo {

    static double valorPeaje = 10.32;

    Coche(String matricula) {
        super(matricula);
    }
    public static double getValorPeaje() {
        return valorPeaje;
    }

    private static void setValorPeaje(double valorPeaje) {
        valorPeaje = valorPeaje;
    }

    @Override
    public String toString() {
        return "Coche [ Matricula -->" + this.getMatricula() + " Peaje --> +" + getValorPeaje() +" ]";
    }
}
