package co.com.wompi.certification.tasks;

import cucumber.api.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.wompi.certification.userinterfaces.AmountPage.BTN_CONTINUE;
import static co.com.wompi.certification.userinterfaces.AmountPage.INPUT_AMOUNT_WOMPI;
import static co.com.wompi.certification.userinterfaces.DataPage.*;
import static co.com.wompi.certification.userinterfaces.ForPayment.BTN_PSE;
import static co.com.wompi.certification.userinterfaces.ForPayment.BTN_QR;

public class EnterQR implements Task {
    private String amount;
    private String email;
    private String fullName;
    private String  cel;
    private String typeBank;

    public EnterQR(DataTable dataTable) {
        List<String> data = dataTable.raw().get(0);
        this.amount = data.get(0);
        this.email = data.get(1);
        this.fullName = data.get(2);
        this.cel = data.get(3);
        this.typeBank = data.get(4);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(INPUT_AMOUNT_WOMPI, WebElementStateMatchers.isVisible()).forNoMoreThan(50).seconds(),
                Enter.theValue(amount).into(INPUT_AMOUNT_WOMPI),
                Click.on(BTN_CONTINUE),
                Click.on(BTN_QR),
                Enter.theValue(email).into(INPUT_EMAIL),
                Enter.theValue(fullName).into(INPUT_NAMES),
                Enter.theValue(cel).into(INPUT_CELL),
                SelectFromOptions.byValue(typeBank).from(SELECT_QR_TRANSACCION),
                Click.on(CHECKBOX),
                WaitUntil.the(BTN_CONITNUE_PAYMENT_DATA,WebElementStateMatchers.isClickable()).forNoMoreThan(150).seconds(),
                Click.on(BTN_CONITNUE_PAYMENT_DATA),
                WaitUntil.the(TXT_INFORMATION_QR,WebElementStateMatchers.isVisible()).forNoMoreThan(500).seconds()
        );
        actor.remember("informationQR",TXT_INFORMATION_QR.resolveFor(actor).getText());

    }
    public static EnterQR with(DataTable dataTable){
        return Tasks.instrumented(EnterQR.class, dataTable);
    }
}
