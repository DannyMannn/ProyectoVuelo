package logic;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.RegistroInternacionalView;
import gui.RegistroEquipajeView;
import model.Vuelo;
import model.Pasajero;
import model.Maleta;
import model.Boleto;
import model.Documentacion;
import model.EnumVuelo;

/*
Ervey Guerrero Gómez
David Hernández López
Daniel Sánchez Vázquez
Alejandro Tonatiuh García Espinoza
*/


public class RegistroInternacionalController {
    private RegistroInternacionalView registroInternacionalView;
    private VueloController vueloController = new VueloController();
    private DocumentacionController documentacionController = new DocumentacionController();
    private PasajeroController pasajeroController = new PasajeroController();
    private MaletaController maletaController = new MaletaController();
    private RegistroEquipajeView registroEquipajeView;
    private RegistroEquipajeController registroEquipajeController;

    Vuelo vuelo;
    Documentacion documentacion;
    Pasajero pasajero;
    Maleta maleta;
    Boleto boleto;

    public RegistroInternacionalController(RegistroInternacionalView registroInternacionalView) {
        this.registroInternacionalView = registroInternacionalView;
        this.registroInternacionalView.addEnviarBoton(new EnviarListener());
        this.registroInternacionalView.addCancelarBtn(new CancelarBtnListener());
    }

    class EnviarListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {

            try {
                vuelo = vueloController.creaVuelo(registroInternacionalView.getVueloView().getAerolineaVueloEntrada(),
                        registroInternacionalView.getVueloView().getDestinoVueloEntrada(),
                        registroInternacionalView.getVueloView().getNumAsientoVueloEntrada(),
                        registroInternacionalView.getVueloView().getNumeroVueloEntrada(),
                        EnumVuelo.INTERNACIONAL); //registroInternacionalView.getVueloView().getTipoVueloEntrada());

                documentacion = documentacionController.creaDocumentacion(registroInternacionalView);

                pasajero = pasajeroController.creaPasajero(registroInternacionalView.getPasajeroView().getClaseEntrada(),
                        documentacion,
                        registroInternacionalView.getPasajeroView().getEdadEntrada(),
                        registroInternacionalView.getPasajeroView().getNombreEntrada(),
                        registroInternacionalView.getPasajeroView().getSexoEntrada());

                boleto = new Boleto(pasajero, vuelo);

                registroEquipajeView = new RegistroEquipajeView(pasajero.getEquipaje().length);
                registroEquipajeController = new RegistroEquipajeController(pasajero.getEquipaje(),
                        pasajero,
                        registroEquipajeView,
                        boleto);
                registroInternacionalView.getMainFrame().dispose();
                JOptionPane.showMessageDialog(null, boleto.toString());

            } catch (NumberFormatException e1) {
                System.out.println(e1);
                registroInternacionalView.mostrarError("Por favor ingrese datos antes" +
                        " de enviar.");
            } catch (Exception e) {
                System.out.println(e);
                registroInternacionalView.mostrarError("Algún error ocurrió...");
            }
        }
    }

    class CancelarBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            RegistroInternacionalController.this.registroInternacionalView
                    .getMainFrame().dispose();
        }
    }
}

