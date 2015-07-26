package collections;


import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import com.gargoylesoftware.htmlunit.javascript.configuration.BrowserName;

public class NewTest {
	//public WebDriver driver;
	/*WrapperMethods rc = new WrapperMethods();


	@DataProvider
	public Object[][] dp() {
		return new Object[][] {
				{"https://www.google.com","Google"},
				{"https://www.facebook.com","Welcome to Facebook - Log In, Sign Up or Learn More"},
				{"https://www.yahoo.com","Yahoo"}
		};
	}
	@BeforeClass

	public void BC() throws IOException{
		rc.invokeBrowser("chrome");
	}
	@AfterClass

	public void AC(){
		rc.closeBrowser();
	}
	@Test(dataProvider = "dp")
	public void f(String URL,String title) {

		rc.getUrl(URL);
		Assert.assertEquals(driver.getTitle(), title );

	}
	 */

	public WebDriver driver;

	@BeforeClass
	@Parameters({"browserName","platform"})
	public void setup(String browserName,String platform) throws MalformedURLException{
		DesiredCapabilities cap;
		if (browserName.equalsIgnoreCase("firefox")){
			cap=DesiredCapabilities.firefox();
		}else if(browserName.equalsIgnoreCase("chrome")){
			cap=DesiredCapabilities.chrome();
		}else {
			cap = DesiredCapabilities.firefox();
			cap.setCapability("platform", platform);
		}
	}

	@AfterClass
	public void closeBrowser(){
		driver.close();
	}
	
	@DataProvider(name = "pages")

	public Object[][] pages(){
		return new  Object[][]{
				{"https://www.google.com","Google"},
				{"https://www.facebook.com","Welcome to Facebook - Log In, Sign Up or Learn More"},
				{"https://www.yahoo.com","Yahoo"}
		};
	}
	@Test(dataProvider = "pages")
	public void f(String URL,String title) {

		driver.get(URL);
		Assert.assertEquals(driver.getTitle(), title );

	}


}

