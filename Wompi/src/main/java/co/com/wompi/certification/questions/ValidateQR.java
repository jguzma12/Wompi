package co.com.wompi.certification.questions;

import cucumber.api.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

import static co.com.wompi.certification.utils.Const.*;
import static co.com.wompi.certification.utils.Const.BANCO_ERROR;

public class ValidateQR implements Question<Boolean> {
    private String typeBank;

    public ValidateQR(DataTable dataTable) {
        List<String> data = dataTable.raw().get(0);
        this.typeBank = data.get(0);
    }
    @Override
    public Boolean answeredBy(Actor actor) {

        String information = actor.recall("informacionQR");

        if (information.contains(APROBADA) && typeBank.contains(BANCO_APRUEBA)) {
            return true;
        } else if (information.contains(DECLINADA) && typeBank.contains(BANCO_DECLINA)) {
            return true;
        } else if (information.contains(ERROR) && typeBank.contains(BANCO_ERROR)) {
            return true;
        } else {
            return false;
        }

    }
    public static ValidatePSE validateQR(DataTable dataTable) {
        return new ValidatePSE(dataTable);
    }
}
