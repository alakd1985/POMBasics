package FlowLuCRMPages;

import base.Page;

public class AddContactFlowPage extends Page {
	public void createNewContact(String newContactName) {

		type("name_name", newContactName);
		/*
		 * //, String oppamount, String oppsource, String oppemail, String oppphone,
		 * String oppweb, String opporganization, String oppcontactperson
		 */
	}

}
