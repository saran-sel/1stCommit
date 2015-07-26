package lKN1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.Select;

public class WrapperMethods {
	XSSFWorkbook workbook;
	RemoteWebDriver driver;
	Actions action;
	int i=1;
	public void invokeBrowser1(String browserName, String url) throws MalformedURLException{


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
		driver=new RemoteWebDriver(new URL("http://10.244.13.76/wd/hub"), dc);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Maximize the browser
		driver.manage().window().maximize();

		// Step 2 : open the url
		// syntax to call a method in a class ( obj.methodname(); )
		driver.get(url);
	}

	/*
	 *	The below method is used to invoke browser (firefox,chrome,IE) and setup Implicit wait
	 *	for 30 seconds and maximise the browser
	 */

	public void invokeBrowser(String browserName, String url) throws IOException{

		if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "d:\\LocalData\\z007885\\Desktop\\Selenium\\drivers\\New driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "d:\\LocalData\\z007885\\Desktop\\Selenium\\drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Maximize the browser
		driver.manage().window().maximize();

		// Step 2 : open the url
		// syntax to call a method in a class ( obj.methodname(); )
		driver.get(url);
	}


	/*
	 *The below method is used to fetch data from excel (Username,Password etc..)
	 *	
	 */

	public String dataFromExcel(String path,int sheetPosition, int rownum, int cellnum) throws IOException {
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(sheetPosition);
		XSSFRow row = sheet.getRow(rownum);
		String text = row.getCell(cellnum).getStringCellValue();
		return text;
	}


	/*
	 *The below method is used to enter value in textbox using ID
	 *	
	 */
	public void enterByID(String ID, String text) throws Exception{
		driver.findElementById(ID).sendKeys(text);	
	}

	/*
	 *The below method is used to enter value in textbox using Name
	 *	
	 */
	public void enterByName(String name, String text) throws Exception{
		driver.findElementByName(name).sendKeys(text);	
	}


	/*
	 *The below method is used to verify the title and print the confirmation in console
	 *	
	 */

	public void verifyTitleName (String negative){
		String title =driver.getTitle();
		if (title.contains(title))
			System.out.println(title);
		else
			System.out.println(negative);
	}
	/*
	 *	The below method is used to get parent window handle
	 * 	and store it in some temporary variable
	 */
	public String getparenthandle(){
		String parent = driver.getWindowHandle();
		return parent;
	}

	/*
	 *	The below method is used to switch to parent window using parent window handle 
	 *	that is stored in temp variable (refer getparenthandle())
	 */
	public void switchParentWindow(String parent) throws IOException{
		driver.switchTo().window(parent);
	}

	/*
	 *	The below method is used to collect all window handles
	 * 	and store in some temporary variable
	 */
	public Set<String> getHandle(){
		Set <String> handles = driver.getWindowHandles();
		return handles;
	}
	/*
	 *The below method is used to switch to last window using for each statement.
	 *for each is used to iterate over the window and switch to last window
	 */
	public void switchLastWindow(Set <String> allhandles) throws IOException{
		for (String controls : allhandles){
			driver.switchTo().window(controls);
		}
	}
	/*
	 *	The below method is used to switch to frame using the frame element
	 *	(Xpath or Classname or using any locator.Here Classname is used)
	 */
	public void frameByElement(String classname){
		driver.switchTo().frame(driver.findElementByClassName(classname));
	}
	/*
	 * 	The below method is used to switch to frame using index value
	 *	(ie) if index value is given as 0 webdriver will switch to first frame
	 */
	public void firstFrame(int index){
		driver.switchTo().frame(index);
	}
	/*
	 *	The below method is used to accept the alert
	 *	(ie) it equals to click OK on the alert
	 */

	public void acceptAlert(){
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	/*
	 *	The below method is used to dismiss the alert
	 *	(ie) it equals to click CANCEL on the alert
	 */
	public void dismissAlert(){
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}
	/*
	 *	The below method is used to get text from webpage using link 
	 *	and printing the confirmation in console
	 */
	public void verifyTextUsingLink(String link,String positive,String negative) throws IOException{
		String text =driver.findElementByLinkText(link).getText();
		if(text.contains(text))
			System.out.println(positive);
		else
			System.out.println(negative);

	}
	/*
	 *	The below method is used to take screen shot and storing the file in local storage.
	 *	by using takescreenshot() under bottom of all methods it will take screen shot continuosly after evry method
	 */
	public void takescreenshot() throws IOException{
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(src, new File("C:\\Users\\Lenovo\\Desktop\\Snapshots\\Snap.jpeg"));
		} catch (IOException e) {
			
			throw new IOException();
		}

	}
	/*
	 *The below method is used to click the webelement using its Xpath
	 *	
	 */
	public void clickByXpath(String xpath){
		driver.findElementByXPath(xpath).click();
	}

	/*
	 *	The below method is used to click the webelement using its Link
	 *	
	 */
	public void clickByLink(String link){
		driver.findElementByLinkText(link).click();
	}
	/*
	 *	The below method is used to click the webelement using its ID
	 *	
	 */
	public void clickByID(String ID){
		driver.findElementById(ID).click();
	}
	/*
	 *	The below method is used to click the webelement using its Name
	 *	
	 */
	public void clickByName(String name){
		driver.findElementByName(name).click();
	}
	/*
	 *	The below method is used to click the weblement using CSS path
	 *	
	 */public void clickByCSS (String css){
		 driver.findElementByCssSelector(css).click();
	 }
	 /*
	  *	The below method is used to click on the dropdown field using its Name
	  *	and select the value using its value
	  */
	 public void selectDropDownName (String name, String value) throws IOException{
		 Select drop = new Select(driver.findElementByName(name));
		 drop.selectByValue(value);
	 }

