package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/",
glue = "stepdefination",
plugin = {"pretty","html:target/cucumber-reports/cucumberreport.html",
		"junit:target/cucumber-reports/cucumberreport.xml",
		"json:target/cucumber-reports/cucumberreport.json"})

public class TestRunner {

}
