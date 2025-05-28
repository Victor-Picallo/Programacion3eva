package Match;

public class PartidoFutbolLigaEspanola implements PartidoFutbol{

    //Atributos
    String equipoLocal;
    String equipoVisitante;
    int golesEquipoLocal;
    int golesEquipoVisitante;

    public void setEquipoLocal(String nombreEquipo) {
        this.equipoLocal = nombreEquipo;
    }

    public void setEquipoVisitante(String nombreEquipo) {
        this.equipoVisitante = nombreEquipo;
    }

    public void setGolesEquipoLocal(int marcador) {
        this.golesEquipoLocal = marcador;
    }

    public void setGolesEquipoVisitante(int marcador) {
        this.golesEquipoVisitante = marcador;
    }

    void imprimirMarcador() {
        System.out.println("Equipo Local: " + equipoLocal + " Marcador: " + golesEquipoLocal +
                "\nEquipo Visitante: " + equipoVisitante + " Marcador: " + golesEquipoVisitante);
    }
}
