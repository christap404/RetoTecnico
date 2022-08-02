package co.com.choucair.certificacion.pruebatecnica.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.certificacion.pruebatecnica.userinterfaces.AprenderFacilPage.*;
import static co.com.choucair.certificacion.pruebatecnica.userinterfaces.HomePage.*;

public class NavegateToPage implements Task {
    public static NavegateToPage documentosLegales() {
        return Tasks.instrumented(NavegateToPage.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LINK_TO_APRENDER_ES_FACIL),
                Click.on(OPTION_DESCUBRE_MAS));
    }
}
