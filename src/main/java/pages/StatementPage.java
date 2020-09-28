package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StatementPage {

	WebDriver driver;
	
	public StatementPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public List<WebElement> getStmtDetails() {
		return stmtDetails;
	}

	public List<WebElement> getLstLogout() {
		return lstLogout;
	}

	@FindBy(linkText = "Account Statement")
	private List<WebElement> stmtDetails;

	@FindBy(linkText = "Logout")
	private List<WebElement> lstLogout;
}
