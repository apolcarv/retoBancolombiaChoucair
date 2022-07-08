package co.com.choucair.certificacion.academy.stepDefinition;

import co.com.choucair.certificacion.academy.helpers.Constant;
import co.com.choucair.certificacion.academy.questions.home.ValidHome;
import co.com.choucair.certificacion.academy.questions.search.ValidateSearchOfCoursea;
import co.com.choucair.certificacion.academy.tasks.login.Login;
import co.com.choucair.certificacion.academy.tasks.browser.OpenUp;
import co.com.choucair.certificacion.academy.tasks.search.Search;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ChoucairAcademyStepDefinition {


    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("than brandon wants to learn automation at the academy choucair")
    public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair() {
        theActorCalled(Constant.MR_ROBOT).wasAbleTo(OpenUp.browserURL());
    }

    @When("he search for the Metodología Bancolombia on the choucair academy plataform")
    public void heSearchForTheMetodologíaBancolombiaOnTheChoucairAcademyPlataform() {
        theActorCalled(Constant.MR_ROBOT).attemptsTo(Login.toAccess());
        theActorInTheSpotlight().should(seeThat(ValidHome.validateImageHome()));
        theActorCalled(Constant.MR_ROBOT).attemptsTo(Search.coursea());
    }

    @Then("he finds the course called resources Metodología Bancolombia")
    public void heFindsTheCourseCalledResourcesMetodologíaBancolombia() {
        theActorInTheSpotlight().should(seeThat(ValidateSearchOfCoursea.questionSuccess()));
    }
}
