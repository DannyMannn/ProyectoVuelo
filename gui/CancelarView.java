package gui;

import javax.swing.*;
import java.awt.*;
/*
Ervey Guerrero Gómez
David Hernández López
Daniel Sánchez Vázquez
Alejandro Tonatiuh García Espinoza
*/

public class CancelarView extends JFrame {
    JPanel contenedor;
    JButton cancelarBoton = new JButton("Cancelar boleto");
    JTextField nombrePas = new JTextField(20);
    JComboBox<String> tipoPasajeroComboBox = new JComboBox<String>(new String[]{"NACIONAL", "INTERNACIONAL"});
    final JLabel nombrePasajero = new JLabel("Nombre Pasajero: ", JLabel.CENTER);
    final JLabel tipoPasajero = new JLabel("Tipo Vuelo: ");

    //Metodo Constructor
    public CancelarView() {
        setVisible(true);
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Cancelar Boleto");

        contenedor = new JPanel();
        contenedor.setVisible(true);
        contenedor.setSize(400, 200);
        contenedor.setLayout(new GridBagLayout());
        contenedor.setBackground(Color.decode("#2299f0"));

        cancelarBoton.setSize(25, 20);
        agregarComponente(contenedor, nombrePasajero, 0, 1);
        agregarComponente(contenedor, nombrePas, 1, 1);
        agregarComponente(contenedor, tipoPasajero, 0, 2);
        agregarComponente(contenedor, tipoPasajeroComboBox, 1, 2);
        agregarComponente(contenedor, cancelarBoton, 1, 3);
        add(contenedor);
    }

    //Agrega componentes, Padre: al que se le agregan, Hijo: El que se agrega
    private void agregarComponente(JComponent padre, JComponent hijo, int x, int y) {
        GridBagConstraints contrains = new GridBagConstraints();
        contrains.insets = new Insets(10, 10, 10, 10);

        contrains.gridx = x;
        contrains.gridy = y;
        padre.add(hijo, contrains);
    }

    public JButton getCancelarBoton() {
        return cancelarBoton;
    }

    public void setCancelarBoton(JButton cancelarBoton) {
        this.cancelarBoton = cancelarBoton;
    }

    public JTextField getNombrePas() {
        return nombrePas;
    }

    public void setNombrePas(JTextField nombrePas) {
        this.nombrePas = nombrePas;
    }

    public JComboBox<String> getTipoPasajeroComboBox() {
        return tipoPasajeroComboBox;
    }

    public void setTipoPasajeroComboBox(JComboBox<String> tipoPasajeroComboBox) {
        this.tipoPasajeroComboBox = tipoPasajeroComboBox;
    }
}