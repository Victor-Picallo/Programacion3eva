package Tour;

public class PruebaEtapa {

    public static void main(String[] args) {

        Etapa etapa = new Etapa(8, "Vigo-Vigo");

        //Etapa
        System.out.println(etapa);
        System.out.println("META ------------------------");
        //Correr
        etapa.disputarEtapa();
        //Ordenar participantes y equipos
        etapa.ordenarParticipantes();
        etapa.ordenarEquipos();
        //Listar clasificaciones
        etapa.listarParticipantes();
        etapa.listarEquipos();
    }
}
