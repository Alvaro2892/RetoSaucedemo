package co.com.certificacion.RetoSaucedemo.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UIVerificacion
{
    public static final Target VERIFICARMENSAJE = Target.the("Extraer el mensaje a verificar").located(By.className("complete-header"));

}
