package pagesReallyCRM;

import base.Page;

public class ReallyCRMHomePage extends Page {

	public AccountsHomePage gotoAcocuntsHomePage() {
		click("accountslink_xpath");
		return new AccountsHomePage();
	}

	public void gotoZOhoEdu() {

	}

	public void validateFooterLinks() {

	}

}

// test_suite

//https://www.zoho.com/
