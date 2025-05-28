package Medicina;

public class Pediatra extends Medico {

    enum tipologia {
        NEUROLOGO,
        PSICOLOGO
    }

    protected tipologia tipo;

    public Pediatra(String nombre, tipologia tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    public void setTipologia(tipologia tipo) {
        this.tipo = tipo;
    }

    public tipologia getTipologia() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Pediatra{" +
                "tipo=" + tipo +
                '}';
    }
}
