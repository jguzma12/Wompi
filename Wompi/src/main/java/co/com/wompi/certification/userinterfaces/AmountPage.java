package co.com.wompi.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AmountPage {
    public static  final Target INPUT_AMOUNT_WOMPI = Target.the("ingresar el monto de Wompi").
            locatedBy("//*[@class='amount-input']");

    public static  final Target BTN_CONTINUE = Target.the("Boton para continuar").
            locatedBy("//*[@class='submit-button padding_button button-main']");


}
