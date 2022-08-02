package co.com.choucair.certificacion.pruebatecnica.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.certificacion.pruebatecnica.userinterfaces.DocumentosLegalesPage.*;
import static co.com.choucair.certificacion.pruebatecnica.userinterfaces.FatcaYCrsPage.*;

public class AccessTo implements Task {
    public static AccessTo fatcaYCrs() {
        return Tasks.instrumented(AccessTo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(OPTION_FATCA_CRS),
                Click.on(BUTTON_OPEN_PDF));
    }
}
