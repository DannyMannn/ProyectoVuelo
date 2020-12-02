import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;

public class CancelarView extends JFrame{
    JPanel contenedor;
    JButton buscarBoton;
    JTextField textoArchivo = new JTextField(20);
    JComboBox<String> tipoPasajeroComboBox = new JComboBox<String>(new String[]{"NACIONAL","INTERNACIONAL"});
    final JLabel nombrePasajero = new JLabel("Nombre Pasajero: ",JLabel.CENTER);
    final JLabel tipoPasajero = new JLabel("Tipo Vuelo: ");
    public CancelarView(){
        setVisible(true);
        setSize(400,200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Cancelar Boleto");
        contenedor = new JPanel();
        contenedor.setVisible(true);
        contenedor.setSize(400,200);
        contenedor.setLayout(new GridBagLayout());
        contenedor.setBackground(new Color(51,51,255));
        agregarComponente(contenedor,nombrePasajero,0,1);
        agregarComponente(contenedor,textoArchivo,1,1);
        agregarComponente(contenedor,tipoPasajero,0,2);
        agregarComponente(contenedor,tipoPasajeroComboBox,1,2);
        buscarBoton = new JButton("Cancelar boleto");
        buscarBoton.setSize(25,20);
        agregarComponente(contenedor,buscarBoton,1,3);
        add(contenedor);
    }

    private void agregarComponente(JComponent padre,JComponent hijo,int x,int y){
        GridBagConstraints contrains = new GridBagConstraints();
        contrains.insets = new Insets(10,10,10,10);

        contrains.gridx = x;
        contrains.gridy = y;
        padre.add(hijo,contrains);
    }
    public static void main(String[] args) {
        CancelarView p1 = new CancelarView();
    }
}
