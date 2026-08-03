package Runner_Cucumber;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Cucumber/Feature/Login.feature", glue = "Cucumber.Step.Definition.Java.Classes", monochrome = true, plugin = {"pretty", "html:target/cucumber.html"})
public class Login_Runner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}
