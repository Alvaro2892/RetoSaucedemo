package co.com.certificacion.RetoSaucedemo.runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/RetoSaucedemo.feature",
        glue = {"co.com.certificacion.RetoSaucedemo.stepdefinitions"},
        plugin = {"pretty"},
        snippets = CucumberOptions.SnippetType.CAMELCASE)


public class RunnerSaucedemo
{
}
