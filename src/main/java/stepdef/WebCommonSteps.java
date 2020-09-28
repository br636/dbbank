package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import mainclass.main;

public class WebCommonSteps {

	WebDriver driver;
	main page_object_manager;

	private ScenarioContext context;

	public WebCommonSteps(ScenarioContext context) {
		this.context = context;
	}

	@Given("Launch the demo bank application {string} in browser")
	public void launch_the_demo_bank_application_http_demo_rapidtestpro_com_login_php_in_browser(String url)
			throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		page_object_manager = new main(driver);
		System.out.println("Login page is verifed Successfully");
		context.setWebDriverValue(driver);
	}
	
	@When("user enters {string}, {string} and {string}")
	public void user_enters_and(String txtUserName, String txtPassword, String pin) throws Throwable {
		page_object_manager.getLogin_page().getLstTextUserName().get(0).sendKeys(txtUserName);
		page_object_manager.getLogin_page().getLstTextPassword().get(0).sendKeys(txtPassword);
		page_object_manager.getLogin_page().getLstLoginButton().get(0).click();
		page_object_manager.getLogin_page().getLstPin().get(0).sendKeys(pin);
		page_object_manager.getLogin_page().getLstValidateButton().get(0).click();
		System.out.println("Home page is verified Successfully");
		context.setpageObjectManagerValue(page_object_manager);
	}

	@Then("User logs out of the application")
	public void user_logs_out_of_the_application() {
		context.getpageObjectManagerValue().getLogout().getLogoutClick().get(0).click();
		System.out.println("Logout successful");
	}
}
