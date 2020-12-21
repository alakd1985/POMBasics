package FlowLuCRMPages;

import base.Page;

public class ContactHomePage extends Page {
	public AddContactFlowPage gotoNewContact() {
		click("createNewContactBtn_xpath");
		return new AddContactFlowPage();
	}
}
