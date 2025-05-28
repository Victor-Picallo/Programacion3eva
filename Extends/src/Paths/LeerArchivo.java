package Paths;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeerArchivo {
        public static void main(String[] args) {

            String nombreArchivo = "prueba.txt";
            FileInputStream archivo;
            InputStreamReader conevrsonr;
            BufferedReader filtro;
            String linea;

            try{
                archivo = new FileInputStream(nombreArchivo);
                conevrsonr = new InputStreamReader(archivo);
                filtro = new BufferedReader(conevrsonr);
                linea= filtro.readLine();

                while(linea != null){
                    System.out.println(linea);
                    linea = filtro.readLine();
                }

                filtro.close();
            }catch (IOException e){
                System.out.println("Error al leer el archivo");
            }


        }
}
