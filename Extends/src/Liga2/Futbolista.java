package Liga2;

public class Futbolista extends SeleccionFutbol {

    private int dorsal;
    private String demarcacion;

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    @Override
    public void entrenar() {
        System.out.println("Realiza un entrenamiento (Clase Futbolista)");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Juega un Partido (Clase Futbolista)");
    }

    //METODO PROPIO DEL FUTBOLISTA
    public void entrevista() {
        System.out.println("Da una Entrevista");
    }

    @Override
    public String toString() {
        return super.toString()+ "\nFutbolista [dorsal=" + dorsal + ", demarcacion=" + demarcacion + "]";
    }

    @Override
    public double primarPorGanar() {
        double calculoDePapa = super.primarPorGanar();
        return Math.pow(calculoDePapa, 2) + 500d;
    }
}