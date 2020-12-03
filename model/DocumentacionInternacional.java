package model;

/*
Ervey Guerrero Gómez
David Hernández López
Daniel Sánchez Vázquez
Alejandro Tonatiuh García Espinoza
*/


public class DocumentacionInternacional implements Documentacion {
    private int numPasaporte;
    private EnumVisa visa;
    private int vigencia;

    public DocumentacionInternacional(int numPasaporte,
                                      EnumVisa visa,
                                      int vigencia) {
        this.numPasaporte = numPasaporte;
        this.visa = visa;
        this.vigencia = vigencia;
    }

    public int getNumPasaporte() {
        return this.numPasaporte;
    }

    public EnumVisa getVisa() {
        return this.visa;
    }

    public int getVigencia() {
        return this.vigencia;
    }

    public void setNumPasaporte(int numPasaporte) {
        this.numPasaporte = numPasaporte;
    }

    public void setVisa(EnumVisa visa) {
        this.visa = visa;
    }

    public void setVigencia(int vigencia) {
        this.vigencia = vigencia;
    }

    @Override
    public String toString() {
        return String.format("N. Pasaporte: %d\nVisa: %s\nVigencia: %d\n",
                this.numPasaporte,
                this.visa,
                this.vigencia);
    }
}
