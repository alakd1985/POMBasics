package pagesReallyCRM;

import base.Page;

public class OpportunitiesHomePage extends Page {
	public CreateOpportunityHomePage gotoAddOpportunities() {
		click("opportunitiesAdd_xpath");
		return new CreateOpportunityHomePage();

	}
}
