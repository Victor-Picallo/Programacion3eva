package SistemaPeaje;

import java.util.ArrayList;

public class Peaje {

    String nombre;
    String departamento;
    ArrayList<Vehiculo> vehiculos;
    double totalPeaje = 0;
    static int totalCamiones = 0;
    static int totalMotos = 0;
    static int totalCoches = 0;

    Peaje(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
        vehiculos = new ArrayList<Vehiculo>();
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    private void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getTotalPeaje() {
        return totalPeaje;
    }

    private void setTotalPeaje(double totalPeaje) {
        this.totalPeaje = totalPeaje;
    }

    public void addVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public double calcularPeaje(Vehiculo vehiculo) {
        double aux;
        if(vehiculo instanceof Coche) {
            totalCoches++;
            aux = Coche.getValorPeaje();
            totalPeaje += aux;
            return aux;
        } else if (vehiculo instanceof Moto) {
            totalMotos++;
            aux = Moto.getValorPeaje();
            totalPeaje += aux;
            return aux;
        } else if (vehiculo instanceof Camion) {
            totalCamiones++;
            Camion camion = (Camion) vehiculo;
            aux = camion.getValorPeaje();
            totalPeaje += aux;
            return aux;
        } else return -1;


    }

    public void imprimir() {
        System.out.println("Peaje = " + this.getNombre());
        System.out.println("Ubicacion = " + this.getDepartamento());
        System.out.println("Total de coches = " + totalCoches);
        System.out.println("Total de motos = " + totalMotos);
        System.out.println("Total de camiones = " + totalCamiones);
        int totalVehiculos = totalCoches + totalMotos + totalCamiones;
        System.out.println("Total de vehiculos = " + totalVehiculos);
        System.out.println("Dinero total = € " + this.getTotalPeaje());
    }
}
