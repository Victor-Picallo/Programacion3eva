package Liga;

public class Entrenador extends SeleccionFutbol{

    private int idFederacion;

    public Entrenador(int id, String nombre, String apellidos, int edad, int idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public void entrenamiento() {
        System.out.println("Dirige un entrenamiento (Clase Entrenador)");

    }

    @Override
    public void partidoFutbol() {
        System.out.println("Dirige un Partido (Clase Entrenador)");
    }

    public void planificarEntrenamiento() {
        System.out.println("Planificar un Entrenamiento");
    }

    public void prepararTactica() {
        System.out.println("Prepara la tactica del partido");
    }

    @Override
    public String toString() {
        return super.toString()+ "\nEntrenador{" +
                "idFederacion=" + idFederacion +
                '}';
    }
}
