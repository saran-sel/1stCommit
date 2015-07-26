package collections;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DP {

	@DataProvider(name = "dp")
	public Object[][] getDataFromDataprovider(){

		return new Object[][] {

				{ "Guru99", "India" },
		};
	}

	@Test(dataProvider= "dp")

	public void f(String author,String SearchKey) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\TestLeaf-Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://google.com");

		WebElement searchText = driver.findElement(By.name("q"));

		//Searching text in google text box
		System.out.println(searchText);
		searchText.sendKeys(SearchKey);

		System.out.println("Welcome ->"+author+" Your search key is->"+SearchKey);

		System.out.println("Thread will sleep now");

		Thread.sleep(3000);

		System.out.println("Value in Google Search Box = "+searchText.getAttribute("value") +" ::: Value given by input = "+SearchKey);

		//verifying the value in google search box

		Assert.assertTrue(searchText.getAttribute("value").equalsIgnoreCase(SearchKey));

		driver.close();
	}


	@Test(dataProvider= "dp")

	public void f1(String author,String SearchKey) throws InterruptedException {

		//	System.setProperty("webdriver.chrome.driver", "E:\\TestLeaf-Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://google.com");

		WebElement searchText = driver.findElement(By.name("q"));

		//Searching text in google text box
		System.out.println(searchText);
		searchText.sendKeys(SearchKey);

		System.out.println("Welcome ->"+author+" Your search key is->"+SearchKey);

		System.out.println("Thread will sleep now");

		Thread.sleep(3000);

		System.out.println("Value in Google Search Box = "+searchText.getAttribute("value") +" ::: Value given by input = "+SearchKey);

		//verifying the value in google search box

		Assert.assertTrue(searchText.getAttribute("value").equalsIgnoreCase(SearchKey));

		driver.close();
	}


}


