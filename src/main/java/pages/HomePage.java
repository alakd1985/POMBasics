package pages;

import base.Page;

public class HomePage extends Page {

	public void gotoSignUp() {
		click("loginSignUp_css");
	}

	public LoginPage gotoLogin() {
		click("loginlink_css");
		return new LoginPage();
	}

	public void gotoZOhoEdu() {

	}

	public void validateFooterLinks() {

	}

	public void gotoSupport() {
		click(".zh-support");
	}
}

// test_suite

//https://www.zoho.com/
