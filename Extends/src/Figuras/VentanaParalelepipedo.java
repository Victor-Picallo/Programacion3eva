package Figuras;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaParalelepipedo extends JFrame implements ActionListener {

    private Container contenedor;
    private JLabel largo, alto, ancho, volumen, superficie;
    private JTextField campoLargo, campoAlto, campoAncho;
    private JButton calcular;

    public VentanaParalelepipedo() {
        inicio();
        setTitle("Paralelepipedo");
        setSize(320, 240);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        largo = new JLabel("Largo (cms):");
        largo.setBounds(20, 20, 135, 23);
        campoLargo = new JTextField();
        campoLargo.setBounds(120, 20, 135, 23);

        alto = new JLabel("Altura (cms):");
        alto.setBounds(20, 50, 135, 23);
        campoAlto = new JTextField();
        campoAlto.setBounds(120, 50, 135, 23);

        ancho = new JLabel("Altura (cms):");
        ancho.setBounds(20, 80, 135, 23);
        campoAncho = new JTextField();
        campoAncho.setBounds(120, 80, 135, 23);

        calcular = new JButton("Calcular");
        calcular.setBounds(120, 110, 135, 23);
        calcular.addActionListener(this);

        volumen = new JLabel("Volumen (cm3):");
        volumen.setBounds(20, 140, 200, 23);

        superficie = new JLabel("Superficie (cm2):");
        superficie.setBounds(20, 170, 200, 23);

        contenedor.add(largo);
        contenedor.add(campoLargo);
        contenedor.add(alto);
        contenedor.add(campoAlto);
        contenedor.add(ancho);
        contenedor.add(campoAncho);
        contenedor.add(calcular);
        contenedor.add(volumen);
        contenedor.add(superficie);
    }

    public void actionPerformed(ActionEvent event) {
        Paralelepipedo para;
        boolean error = false;
        double largo = 0;
        double alto = 0;
        double ancho = 0;
        try {
            largo = Double.parseDouble(campoLargo.getText());
            alto = Double.parseDouble(campoAlto.getText());
            ancho = Double.parseDouble(campoAncho.getText());
            para = new Paralelepipedo(largo, alto, ancho);
            volumen.setText("Volumen (cm3): " + String.format("%.2f", para.calcularVolumen()));
            superficie.setText("Superficie (cm2): " + String.format("%.2f", para.calcularSuperficie()));
        } catch (Exception e) {
            error = true;
        } finally {
            if (error) {
                JOptionPane.showMessageDialog(null, "Campo nulo o error en formato de numero",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new VentanaParalelepipedo().setVisible(true);
        });
    }
}