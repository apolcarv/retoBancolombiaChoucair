package co.com.choucair.certificacion.academy.tasks.search;

import co.com.choucair.certificacion.academy.helpers.Constant;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static co.com.choucair.certificacion.academy.ui.Home.HomeUI.IMG_UC;
import static co.com.choucair.certificacion.academy.ui.search.SearchUI.*;

public class Search implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(IMG_UC));
        actor.attemptsTo(Enter.theValue(Constant.NAME_OF_COURSEA).into(INPUT_SEARCH_COURSEA));
        actor.attemptsTo(Click.on(BUTTON_TO_GO));
        actor.attemptsTo(Click.on(SELECT_RESULT));
    }
    public static Performable coursea(){
        return Tasks.instrumented(Search.class);
    }
}
