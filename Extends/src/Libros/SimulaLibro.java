package Libros;

import java.util.ArrayList;

public class SimulaLibro {

    public static void main(String[] args) {
        Libro libro1 = new Libro("El Lazarillo de Tormes", "Anonimo");
        libro1.setPrecio(7.5f);
        //System.out.println(libro1.toString());

        Novela novela1 = new Novela("El amor en los tiempos del cólera", "Gabriel García Márquez", Novela.genero.ROMANTICA);
        novela1.setPrecio(22.50f);
        //System.out.println(novela1.toString());

        LibroTexto ltexto1 = new LibroTexto("Cálculo", "James Stewart", "Cálculo Diferencial e Integral");
        ltexto1.setPrecio(50.0f);
        //System.out.println(ltexto1.toString());

        LibroTextoUni libroUni1 = new LibroTextoUni("Fisica Cuantica III", "A.Einstein", "Cálculo Diferencial e Integral", "Fisicas");
        libroUni1.setPrecio(35.0f);
        //System.out.println(libroUni1.toString());

        ArrayList<Libro> cole = new ArrayList<Libro>();

        cole.add(libro1);
        cole.add(novela1);
        cole.add(ltexto1);
        cole.add(libroUni1);

        for (Libro l : cole) {
            System.out.println(cole.toString());
        }
    }
}