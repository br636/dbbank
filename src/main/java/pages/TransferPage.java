package pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferPage {
	
	WebDriver driver;

	public TransferPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Fund Transfers')]")
	private List<WebElement> transferBtn;

	@FindBy(xpath = "//h2[contains(text(),'Transaction Authorization Code')]")
	private List<WebElement> otpPage;

	@FindBy(id = "token")
	private List<WebElement> otp;

	@FindBy(id = "submitButton")
	private List<WebElement> OtpSubmit;

	@FindBy(xpath = "//input[@id='submitButton']")
	private List<WebElement> transfersubmitButton;

	@FindBy(xpath = "//strong[contains(text(),'International Transaction Successful')]")
	private List<WebElement> successsMsg;
	

	public List<WebElement> getTransfersBtn() {
		return transferBtn;
	}

	public List<WebElement> getOtpPage() {
		return otpPage;
	}

	public List<WebElement> getOtp() {
		return otp;
	}

	public List<WebElement> getOtpSubmit() {
		return OtpSubmit;
	}

	public List<WebElement> getSubmitButton() {
		return transfersubmitButton;
	}

	public List<WebElement> getSuccessMsg() {
		return successsMsg;
	}
}
