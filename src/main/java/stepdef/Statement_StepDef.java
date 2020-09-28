package stepdef;



import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mainclass.main;

public class Statement_StepDef {
	public static WebDriver driver;
	main page_object_manager;
	String iBalance;

	private ScenarioContext context;

	public Statement_StepDef(ScenarioContext context) {
		this.context = context;
	}

	@When("use click the account statement button")
	public void use_click_the_account_statement_button() throws Throwable {
		context.getpageObjectManagerValue().getStatement_page().getStmtDetails().get(0).click();
	}

	@Then("transaction statement is displayed")
	public void transaction_statement_is_displayed() throws Throwable {
		System.out.println("Statement of the user is displayed");
		TakesScreenshot scrsht = (TakesScreenshot) driver;
		File source = scrsht.getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		File destination = new File("C:\\Users\\Danny\\Documents\\MavenProject\\Screenshots\\out1.png");
		FileUtils.copyFile(source, destination);
		System.out.println("Screenshot taken");
	}
	

}
