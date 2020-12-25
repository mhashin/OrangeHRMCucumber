package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/appFeatures/"},
		glue = {"stepdefinitions", "hooks"},
		plugin = {"pretty"},
		dryRun=false,
		monochrome=true
		
		)
public class MyTestRunner {

}
