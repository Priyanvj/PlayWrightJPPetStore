package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/java/Features/" }, glue = { "StepDefinition", "Hooks" }, plugin = { "pretty",
		"html:traget/cucumber.html", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"rerun:target/rerun.txt" // Save Failed test scenarios in rerun.txt file
},
tags = "@TC003")

public class TestRunner {

}
