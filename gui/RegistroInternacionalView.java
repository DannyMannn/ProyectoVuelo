package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.net.URL;

/*
Ervey Guerrero Gómez
David Hernández López
Daniel Sánchez Vázquez
Alejandro Tonatiuh García Espinoza
*/


public class RegistroInternacionalView {
    private JFrame mainFrame;
    DocumentacionInternacionalView docInternacionalView = new DocumentacionInternacionalView();
    PasajeroView pasajeroView = new PasajeroView();
    VueloView vueloView = new VueloView();
    JButton enviarBoton = new JButton("Enviar");
    JButton cancelarBoton = new JButton("Cancelar");

    public DocumentacionInternacionalView getDocInternacionalView() {
        return docInternacionalView;
    }

    public PasajeroView getPasajeroView() {
        return pasajeroView;
    }

    public VueloView getVueloView() {
        return vueloView;
    }

    public RegistroInternacionalView() {
        mainFrame = new JFrame();
        mainFrame.setLayout(new BorderLayout());
        URL iconURL = getClass().getResource("resources/images/iconavion.png");
        ImageIcon icon = new ImageIcon(iconURL);
        mainFrame.setIconImage(icon.getImage());
        mainFrame.setTitle("Registro de Boleto Internacional");

        //hacer panel en clase reutilizable?
        JPanel panelBoton = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10);
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.anchor = GridBagConstraints.CENTER;
        panelBoton.add(enviarBoton, constraints);
        constraints.gridy = 1;
        panelBoton.add(cancelarBoton, constraints);
        panelBoton.setBackground(Color.decode("#2299f0"));

        JPanel panelEast = new JPanel(new GridLayout(2, 1));
        panelEast.add(pasajeroView);
        panelEast.add(panelBoton);

        JPanel panelCenter = new JPanel(new GridLayout(2, 1));
        panelCenter.add(vueloView);
        panelCenter.add(docInternacionalView);

        JLabel backgroundLabel = new JLabel(new ImageIcon(this.getClass().getResource("resources/images/RegistrationN1_Parejo_Fondo.png")));

        mainFrame.getContentPane().add(panelEast, BorderLayout.EAST);
        mainFrame.getContentPane().add(panelCenter, BorderLayout.CENTER);
        mainFrame.getContentPane().add(backgroundLabel, BorderLayout.WEST);
        mainFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        mainFrame.setResizable(false);
        mainFrame.setVisible(true);
        mainFrame.pack();
    }

    public JFrame getMainFrame() {
        return mainFrame;
    }

    public void addEnviarBoton(ActionListener listenForEnviarBoton) {
        enviarBoton.addActionListener(listenForEnviarBoton);
    }

    public void addCancelarBtn(ActionListener cancelarBotonListener) {
        this.cancelarBoton.addActionListener(cancelarBotonListener);
    }

    public void mostrarError(String mensajeError) {
        JOptionPane.showMessageDialog(mainFrame, mensajeError);
    }
}
