package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailsPage {

	WebDriver driver;
	
	public DetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public List<WebElement> getAccDetails() {
		return accDetails;
	}

	public List<WebElement> getLstLogout() {
		return lstLogout;
	}

	@FindBy(linkText = "Account Details")
	private List<WebElement> accDetails;

	@FindBy(linkText = "Logout")
	private List<WebElement> lstLogout;
}

