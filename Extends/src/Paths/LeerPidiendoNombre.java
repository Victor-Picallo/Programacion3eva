package Paths;

import java.io.*;
import java.util.Scanner;

public class LeerPidiendoNombre {
    public static void main(String[] args) {

        String nombreArchivo;
        FileInputStream archivo;
        InputStreamReader conversor;
        BufferedReader filtro;
        String linea;

        System.out.println("Introduce el nombre del archivo/fichero (incluyendo la extension)");
        Scanner sc = new Scanner(System.in);
        nombreArchivo = sc.nextLine();

        try{
            archivo = new FileInputStream(nombreArchivo);
            conversor = new InputStreamReader(archivo);
            filtro = new BufferedReader(conversor);
            linea= filtro.readLine();

            while(linea != null){
                System.out.println(linea);
                linea = filtro.readLine();
            }

            filtro.close();
        }catch (FileNotFoundException e){
            System.out.println("No se econtró el archivo:" + e.getMessage());
        }
        catch (IOException e){
            System.out.println("Error de E/S: " + e.getMessage());
        }


    }
}
