package pages;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public List<WebElement> getLstTextUserName() {
		return lstTextUserName;
	}

	public List<WebElement> getLstTextPassword() {
		return lstTextPassword;
	}

	public List<WebElement> getLstLoginButton() {
		return lstLoginButton;
	}

	public List<WebElement> getLstPin() {
		return LstPin;
	}

	public List<WebElement> getLstValidateButton() {
		return LstValidateButton;
	}

	@FindBy(id = "accno") // user name
	private List<WebElement> lstTextUserName;

	@FindBy(id = "pass") // password
	private List<WebElement> lstTextPassword;

	@FindBy(id = "submitButton") // submit
	private List<WebElement> lstLoginButton;

	@FindBy(id = "accpin") // pin
	private List<WebElement> LstPin;

	@FindBy(id = "submitButton") // validate button
	private List<WebElement> LstValidateButton;
}
