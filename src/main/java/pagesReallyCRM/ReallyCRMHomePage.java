package pagesReallyCRM;

import base.Page;

public class ReallyCRMHomePage extends Page {

	public AccountsHomePage gotoAcocuntsHomePage() {
		click("accountslink_xpath");
		return new AccountsHomePage();
	}

	public ContactsHomePage gotoContactsPage() {
		click("contactsLink_xpath");
		return new ContactsHomePage();
	}

	public OpportunitiesHomePage gotoOpportunities() {
		click("opportunitiesLink_xpath");
		return new OpportunitiesHomePage();
	}

}

// test_suite

//https://www.zoho.com/
