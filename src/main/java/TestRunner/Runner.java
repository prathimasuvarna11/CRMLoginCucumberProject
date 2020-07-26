package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;







@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\NI7587\\eclipse-workspace\\Automation\\src\\main\\java\\Features\\Login.feature",
		glue= {"StepDefinitions"}
		)
public class Runner {
	
	
	

}
