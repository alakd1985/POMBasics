package FlowLuCRMTestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class practice {

	@Test
	public void test1() {
		System.out.println("test 1");
	}

	@Test
	public void test2() {
		System.out.println("test 2");
	}

	@BeforeMethod
	public void BM() {
		System.out.println("@BeforeMethod");
	}

	@AfterMethod
	public void AM() {
		System.out.println("@AfterMethod");
	}

	@BeforeTest
	public void BT() {
		System.out.println("@BeforeTest");
	}

	@AfterTest
	public void AT() {
		System.out.println("@AfterTest");
	}

	@BeforeClass
	public void BC() {
		System.out.println("@BeforeClass");
	}

	@AfterClass
	public void AC() {
		System.out.println("@AfterClass");
	}

	/*
	 * @BeforeSuite public void BS() { System.out.println("@BeforeSuite"); }
	 * 
	 * @AfterSuite public void AS() { System.out.println("@AfterSuite"); }
	 */
}
