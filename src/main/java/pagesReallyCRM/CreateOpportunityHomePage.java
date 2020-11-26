package pagesReallyCRM;

import base.Page;

public class CreateOpportunityHomePage extends Page {
	public void newOpportunity(String oppName, String nextStep, String competitor, String accname) {
		type("oppName_css", oppName);
		type("nextstep_css", nextStep);
		type("competitor_css", competitor);
		click("addNewAccount_css");
		type("accountName_css", accname);
		click("saveBtn_xpath");
		click("saveOpportunity_css");
	}
}
