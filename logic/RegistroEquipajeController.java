package logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import gui.RegistroEquipajeView;
import gui.MaletaView;
import model.Maleta;
import model.Boleto;
import model.Pasajero;

/*
Ervey Guerrero Gómez
David Hernández López
Daniel Sánchez Vázquez
Alejandro Tonatiuh García Espinoza
*/


public class RegistroEquipajeController {
    private RegistroEquipajeView registroEquipajeView;
    private MaletaController maletaController;
    private Maleta[] maleta;
    private Pasajero pasajero;
    private Boleto boleto;

    public RegistroEquipajeController(Maleta[] maleta, Pasajero pasajero,
                                      RegistroEquipajeView registroEquipajeView, Boleto boleto) {
        this.maleta = maleta;
        this.pasajero = pasajero;
        maletaController = new MaletaController();
        this.registroEquipajeView = registroEquipajeView;
        this.boleto = boleto;
        this.registroEquipajeView.addEnviarBoton(new EnviarListenerEquipaje());
    }

    class EnviarListenerEquipaje implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            try {
                for (MaletaView maletaView :
                        RegistroEquipajeController.this
                                .registroEquipajeView.getMaletaViews()) {
                    if (maletaView != null) {
                        Maleta maleta = RegistroEquipajeController.this.
                                maletaController.creaMaleta(
                                maletaView.getPesoMaletaEntrada());
                        RegistroEquipajeController.this
                                .pasajero.documentarMaleta(maleta);
                    }

                    try {
                        BoletoDao boletoDao = new BoletoDao();
                        boletoDao.guardar(boleto);
                    } catch (IOException e) {
                        registroEquipajeView.mostrarError("¡Error! ¡No se ha podido guardar su boleto!");
                    }

                    registroEquipajeView.getMainFrame().dispose();
                }
            } catch (Exception e) {
                System.out.println(e);
                registroEquipajeView.mostrarError(e.getMessage());
            }

        }
    }
}

