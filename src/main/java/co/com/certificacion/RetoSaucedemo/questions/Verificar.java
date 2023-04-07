package co.com.certificacion.RetoSaucedemo.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.certificacion.RetoSaucedemo.userinterface.UIVerificacion.VERIFICARMENSAJE;

public class Verificar implements Question<Boolean>
{
    private final String mensajeVerificar;

    public Verificar(String mensajeVerificar)
    {
        this.mensajeVerificar = mensajeVerificar;
    }

    public static Verificar mensajeSitioWeb(String questionv)
    {
        return new Verificar(questionv);
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        WebElementFacade webElementFacade = VERIFICARMENSAJE.resolveFor(actor);
        String textoVerificar = webElementFacade.getText();
        return mensajeVerificar.equals(textoVerificar);
    }
}
