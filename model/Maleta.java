package model;

import java.io.Serializable;

/*
Ervey Guerrero Gómez
David Hernández López
Daniel Sánchez Vázquez
Alejandro Tonatiuh García Espinoza
*/


public class Maleta implements Serializable {
    private double peso;

    public Maleta(double peso) {
        this.peso = peso;
    }

    private double calcularExceso() {
        if (this.peso > 23)
            return this.peso - 23;
        return 0;
    }

    public double obtenerTotal() {
        double exceso = this.calcularExceso();
        if (exceso <= 10) return exceso * 300;
        return exceso * 500;
    }

    @Override
    public String toString() {
        return "Maleta{" +
                "peso=" + peso +
                '}';
    }
}
