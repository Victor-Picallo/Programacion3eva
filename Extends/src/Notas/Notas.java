package Notas;

import java.util.ArrayList;

public class Notas {

    ArrayList<Double> listaNotas; /* Atributo que identifica un array de notas de tipo double */

    public Notas() {
        listaNotas = new ArrayList<Double>(); // Crea un array de 5 notas
    }

//    double calcularPromedio() {
//        double suma = 0;
//        for (double n : listaNotas) { // Se recorre el array
//            suma += n; // Suma las notas del array
//        }
//        return (suma / listaNotas.size());
//    }

    public ArrayList<Double> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(ArrayList<Double> listaNotas) {
        this.listaNotas = listaNotas;
    }

    double calcularPromedio() {
        return listaNotas.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0);
    }

//    double calcularDesviacion() {
//        double prom = calcularPromedio(); /* Invoca el método para calcular el promedio */
//        double suma = 0;
//        for (Double n : listaNotas) {
//            // Aplica fórmula para la sumatoria de elementos
//            suma += Math.pow(n - prom, 2);
//        }
//        return Math.sqrt(suma / listaNotas.size()); /* Retorna el cálculo final de la desviación */
//    }

    double calcularDesviacion() {
        double prom = calcularPromedio();
        return Math.sqrt(
                listaNotas.stream()
                        .mapToDouble(n -> Math.pow(n - prom, 2))
                        .average()
                        .orElse(0) // Si no hay elementos, devuelve 0
        );
    }

//    double calcularMenor() {
//        double menor = listaNotas.get(0); /* Define una variable como la nota menor */
//        for (Double n : listaNotas) { // Se recorre el array
//            if (n < menor) {
//                menor = n;
//            }
//        }
//        return menor;
//    }

    double calcularMenor() {
        return listaNotas.stream()
                .mapToDouble(Double::doubleValue)
                .min()
                .orElse(Double.NaN); //O puedes usar otro valor predeterminado si la lista esta vacia
    }

//    double calcularMayor() {
//        double mayor = listaNotas.get(0); /* Define una variable como la nota mayor */
//        for (Double n : listaNotas) { // Se recorre el array
//            if (n > mayor) {
//                mayor = n;
//            }
//        }
//        return mayor;
//    }

    double calcularMayor() {
        return listaNotas.stream()
                .mapToDouble(Double::doubleValue)
                .max()
                .orElse(Double.NaN); //O puedes usar otro valor predeterminado si la lista esta vacia
    }

}