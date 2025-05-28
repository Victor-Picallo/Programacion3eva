package Mascotas;

import java.util.ArrayList;

public class MascotasTest {

    public static void main(String[] args) {

        ArrayList<Gato>jatos = new ArrayList<>();
        ArrayList<Perro>perros = new ArrayList<>();

        //Vamos a construir un objeto de cada clase
        Mascota cota =      new Mascota("a", 1, "verde");
        Perro perro =       new Perro("guau", 3, "marron", 3.5, false);
        Gato gato =         new Gato("miau", 16, "blanco", 2.5, 3.2);

        Perro pg =          new PerroGrande("pg", 4, "rosa", 5.6, true, PerroGrande.razas.doberman);
        Perro pm =          new PerroMediano("pm", 5, "amarillo", 12, false, PerroMediano.razas.galgo);
        Perro pp =          new PerroPequeno("pp",4, "rojo", 45, true, PerroPequeno.razas.caniche);

        Gato gsp =          new GatoSinPelo("gsp", 56, "naranja", 1, 2, GatoSinPelo.razas.elfo);
        Gato gpc =          new GatoPeloCorto("gpc", 12, "verde listado", 2, 0, GatoPeloCorto.razas.azulRuso);
        Gato gpl =          new GatoPeloLargo("gpl", 7, "blanco", 4, 4, GatoPeloLargo.razas.angora);

        perros.add(perro);
        perros.add(pg);
        perros.add(pm);
        perros.add(pp);

        jatos.add(gato);
        jatos.add(gsp);
        jatos.add(gpc);
        jatos.add(gpl);

        System.out.println("COLECCION DE JATOS\n");
        for (Mascota mascota : jatos) {
            System.out.println(mascota);
            System.out.println(mascota.sonido());
        }

        System.out.println("COLECCION DE PERROS\n");
        for (Mascota mascota : perros) {
            System.out.println(mascota);
            System.out.println(mascota.sonido());
        }
    }
}
