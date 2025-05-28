package Match;

public class PartidoLigaBasketGriega implements PartidoBasket{

    //Atributos
    String equipoLocal;
    String equipoVisitante;
    int canastasEquipoLocal;
    int canastasEsquipoVisitante;

    @Override
    public void setEquipoLocal(String nombreEquipo) {
        this.equipoLocal = nombreEquipo;
    }

    @Override
    public void setEquipoVisitante(String nombreEquipo) {
        this.equipoVisitante = nombreEquipo;
    }

    @Override
    public void setCanastasEquipoLocal(int marcador) {
        this.canastasEquipoLocal = marcador;
    }

    @Override
    public void setCanastasEquipoVisitante(int marcador) {
        this.canastasEsquipoVisitante = marcador;
    }

    void imprimirMarcador() {
        System.out.println("Equipo Local: " + this.equipoLocal + " : " + this.canastasEquipoLocal
        + " - " + this.canastasEsquipoVisitante  + " : " + this.equipoVisitante + ": Equipo Visitante");
    }
}
