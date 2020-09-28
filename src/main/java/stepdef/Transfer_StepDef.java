package stepdef;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mainclass.main;

public class Transfer_StepDef {
	public static WebDriver driver;
	main page_object_manager;
	String iBalance;

	private ScenarioContext context;

	public Transfer_StepDef(ScenarioContext context) {
		this.context = context;
	}
	
	@When("user click the fund transfer button")
	public void user_click_the_fund_transfer_button() throws Throwable {
		context.getpageObjectManagerValue().getTransfer_page().getTransfersBtn().get(0).click();
	}

	@When("^User inputs the \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"  to complete  the fund transfer$")
	public void user_inputs_the_and_to_complete_the_fund_transfer(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) throws Throwable {
	    
	}

	@When("^click the transfer button$")
	public void click_the_transfer_button() {
		context.getpageObjectManagerValue().getTransfer_page().getSubmitButton().get(0).click();
	}

	@Then("the OTP page is displayed")
	public void the_OTP_page_is_displayed() {
		String otp = context.getpageObjectManagerValue().getTransfer_page().getOtpPage().get(0).getText();
		System.out.println(otp);
	}

	@When("user enter the OTP and Clicking validate VAT")
	public void user_enter_the_OTP_and_Clicking_validate_VAT() {
		context.getpageObjectManagerValue().getTransfer_page().getOtp().get(0).sendKeys("123456");
		context.getpageObjectManagerValue().getTransfer_page().getOtpSubmit().get(0).click();
		
	}

	@Then("successful transfer page with transaction details is displayed")
	public void successful_transfer_page_with_transaction_details_is_displayed() throws IOException {
		String success = context.getpageObjectManagerValue().getTransfer_page().getSuccessMsg().get(0).getText();
		System.out.println(success);
		TakesScreenshot scrsht = (TakesScreenshot) driver;
		File source = scrsht.getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		File destination = new File("C:\\Users\\hp\\eclipse-workspace\\MavenProject\\Screenshots\\out3.png");
		FileUtils.copyFile(source, destination);
		System.out.println("Screenshot taken");
	}
}
