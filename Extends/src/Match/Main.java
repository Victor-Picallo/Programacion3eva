package Match;

public class Main {

    public static void main(String[] args) {

        PartidoFutbolLigaEspanola partido = new
                PartidoFutbolLigaEspanola();
        System.out.println("Duracion del partido    " + PartidoFutbol.duracionPartidoFutbol);
        partido.setEquipoLocal("Real Madrid");
        partido.setEquipoVisitante("Barcelona");
        partido.setGolesEquipoLocal(1);
        partido.setGolesEquipoVisitante(2);
        partido.imprimirMarcador();

        System.out.println("--------------------------");

        PartidoLigaBasketGriega rotok = new
                PartidoLigaBasketGriega();
        System.out.println("Duracion del partido = " + PartidoLigaBasketGriega.duracionPartidoBasket);
        rotok.setEquipoLocal("Olympiakos");
        rotok.setEquipoVisitante("Panathinaikos");
        rotok.setCanastasEquipoLocal(50);
        rotok.setCanastasEquipoVisitante(47);
        rotok.imprimirMarcador();

    }
}
