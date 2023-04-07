package co.com.certificacion.RetoSaucedemo.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UIIniciarSesion
{
    public static final Target ENTERUSERNAME = Target.the("Clic en el input y luego ingreso el username ").located(By.id("user-name"));
    public static final Target ENTERPASSWORD = Target.the("Clic en el input y luego ingreso la password ").located(By.id("password"));
    public static final Target BOTONLOGIN = Target.the("Clic en el boton login ").located(By.id("login-button"));


}
