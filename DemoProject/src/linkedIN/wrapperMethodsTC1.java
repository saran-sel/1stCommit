package linkedIN;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class wrapperMethodsTC1 {
	RemoteWebDriver driver;
	Actions action;
	XSSFWorkbook workbook;
	public void invokeBrowser(String browserName, String url) throws MalformedURLException{
	

		DesiredCapabilities dc=new DesiredCapabilities();
		  
		if (browserName.equalsIgnoreCase("Firefox")) {
			  
			  dc.setBrowserName("firefox");
			  dc.setPlatform(Platform.WINDOWS);
			  
//			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Chrome")) {
			
			  
			  dc.setBrowserName("chrome");
			  dc.setPlatform(Platform.WINDOWS);
			  
/*			System.setProperty("webdriver.chrome.driver", "F:\\Selenium_project\\Projectreport\\data\\chromedriver.exe");
			driver = new ChromeDriver();*/
		} else if (browserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "E:\\TestLeaf-Selenium\\drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		// Wait for 30 seconds
				// Step 2 : open the url
		// syntax to call a method in a class ( obj.methodname(); )
		driver=new RemoteWebDriver(new URL("http://10.0.0.162:4444/wd/hub"), dc);
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Maximize the browser
		driver.manage().window().maximize();
	}

	//passing value
	public void findById(String ID, String USPW) {
	
			driver.findElementById(ID).sendKeys(USPW);	
	
}
//clicking button
	public void clickbutton(String ID){
		driver.findElementById(ID).click();
	}	

	//Verify title
	public void verifyTitle(String etitle)
	{
		String atitle = driver.getTitle();
		System.out.println(atitle);
		if(etitle.contains(atitle))
			System.out.println("title is correct");
		else
			System.out.println("title is wrong");
	
	}
	
	//to verify the text using class name
	public void verifyText(String classname,String desiredtext) throws IOException{
		String S= driver.findElementByClassName(classname).getText();
		if (S.equalsIgnoreCase(desiredtext));
			System.out.println("First Name Verified Successfully");
	}
	//to click the button by using xpath

	public void clickByXpath(String xpath,String sign) throws InterruptedException{
		Thread.sleep(3000);
		
		 driver.findElementByXPath(xpath).click();
//		createAction();
	//	moveelement(s);
		 clickByLink(sign);

	}

	public void verifyFirstname(String xpath,String desiredtext)
	{
		String S= driver.findElementByXPath(xpath).getText();
		System.out.println(S);
				if (S.contains(desiredtext))
					
		System.out.println("First Name Verified Successfully");
				else
					System.out.println("First name is incorrect");
}		

	public void clickByLink(String link){
		driver.findElementByLinkText(link).click();
	}

	public void createAction(){
		action = new Actions(driver);
		
	} 

	public void moveelement(WebElement a) throws InterruptedException{
		action.moveToElement(a);
		Thread.sleep(3000);
	}
	
	// to read username and password from excel
	public String readDataFromExcel1(String path,int sheetPosition, int row1, int cell1) {
	        File file = new File(path);
	        FileInputStream fis = null;
	try {
	fis = new FileInputStream(file);
	} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	        try {
	workbook = new XSSFWorkbook(fis);
	} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	        XSSFSheet sheet = workbook.getSheetAt(sheetPosition);
	        XSSFRow row = sheet.getRow(row1);
	        String text = row.getCell(cell1).getStringCellValue();
	        return text;

	}

	public  int dataCount(String path,int sheetPosition) {
        File file = new File(path);
        FileInputStream fis = null;
try {
fis = new FileInputStream(file);
} catch (FileNotFoundException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
        try {
workbook = new XSSFWorkbook(fis);
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
        XSSFSheet sheet = workbook.getSheetAt(sheetPosition);
        int c=sheet.getLastRowNum();
        return c;

}

	// close browser

		public void closeBrowser(){
			driver.close();
		}

//Getting data from Excel
}
