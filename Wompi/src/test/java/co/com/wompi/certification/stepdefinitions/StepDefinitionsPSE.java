package co.com.wompi.certification.stepdefinitions;

import co.com.wompi.certification.questions.ValidatePSE;
import co.com.wompi.certification.tasks.EnterPSE;
import co.com.wompi.certification.utils.Const;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class StepDefinitionsPSE {

    @Managed
    WebDriver driver;
    @Before
    public void setup() {
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(driver)));
        OnStage.theActorCalled("Actor");

    }

    @Given("^The user enters the Wompi payments page$")
    public void theUserEntersTheWompiPaymentsPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(Const.URL_WOMPI));

    }

    @When("^The user enter all data neccesary$")
    public void theUserEnterAllDataNeccesary(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(EnterPSE.with(dataTable));


    }

    @Then("^The transaction is validated$")
    public void theTransactionIsValidated(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidatePSE.validatePSE(dataTable)));


    }


}
