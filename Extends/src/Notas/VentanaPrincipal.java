package Notas;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * Esta clase define una interfaz gráfica para ingresar notas, verlas en un JList,
 * y calcular estadísticas usando la clase Notas.
 */
public class VentanaPrincipal extends JFrame implements ActionListener {
    // Contenedor de elementos gráficos
    private Container contenedor;
    // CAMBIO: Etiqueta y campo para UNA nota
    private JLabel labelNota, promedio, desviacion, mayor, menor;
    private JTextField campoNota;
    // CAMBIO: JList para mostrar las notas
    private DefaultListModel<Double> modeloLista;
    private JList<Double> listaNotas;
    // Botones para añadir, eliminar, borrar todas y calcular
    private JButton btnAnadir, btnEliminar, btnBorrarTodo, btnCalcular;

    // CAMBIO: Objeto Notas para gestionar la lista y los cálculos
    private Notas notas;

    /** Constructor de la clase VentanaPrincipal */
    public VentanaPrincipal() {
        inicio(); // Inicializa la VISTA
        setTitle("Notas");
        setSize(340, 420);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    /** Método que crea la ventana con sus diferentes componentes gráficos */
    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        // CAMBIO: Etiqueta y campo de texto para una nota
        labelNota = new JLabel("Nota:");
        labelNota.setBounds(20, 20, 50, 23);
        campoNota = new JTextField();
        campoNota.setBounds(70, 20, 80, 23);

        // CAMBIO: Botón Añadir
        btnAnadir = new JButton("Añadir");
        btnAnadir.setBounds(160, 20, 80, 23);
        btnAnadir.addActionListener(this);

        // CAMBIO: JList y modelo para mostrar las notas
        modeloLista = new DefaultListModel<>();
        listaNotas = new JList<>(modeloLista);
        JScrollPane scrollLista = new JScrollPane(listaNotas);
        scrollLista.setBounds(20, 60, 220, 120);

        // CAMBIO: Botón Eliminar nota seleccionada
        btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(250, 60, 80, 23);
        btnEliminar.addActionListener(this);

        // CAMBIO: Botón Borrar todas las notas
        btnBorrarTodo = new JButton("Borrar todo");
        btnBorrarTodo.setBounds(250, 100, 80, 23);
        btnBorrarTodo.addActionListener(this);

        // Botón Calcular estadísticas
        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(20, 190, 100, 23);
        btnCalcular.addActionListener(this);

        // Etiquetas de resultados
        promedio = new JLabel("Promedio = ");
        promedio.setBounds(20, 230, 200, 23);

        desviacion = new JLabel("Desviación estándar = ");
        desviacion.setBounds(20, 260, 200, 23);

        mayor = new JLabel("Valor mayor = ");
        mayor.setBounds(20, 290, 200, 23);

        menor = new JLabel("Valor menor = ");
        menor.setBounds(20, 320, 200, 23);

        // CAMBIO: Instancia la clase Notas
        notas = new Notas();

        // Añadir componentes al contenedor
        contenedor.add(labelNota);
        contenedor.add(campoNota);
        contenedor.add(btnAnadir);
        contenedor.add(scrollLista);
        contenedor.add(btnEliminar);
        contenedor.add(btnBorrarTodo);
        contenedor.add(btnCalcular);
        contenedor.add(promedio);
        contenedor.add(desviacion);
        contenedor.add(mayor);
        contenedor.add(menor);
    }

    /** Método que gestiona los eventos generados en la ventana principal */
    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == btnAnadir) {
            // CAMBIO: Añade la nota al modelo y al objeto Notas
            try {
                double nota = Double.parseDouble(campoNota.getText());
                modeloLista.addElement(nota);
                notas.getListaNotas().add(nota);
                campoNota.setText("");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese solo números.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        if (evento.getSource() == btnEliminar) {
            // CAMBIO: Elimina la nota seleccionada del modelo y del objeto Notas
            int indice = listaNotas.getSelectedIndex();
            if (indice != -1) {
                modeloLista.remove(indice);
                notas.getListaNotas().remove(indice);
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione una nota para eliminar.", "Atención", JOptionPane.WARNING_MESSAGE);
            }
        }

        if (evento.getSource() == btnBorrarTodo) {
            // CAMBIO: Borra todas las notas del modelo y del objeto Notas
            modeloLista.clear();
            notas.getListaNotas().clear();
        }

        if (evento.getSource() == btnCalcular) {
            // CAMBIO: Calcula estadísticas usando la clase Notas
            if (modeloLista.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No hay notas para calcular.", "Atención", JOptionPane.WARNING_MESSAGE);
                return;
            }
            double prom = notas.calcularPromedio();
            double desv = notas.calcularDesviacion();
            double max = notas.calcularMayor();
            double min = notas.calcularMenor();

            promedio.setText("Promedio = " + String.format("%.2f", prom));
            desviacion.setText("Desviación estándar = " + String.format("%.2f", desv));
            mayor.setText("Valor mayor = " + String.format("%.2f", max));
            menor.setText("Valor menor = " + String.format("%.2f", min));
        }
    }

    // Método main para probar la ventana
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new VentanaPrincipal().setVisible(true));
    }
}
