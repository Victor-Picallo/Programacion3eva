package Figuras;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Ventana principal para elegir la figura geométrica a calcular.
 * Abre las ventanas específicas de Cilindro, Esfera, Pirámide o Paralelepípedo.
 */
public class VentanaPrincipal extends JFrame implements ActionListener {
    private Container contenedor;
    private JLabel titulo, descripcion;
    private JButton Cilindro, Esfera, Piramide, Paralelepipedo, Salir;

    public VentanaPrincipal() {
        inicio();
        setTitle("Figuras Geométricas");
        setSize(370, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        titulo = new JLabel("Calculadora de Figuras Geométricas");
        titulo.setFont(new Font("Arial", Font.BOLD, 16));
        titulo.setBounds(30, 20, 320, 30);

        descripcion = new JLabel("Seleccione una figura para calcular sus propiedades:");
        descripcion.setBounds(30, 60, 320, 23);

        Cilindro = new JButton("Cilindro");
        Cilindro.setBounds(100, 100, 160, 30);
        Cilindro.addActionListener(this);

        Esfera = new JButton("Esfera");
        Esfera.setBounds(100, 140, 160, 30);
        Esfera.addActionListener(this);

        Piramide = new JButton("Pirámide");
        Piramide.setBounds(100, 180, 160, 30);
        Piramide.addActionListener(this);

        Paralelepipedo = new JButton("Paralelepípedo");
        Paralelepipedo.setBounds(100, 220, 160, 30);
        Paralelepipedo.addActionListener(this);

        Salir = new JButton("Salir");
        Salir.setBounds(100, 260, 160, 30);
        Salir.addActionListener(this);

        contenedor.add(titulo);
        contenedor.add(descripcion);
        contenedor.add(Cilindro);
        contenedor.add(Esfera);
        contenedor.add(Piramide);
        contenedor.add(Paralelepipedo);
        contenedor.add(Salir);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == Cilindro) {
            new VentanaCilindro().setVisible(true);
        }
        if (evento.getSource() == Esfera) {
            new VentanaEsfera().setVisible(true);
        }
        if (evento.getSource() == Piramide) {
            new VentanaPiramide().setVisible(true);
        }
        if (evento.getSource() == Paralelepipedo) {
            new VentanaParalelepipedo().setVisible(true);
        }
        if (evento.getSource() == Salir) {
            dispose();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new VentanaPrincipal().setVisible(true));
    }
}

