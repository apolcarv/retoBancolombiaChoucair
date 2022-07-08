package co.com.choucair.certificacion.academy.ui.search;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchUI extends PageObject {

    public static final Target INPUT_SEARCH_COURSEA = Target.the("Insert name of coursea for search")
            .located(By.id("coursesearchbox"));

    public static final Target BUTTON_TO_GO = Target.the("Insert name of coursea for search")
            .located(By.xpath("//button[@class='btn btn-secondary']"));

    public static final Target SELECT_RESULT= Target.the("Select the course")
            .located(By.xpath("//h4[@class='result-title']//a[contains(text(),'Metodología Bancolombia')]"));

    public static final Target VALIDATE_NAME_COURSEA = Target.the("validate the coursea search")
            .located(By.xpath("//a[contains(text(),'Metodología Bancolombia')]"));
}
