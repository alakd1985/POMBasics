package FlowLuCRMPages;

import base.Page;

public class FlowHomePage extends Page {
	public FlowOpportunitiesPage gotoCRM() {
		click("flowLuCRM_xpath");
		return new FlowOpportunitiesPage();
	}

	public OrganizationHomePage gotoOrganization() {

		click("organization_xpath");
		return new OrganizationHomePage();
	}
}
