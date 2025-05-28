package SistemaPeaje;

public class Camion extends Vehiculo{

    static double valorPeaje = 3.67;
    int numeroEjes;


    Camion(String matricula, int numeroEjes) {
        super(matricula);
        this.numeroEjes = numeroEjes;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    private void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public double getValorPeaje() {
        return valorPeaje*this.numeroEjes;
    }

    private static void setValorPeaje(double valorPeaje) {
        valorPeaje = valorPeaje;
    }

    @Override
    public String toString() {
        return "Camion [ Matricula -->" + this.getMatricula() + "Numero de Ejes -->" + this.getNumeroEjes() + " Peaje --> +" + getValorPeaje() +" ]";
    }
}

