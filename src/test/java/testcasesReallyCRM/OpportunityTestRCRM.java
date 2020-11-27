package testcasesReallyCRM;

import java.util.Hashtable;
import java.util.Random;

import org.testng.annotations.Test;

import Utilities.DataUtil;
import pagesReallyCRM.CreateOpportunityHomePage;
import pagesReallyCRM.OpportunitiesHomePage;
import pagesReallyCRM.ReallyCRMHomePage;

public class OpportunityTestRCRM {
	Random rand = new Random();

	@Test(dataProviderClass = DataUtil.class, dataProvider = "dp")
	public void opportunityTestRCRM(Hashtable<String, String> data) {
		ReallyCRMHomePage rehomepage = new ReallyCRMHomePage();
		OpportunitiesHomePage oppHomePage = rehomepage.gotoOpportunities();
		CreateOpportunityHomePage createOppHome = oppHomePage.gotoAddOpportunities();
		createOppHome.newOpportunity(data.get("oppName") + rand.nextInt(), data.get("nxtStep"), data.get("competitor"),
				data.get("acname"));
	}
}
