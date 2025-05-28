package SistemaPeaje;

public class Vehiculo {

    String Matricula;

    Vehiculo(String matricula) {
        this.Matricula = matricula;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + Matricula + '\'' +
                '}';
    }
}
