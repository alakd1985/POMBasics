package testcases;

import org.testng.annotations.AfterSuite;

import base.Page;

public class BaseTest {

	/*
	 * @BeforeSuite public void setup() {
	 * 
	 * try { fis = new
	 * FileInputStream(".\\src\\test\\resources\\properties\\config.properties"); }
	 * catch (FileNotFoundException e1) {
	 * 
	 * e1.printStackTrace(); } try { config.load(fis); } catch (IOException e) {
	 * 
	 * e.printStackTrace(); }
	 * 
	 * RestAssured.baseURI = config.getProperty("baseURI"); RestAssured.basePath =
	 * config.getProperty("basePath"); }
	 */
	@AfterSuite
	public void tearDown() {
		Page.quit();
	}
}
