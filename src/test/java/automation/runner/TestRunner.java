package automation.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src//test//resources//features",
        glue = "automation.steps", // package name wher we step definition
        tags = "@Smoke",
        plugin = {"json:target//cucumber.json","html:target//index.html"} // which report: where we want

)
public class TestRunner {

}
