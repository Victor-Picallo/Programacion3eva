package Liga2;

public class Entrenador extends SeleccionFutbol {

    //1 No necesito volver a implementar
    //2 Dos metodos implementados se heredan --> Concentrar y viajar (YA SE IMPLEMENTARON EN LA CLASE PADRE)
    //3 Tengo que escribir los dos que NO se implementaron en la clase padre

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
    public void entrenar() {
        System.out.println("Dirige un entrenamiento (Clase Entrenador)");

    }

    @Override
    public void jugarPartido() {
        System.out.println("Dirige un Partido (Clase Entrenador)");
    }

    //METODO PROPIO DEL ENTRENADOR
    public void planificarEntrenamiento() {
        System.out.println("Planificar un Entrenamiento");
    }

    @Override
    public double primarPorGanar() {
        double calculoDePapa = super.primarPorGanar();
        return calculoDePapa * 2.45 + 3000d;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nEntrnador [idFederacion=" + idFederacion + "]";
    }
}