package logic;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.RegistroNacionalView;
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


public class RegistroNacionalController {
    private RegistroNacionalView registroNacionalView;
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

    public RegistroNacionalController(RegistroNacionalView registroNacionalView) {
        this.registroNacionalView = registroNacionalView;
        this.registroNacionalView.addEnviarBoton(new EnviarListener());
        this.registroNacionalView.addCancelarBtn(new CancelarBtnListener());
    }

    class EnviarListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {

            try {
                vuelo = vueloController.creaVuelo(registroNacionalView.getVueloView().getAerolineaVueloEntrada(),
                        registroNacionalView.getVueloView().getDestinoVueloEntrada(),
                        registroNacionalView.getVueloView().getNumAsientoVueloEntrada(),
                        registroNacionalView.getVueloView().getNumeroVueloEntrada(),
                        EnumVuelo.NACIONAL); //registroNacionalView.getVueloView().getTipoVueloEntrada());

                documentacion = documentacionController.creaDocumentacion(registroNacionalView);

                pasajero = pasajeroController.creaPasajero(registroNacionalView.getPasajeroView().getClaseEntrada(),
                        documentacion,
                        registroNacionalView.getPasajeroView().getEdadEntrada(),
                        registroNacionalView.getPasajeroView().getNombreEntrada(),
                        registroNacionalView.getPasajeroView().getSexoEntrada());

                boleto = new Boleto(pasajero, vuelo);

                registroEquipajeView = new RegistroEquipajeView(pasajero.getEquipaje().length);
                registroEquipajeController = new RegistroEquipajeController(pasajero.getEquipaje(),
                        pasajero,
                        registroEquipajeView,
                        boleto);
                registroNacionalView.getMainFrame().dispose();

                JOptionPane.showMessageDialog(null, boleto.toString());
                //crear una excepcion para boton Cancelar boleto
            } catch (NumberFormatException e1) {
                System.out.println(e1);
                registroNacionalView.mostrarError("Por favor ingrese datos antes" +
                        " de enviar.");
            } catch (Exception e) {
                System.out.println(e);
                registroNacionalView.mostrarError("Algún error ocurrió...");
            }
        }
    }

    class CancelarBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            RegistroNacionalController.this.registroNacionalView
                    .getMainFrame().dispose();
        }
    }
}
