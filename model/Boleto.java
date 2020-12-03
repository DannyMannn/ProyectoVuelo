package model;

import java.io.Serializable;

public class Boleto implements Serializable {
    public static int uid = 0;
    private int id;
    private Pasajero pasajero;
    private Vuelo vuelo;

    public Boleto (Pasajero pasajero, Vuelo vuelo) {
	this.id = ++Boleto.uid;
        this.pasajero = pasajero;
        this.vuelo = vuelo;
    }

    public int getId () {
	    return this.id;
    }

    public Pasajero getPasajero () {
        return this.pasajero;
    }

    public Vuelo getVuelo () {
        return this.vuelo;
    }

    public void setId (int id) {
	    this.id = id;
    }

    public void setPasajero (Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public void setVuelo (Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    @Override
    public String toString () {
        String linea = "-------------------------------------------------------------------------------------------------------------------------------------------------\n";
        String encabezado = "\t\t\t\t\t\t\t\t\tBoleto\n";
        return String.format (this.id + linea + encabezado + linea + this.vuelo + this.pasajero);
    }
}
