package co.com.choucair.certificacion.academy.questions.search;

import co.com.choucair.certificacion.academy.helpers.Constant;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.choucair.certificacion.academy.ui.search.SearchUI.VALIDATE_NAME_COURSEA;

public class ValidateSearchOfCoursea implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String getNameCoursea = Text.of(VALIDATE_NAME_COURSEA).answeredBy(actor);
        if(getNameCoursea != null && getNameCoursea.equals(Constant.NAME_OF_COURSEA)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
    public static ValidateSearchOfCoursea questionSuccess(){
        return new ValidateSearchOfCoursea();
    }
}
