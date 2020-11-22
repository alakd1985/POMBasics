package pagesReallyCRM;

import base.Page;

public class ContactsHomePage extends Page {

	public CreateContactReallyCRM gotoCreateContact() {
		click("addBtnContactPage_xpath");
		return new CreateContactReallyCRM();
	}

}
