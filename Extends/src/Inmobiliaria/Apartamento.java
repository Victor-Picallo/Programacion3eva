package Inmobiliaria;

public class Apartamento extends Vivienda{

    //atributos NO TIENE

    //constructor
    public Apartamento(int idInmo, int area, String direccion, int nHab, int nBanos) {
        super(idInmo, area, direccion, nHab, nBanos);
    }

    //toString

    @Override
    public String toString() {
        return super.toString() + "\nApartamento [ ]";
    }
}