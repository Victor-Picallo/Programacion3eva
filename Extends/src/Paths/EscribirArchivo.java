package Paths;

import java.io.*;
public class EscribirArchivo {
    public static void main(String[] args) {

        FileWriter archivo= null;
        PrintWriter impresor =null;

        try{
            System.out.println("Creando archivo...");
            archivo = new FileWriter("prueba.txt");
            impresor = new PrintWriter(archivo);
            for (int i = 0; i<10; i++){
                impresor.println("Linea: " + i);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try{
                if (archivo != null)
                    archivo.close();
                System.out.println("Cerrando fichero...");
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
    }
}
