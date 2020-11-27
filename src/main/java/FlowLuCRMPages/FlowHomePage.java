package FlowLuCRMPages;

import base.Page;

public class FlowHomePage extends Page {
	public FlowOpportunitiesPage gotoCRM() {
		click("flowLuCRM_xpath");
		return new FlowOpportunitiesPage();
	}
}
