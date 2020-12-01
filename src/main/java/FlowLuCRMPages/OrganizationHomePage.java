package FlowLuCRMPages;

import base.Page;

public class OrganizationHomePage extends Page {
	public CreateOrganization gotoCreateNewOrganization() {

		click("newOrganization_xpath");
		return new CreateOrganization();
	}
}
