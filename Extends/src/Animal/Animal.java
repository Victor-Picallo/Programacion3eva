package Animal;

public abstract class Animal {

    protected String sonido;
    protected String alimentos;
    protected String habitat;
    protected String nombreCientifico;

    //CONSTRUCTOR???
    //SETTERS NO
    //GETTERS
    public abstract String getSonido();
    public abstract String getAlimentos();
    public abstract String getHabitat();
    public abstract String getNombreCientifico();

    //ToString para mostrar los getters

    @Override
    public String toString() {
        return "Animal{" +
                "sonido='" + getSonido() + '\'' +
                ", alimentos='" + getAlimentos() + '\'' +
                ", habitat='" + getHabitat() + '\'' +
                ", nombreCientifico='" + getNombreCientifico() + '\'' +
                '}';
    }
}
