import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\Features\\",
        glue = {"com.stepDef"},
//        plugin = {"pretty"},
        plugin = {"html: test-reports"},
//        plugin = {"json: test-reports\\json-report.json"},
        tags = "@SimpleAlert",
        monochrome = true

)

public class ActivityRunner {
    //empty
}