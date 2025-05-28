package SistemaPeaje;

public class Main {

    public static void main(String[] args) {

        Peaje peaje = new Peaje("vilaboa", "PO");
        Camion camion1 = new Camion("PKT-1234", 2);
        peaje.addVehiculo(camion1);
        peaje.calcularPeaje(camion1);
        System.out.println(camion1);
        System.out.println("---------------------------------------");

        Camion camion2 = new Camion("KLM-1234", 3);
        peaje.addVehiculo(camion2);
        peaje.calcularPeaje(camion2);
        System.out.println(camion2);
        System.out.println("---------------------------------------");

        Camion camion3 = new Camion("PKT-4321", 4);
        peaje.addVehiculo(camion3);
        peaje.calcularPeaje(camion3);
        System.out.println(camion3);
        System.out.println("---------------------------------------");

        Moto moto1 = new Moto("MTR-1234");
        peaje.addVehiculo(moto1);
        peaje.calcularPeaje(moto1);
        System.out.println(moto1);
        System.out.println("---------------------------------------");

        Moto moto2 = new Moto("KSW-1234");
        peaje.addVehiculo(moto2);
        peaje.calcularPeaje(moto2);
        System.out.println(moto2);
        System.out.println("---------------------------------------");

        Coche coche1 = new Coche("ABC-1234");
        peaje.addVehiculo(coche1);
        peaje.calcularPeaje(coche1);
        System.out.println(coche1);
        System.out.println("---------------------------------------");

        Coche coche2 = new Coche("ZXA-1234");
        peaje.addVehiculo(coche2);
        peaje.calcularPeaje(coche2);
        System.out.println(coche2);
        System.out.println("---------------------------------------");

        System.out.println("RESUMEN DEL DIA EN EL PEAGE");
        peaje.imprimir();
    }

}
