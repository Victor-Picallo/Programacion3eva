package Inmobiliaria;

public class ApartamentoEstudio extends Apartamento {

    public ApartamentoEstudio(int idInmo, int area, String direccion, int nHab, int nBanos) {
        super(idInmo, area, direccion, nHab, nBanos);
    }

    @Override
    public String toString() {
        return super.toString()+ "\nApartamentoEstudio{}";
    }

    @Override
    void calcularPrecioVenta() {
        this.precioVenta = area * valorUnitario.get("Apartamento estudio");
    }
}
