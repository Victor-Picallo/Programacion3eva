package Ventanas;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class ListaPersonas implements Serializable {

    private static final String NOMBRE_FICHERO = "DATOS.OBJ";
    ArrayList<Persona> listaPersonas;

    public ListaPersonas() {
        listaPersonas = new ArrayList<>();
    }

    public ListaPersonas(ArrayList<Persona> conjunto) {
        this.listaPersonas = conjunto;
    }

    public void annadirPersona(Persona p) {
        listaPersonas.add(p);
    }

    public void eliminarPersona(int i) {
        listaPersonas.remove(i);
    }

    public void borrarLista() {
        listaPersonas.removeAll(listaPersonas);

    }

    /* Añadir un metodo para guardar la lista en un fichero */
    public static void guardarArrayList(ListaPersonas lista) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(NOMBRE_FICHERO))) {
            oos.writeObject(lista);
            System.out.println("ArrayList guardado correctamente en " + NOMBRE_FICHERO);
        } catch (IOException e) {
            System.err.println("Error al guardar el ArrayList: " + e.getMessage());
        }
    }

    /* Añadir un metodo para cargar la lista desde un fichero */
    public static ListaPersonas cargarArrayList() {
        ListaPersonas listaPersonas = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(NOMBRE_FICHERO))) {
            listaPersonas = (ListaPersonas) ois.readObject();
            System.out.println("ListaPersonas cargada correctamente desde " + NOMBRE_FICHERO);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar ListaPersonas: " + e.getMessage());
        }
        return listaPersonas;
    }



}
