package co.com.choucair.certificacion.academy.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/feature/academychoucair.feature"}
        , glue = {"co.com.choucair.certificacion.academy.stepDefinition"}
        , tags = "@stories"
        , snippets =  CucumberOptions.SnippetType.CAMELCASE)
public class TestRunnerTags {
}
