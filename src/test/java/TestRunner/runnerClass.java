package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/signFeatures"},
plugin = {"json:target/cucumber.json"},
glue = "StepDefinition") //tags = {""})

public class runnerClass extends AbstractTestNGCucumberTests {
	

}
