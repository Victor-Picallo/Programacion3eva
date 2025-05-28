package Tour;

import java.util.ArrayList;
import java.util.Collections;

public class Etapa {

    private int numero;
    private String nombre;
    private ArrayList<Equipo> listaEquipos = new ArrayList<Equipo>();
    private ArrayList<Ciclista> participantes = new ArrayList<Ciclista>();

    public Etapa(String nombre, int numero, ArrayList<Equipo> listaEquipos, ArrayList<Ciclista> participantes) {
        this.nombre = nombre;
        this.numero = numero;
        this.listaEquipos = listaEquipos;
        this.participantes = participantes;
    }

    void inicializaEtapa() {
        //EQUIPO 1
        Equipo equipo1 = new Equipo("Sky", "Estados Unidos");
        Ciclista uno = new Velocista(71, "Geraint Thomas", 1d, 12.5);
        Ciclista dos = new Escalador(72, "Egan Bernal", 0.8, 5.5);
        Ciclista tres = new Contrarelojista(73, "Jonathan Castroviejo", 23.7);

//        Ciclista uno = new Ciclista("Geraint Thomas", 71);
//        Ciclista dos = new Ciclista("Egan Bernal", 72);
//        Ciclista tres = new Ciclista("Jonathan Castroviejo",  73);

        equipo1.anadirCiclista(uno);
        equipo1.anadirCiclista(dos);
        equipo1.anadirCiclista(tres);

        //EQUIPO 2
        Equipo equipo2 = new Equipo("Quick-Step", "Bélgica");
        Ciclista cuatro = new Velocista(51,"Remco Evenepoel", 1d, 10);
        Ciclista cinco = new Escalador(52, "Julian Alaphilippe", 0.7, 5.3);
        Ciclista seis = new Contrarelojista(53, "Kasper Asgreen", 23.4);

//        Ciclista cuatro = new Ciclista("Remco Evenepoel", 51);
//        Ciclista cinco = new Ciclista("Julian Alaphilippe", 52);
//        Ciclista seis = new Ciclista("Kasper Asgreen", 53);

        equipo2.anadirCiclista(cuatro);
        equipo2.anadirCiclista(cinco);
        equipo2.anadirCiclista(seis);

        //EQUIPO 3
        Equipo equipo3 = new Equipo("Movistar", "España");
        Ciclista siete = new Velocista(25,"Alejandro Valverde", 1d, 11);
        Ciclista ocho = new Escalador(26, "Enric Mas", 0.8, 5.6);
        Ciclista nueve = new Contrarelojista(27,"Pedro Acosta", 26);

//        Ciclista siete = new Ciclista("Alejandro Valverde", 25);
//        Ciclista ocho = new Ciclista("Enric Mas", 26);
//        Ciclista nueve = new Ciclista("Pedro Acosta", 27);

        equipo3.anadirCiclista(siete);
        equipo3.anadirCiclista(ocho);
        equipo3.anadirCiclista(nueve);

        Equipo equipo4 = new Equipo("Jumbo-Visma", "Países Bajos");
        Ciclista diez = new Ciclista("Primož Roglič", 88);
        Ciclista once = new Ciclista("Jonas Vingegaard", 89);
        Ciclista doce = new Ciclista("Wout van Aert", 90);
        equipo4.anadirCiclista(diez);
        equipo4.anadirCiclista(once);
        equipo4.anadirCiclista(doce);

        // Add teams and participants to the lists
        listaEquipos.add(equipo1);
        listaEquipos.add(equipo2);
        listaEquipos.add(equipo3);
        listaEquipos.add(equipo4);

        //Ver equipos
        for (int i = 0; i < listaEquipos.size(); i++) {
            Equipo e = listaEquipos.get(i);
            System.out.println(e);
        }

        //Ver participantes
        for (int i = 0; i < listaEquipos.size(); i++) {
            Equipo e = listaEquipos.get(i);
            for (int j = 0; j < e.getListaCiclistas().size(); j++) {
                Ciclista c = e.listaCiclistas.get(j);
                participantes.add(c);
            }
        }
    }

    public Etapa(int num, String nome) {
        this.numero = num;
        this.nombre = nome;
        inicializaEtapa();
    }

    public void disputarEtapa() {
        for (Ciclista ciclo : participantes)
            ciclo.correr();
        for (Equipo equipo : listaEquipos)
            equipo.calcularTotalTiempo();
    }

    public void ordenarEquipos() {
        Collections.sort(listaEquipos);
    }

    public void ordenarParticipantes() {
        Collections.sort(participantes);
    }

    public void listarParticipantes() {
        System.out.println("CLASIFICACION GENERAL INDIVIDUAL");
        for (Ciclista ciclo : participantes)
            System.out.println(ciclo);
    }

    public void listarEquipos() {
        for (Equipo e : listaEquipos) {
            System.out.println(e);
        }
    }

    @Override
    public String toString() {
        return "Etapa{" +
                "numero=" + numero +
                ",\n nombre='" + nombre +
                ",\n listaEquipos=" + listaEquipos +
                ",\n participantes=" + participantes +
                '}';
    }
}