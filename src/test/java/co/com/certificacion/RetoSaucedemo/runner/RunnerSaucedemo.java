package co.com.certificacion.RetoSaucedemo.runner;


import co.com.certificacion.RetoSaucedemo.util.Generica.BeforeSuite;
import co.com.certificacion.RetoSaucedemo.util.Generica.DataToFeature;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;

//@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/RetoSaucedemo.feature",
        glue = {"co.com.certificacion.RetoSaucedemo.stepdefinitions"},
        plugin = {"pretty"},
        snippets = CucumberOptions.SnippetType.CAMELCASE)


@RunWith(RunnerPersonalizado.class)

public class RunnerSaucedemo
{
    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("src/test/resources/features/RetoSaucedemo.feature");
    }
}
