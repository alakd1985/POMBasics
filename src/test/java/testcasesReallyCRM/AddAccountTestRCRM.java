package testcasesReallyCRM;

import java.util.Hashtable;

import org.testng.annotations.Test;

import Utilities.DataUtil;
import pagesReallyCRM.AccountsHomePage;
import pagesReallyCRM.AddAccountpage;
import pagesReallyCRM.ReallyCRMHomePage;

public class AddAccountTestRCRM {

	@Test(dataProviderClass = DataUtil.class, dataProvider = "dp")
	public void addaccountTestRCRM(Hashtable<String, String> data) {
		ReallyCRMHomePage rehomepage = new ReallyCRMHomePage();
		AccountsHomePage aHomepage = rehomepage.gotoAcocuntsHomePage();
		AddAccountpage addAccount = aHomepage.gotoAddAccountpage();
		addAccount.createAccount(data.get("name"), data.get("address"), data.get("zip"), data.get("city"),
				data.get("state"), data.get("website"), data.get("phone"), data.get("typed"), data.get("sectord"));
	}

}
