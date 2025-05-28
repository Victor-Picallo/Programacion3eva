package Liga2;

public class Masajista extends SeleccionFutbol {

    private String titulacion;
    private int aniosExperiencia;

    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public void entrenar() {
        System.out.println("Da asistencia en el entrenamiento (Clase Masajista)");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Dormita en el partido de Futbol (Clase Masajista)");
    }

    //METODO PROPIO DEL MASAJISTA
    public void darMasaje() {
        System.out.println("Da un Masaje");
    }

    @Override
    public String toString() {
        return super.toString()+"\nMasajista [titulacion=" + titulacion + ", aniosExperiencia=" + aniosExperiencia + "]";
    }

    @Override
    public double primarPorGanar() {
        return super.primarPorGanar() + 1000d;
    }
}
