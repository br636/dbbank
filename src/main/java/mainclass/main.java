package mainclass;
import org.openqa.selenium.WebDriver;

import pages.DetailsPage;
import pages.LoginPage;
import pages.Logout;
import pages.StatementPage;
import pages.TransferPage;

public class main {

	private WebDriver driver;
	private LoginPage login_page;
	private DetailsPage details_page;
	private TransferPage transfer_page;
	private StatementPage statement_page;
	private Logout logout;

	public main(WebDriver driver) {

		this.driver = driver;
	}

	public LoginPage getLogin_page() {
		return (login_page == null) ? login_page = new LoginPage(driver) : login_page;
	}

	public DetailsPage getDetails_page() {
		return (details_page == null) ? details_page = new DetailsPage(driver) : details_page;
	}

	public TransferPage getTransfer_page() {
		return (transfer_page == null) ? transfer_page = new TransferPage(driver) : transfer_page;
	}

	public StatementPage getStatement_page() {
		return (statement_page == null) ? statement_page = new StatementPage(driver) : statement_page;
	}

	public Logout getLogout() {
		return (logout == null) ? logout = new Logout(driver) : logout;
	}

}

