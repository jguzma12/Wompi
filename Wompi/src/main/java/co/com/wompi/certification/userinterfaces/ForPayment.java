package co.com.wompi.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ForPayment {
    public static final Target BTN_PSE = Target.the("boton pse").
            locatedBy("(//*[@class='src-components-PaymentMethod-__PaymentMethod__method__S2sQK'])[5]");
}
