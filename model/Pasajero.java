package model;

import java.io.Serializable;

/*
Ervey Guerrero Gómez
David Hernández López
Daniel Sánchez Vázquez
Alejandro Tonatiuh García Espinoza
*/


public class Pasajero implements Serializable {
    private EnumClase clase;
    private Documentacion documentacion;
    private int edad;
    private Maleta[] equipaje;
    private String nombre;
    private int numMaletas;
    private String sexo;

    public Pasajero(EnumClase clase,
                    Documentacion documentacion,
                    int edad,
                    String nombre,
                    String sexo) {
        this.clase = clase;
        this.documentacion = documentacion;
        this.edad = edad;
        this.nombre = nombre;
        this.numMaletas = 0;
        this.sexo = sexo;

        switch (this.clase) {
            case TURISTA:
                this.equipaje = new Maleta[1];
                break;
            case EJECUTIVO:
                this.equipaje = new Maleta[2];
                break;
            case PRIMERA_CLASE:
                this.equipaje = new Maleta[3];
                break;
        }
    }

    public void documentarMaleta(Maleta maleta) throws Exception {
        try {
            this.equipaje[this.numMaletas] = maleta;
            this.numMaletas++;
        } catch (IndexOutOfBoundsException e) {
            throw new Exception("Número de maletas excedido.");
        }
    }

    public EnumClase getClase() {
        return this.clase;
    }

    public Documentacion getDocumentacion() {
        return this.documentacion;
    }

    public int getEdad() {
        return this.edad;
    }

    public Maleta[] getEquipaje() {
        return this.equipaje;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setClase(EnumClase clase) {
        this.clase = clase;
    }

    public void setDocumentacion(Documentacion documentacion) {
        this.documentacion = documentacion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s\nEdad: %d\nSexo: %s\nClase: %s\n%s",
                this.nombre,
                this.edad,
                this.sexo,
                this.clase,
                this.documentacion);
    }
}
