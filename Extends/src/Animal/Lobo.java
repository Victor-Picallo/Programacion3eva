package Animal;

public class Lobo extends Canido {

    //No hay nuevos atributos
    //Constructor --> Por defecto

    //Setters -->No tiene, no hacen falta

    //Escribimos los getters
    @Override
    public String getSonido() {
        return "Aullido";
    }

    @Override
    public String getAlimentos() {
        return "Carnivoro";
    }

    @Override
    public String getHabitat() {
        return "Bosque";
    }

    @Override
    public String getNombreCientifico() {
        return "Canis lupus";
    }
}
