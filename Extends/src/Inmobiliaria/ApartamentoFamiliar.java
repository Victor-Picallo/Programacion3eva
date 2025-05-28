package Inmobiliaria;

public class ApartamentoFamiliar extends Apartamento {

    protected int valorAdmin;

    public ApartamentoFamiliar(int idInmo, int area, String direccion, int nHab, int nBanos, int valorAdmin) {
        super(idInmo, area, direccion, nHab, nBanos);
    }

    @Override
    public String toString() {
        return super.toString() + "\nApartamentoFamiliar{" +
                "valorAdmin=" + valorAdmin +
                '}';
    }

    @Override
    //HEMOS HEREDADO calcuarPrecioVenta lo tocamos?????
    void calcularPrecioVenta() {
        this.precioVenta = area * valorUnitario.get("Apartamento familiar");
    }
}
