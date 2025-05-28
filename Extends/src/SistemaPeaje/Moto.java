package SistemaPeaje;

public class Moto extends  Vehiculo{

    static double valorPeaje = 4.53;

    Moto(String matricula) {
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
        return "Moto [ Matricula -->" + this.getMatricula() + " Peaje --> +" + getValorPeaje() +" ]";
    }
}