	 /*
	  *	The below method is used to click on the dropdown field using its ID
	  *	and select the value using its value
	  */
	 public void selectDropDownID(String ID, String value) throws IOException{
		 Select drop = new Select(driver.findElementById(ID));
		 drop.selectByValue(value);
	 }


	 /*
	  *	The below method is used to clear the existing content in any textfield
	  *	
	  */
	 public void clearContent(String id){
		 driver.findElementById(id).clear();
	 }
	 /*
	  *	The below method is used to get text from webpage using classname 
	  *	and printing the confirmation in console
	  */
	 public void verifyText(String classname,String positive,String negative) throws IOException{
		 String S= driver.findElementByClassName(classname).getText();
		 if (S.equalsIgnoreCase(S)){
			 System.out.println(positive);
		 }
		 else{
			 System.out.println(negative);
		 }
	 }

	 /*
	  *	The below method is used to get text from webpage using ID 
	  *	and printing the confirmation in console
	  */
	 public void verifyTextUsingID (String ID,String print) throws Exception{
		 String D = driver.findElementById(ID).getText();
		 if (D.equalsIgnoreCase(D));
		 System.out.println(print);
	 }
	 /*
	  *	The below method is used to close the browser
	  *	
	  */
	 public void closeBrowser(){
		 driver.close();
	 }
	 /*
	  *	The below method is used to create the Header line in Excel
	  *	
	  */
	 public void createHeader(String sheetname,String cell1name,String cell2name,String cell3name, String excelpath  ) throws IOException {

		 XSSFWorkbook workbook = new XSSFWorkbook();
		 XSSFSheet sheet =	workbook.createSheet(sheetname);
		 XSSFRow row =	sheet.createRow(0);
		 row.createCell(0).setCellValue(cell1name);
		 row.createCell(1).setCellValue(cell2name);
		 row.createCell(2).setCellValue(cell3name);

		 File excel = new File(excelpath);
		 FileOutputStream fos = new FileOutputStream(excel);
		 workbook.write(fos);
		 fos.close();

	 }
	 /*
	  *	The below method is used to get element using ID and store in some temporary variable
	  *	
	  */
	 public WebElement getElementById(String id){

		 WebElement getele = driver.findElementById(id);
		 return getele;

	 }
	 /*
	  *	The below method is used to Drag and Drop an webelement
	  *	
	  */
	 public void dragAndDrop(WebElement source,WebElement target){
		 Actions action = new Actions(driver);
		 action.dragAndDrop(source, target).build().perform();

	 }
	 /*
	  *	The below method is used to get element using xpath and store in some temporary variable
	  *	
	  */

	 public WebElement findElementByXPath (String xpath1){
		 WebElement xpath =	driver.findElementByXPath(xpath1);
		 return xpath;

	 }
	 /*
	  *	The below method is used to create a reference for Actions class
	  *	
	  */
	 public void createAction(){
		 action = new Actions(driver);

	 }
	 /*
	  *	The below method is used to click and hold the webelement
	  *	 
	  */
	 public void actionsClickAndHold(WebElement a){
		 action.clickAndHold(a);
	 }
	 /*
	  *	The below method is used to click multiple items after clickandhold is done
	  *	
	  */
	 public void actionsClick(WebElement b){
		 action.click(b).release().build().perform();

	 }
	 /*
	  *	The below method is used to key press Up,Down and Enter Keys
	  *	
	  */
	 public void contextClick(String keysToSend){
		 Actions action = new Actions(driver);
		 
		

		 if (keysToSend.equalsIgnoreCase("down")){
			 action.contextClick().sendKeys(Keys.DOWN);

		 }else if (keysToSend.equalsIgnoreCase("up")){
			 action.contextClick().sendKeys(Keys.UP);

		 }else if (keysToSend.equalsIgnoreCase("enter")){
			 action.contextClick().sendKeys(Keys.ENTER);
		 }

	 }
	 

	 /*
	  *	The below method is used to verify the text presence using Xpath
	  *	
	  */
	 public void verifyTextByXpath(String locator,String positive,String negative)
	 {
		 String text = driver.findElementByXPath(locator).getText();
		 if (text.contains(text)){
			 System.out.println(text);
			 System.out.println(positive);
		 } else{
			 System.out.println(negative);

		 }
	 }

	 public String getText(String ID1)
	 {
		 String a= driver.findElementByXPath(ID1).getText();
		 return a;
	 }

	 //mouse Hover
	 public void hover(String xpath){
		 WebElement S =driver.findElementByXPath(xpath);
		 Actions action = new Actions(driver);
		 action.moveToElement(S).build().perform();
		 System.out.println("success");

	 }

	 /*
	  *	The below method is used to compare two text using its xpath
	  *	
	  */

	 public void compareTextUsingXpath(String xpath1,String xpath2){
		 String path1 = driver.findElementByXPath(xpath1).getText();
		 String path2 = driver.findElementByXPath(xpath2).getText();

		 System.out.println(path1);

		 System.out.println(path2);
	 }
	 
	 public void downPress(){
		 Actions action = new Actions(driver);
		 action.sendKeys(Keys. DOWN).build().perform();
		 
	 }
	 



}