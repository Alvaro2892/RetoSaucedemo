package co.com.certificacion.RetoSaucedemo.stepdefinitions;

import co.com.certificacion.RetoSaucedemo.model.ConstructorVar;
import co.com.certificacion.RetoSaucedemo.questions.Verificar;
import co.com.certificacion.RetoSaucedemo.tasks.TaskAbrirPagina;
import co.com.certificacion.RetoSaucedemo.tasks.TaskComprarArticulos;
import co.com.certificacion.RetoSaucedemo.tasks.TaskIniciarSesion;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepSaucedemo
{
    @Given("que el usuario se encuentra en la pagina principal de Saucedemo")
    public void queElUsuarioSeEncuentraEnLaPaginaPrincipalDeSaucedemo()
    {
        theActorCalled("Alvaro").wasAbleTo(TaskAbrirPagina.swagLabs());
    }
    @When("el usuario inicia sesion y agrega dos productos al carrito hace clic en el icono del carrito completa el formulario de compra con los detalles requeridos y hace clic en el boton FINALIZAR")
    public void elUsuarioIniciaSesionYAgregaDosProductosAlCarritoHaceClicEnElIconoDelCarritoCompletaElFormularioDeCompraConLosDetallesRequeridosYHaceClicEnElBotonFINALIZAR(List<ConstructorVar> constructorVars)
    {
        theActorInTheSpotlight().attemptsTo(TaskComprarArticulos.articulosSwagLabs(constructorVars));
    }
    @Then("el usuario deberia ver el mensaje de confirmacion {string}")
    public void elUsuarioDeberiaVerElMensajeDeConfirmacion(String VerificarMensajePagina)
    {
        theActorInTheSpotlight().should(seeThat(Verificar.mensajeSitioWeb(VerificarMensajePagina)));
    }

}
