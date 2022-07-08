package co.com.choucair.certificacion.academy.questions.home;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.choucair.certificacion.academy.ui.Home.HomeUI.VALID_IMG_HOME;

public class ValidHome implements  Question {

    @Override
    public Object answeredBy(Actor actor) {
        return VALID_IMG_HOME.resolveFor(actor).isPresent();
    }
    public static ValidHome validateImageHome(){
        return new ValidHome();

    }
}
