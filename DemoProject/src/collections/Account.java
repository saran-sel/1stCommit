package collections;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Account {
	WrapperMethods read = new WrapperMethods();


	@Test 
	public void f2() throws Exception{
		read.invokeBrowser("chrome", "http://demo1.opentaps.org/opentaps/control/main");
		read.enterByID("username", "DemoSalesManager");
		read.enterByID("password", "crmsfa");
		read.clickByXpath("//*[@id='login']/p[3]/input");
		read.clickByXpath("//*[@id='button']/a/img");
		read.closeBrowser();
	}
	
	@Test
	
	public void f3() throws Exception{
		read.invokeBrowser("chrome", "http://demo1.opentaps.org/opentaps/control/main");
		read.enterByID("username", "DemoSalesManager");
		read.enterByID("password", "crmsfa");
		read.clickByXpath("//*[@id='login']/p[3]/input");
	}
	

	@BeforeClass
	public void beforeClass() {


	}


	@AfterClass
	public void afterClass() {

	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

	@BeforeSuite
	public void beforeSuite() {
	}

	@AfterSuite
	public void afterSuite() {
	}

}
