package co.com.choucair.certificacion.pruebatecnica.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AprenderFacilPage extends PageObject {
    public static final Target OPTION_DESCUBRE_MAS = Target.the("option to page descubre mas").
            located(By.xpath("(//a[@class='center-block btn btn-primary'])[6]"));
}
