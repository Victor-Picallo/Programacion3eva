package Animal;

public class Gato extends Felino {

    //No hay nuevos atributos
    //Constructor --> Por defecto

    //Setters -->No tiene, no hacen falta

    //Escribimos los getters
    @Override
    public String getSonido() {
        return "Maullido";
    }

    @Override
    public String getAlimentos() {
        return "Ratones";
    }

    @Override
    public String getHabitat() {
        return "Domestico";
    }

    @Override
    public String getNombreCientifico() {
        return "Felix silvestris catus";
    }

}
