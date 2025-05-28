package Inmobiliaria;

public class CasaCerrado extends CasaUrbana{

    //atributos
    protected int valorAdministracion;
    protected boolean tienePiscina;
    public boolean camposDeportivos;

    //constructor

    public CasaCerrado(int idInmo, int area, String direccion, int nHab, int nBanos, int nPisos, boolean campos, boolean piscina, int admin) {
        super(idInmo, area, direccion, nHab, nBanos, nPisos);
        this.valorAdministracion = admin;
        this.tienePiscina = piscina;
        this.camposDeportivos = campos;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + "\nCasaCerrado[" + "camposDeportivos=" + camposDeportivos + ", valorAdministracion=" + valorAdministracion +
                ", tienePiscina=" + tienePiscina + ']';
    }

    //calcular pvp
    @Override
    void calcularPrecioVenta() {
        //esto seria una opcion valida
        //super.calcularPrecioVenta("Casa en conjunto cerrado");

        this.precioVenta = area * valorUnitario.get("Casa en conjunto cerrado");
    }
}