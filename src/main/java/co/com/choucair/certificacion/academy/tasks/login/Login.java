package co.com.choucair.certificacion.academy.tasks.login;


import co.com.choucair.certificacion.academy.helpers.Utils;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static co.com.choucair.certificacion.academy.ui.login.LoginUI.*;

public class Login implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(BUTTON_GET_INTO));
        actor.attemptsTo(Enter.theValue(Utils.decode64(Utils.getCredentials().get(0))).into(INPUT_USER));
        actor.attemptsTo(Enter.theValue(Utils.decode64(Utils.getCredentials().get(1))).into(INPUT_PWD));
        actor.attemptsTo(Click.on(BUTTON_TO_ACCESS));

    }
    public static Performable toAccess(){
        return Tasks.instrumented(Login.class);
    }
}
