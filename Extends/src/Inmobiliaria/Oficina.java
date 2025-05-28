package Inmobiliaria;

public class Oficina extends Local {

    protected boolean esOficial;

    public Oficina(int id, int area, String direccion, tipo tipoLocal, boolean esOficial) {
        super(id, area, direccion, tipoLocal);
        this.esOficial = esOficial;
    }

    @Override
    public String toString() {
        return super.toString() + "\nOficina{" +
                "esOficial=" + esOficial +
                '}';
    }

    @Override
    void calcularPrecioVenta() {
        this.precioVenta = area * valorUnitario.get("Oficina");
    }
}
