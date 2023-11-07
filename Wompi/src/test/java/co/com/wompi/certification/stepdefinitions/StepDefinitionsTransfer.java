package co.com.wompi.certification.stepdefinitions;

import co.com.wompi.certification.questions.ValidateQR;
import co.com.wompi.certification.questions.ValidateTransfer;
import co.com.wompi.certification.tasks.EnterQR;
import co.com.wompi.certification.tasks.EnterTransfer;
import co.com.wompi.certification.utils.Const;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

public class StepDefinitionsTransfer {
    @Given("^The user enters the Wompi payments page transfer$")
    public void theUserEntersTheWompiPaymentsPageTransfer() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(Const.URL_WOMPI));

    }

    @When("^The user enter all data neccesary transfer$")
    public void theUserEnterAllDataNeccesaryTransfer(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(EnterTransfer.with(dataTable));

    }

    @Then("^The transaction is transfer validated$")
    public void theTransactionIsTransferValidated(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateTransfer.with(dataTable)));

    }
}
