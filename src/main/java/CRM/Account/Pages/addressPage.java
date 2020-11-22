package CRM.Account.Pages;

import base.Page;

public class addressPage extends Page {

	public void addressName(String physicalAdd, String emailId) {
		type("address_xpath", physicalAdd);
		type("email_xpath", emailId);
	}

}
