package co.com.choucair.certificacion.academy.ui.login;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI extends PageObject {

    public static final Target BUTTON_GET_INTO = Target.the("click button getInto")
            .located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(text(),'Ingresar')]"));

    public static final Target INPUT_USER = Target.the("Insert user")
            .located(By.id("username"));

    public static final Target INPUT_PWD = Target.the("Insert pwd")
            .located(By.id("password"));

    public static final Target BUTTON_TO_ACCESS = Target.the("click to access")
            .located(By.xpath("//button[@type='submit']"));
}
