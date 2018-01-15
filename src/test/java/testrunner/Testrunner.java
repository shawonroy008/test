package testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class Testrunner {
@CucumberOptions(
		features="feature",
		glue="stepdeff"
		
		)
public class TestRunner extends AbstractTestNGCucumberTests{
	
}
}

