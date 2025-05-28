package Ventanas;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

public class VentanaPrincipal extends JFrame implements ActionListener {
    private ListaPersonas lista;
    private Container contenedor;
    private JLabel nombre, apellidos, telefono, dirección;
    private JTextField campoNombre, campoApellidos, campoTelefono, campoDirección;
    private JButton añadir, eliminar, borrarLista, guardar, cargar;
    private JList listaNombres;
    private DefaultListModel modelo;
    private JScrollPane scrollLista;

    public VentanaPrincipal() {
        lista = new ListaPersonas(); /* crea la lista de personas */
        //LLAMAR A CARGAR LSITA???
        inicio();/* inicializamos los componentes de la ventana */
        cargarLista();
        setTitle("Personas");
        //PASAMOS DE 350 px A 400 PARA METER UN BOTON MAS
        setSize(270, 400);
        setLocationRelativeTo(null);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);/* Establece que el boton de cerrar, permitira salir de la app */
        //DEBERIA LLAMAR A GUARDAR CUANDO SE CIERRA???
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                ListaPersonas.guardarArrayList(lista);
                System.exit(0);
            }
        });
        setResizable(false); /* Establece el tamaño de la ventana */
    }

    private void inicio() {
        //LOS CONTENEDORES NO SEINSTANCIAN
        contenedor = getContentPane();/* Obtiene el panel de contenidos de la ventana */
        contenedor.setLayout(null); /* Establece que el panel no tiene asociado ningun layout */

        /* Establece la etiquete y el campo nombre */
        nombre = new JLabel();
        nombre.setText("Nombre:");
        nombre.setBounds(20, 20, 135, 23); /* Establece la posicion de la etiqueta nombre */
        campoNombre = new JTextField(); /* Crea el campo de texto para el nombre */
        campoNombre.setBounds(105, 20, 135, 23);

        /* Establece la etiqueta y el campo apellidos */
        apellidos = new JLabel();
        apellidos.setText("Apellidos:"); /* Establece la posicion de la etiqueta apellidos */
        apellidos.setBounds(20, 50, 135, 23);
        campoApellidos = new JTextField();
        campoApellidos.setBounds(105, 50, 135, 23); /* Crea el campo de texto para los apellidos */

        /* Establece la etiqueta y el campo telefono */
        telefono = new JLabel();
        telefono.setText("Telefono");
        telefono.setBounds(20, 80, 135, 23); /* Establece la posicion de la etiqueta telefono */
        campoTelefono = new JTextField();
        campoTelefono.setBounds(105, 80, 135, 23); /* Crea el campo de texto para el telefono */

        /* Establece la etiqueta y el campo direccion */
        dirección = new JLabel();
        dirección.setText("Direccion");
        dirección.setBounds(20, 110, 135, 23); /* Establece la posicion de la etiqueta direccion */
        campoDirección = new JTextField();
        campoDirección.setBounds(105, 110, 135, 23); /* Crea el campo de texto para la direccion */

        /* Establece el boton Añadir persona */
        añadir = new JButton();
        añadir.setText("Añadir");
        añadir.setBounds(105, 150, 80, 23); /* Establece la posicion del boton añadir */
        añadir.addActionListener(this);

        /* Establece el boton eliminar persona */
        eliminar = new JButton();
        eliminar.setText("Eliminar");
        eliminar.setBounds(20, 280, 100, 23); /* Establece la posicion del boton eliminar */
        eliminar.addActionListener(this); /* Establece el evento al que se asocia el boton eliminar */

        /* Establece el boton borrar lista */
        borrarLista = new JButton();
        borrarLista.setText("Borrar Lista");
        borrarLista.setBounds(140, 280, 100, 23); /* Establece la posicion del boton borrar lista */
        borrarLista.addActionListener(this); /* Establece el evento al que se asocia el boton borrar lista */

        /* Establece el boton GUARDAR LISTA */
        guardar = new JButton();
        guardar.setText("Guardar Lista");
        guardar.setBounds(20, 320, 100, 23); /* Establece la posicion del boton eliminar */
        guardar.addActionListener(this); /* Establece el evento al que se asocia el boton eliminar */

        /* Establece el boton CARGAR LISTA */
        cargar = new JButton();
        cargar.setText("Cargar Lista");
        cargar.setBounds(140, 320, 100, 23); /* Establece la posicion del boton eliminar */
        cargar.addActionListener(this); /* Establece el evento al que se asocia el boton eliminar */

        /* Establece la lista grafica de personas */
        listaNombres = new JList();

        /* Establece que se pueda seleccionar solamente un elemento de la lista */
        listaNombres.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        modelo = new DefaultListModel();

        /* Establece una barra de desplazamiento vertical */
        scrollLista = new JScrollPane();
        scrollLista.setBounds(20, 190, 220, 80); /* Establece la posicion de la barra de desplazamiento vertical */
        scrollLista.setViewportView(listaNombres); /*
                                                    * Asocia la barra de desplazamiento vertical a la lista de personas
                                                    */

        /* Se añade cada componente grafico al contenedor de la ventana */
        contenedor.add(nombre);
        contenedor.add(campoNombre);
        contenedor.add(apellidos);
        contenedor.add(campoApellidos);
        contenedor.add(telefono);
        contenedor.add(campoTelefono);
        contenedor.add(dirección);
        contenedor.add(campoDirección);
        contenedor.add(añadir);
        contenedor.add(eliminar);
        contenedor.add(borrarLista);
        contenedor.add(scrollLista);

        //AÑADIMOS LOS BOTONES NUEVOS
        contenedor.add(guardar);
        contenedor.add(cargar);
    }

    /* Crea el metodo que gestiona los eventos generados en la ventana principal */
    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == añadir) {
            añadirPersona();
        }
        if (evento.getSource() == eliminar) {
            eliminarNombre(listaNombres.getSelectedIndex());
        }
        if (evento.getSource() == borrarLista) {
            borrarLista();
        }
        if (evento.getSource() == guardar) {
            ListaPersonas.guardarArrayList(lista);
        }
        if (evento.getSource() == cargar) {
            cargarLista();
        }
    }

    private void cargarLista() {
        lista = ListaPersonas.cargarArrayList();
        modelo.clear();
        for (Persona p : lista.listaPersonas) {
            String elemento = p.getNombre() + "-" +
                    p.getApellidos() + "-" +
                    p.getTelefono() + "-" +
                    p.getDireccion();
            modelo.addElement(elemento);
        }
        listaNombres.setModel(modelo);
    }

    private void añadirPersona() {
        Persona p = new Persona(
                campoNombre.getText(),
                campoApellidos.getText(),
                campoTelefono.getText(),
                campoDirección.getText());
        lista.annadirPersona(p);/* Se añade una persona a la lista de personas */

        /* FUSIONA EN UNA CADENA TODOS LOS DATOS DE LA PERSONA PARA SER MOSTRADOS */
        String elemento = campoNombre.getText() + "-" +
                campoApellidos.getText() + "-" +
                campoTelefono.getText() + "-" +
                campoDirección.getText();
        modelo.addElement(elemento);
        listaNombres.setModel(modelo);
        campoNombre.setText("");
        campoApellidos.setText("");
        campoTelefono.setText("");
        campoDirección.setText("");
    }

    private void eliminarNombre(int indice) {
        if (indice >= 0) {
            modelo.removeElementAt(indice); /* Se elimina la persona de la lista grafica */
            lista.eliminarPersona(indice);  /* Se elimina la persona de la lista de personas */
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void borrarLista() {
        lista.borrarLista();
        modelo.clear();
    }
}
