package co.com.wompi.certification.questions;

import cucumber.api.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

import static co.com.wompi.certification.utils.Const.*;

public class ValidatePSE implements Question<Boolean> {
    private String typeBank;

    public ValidatePSE(DataTable dataTable) {
        List<String> data = dataTable.raw().get(0);
        this.typeBank = data.get(0);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String information = actor.recall("informacion");

        if (information.equals(APROBADA_QR) && typeBank.equals(BANCO_APRUEBA)) {
            return true;
        } else if (information.equals(DECLINADA_QR) && typeBank.equals(BANCO_DECLINA)) {
            return true;
        } else if (information.equals(ERROR_QR) && typeBank.equals(BANCO_ERROR)) {
            return true;
        } else {
            return false;
        }


    }

    public static ValidatePSE validatePSE(DataTable dataTable) {
        return new ValidatePSE(dataTable);
    }

}
