package Universidad;

public class Estudiante extends Persona {

    //Los estudiantes tienen atributos adicionales
    protected String carrera;
    protected int semestre;

    //Constructor
    public Estudiante(String nombre, String apellido, String carrera, int semestre) {
        super(nombre, apellido);
        this.carrera = carrera;
        this.semestre = semestre;
    }

    //Getters Y Setters
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    //ToString
    @Override
    public String toString() {
        return "Estudiante{" +
                "carrera='" + carrera + '\'' +
                ", semestre=" + semestre +
                '}';
    }

    @Override
    protected void vaClase() {
        super.vaClase();
        System.out.println("Voy a clase de " + this.getCarrera() + " en el semestre " + this.getSemestre());
    }
}
