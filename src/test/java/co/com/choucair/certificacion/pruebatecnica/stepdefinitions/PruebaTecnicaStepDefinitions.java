package co.com.choucair.certificacion.pruebatecnica.stepdefinitions;

import co.com.choucair.certificacion.pruebatecnica.questions.CheckThe;
import co.com.choucair.certificacion.pruebatecnica.tasks.AccessTo;
import co.com.choucair.certificacion.pruebatecnica.tasks.NavegateToPage;
import co.com.choucair.certificacion.pruebatecnica.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class PruebaTecnicaStepDefinitions {
    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }
    @Given("^the user is on the page Documentos Legales$")
    public void theUserIsOnThePageDocumentosLegales(){
        theActorCalled("user").wasAbleTo(OpenUp.thePage(), NavegateToPage.documentosLegales());
    }

    @When("^the user accesses the option FATCA & CRS$")
    public void theUserAccessesTheOptionFATCACRS(){
        theActorInTheSpotlight().attemptsTo(AccessTo.fatcaYCrs());
    }

    @Then("^the user check the document (.*)$")
    public void theUserCheckTheDocumentAutocertificacionUnificado(String document){
        theActorInTheSpotlight().should(seeThat(CheckThe.document(document)));
    }


}
