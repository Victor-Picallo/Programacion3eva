package Inmobiliaria;

public class Casa extends Vivienda{

    //atributo
    protected int nPisos;

    //Constructor

    public Casa(int idInmo, int area, String direccion, int nHab, int nBanos, int nPisos) {
        super(idInmo, area, direccion, nHab, nBanos);
        this.nPisos = nPisos;
    }

    //no sobrescribo ningun metodo ecepto el toString
    @Override
    public String toString() {
        return super.toString() + "\nCasa [nPisos=" + nPisos + ']';
    }
}