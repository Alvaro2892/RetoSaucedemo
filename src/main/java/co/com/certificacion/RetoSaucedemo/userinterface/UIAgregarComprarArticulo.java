package co.com.certificacion.RetoSaucedemo.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UIAgregarComprarArticulo
{
    public static final Target ADDTOCARTBACKPACK = Target.the("Clic en el articulo backpack ").located(By.id("add-to-cart-sauce-labs-backpack"));
    public static final Target ADDTOCARTLIGHTBIKE = Target.the("Clic en el articulo light bike ").located(By.id("add-to-cart-sauce-labs-bike-light"));
    public static final Target CLICKCART = Target.the("Clic en el carrito de compra ").located(By.id("shopping_cart_container"));
    public static final Target CLICKBOTONCHECKOUT = Target.the("Clic en el boton checkout ").located(By.id("checkout"));
    public static final Target INGRESARNOMBRE = Target.the("Clic y luego ingresar el nombre ").located(By.id("first-name"));
    public static final Target INGRESARAPELLIDO = Target.the("Clic y luego ingresar el apellido ").located(By.id("last-name"));
    public static final Target INGRESARCODIGOPOSTAL = Target.the("Clic y luego ingresar el codigo postal ").located(By.id("postal-code"));
    public static final Target CLICKBOTONCONTINUAR = Target.the("Clic en el boton continuar ").located(By.id("continue"));
    public static final Target CLICKBOTONFINISH = Target.the("Clic en el boton finish ").located(By.id("finish"));








}
