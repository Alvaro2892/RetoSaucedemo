package co.com.certificacion.RetoSaucedemo.tasks;

import co.com.certificacion.RetoSaucedemo.model.ConstructorVar;
import co.com.certificacion.RetoSaucedemo.userinterface.UIAgregarComprarArticulo;
import co.com.certificacion.RetoSaucedemo.userinterface.UIIniciarSesion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class TaskIniciarSesion implements Task

{
    private List<ConstructorVar> constructorVars;


    public TaskIniciarSesion(List<ConstructorVar> constructorVars)
    {
        this.constructorVars = constructorVars;
    }


    public static TaskIniciarSesion webSwagLabs(List<ConstructorVar> constructorVars) {
        return Tasks.instrumented(TaskIniciarSesion.class, constructorVars);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {

        for (ConstructorVar constructorVar : constructorVars)
        {
                    actor.attemptsTo
                    (
                            Click.on(UIIniciarSesion.ENTERUSERNAME),
                            Enter.theValue(constructorVar.getUsername()).into(UIIniciarSesion.ENTERUSERNAME),
                            Click.on(UIIniciarSesion.ENTERPASSWORD),
                            Enter.theValue(constructorVar.getPassword()).into(UIIniciarSesion.ENTERPASSWORD),
                            Click.on(UIIniciarSesion.BOTONLOGIN)


                    );
        }


    }
}
