package Universidad;

public class Profesor extends Persona {

    //Los profesores tienen sus atributos adicionales
    protected String departamento;
    protected String categoria;

    //Constructor
    public Profesor(String nombre, String apellido, String departamento, String categoria) {
        super(nombre, apellido);
        this.departamento = departamento;
        this.categoria = categoria;
    }

    //Getters Y Setter
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    //ToString
    @Override
    public String toString() {
        return "Profesor{" +
                "departamento='" + departamento + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }

    @Override
    protected void vaClase() {
        super.vaClase();
        System.out.println("Voy a clase de " + this.getCategoria() + " en el " + this.getDepartamento());
    }
}
