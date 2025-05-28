package Medicina;

public class Ortopedista extends Medico {

    enum tipologia {
        MAXILOFACIAL,
        PEDIATRICA
    }

    public Ortopedista(String nombre, tipologia tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    protected tipologia tipo;

    public void setTipologia(tipologia tipo) {
        this.tipo = tipo;
    }

    public tipologia getTipologia() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Ortopedista{" +
                "tipo=" + tipo +
                '}';
    }
}
