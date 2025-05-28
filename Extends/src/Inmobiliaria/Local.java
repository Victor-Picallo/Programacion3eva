package Inmobiliaria;

public class Local extends Inmueble {

    //Enum de tipo de local
    enum tipo {
        INTERNO, CALLE
    };

    // Atributo que indentifica el tipo de local
    protected tipo tipoLocal;

    public Local(int id, int area, String direccion, tipo tipoLocal) {
        super(id, area, direccion);
        this.tipoLocal = tipoLocal;
    }

    public String toString() {
        return super.toString() + "\nLocal [tipoLocal = " + tipoLocal + "]";
    }
}
