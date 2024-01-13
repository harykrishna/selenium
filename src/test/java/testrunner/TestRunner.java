package testrunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import utilities.WebElementOperations;

@CucumberOptions(features = "src/test/resources/scenarios",glue = {"steps"},tags = "@Test",publish = true)
public class TestRunner extends AbstractTestNGCucumberTests {

    @AfterClass
    public void afterSuite(){
       new WebElementOperations().getDriver().quit();
    }

}
