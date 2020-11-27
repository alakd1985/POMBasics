package FlowLuCRMPages;

import base.Page;

public class FlowLoginPage extends Page {
	public void loginFlowLu(String username, String password) {
		type("usename_xpath", username);
		type("passFlow_xpath", password);
		click("submitBtnFlow_xpath");
	}
}
