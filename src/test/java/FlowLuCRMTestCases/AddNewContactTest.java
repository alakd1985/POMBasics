package FlowLuCRMTestCases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import FlowLuCRMPages.AddContactFlowPage;
import FlowLuCRMPages.ContactHomePage;
import FlowLuCRMPages.FlowHomePage;
import Utilities.DataUtil;

public class AddNewContactTest {
	@Test(dataProviderClass = DataUtil.class, dataProvider = "dp")
	public void addNewContactTest(Hashtable<String, String> data) {
		FlowHomePage fH = new FlowHomePage();
		ContactHomePage conHomepage = fH.gotoContactPage();
		AddContactFlowPage addcontact = conHomepage.gotoNewContact();
		addcontact.createNewContact(data.get("name"));
		/*
		 * AddOpportunityFlowPage addOflow = fopage.gotoAddOpportunity();
		 * addOflow.createOpportunity(data.get("title"), data.get("amount"),
		 * data.get("source"), data.get("email"), data.get("phone"),
		 * data.get("website"), data.get("oraganization"), data.get("contactperson"));
		 */
	}
}
