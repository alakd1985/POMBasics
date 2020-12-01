package FlowLuCRMTestCases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import FlowLuCRMPages.CreateOrganization;
import FlowLuCRMPages.FlowHomePage;
import FlowLuCRMPages.OrganizationHomePage;
import Utilities.DataUtil;

public class AddOrganizationTestFlow {
	@Test(dataProviderClass = DataUtil.class, dataProvider = "dp")
	public void addorganizationTestFlow(Hashtable<String, String> data) {
		FlowHomePage fH = new FlowHomePage();
		OrganizationHomePage fopage = fH.gotoOrganization();
		CreateOrganization addOflow = fopage.gotoCreateNewOrganization();
		addOflow.createOrganization(data.get("organname"), data.get("phone"), data.get("web"), data.get("email"),
				data.get("jobtitle"));
	}
}
//,   ,, , data.get("contactperson")data.get("category"), data.get("industry"),
