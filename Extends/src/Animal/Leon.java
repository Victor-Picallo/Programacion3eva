package Animal;

public class Leon extends Felino {

    //No hay nuevos atributos
    //Constructor --> Por defecto

    //Setters -->No tiene, no hacen falta

    //Escribimos los getters
    @Override
    public String getSonido() {
        return "Rugido";
    }

    @Override
    public String getAlimentos() {
        return "Carnivoro";
    }

    @Override
    public String getHabitat() {
        return "Pradera";
    }

    @Override
    public String getNombreCientifico() {
        return "Panthera leo";
    }

}
