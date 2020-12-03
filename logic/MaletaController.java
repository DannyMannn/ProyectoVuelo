package logic;

import gui.MaletaView;
import model.Maleta;

/*
Ervey Guerrero Gómez
David Hernández López
Daniel Sánchez Vázquez
Alejandro Tonatiuh García Espinoza
*/


public class MaletaController {
    private MaletaView vista;

    public Maleta creaMaleta(double peso) {
        return new Maleta(peso);
    }

    public Maleta creaMaleta() {
        return new Maleta(this.vista.getPesoMaletaEntrada());
    }

    public void mostrarVista() throws Exception {
        this.vista = new MaletaView();
    }
}
