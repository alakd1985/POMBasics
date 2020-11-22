package pagesReallyCRM;

import base.Page;

public class AccountsHomePage extends Page {

	public AddAccountpage gotoAddAccountpage() {
		click("addBtn_xpath");
		return new AddAccountpage();
	}

}
