package collections;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNG {
	


	@DataProvider(name = "dp")
	public Object[][] getDataFromDataprovider(){

		return new Object[][] {

				{ "23", "45" },
				{ "Saravanan","Cognizant"},
		};
	}
	 @Test (dataProvider = "dp",priority =1)
	 public void dp(String str, String str2){	
		 System.out.println(str);
		 System.out.println(str2);
	}
	 @Test (dataProvider ="dp",priority=2)
	 public void aaa(String ppr,String ttr){
		 System.out.println(ppr +":   1st");
		 System.out.println(ttr +":   2nd");
	 }
	
	
/*  @Test (groups = { "grp1" })
  public void f1() {
	  System.out.println("@Test1");
  }
  @Test (dependsOnGroups = { "grp1.*" })

  public void f2() {
	  System.out.println("@Test2");
  }
  @Test  (enabled = false,groups = { "grp1" })
  public void f3() {
	  System.out.println("@Test3");
  }
  @Test (alwaysRun=false)
  @Parameters("str")
  public void f4(String str){
	  System.out.println("The Param value is:" + str );
  }
  @Test (description="It like a comment")
  public void f5(){
	  System.out.println("I will always run");
  }*/
  
 /* @Test(expectedExceptions = {ArithmeticException.class,TestException.class})
	public void divisionWithException() {
		int i = 1 / 4;
		System.out.println("@Test   :   The i value is"+i);
  }*/
  
 /* @Test(invocationCount = 3)
  public void testServer() {
	 FirefoxDriver driver = new FirefoxDriver();
	 driver.navigate().to("http://google.co.in");
	 driver.close();
	  System.out.println("Saravanan-Yamini");
  }*/
	/*public class TestNGTimeTest {
		 
	    @Test(timeOut = 500)
	    public void waitLongTime() throws Exception {
	        Thread.sleep(500);
	}*/
	
	/*@Test (priority=3)
	public void logout(){
		System.out.println("Logout");
	}
	
	
	@Test(priority=2)
	public void CreateAccount(){
		System.out.println("CreateAccount");
	}
	
	@Test
	public void login(){
		System.out.println("login");
	}*/
  
	   /* @Test (timeOut=300)
	    public void timeTestOne() throws InterruptedException {
	        Thread.sleep(1000);
	        System.out.println("Time test method one");
	    }
	 
	    @Test(timeOut=2000)
	    public void timeTestTwo() throws InterruptedException {
	        Thread.sleep(400);
	        System.out.println("Time test method two");
	    }*/

	
	WrapperMethods read = new WrapperMethods();
	
	
  
  
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("@Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("@After Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("@Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("@AfterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("@Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("@After Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("@Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite");
  }

}
