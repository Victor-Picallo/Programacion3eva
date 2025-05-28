package Inmobiliaria;

public class Vivienda extends Inmueble{

    //atributos a mayores
    protected int nHabitaciones;
    protected int nBanos;

    //Constructor
    public Vivienda(int idInmo, int area, String direccion, int nHab, int nBanos) {
        super(idInmo, area, direccion);
        this.nHabitaciones = nHab;
        this.nBanos = nBanos;
    }

    //no sobrescribo ningun metodo ecepto el toString

    @Override
    public String toString() {
        return super.toString() + "\nVivienda [nBanos=" + nBanos + ", nHabitaciones=" + nHabitaciones + ']';
    }
}