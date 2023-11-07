package co.com.wompi.certification.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/pago_qr.feature",
        glue = "co.com.wompi.certification.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class RunnerQR {
}
