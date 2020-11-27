package FlowLuCRMTestCases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import FlowLuCRMPages.FlowLoginPage;
import Utilities.DataUtil;

public class LoginTestFlow {

	@Test(dataProviderClass = DataUtil.class, dataProvider = "dp")
	public void logintestFlow(Hashtable<String, String> data) {
		FlowLoginPage recrm = new FlowLoginPage();
		recrm.loginFlowLu(data.get("username"), data.get("password"));
	}
}
