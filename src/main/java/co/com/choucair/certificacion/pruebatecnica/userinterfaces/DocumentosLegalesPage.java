package co.com.choucair.certificacion.pruebatecnica.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DocumentosLegalesPage extends PageObject {
    public static final Target OPTION_FATCA_CRS = Target.the("option to FATCA & CRS").
            located(By.xpath("(//a[@title='ENSA'])"));
}
