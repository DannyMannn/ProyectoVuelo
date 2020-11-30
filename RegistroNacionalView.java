import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class RegistroNacionalView {
    private JFrame mainFrame;
    DocumentacionNacionalView docNacionalView = new DocumentacionNacionalView();
    PasajeroView pasajeroView = new PasajeroView();
    VueloView vueloView = new VueloView();
    JButton enviarBoton = new JButton("Enviar");
    JButton cancelarBoton = new JButton("Cancelar Boleto");

    public DocumentacionNacionalView getDocNacionalView() {
        return docNacionalView;
    }

    public PasajeroView getPasajeroView() {
        return pasajeroView;
    }

    public VueloView getVueloView() {
        return vueloView;
    }

    public RegistroNacionalView(){
        mainFrame = new JFrame();
        mainFrame.setLayout(new BorderLayout());

        //hacer panel en clase reutilizable?
        JPanel panelBoton = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10);
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.anchor = GridBagConstraints.CENTER;
        panelBoton.add(enviarBoton,constraints);
        constraints.gridy = 1;
        panelBoton.add(cancelarBoton,constraints);
        panelBoton.setBackground(Color.decode("#2299f0"));

        JPanel panelEast = new JPanel(new GridLayout(2,1));
        panelEast.add(pasajeroView);
        panelEast.add(panelBoton);

        JPanel panelCenter = new JPanel(new GridLayout(2,1));
        panelCenter.add(vueloView);
        panelCenter.add(docNacionalView);

        JLabel backgroundLabel = new JLabel(new ImageIcon("Images/RegistrationN1_Parejo_Fondo.png"));

        mainFrame.getContentPane().add(panelEast, BorderLayout.EAST);
        mainFrame.getContentPane().add(panelCenter, BorderLayout.CENTER);
        mainFrame.getContentPane().add(backgroundLabel, BorderLayout.WEST);
        mainFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        mainFrame.setResizable(false);
        mainFrame.setVisible(true);
        mainFrame.pack();
    }

    public JFrame getMainFrame(){
        return mainFrame;
    }

    public void addEnviarBoton(ActionListener listenForEnviarBoton){
        enviarBoton.addActionListener(listenForEnviarBoton);
    }

    public void addCancelarBtn (ActionListener cancelarBotonListener) {
	    this.cancelarBoton.addActionListener (cancelarBotonListener);
    }

    public void mostrarError(String mensajeError){
        JOptionPane.showMessageDialog(mainFrame,mensajeError);
    }
}
