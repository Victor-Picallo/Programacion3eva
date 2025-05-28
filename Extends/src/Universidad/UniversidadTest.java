package Universidad;

import java.util.ArrayList;

public class UniversidadTest {

    public static void main(String[] args) {

        ArrayList<Estudiante> estudiosos = new ArrayList<>();
        ArrayList<Profesor> profes = new ArrayList<>();
        ArrayList<ProfesorTitular> profesTitulares = new ArrayList<>();

        Persona alumno = new Estudiante("Pepito", "Lopez", "Enfermeria", 1);
        Persona profe = new Profesor("Antonio", "Rodriguez", "Matematicas", "Superior");
        Persona profeTit = new ProfesorTitular("Rosa", "Melano", "Lengua", "Titular", "Lengua Castellana");

        estudiosos.add((Estudiante) alumno);
        profes.add((Profesor) profe);
        profesTitulares.add((ProfesorTitular) profeTit);

        System.out.println("ALUMNOS");
        for (Estudiante estudiante : estudiosos) {
            System.out.println(estudiante);
            estudiante.vaClase();
        }

        System.out.println("PROFESORES");
        for (Profesor profesor : profes) {
            System.out.println(profesor);
            profesor.vaClase();
        }

        System.out.println("PROFESORES TITULARES");
        for (ProfesorTitular profesor : profesTitulares) {
            System.out.println(profeTit);
            profesor.vaClase();
        }

//        System.out.println("PROFESORES TITULARES");
//        for (Persona profe : col) {
//            if (profe instanceof ProfesorTitular)
//                System.out.println(profe);
//            else
//                System.out.println("NO ES UN PROFESOR TITULAR");
//        }

        System.out.println("Otro ejercicio");
        Profesor profesor1 = new ProfesorTitular("Bacterio", "Alfa", "Geometria", "ocho", "Geometria");
        //ESTO REALMENTE NO ES OBLIGATORIO, PERO SI INDICATIVO
        Profesor profesor2 = (Profesor) profesor1;
        System.out.println(profesor1.toString());
        System.out.println(profesor2.toString());
    }
}
