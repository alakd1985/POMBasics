package pagesReallyCRM;

import base.Page;

public class CreateContactReallyCRM extends Page {
	public void createContact(String fname, String midname, String lname, String title, String manager, String zip,
			String phonenumber, String country, String localadd, String email, String other, String cell, String ass) {

		type("firstName_css", fname);
		type("middleName_css", midname);
		type("lastName_css", lname);
		type("title_css", title);

		type("manager_css", manager);
		type("zip_css", zip);
		type("phone_css", phonenumber);
		type("cell_css", cell);

		type("other_css", other);

		type("email_css", email);

		select("country_css", country);
		type("localAddress_css", localadd);
		type("assistant_css", ass);
	}
}
