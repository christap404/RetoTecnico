package co.com.choucair.certificacion.pruebatecnica.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\features\\prueba_tecnica.feature",
        tags = "",
        glue = "co.com.choucair.certificacion.pruebatecnica.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class RunnerTags {
}
