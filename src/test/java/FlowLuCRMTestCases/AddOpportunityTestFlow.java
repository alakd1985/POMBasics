package FlowLuCRMTestCases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import FlowLuCRMPages.AddOpportunityFlowPage;
import FlowLuCRMPages.FlowHomePage;
import FlowLuCRMPages.FlowOpportunitiesPage;
import Utilities.DataUtil;

public class AddOpportunityTestFlow {
	@Test(dataProviderClass = DataUtil.class, dataProvider = "dp")
	public void addopportunityTestFlow(Hashtable<String, String> data) {
		FlowHomePage fH = new FlowHomePage();
		FlowOpportunitiesPage fopage = fH.gotoCRM();
		AddOpportunityFlowPage addOflow = fopage.gotoAddOpportunity();
		addOflow.createOpportunity(data.get("title"), data.get("amount"), data.get("source"), data.get("email"),
				data.get("phone"), data.get("website"), data.get("oraganization"), data.get("contactperson"));
	}

}
