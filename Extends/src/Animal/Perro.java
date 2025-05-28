package Animal;

public class Perro extends Canido {

    //No hay nuevos atributos
    //Constructor --> Por defecto

    //Setters -->No tiene, no hacen falta

    //Escribimos los getters
    public String getSonido() {
        return "Ladrido";
    }

    public String getAlimentos() {
        return "Carnivoro";
    }

    public String getHabitat() {
        return "Domestico";
    }

    public String getNombreCientifico() {
        return "Canis lupus familiaris";
    }
}
