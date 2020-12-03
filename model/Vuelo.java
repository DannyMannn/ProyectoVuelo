package model;

import java.io.Serializable;

/*
Ervey Guerrero Gómez
David Hernández López
Daniel Sánchez Vázquez
Alejandro Tonatiuh García Espinoza
*/


public class Vuelo implements Serializable {
    private String aerolinea;
    private String destino;
    private int numAsiento;
    private int numero;
    private EnumVuelo tipo;

    public Vuelo(String aerolinea,
                 String destino,
                 int numAsiento,
                 int numero,
                 EnumVuelo tipo) {
        this.aerolinea = aerolinea;
        this.destino = destino;
        this.numAsiento = numAsiento;
        this.numero = numero;
        this.tipo = tipo;
    }

    public String getAerolinea() {
        return this.aerolinea;
    }

    public String getDestino() {
        return this.destino;
    }

    public int getNumAsiento() {
        return this.numAsiento;
    }

    public int getNumero() {
        return this.numero;
    }

    public EnumVuelo getTipo() {
        return this.tipo;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setNumAsiento(int numAsiento) {
        this.numAsiento = numAsiento;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTipo(EnumVuelo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return String.format("Aerolinea: %s\nDestino: %s\nN. asiento: %d\nN. vuelo: %d\nT. vuelo: %s\n",
                this.aerolinea,
                this.destino,
                this.numAsiento,
                this.numero,
                this.tipo);
    }
}
