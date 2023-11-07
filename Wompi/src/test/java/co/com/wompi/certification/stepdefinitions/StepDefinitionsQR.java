package co.com.wompi.certification.stepdefinitions;

import co.com.wompi.certification.questions.ValidatePSE;
import co.com.wompi.certification.questions.ValidateQR;
import co.com.wompi.certification.tasks.EnterPSE;
import co.com.wompi.certification.tasks.EnterQR;
import co.com.wompi.certification.utils.Const;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

public class StepDefinitionsQR {
    @Given("^The user enters the Wompi payments page QR$")
    public void theUserEntersTheWompiPaymentsPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(Const.URL_WOMPI));

    }

    @When("^The user enter all data neccesary QR$")
    public void theUserEnterAllDataNeccesary(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(EnterQR.with(dataTable));

    }

    @Then("^The transaction is QR validated$")
    public void theTransactionIsValidated(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateQR.validateQR(dataTable)));

    }
}
