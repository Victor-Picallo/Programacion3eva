package Paths;

import java.io.File;

public class LeerDirectorio {

    public static void main(String[] args) {

        File directorio = new File("C:\\Users\\xandr\\Documents\\java\\ev3");

        String [] directorios = directorio.list();
        for (int i = 0; i < directorios.length; i++) {
            System.out.println("Archivo: " + directorios[i]);
        }
    }
}
