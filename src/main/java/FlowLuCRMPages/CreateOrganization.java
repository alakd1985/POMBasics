package FlowLuCRMPages;

import base.Page;

public class CreateOrganization extends Page {

	public void createOrganization(String oragaName, String cell, String email, String title, String website) {
		type("organizationName_xpath", oragaName);

		type("email_xpath", email);
		type("jobtitle_xpath", title);

		type("phone_name", cell);
		type("web_name", website);

		/*
		 * type("oppAmountflow_xpath", oppamount);
		 * 
		 * type("oppwebsite_xpath", oppweb); type("opporganization_xpath",
		 * opporganization); type("oppperson_xpath", oppcontactperson);
		 * click("oppsaveBtn_xpath");, String oppamount, String oppsource, String
		 * oppemail, String oppphone, String oppweb, String opporganization, String
		 * oppcontactperson
		 */
	}
}
