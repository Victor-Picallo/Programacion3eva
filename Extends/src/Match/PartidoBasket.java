package Match;

public interface PartidoBasket  extends MatchDeportivo{

    static final int duracionPartidoBasket = 48;

    void setCanastasEquipoLocal(int marcador);
    void setCanastasEquipoVisitante(int marcador);
}
