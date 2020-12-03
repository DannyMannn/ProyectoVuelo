package gui;

import javax.swing.*;
import java.awt.*;

public class DocumentacionNacionalView extends JPanel {
    private JLabel curpLabel = new JLabel("Ingresa CURP: ");
    private JTextField curpField = new JTextField(20);

    private String curpEntrada;

    public String getCurpEntrada() {
        return curpEntrada = curpField.getText();
    }

    public DocumentacionNacionalView() {
        this.setLayout(new GridBagLayout());
        this.setBackground(Color.decode("#2299f0"));

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10);

        constraints.gridx = 0;
        constraints.gridy = 0;
        this.add(curpLabel, constraints);

        constraints.gridx = 1;
        this.add(curpField, constraints);

        this.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Documentación Nacional"));
    }
}

