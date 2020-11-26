package pagesReallyCRM;

import base.Page;

public class AddAccountpage extends Page {
	public void createAccount(String accountName, String addressline, String zipcode, String state, String city,
			String websiteaddress, String phonenumber, String type, String sector) {
		type("accountName_css", accountName);
		type("address_css", addressline);
		type("zip_css", zipcode);
		type("city_css", city);
		type("state_css", state);
		type("website_css", websiteaddress);
		type("phone_css", phonenumber);
		select("type_xpath", type);
		select("sector_xpath", sector);
		click("saveBtn_css");

	}
}
