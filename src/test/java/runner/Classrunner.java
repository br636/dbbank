package runner;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "C:\\Users\\babu_\\eclipse-workspace\\Bank\\src\\main\\java\\Feature\\bank.Feature" }, 
                 glue = "stepdef",   
                 tags = {"@Background" }, 
                 strict = true, 
                 monochrome = true,
                 dryRun = false, 
                 plugin = { "json:target\\cucumber.json" })

public class Classrunner extends AbstractTestNGCucumberTests {
	@DataProvider(parallel = true)
	@Override
	public Object[][] scenarios() {
		return super.scenarios();
	}
}



