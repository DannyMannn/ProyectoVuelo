package logic;

import gui.DocumentacionInternacionalView;
import gui.DocumentacionNacionalView;
import gui.RegistroNacionalView;
import gui.RegistroInternacionalView;
import model.Documentacion;
import model.DocumentacionInternacional;
import model.DocumentacionNacional;

/*
Ervey Guerrero Gómez
David Hernández López
Daniel Sánchez Vázquez
Alejandro Tonatiuh García Espinoza
*/


public class DocumentacionController {
    private DocumentacionNacionalView nacionalVista;
    private DocumentacionInternacionalView internacionalVista;

    public Documentacion creaDocumentacion(RegistroNacionalView registroNacionalView) {
        return new DocumentacionNacional(
                registroNacionalView.getDocNacionalView().getCurpEntrada());
    }

    public Documentacion creaDocumentacion(RegistroInternacionalView registroInternacionalView) {
        return new DocumentacionInternacional(
                registroInternacionalView.getDocInternacionalView().getNumPasaporteEntrada(),
                registroInternacionalView.getDocInternacionalView().getVisaEntrada(),
                registroInternacionalView.getDocInternacionalView().getVigenciaEntrada());
    }
}
