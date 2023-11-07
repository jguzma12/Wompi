package co.com.wompi.certification.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/pago_pse.feature",
        glue = "co.com.wompi.certification.stepdefinitions.StepDefinitionsPSE",
        snippets = SnippetType.CAMELCASE
)
public class RunnerWompi {
}
