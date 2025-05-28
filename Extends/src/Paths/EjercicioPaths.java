package Paths;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;



public class EjercicioPaths {

    public static void main(String[] args) {

        //1. Cambia esta ruta en funcion dde tu sistema
        String rutaActual = System.getProperty("user.dir");
        System.out.println("Directorio actual: " + rutaActual);

        Path rutaBase = Paths.get(System.getProperty("user.dir"));

        //2. Crear el directorio dentro del path existente path nuevoDirectorio
        Path nuevoDirectorio = rutaBase.resolve("miDirectorio");
        try {
            if (!Files.exists(nuevoDirectorio)) {
                Files.createDirectory(nuevoDirectorio);
                System.out.println("Directorio creado: " + nuevoDirectorio.toAbsolutePath());
            } else {
                System.out.println("El directorio ya existe");
            }
            //3. Listar el contenido del nuevo directorio
            Path nuevoFichero = nuevoDirectorio.resolve("ejemplo33.txt");
            if(!Files.exists(nuevoFichero)) {
                Files.createFile(nuevoFichero);
                System.out.println("Archivo creado: " + nuevoFichero.toAbsolutePath());
            } else {
                System.out.println("El archivo ya existe");
            }
            //4. Lista el contenido nuevo
            System.out.println("Contenido de " + nuevoDirectorio.toAbsolutePath() + ":");
            try (DirectoryStream<Path> stream = Files.newDirectoryStream(nuevoDirectorio)) {
                for (Path entry : stream) {
                    System.out.println(entry.getFileName());
                }
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }

        //5. Lista los packages de la tercera evaluacion
        System.out.println("Dime el contenido de todos mis paquetes dentro de tercera: ");

        Path base = Paths.get("C:\\Workspace\\p3Eva\\src\\Extends\\src");

        System.out.println("Contenido de PACKAGES " + base.toAbsolutePath() + ":");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(base)) {
            for (Path entry : stream) {
                System.out.println(entry.getFileName());
            }
        }
        catch (IOException e) {
        System.err.println("Error de PACKAGE: " + e.getMessage());
    }

    }
}
