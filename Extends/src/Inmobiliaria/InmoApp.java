package Inmobiliaria;

import java.util.ArrayList;

public class InmoApp {

    public static void main(String[] args) {

        ArrayList<Inmueble> inmo = new ArrayList<Inmueble>();
        CasaRural casa1 = new CasaRural(1, 50, "a1", 3, 2, 3, 1, 1);
        CasaCerrado casa2 = new CasaCerrado(2, 100, "b 33", 3, 2, 1, false, false, 1000);
        CasaIndependiente casa3 = new CasaIndependiente(3, 150, "c 44", 5, 3, 2);
        ApartamentoFamiliar apar1 = new ApartamentoFamiliar(4, 30, "f3", 2, 1, 100);
        ApartamentoEstudio apar2 = new ApartamentoEstudio(6, 10, "g 5", 1, 1);
        LocalComercial loc1 = new LocalComercial(8, 50, "cd 3", Local.tipo.CALLE, "calle zx");
        Oficina loc2 = new Oficina(9, 100, "cd 3", Local.tipo.INTERNO, false);

        inmo.add(casa1);
        inmo.add(casa2);
        inmo.add(casa3);
        inmo.add(apar1);
        inmo.add(apar2);
        inmo.add(loc1);
        inmo.add(loc2);

//        for(Inmueble i : inmo)
//            System.out.println(i.toString());

        Double suma = 0d;
        for (Inmueble i : inmo) {
            i.pueblaValores();
            i.calcularPrecioVenta();
            suma += i.getPrecioVenta();
            System.out.println(i.toString() + "\n-->" + i.getPrecioVenta());
        }

        System.out.println("Total valor propiedades: " + suma);
    }
}
