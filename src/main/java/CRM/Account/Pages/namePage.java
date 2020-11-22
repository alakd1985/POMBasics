package CRM.Account.Pages;

import base.Page;

public class namePage extends Page {

	public void createName(String fName, String lName) {
		type("firstname_xpath", fName);
		type("lastname_xpath", lName);
	}
}
