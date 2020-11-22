package pagesReallyCRM;

import base.Page;

public class LoginPageReallyCRM extends Page {

	public void loginCRM(String username, String password) {
		type("id_css", username);
		type("pass_css", password);
		click("logBtn_css");
	}
}
