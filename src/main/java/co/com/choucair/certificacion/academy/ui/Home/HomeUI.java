package co.com.choucair.certificacion.academy.ui.Home;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeUI extends PageObject {

    public static final Target VALID_IMG_HOME = Target.the("validate the image in the house")
            .located(By.xpath("//div[@class='customimage']"));

    public static final Target IMG_UC = Target.the("click in the image")
            .located(By.xpath("//img[@alt='Universidad Choucair']"));


}
