package FlowLuCRMPages;

import base.Page;

public class AddOpportunityFlowPage extends Page {

	public void createOpportunity(String newOppName, String oppamount, String oppsource, String oppemail,
			String oppphone, String oppweb, String opporganization, String oppcontactperson) {
		type("oppNameflow_xpath", newOppName);
		type("oppAmountflow_xpath", oppamount);
		select("oppSource_xpath", oppsource);
		type("oppemail_xpath", oppemail);
		type("oppphone_xpath", oppphone);
		type("oppwebsite_xpath", oppweb);
		type("opporganization_xpath", opporganization);
		type("oppperson_xpath", oppcontactperson);
		click("oppsaveBtn_xpath");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click("closeBtn_xpath");
	}
}
