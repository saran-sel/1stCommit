package lKN1;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import collections.WrapperMethods;

public class Windowhandiling {
	static int i=10;

	public static void main(String[] args) {

		/*System.setProperty("webdriver.chrome.driver", "E:\\TestLeaf-Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("http://www.crystalcruises.com/");
		System.out.println(driver.getTitle());
		String parent =driver.getWindowHandle();
		driver.findElementByLinkText("GUEST CHECK-IN").click();
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Lenovo\\Desktop\\Snapshots\\Snap(i).jpeg"));
		i++;
		Set<String> handles =driver.getWindowHandles();
		for (String obj:handles){
			driver.switchTo().window(obj);
			File src1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src1, new File("C:\\Users\\Lenovo\\Desktop\\Snapshots\\Snap(i).jpeg"));
			i++;
		}
		System.out.println("The second window title is" +driver.getTitle());

		driver.findElementByName("txtFirstName").sendKeys("Saravanan");
		driver.switchTo().window(parent);
		File src2= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src2, new File("C:\\Users\\Lenovo\\Desktop\\Snapshots\\Snap(i).jpeg"));
		System.out.println("Came back to Parent window");
		i++;
		driver.quit();*/

		WrapperMethods rc = new WrapperMethods();
		rc.invokeBrowser("chrome");
		rc.getUrl("http://www.crystalcruises.com");
		rc.verifyTitleName("Page Title Verification Failed");
		String parent =rc.getparenthandle();
		rc.clickByLink("GUEST CHECK-IN");
		Set<String>  child =rc.getHandle();
		rc.switchLastWindow(child);
		String str =rc.dataFromExcel("C:\\Users\\Lenovo\\Desktop\\Snapshots\\excelSheet.xlsx", 3, 0, 0);
		rc.enterByName("txtFirstName", str);
		rc.verifyTitleName("Window Handing Failed");
		rc.switchParentWindow(parent);
		rc.verifyTitleName("Parent SCreen navigation failed");
		rc.closeBrowser();
		
		
































	}

}
