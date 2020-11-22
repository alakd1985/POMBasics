package testcasesReallyCRM;

import java.util.Hashtable;

import org.testng.annotations.Test;

import Utilities.DataUtil;
import pagesReallyCRM.ContactsHomePage;
import pagesReallyCRM.CreateContactReallyCRM;
import pagesReallyCRM.ReallyCRMHomePage;

public class CreateContactTestReallyCRM {
	@Test(dataProviderClass = DataUtil.class, dataProvider = "dp")
	public void createcontactTestReallyCRM(Hashtable<String, String> data) {
		ReallyCRMHomePage rcmHomepage = new ReallyCRMHomePage();
		ContactsHomePage conHomepage = rcmHomepage.gotoContactsPage();
		CreateContactReallyCRM crcontactHome = conHomepage.gotoCreateContact();
		crcontactHome.createContact(data.get("first"), data.get("middle"), data.get("last"), data.get("manager"),
				data.get("title"), data.get("assistant"), data.get("phone"), data.get("cell"), data.get("other"),
				data.get("email"), data.get("localaddress"), data.get("localcity"), data.get("localzip"));
		;
	}
}
