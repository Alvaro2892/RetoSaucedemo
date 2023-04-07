package co.com.certificacion.RetoSaucedemo.tasks;
import co.com.certificacion.RetoSaucedemo.userinterface.AbrirPaginaSaucedemo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class TaskAbrirPagina implements Task
{
    private AbrirPaginaSaucedemo abrirPaginaSaucedemo;

    public static TaskAbrirPagina swagLabs()
    {
        return Tasks.instrumented(TaskAbrirPagina.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo
                (
                        Open.browserOn(abrirPaginaSaucedemo)

                );
    }
}
