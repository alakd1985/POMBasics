package testcasesReallyCRM;

import java.util.Hashtable;

import org.testng.annotations.Test;

import Utilities.DataUtil;
import pagesReallyCRM.ContactsHomePage;
import pagesReallyCRM.CreateContactReallyCRM;
import pagesReallyCRM.ReallyCRMHomePage;

public class CreateContactTestRCRM {
	@Test(dataProviderClass = DataUtil.class, dataProvider = "dp")
	public void createcontactTestRCRM(Hashtable<String, String> data) {
		ReallyCRMHomePage rcmHomepage = new ReallyCRMHomePage();
		ContactsHomePage conHomepage = rcmHomepage.gotoContactsPage();
		CreateContactReallyCRM crcontactHome = conHomepage.gotoCreateContact();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		crcontactHome.createContact(data.get("first"));
		/*
		 * data.get("manager"), data.get("title"), data.get("assistant"),
		 * data.get("phone"), data.get("cell"), data.get("other"), data.get("email"),
		 * data.get("localaddress"), data.get("localcity"), data.get("localzip"),
		 * data.get("country"), data.get("middle"), data.get("last")
		 */
	}
}
