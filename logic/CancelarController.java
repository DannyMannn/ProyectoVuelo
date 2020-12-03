package logic;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.CancelarView;
import model.EnumVuelo;

/*
Ervey Guerrero Gómez
David Hernández López
Daniel Sánchez Vázquez
Alejandro Tonatiuh García Espinoza
*/


//Clase controladora de la accion cancelar boleto
public class CancelarController implements ActionListener {
    BoletoDao b1 = new BoletoDao();
    private CancelarView vista;

    public CancelarController(CancelarView vistaCancelar) {
        this.vista = vistaCancelar;
        eventos();
    }

    //Agrega el escuchador al boton
    public void eventos() {
        vista.getCancelarBoton().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object evt = e.getSource();
        if (evt.equals(vista.getCancelarBoton())) {
            try {
                b1.eliminar(vista.getNombrePas().getText(), EnumVuelo.valueOf(vista.getTipoPasajeroComboBox().getSelectedItem().toString()));
                JOptionPane.showMessageDialog(null, "Boleto Cancelado");
                vista.dispose();
            } catch (Exception a) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error!!!");
            }
        }
    }
}
