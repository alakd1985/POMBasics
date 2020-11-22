package base;

import org.openqa.selenium.WebDriver;

public class sidebarReallyCRM {
	WebDriver driver;

	public sidebarReallyCRM(WebDriver driver) {
		this.driver = driver;
	}

	public void gotoAccountsReallyCRM() {
		Page.click("accountslink_xpath");
		// return new AccountsHomePage();

	}
}
