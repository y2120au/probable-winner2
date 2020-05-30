package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",	
glue= {"StepDefinitions"},
monochrome=true,
plugin={"pretty","junit:target/xml/report.xml",
		"html:target/html/report.html",
		"json:target/json/report.json"},
tags="@SmokeReg"
)
public class TestRunner {

}