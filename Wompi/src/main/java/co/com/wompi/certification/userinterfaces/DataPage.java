package co.com.wompi.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DataPage {
    public static final Target INPUT_EMAIL = Target.the("email")
            .locatedBy("//*[@id='email']");
    public static final Target INPUT_NAMES = Target.the("Nombres y apellidos")
            .locatedBy("//*[@id='fullName']");
    public static final Target INPUT_CELL = Target.the("Celular")
            .locatedBy("//*[@id='number']");
    public static final Target ARROW_BANK = Target.the("fecha para desplegar bancos")
            .locatedBy("//*[@id='financialInstitutionCode']");
    public static final Target SELECT_QR_TRANSACCION = Target.the("Transaccion QR")
            .locatedBy("//*[@id='sandboxStatusQR']");
    public static final Target TYPE_DOCUMENT = Target.the("Tipo documento").located(By.id("userLegalIdType"));
    public static final Target DOCUMENT = Target.the("documento").located(By.id("userLegalId"));
    public static final Target BTN_CONITNUE_PAYMENT = Target.the("Boton continuar con el pago")
            .locatedBy("//*[@class='submit-button button-main padding_button']");
    public static final Target TXT_INFORMATION_PSE = Target.the("informacion de la transaccion")
            .locatedBy("//*[@class='asyncPaymentMethodWrapper__MmVgQ']//td[text()='Aprobada']");

    public static final Target TXT_INFORMATION_QR = Target.the("informacion de la transaccioN")
            .locatedBy("///*[@class='src-components-App-__App__title__Y13rn']");

    public static final Target BTN_CONITNUE_PAYMENT_DATA = Target.the("Boton continuar con el pago despues de la data")
            .locatedBy("//*[@class='submit-button padding_button button-main true false src-components-AcceptTerms-__Accep" +
                    "tTermsAndSubmit__buttonSubmit__nrW74 undefined']");

    public static final Target CHECKBOX = Target.the("Checkbox")
            .locatedBy("//*[@id='acceptance']");


}
