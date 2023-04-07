package co.com.certificacion.RetoSaucedemo.tasks;

import co.com.certificacion.RetoSaucedemo.model.ConstructorVar;
import co.com.certificacion.RetoSaucedemo.userinterface.UIAgregarComprarArticulo;
import co.com.certificacion.RetoSaucedemo.userinterface.UIIniciarSesion;
import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class TaskComprarArticulos implements Task
{
    Faker faker = new Faker();
    String firstname = faker.name().firstName();
    String lastname = faker.name().lastName();
    String zipCode = faker.address().zipCode();


    private List<ConstructorVar> constructorVars;


    public TaskComprarArticulos(List<ConstructorVar> constructorVars)
    {
        this.constructorVars = constructorVars;
    }


    public static TaskComprarArticulos articulosSwagLabs(List<ConstructorVar> constructorVars) {
        return Tasks.instrumented(TaskComprarArticulos.class, constructorVars);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        for (ConstructorVar constructorVar : constructorVars)
        {

            actor.attemptsTo
                    (
                            TaskIniciarSesion.webSwagLabs(constructorVars),
                            WaitUntil.the(UIAgregarComprarArticulo.ADDTOCARTBACKPACK, isVisible()),
                            Click.on(UIAgregarComprarArticulo.ADDTOCARTBACKPACK),
                            Click.on(UIAgregarComprarArticulo.ADDTOCARTLIGHTBIKE),
                            Click.on(UIAgregarComprarArticulo.CLICKCART),
                            WaitUntil.the(UIAgregarComprarArticulo.CLICKBOTONCHECKOUT, isVisible()),
                            Click.on(UIAgregarComprarArticulo.CLICKBOTONCHECKOUT),
                            WaitUntil.the(UIAgregarComprarArticulo.INGRESARNOMBRE, isVisible()),
                            Click.on(UIAgregarComprarArticulo.INGRESARNOMBRE),
                            Enter.theValue(firstname).into(UIAgregarComprarArticulo.INGRESARNOMBRE),
                            Enter.theValue(lastname).into(UIAgregarComprarArticulo.INGRESARAPELLIDO),
                            Enter.theValue(zipCode).into(UIAgregarComprarArticulo.INGRESARCODIGOPOSTAL),
                            Click.on(UIAgregarComprarArticulo.CLICKBOTONCONTINUAR),
                            Click.on(UIAgregarComprarArticulo.CLICKBOTONFINISH)




                    );
        }
    }
}
