package stepdef;

import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mainclass.main;

public class Details_StepDef {

	public static WebDriver driver;
	main page_object_manager;
	String iBalance;

	private ScenarioContext context;

	public Details_StepDef(ScenarioContext context) {
		this.context = context;
	}

	@When("user click the account details button")
	public void user_click_the_account_details_button() {
		context.getpageObjectManagerValue().getDetails_page().getAccDetails().get(0).click();
	}

	@Then("account details page is displayed")
	public void account_details_page_is_displayed() throws IOException  {
		System.out.println("Account Details of the user is displayed");
		TakesScreenshot scrsht = (TakesScreenshot) driver;
		File source = scrsht.getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		File destination = new File("C:\\Users\\babu_\\eclipse-workspace\\Bank\\src\\main\\resources\\screenshot");
		FileUtils.copyFile(source, destination);
		System.out.println("Screenshot taken");
	}
}
