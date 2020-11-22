package testcasesReallyCRM;

import java.util.Hashtable;

import org.testng.annotations.Test;

import Utilities.DataUtil;
import pagesReallyCRM.LoginPageReallyCRM;

public class LoginTestReallyCRM {

	@Test(dataProviderClass = DataUtil.class, dataProvider = "dp")
	public void loginTestReallyCRM(Hashtable<String, String> data) {
		LoginPageReallyCRM recrm = new LoginPageReallyCRM();
		recrm.loginCRM(data.get("id"), data.get("pass"));

	}
}
