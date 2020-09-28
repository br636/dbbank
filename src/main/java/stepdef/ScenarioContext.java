package stepdef;



import org.openqa.selenium.WebDriver;

import mainclass.main;

public class ScenarioContext {
	
	private main pageObjectManager;
	private WebDriver driver;
	
	public main getpageObjectManagerValue() {
		return pageObjectManager;
	}
	
	public void setpageObjectManagerValue(main pageObjectManager) {
		this.pageObjectManager = pageObjectManager;
	}	
	
	public WebDriver getWebDriverValue() {
		return driver;
	}
	
	public void setWebDriverValue(WebDriver driver) {
		this.driver = driver;
	}	


}
