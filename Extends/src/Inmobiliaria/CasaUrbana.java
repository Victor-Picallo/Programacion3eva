package Inmobiliaria;

public class CasaUrbana extends Casa{

    //constructor

    public CasaUrbana(int idInmo, int area, String direccion, int nHab, int nBanos, int nPisos) {
        super(idInmo, area, direccion, nHab, nBanos, nPisos);
    }

    //toString

    @Override
    public String toString() {
        return super.toString() + "\nCasaUrbana [ ]";
    }
}