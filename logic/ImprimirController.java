package logic;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


import gui.ImprimirView;
import model.Boleto;
import model.EnumVuelo;

/*
Ervey Guerrero Gómez
David Hernández López
Daniel Sánchez Vázquez
Alejandro Tonatiuh García Espinoza
*/


public class ImprimirController implements ActionListener {
    BoletoDao boleto = new BoletoDao();
    private ImprimirView vista;

    public ImprimirController(ImprimirView vistaImprimir) {
        this.vista = vistaImprimir;
        this.eventos();
    }

    public void eventos() {

        vista.getImprimirBoton().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object evt = e.getSource();
        if (evt.equals(vista.getImprimirBoton())) {
            try {
                Boleto b1 = boleto.cargar(vista.getNombrePas().getText(), EnumVuelo.valueOf(vista.getTipoPasajeroComboBox().getSelectedItem().toString()));
                JOptionPane.showMessageDialog((Component)null,b1.toString());
                vista.dispose();
            } catch (Exception a) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error!!!");
            }
        }
    }
}
