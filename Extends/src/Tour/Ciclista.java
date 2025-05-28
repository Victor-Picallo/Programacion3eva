package Tour;

import java.util.Random;

public class Ciclista implements Comparable {

    protected int id;
    protected String nombre;
    protected double tiempoAcumulado = 0d;
    protected int posGeneral = 0;

    public Ciclista(String nombre, int identificador) {
        this.nombre = nombre;
        this.id = identificador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getTiempoAcumulado() {
        return tiempoAcumulado;
    }

    public void setTiempoAcumulado(double tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }

    public void correr() {
        Random random = new Random();
        double t = 50.0+Math.random()*20;
        this.setTiempoAcumulado(t);
    }

    protected String imprimirTipo() {
        return "Ciclista Generico";
    }

    protected int getPosGeneral() {
        return this.posGeneral;
    }

    protected void setPosGeneral(int pos) {
        this.posGeneral = pos;
    }

    @Override
    public String toString() {
        return "Ciclista{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tiempoAcumulado=" + tiempoAcumulado +
                ", posGeneral=" + posGeneral +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Ciclista c = (Ciclista) o;
        //REVISADO
        return (int)(Double.compare(getTiempoAcumulado(), c.getTiempoAcumulado()));

    }
}
