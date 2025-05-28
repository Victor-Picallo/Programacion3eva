package Animal;

import java.util.ArrayList;

public class AnimalTest {

    public static void main(String[] args) {

        ArrayList<Animal> listado = new ArrayList<Animal>();

        Perro perro = new Perro();
        Gato gato = new Gato();
        Lobo lobo = new Lobo();
        Leon leon = new Leon();

        listado.add(perro);
        listado.add(gato);
        listado.add(lobo);
        listado.add(leon);

//        for(Animal animal : listado) {
//            System.out.println(animal.getNombreCientifico() + " " + animal.getHabitat() + " " + animal.getSonido() + " " + animal.getAlimentos());
//        }

        for(Animal a : listado){
            System.out.println(a);
        }
    }
}
