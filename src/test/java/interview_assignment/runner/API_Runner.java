package interview_assignment.runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/apiTask.features",
        glue= "interview_assignment/step_definitions",
        dryRun  = false,
        tags = {"@TaskApi"},
        plugin = {"pretty", "html:target/cucumber-html-report", "json:target/cucumber.json"}

)

public class API_Runner {
}
