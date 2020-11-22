package testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import CRM.Account.Pages.addressPage;
import CRM.Account.Pages.namePage;
import Utilities.DataHelper;

public class DemoTest {

	@Test(dataProviderClass = DataHelper.class, dataProvider = "dp")
	public void nameTest(Hashtable<String, String> data) {
		namePage npage = new namePage();
		npage.createName(data.get("firstName"), data.get("lastName"));
	}

	@Test(dataProviderClass = DataHelper.class, dataProvider = "dp")
	public void addressTest(Hashtable<String, String> data) {
		addressPage aPage = new addressPage();
		aPage.addressName(data.get("physicalAddress"), data.get("emailAddress"));
	}
}
