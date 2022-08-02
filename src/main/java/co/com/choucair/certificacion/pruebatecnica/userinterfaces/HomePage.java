package co.com.choucair.certificacion.pruebatecnica.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    public static final Target LINK_TO_APRENDER_ES_FACIL = Target.the("link to page aprender es facil").
            located(By.xpath("//a[contains(text(),'Aprender')]"));
}
