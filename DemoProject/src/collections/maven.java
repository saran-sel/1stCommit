package collections;

import org.openqa.selenium.chrome.ChromeDriver;

public class maven {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "E:\\TestLeaf-Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://google.co.in");
		driver.close();

	}

}
