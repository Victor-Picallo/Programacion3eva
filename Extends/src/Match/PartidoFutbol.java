package Match;

public interface PartidoFutbol extends MatchDeportivo {

    //CONSTANTE PARA PARTIDO DE FUTBOL
    static final int duracionPartidoFutbol = 90;

    void setGolesEquipoLocal(int marcador);
    void setGolesEquipoVisitante(int marcador);
}
