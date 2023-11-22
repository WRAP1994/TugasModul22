package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:reports/test-report-api.html",},
        glue = {"StepDef"},
        features = {"src/test/java/API"},
        tags = "@api",
        monochrome = true
)
public class cucumberApiTest {

}
