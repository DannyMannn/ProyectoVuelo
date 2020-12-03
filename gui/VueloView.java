package gui;

import javax.swing.*;
import java.awt.*;

import model.EnumVuelo;

public class VueloView extends JPanel {
    private JLabel aerolineaLabel = new JLabel("Aerolinea: ");
    private JLabel destinoVueloLabel = new JLabel("Destino: ");
    private JLabel numAsientoLabel = new JLabel("Número de Asiento: ");
    private JLabel numVueloLabel = new JLabel("Número de Vuelo: ");
    private JLabel tipoVueloLabel = new JLabel("Tipo de Vuelo: ");
    private JTextField aerolineaTextField = new JTextField(20);
    private JTextField destinoTextField = new JTextField(20);
    private JTextField numAsientoTextField = new JTextField(20);
    private JTextField numVueloTextField = new JTextField(20);
    private JTextField tipoVueloTextField = new JTextField(20);

    public String aerolineaVueloEntrada;
    public String destinoVueloEntrada;
    public int numAsientoVueloEntrada;
    public int numeroVueloEntrada;
    public EnumVuelo tipoVueloEntrada;

    public String getAerolineaVueloEntrada() {
        return aerolineaVueloEntrada = aerolineaTextField.getText();
    }

    public String getDestinoVueloEntrada() {
        return destinoVueloEntrada = destinoTextField.getText();
    }

    public int getNumAsientoVueloEntrada() {
        return numAsientoVueloEntrada = Integer.parseInt(numAsientoTextField.getText());
    }

    public int getNumeroVueloEntrada() {
        return numeroVueloEntrada = Integer.parseInt(numVueloTextField.getText());
    }

    public EnumVuelo getTipoVueloEntrada() {
        return tipoVueloEntrada = EnumVuelo.valueOf(tipoVueloTextField.getText());
    }

    public VueloView() {
        this.setLayout(new GridBagLayout());
        this.setBackground(Color.decode("#2299f0"));

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5);

        constraints.gridx = 0;
        constraints.gridy = 0;
        this.add(aerolineaLabel, constraints);

        constraints.gridx = 1;
        this.add(aerolineaTextField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        this.add(destinoVueloLabel, constraints);

        constraints.gridx = 1;
        this.add(destinoTextField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        this.add(numAsientoLabel, constraints);

        constraints.gridx = 1;
        this.add(numAsientoTextField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 3;
        this.add(numVueloLabel, constraints);

        constraints.gridx = 1;
        this.add(numVueloTextField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 4;

        constraints.gridx = 1;

        this.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Datos del Vuelo"));
    }
}
