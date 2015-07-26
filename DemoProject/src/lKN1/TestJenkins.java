package lKN1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestJenkins {
	@Test
	public void testJenkins(){
		
		System.out.println("Welcome to Jenkins World");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.co.in");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
