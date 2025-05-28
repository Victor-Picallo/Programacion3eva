package Inmobiliaria;

public class CasaRural extends Casa{

    //atributos
    //prtectes static double valorArea = 1500000;
    protected int distanciaCap;
    protected int altitud;

    //constructor

    public CasaRural(int idInmo, int area, String direccion, int nHab, int nBanos, int nPisos, int alt, int dis) {
        super(idInmo, area, direccion, nHab, nBanos, nPisos);
        this.altitud = alt;
        this.distanciaCap = dis;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + "\nCasaRural[" + "altitud=" + altitud + ", distanciaCap=" + distanciaCap + ']';
    }

    //HEMOS HEREDADO calcuarPrecioVenta lo tocamos?????
    @Override
    void calcularPrecioVenta() {
        this.precioVenta = area * valorUnitario.get("Casa rural");
    }
}