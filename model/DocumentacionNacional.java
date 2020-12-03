package model;

/*
Ervey Guerrero Gómez
David Hernández López
Daniel Sánchez Vázquez
Alejandro Tonatiuh García Espinoza
*/


public class DocumentacionNacional implements Documentacion {
    private String curp;

    public DocumentacionNacional(String curp) {
        this.curp = curp;
    }

    public String getCurp() {
        return this.curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    @Override
    public String toString() {
        return String.format("CURP: %s\n", this.curp);
    }
}
