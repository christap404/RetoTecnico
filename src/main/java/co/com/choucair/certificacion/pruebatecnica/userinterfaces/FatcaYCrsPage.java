package co.com.choucair.certificacion.pruebatecnica.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FatcaYCrsPage extends PageObject {
    public static final Target BUTTON_OPEN_PDF = Target.the("button to open the pdf").
            located(By.xpath("(//img[@alt='Descargar PDF'])[3]"));
}
