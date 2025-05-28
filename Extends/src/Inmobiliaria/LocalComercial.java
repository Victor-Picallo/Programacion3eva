package Inmobiliaria;

public class LocalComercial extends Local{

    protected String centroComercial;

    public LocalComercial(int id, int area, String direccion, tipo tipoLocal, String centroComercial) {
        super(id, area, direccion, tipoLocal);
        this.centroComercial = centroComercial;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLocalComercial{" +
                "centroComercial='" + centroComercial + '\'' +
                '}';
    }


    @Override
    void calcularPrecioVenta() {
        this.precioVenta = area * valorUnitario.get("Local comercial");
    }
}
