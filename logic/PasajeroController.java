package logic;

import gui.PasajeroView;
import model.Pasajero;
import model.EnumClase;
import model.Documentacion;

/*
Ervey Guerrero Gómez
David Hernández López
Daniel Sánchez Vázquez
Alejandro Tonatiuh García Espinoza
*/


public class PasajeroController {
    private PasajeroView vista;

    public Pasajero creaPasajero(EnumClase claseVuelo,
                                 Documentacion documentacion,
                                 int edad,
                                 String nombre,
                                 String sexo) {
        return new Pasajero(claseVuelo,
                documentacion,
                edad,
                nombre,
                sexo);
    }
}
