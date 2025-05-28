package Inmobiliaria;

public class CasaIndependiente extends CasaUrbana {

    public CasaIndependiente(int idInmo, int area, String direccion, int nHab, int nBanos, int nPisos) {
        super(idInmo, area, direccion, nHab, nBanos, nPisos);
    }

    //toString
    @Override
    public String toString() {
        return "CasaIndependiente[ ]";
    }

    //calcular pvp
    @Override
    void calcularPrecioVenta() {
        this.precioVenta = area * valorUnitario.get("Casa independiente");
    }
}