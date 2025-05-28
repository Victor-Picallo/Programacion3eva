package Universidad;

public class ProfesorTitular extends Profesor{

    private String asignatura;

    public ProfesorTitular(String nombre, String apellido, String departamento, String categoria, String asignatura) {
        super(nombre, apellido, departamento, categoria);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    protected void vaClase() {
        super.vaClase();
        System.out.println("A dar clase de " + this.getAsignatura() + " en el " + this.getDepartamento());
    }

    //Comprobacion de polimorfismo
    /**
     * Metodo que sobreescribe el metodo toString heredadado de la clase padre
     * @return el cambio
     */
    //No puedo hacer mas restringido el tipo de retorno
    //al heredad se puede ampliar el scope de un metodo
    @Override
    public String toString() {
        return "Es un profesor titular.";
    }
}
