package logic;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


import gui.ImprimirView;
import model.EnumVuelo;

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
                boleto.eliminar(vista.getNombrePas().getText(), EnumVuelo.valueOf(vista.getTipoPasajeroComboBox().getSelectedItem().toString()));
                JOptionPane.showMessageDialog((Component)null, ImprimirController.this.boleto.toString());
                vista.dispose();
            } catch (Exception a) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error!!!");
            }
        }
    }
}
