package FlowLuCRMPages;

import base.Page;

public class FlowOpportunitiesPage extends Page {
	public AddOpportunityFlowPage gotoAddOpportunity() {
		click("opportunityFlowLu_xpath");
		click("addOppFlowBtn_xpath");

		return new AddOpportunityFlowPage();
	}
}
