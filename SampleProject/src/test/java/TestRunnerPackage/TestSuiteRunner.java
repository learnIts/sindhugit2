package TestRunnerPackage;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/java/FirstFolder/Calculator.feature",glue ={"StepDefinitions"},
        tags = {"@Demo","@sampleTestCase"},
        snippets = SnippetType.CAMELCASE
)
public class TestSuiteRunner {




}


