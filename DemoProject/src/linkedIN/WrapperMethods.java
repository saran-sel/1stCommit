package linkedIN;

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
import org.openqa.selenium.support.ui.Select;

public class WrapperMethods {
	XSSFWorkbook workbook;
	RemoteWebDriver driver;
	Actions action;
	int i=1;
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
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Maximize the browser
		driver.manage().window().maximize();

		// Step 2 : open the url
		// syntax to call a method in a class ( obj.methodname(); )
		driver.get(url);
	}

	//to enter value in textbox by using ID 

	public void findById(String ID, String USPW) throws Exception{
		driver.findElementById(ID).sendKeys(USPW);	
		try {
			takescreenshot();
		} catch (IOException e) {
			throw  new Exception("Input ouput Exception");
		}finally{

		}
	}

	//to click the button by using xpath

	public void clickByXpath(String xpath){
		driver.findElementByXPath(xpath).click();

	}

	//to get parent window handle.

	public String getparenthandle(){
		String parent = driver.getWindowHandle();
		return parent;
	}

	//to switch to parent window

	public void switchParentWindow(String parent) throws IOException{
		driver.switchTo().window(parent);


	}

	//to switch to lastwindow (getting all handles)

	public Set<String> getHandle(){
		Set <String> handles = driver.getWindowHandles();
		return handles;
	}


	//to switch to last window (switching )

	public void switchLastWindow(Set <String> allhandles) throws IOException{
		for (String controls : allhandles){
			driver.switchTo().window(controls);

		}
	}


	//to switch to frame by element

	public void frameByElement(String classname){
		driver.switchTo().frame(driver.findElementByClassName(classname));
	}
	// to switch to first frame

	public void firstFrame(int index){
		driver.switchTo().frame(index);
	}

	//to accept the alert

	public void acceptAlert(){
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	//to dismiss the alert

	public void dismissAlert(){
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}

	//to verify the text using link

	public void verifyTextOnPage(String link, String text) throws IOException{
		driver.findElementByLinkText(link).getText().contains(text);
		takescreenshot();
	}

	// to take a screen shot

	public void takescreenshot() throws IOException{
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
			try {
				FileUtils.copyFile(src, new File("C:\\Users\\Lenovo\\Desktop\\Snapshots\\Snap1.jpeg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				throw new IOException();
			}
			
	}
	
	

	public void clickByLink(String link){
		driver.findElementByLinkText(link).click();
	}

	//to click image using ID

	public void clickImage(String ID){
		driver.findElementById(ID).click();
	}

	//to click using ID

	public void clickbutton(String ID){
		driver.findElementById(ID).click();
	}

	//to click using name

	public void clickButtonName(String name){
		driver.findElementByName(name).click();
	}


	//to click image using CSS path

	public void imageClickUsingCSS (String css){
		driver.findElementByCssSelector(css).click();
	}

	//to select the drop down name 
	public void selectDropDownName (String name, String value) throws IOException{
		Select drop = new Select(driver.findElementByName(name));
		drop.selectByValue(value);
		takescreenshot();
	}

	//to clear the existing content
	public void clearContent(String id){
		driver.findElementById(id).clear();
	}

	//to verify the text using class name
	public void verifyText(String classname,String desiredtext) throws IOException{
		String S= driver.findElementByClassName(classname).getText();
		if (S.equalsIgnoreCase(desiredtext));
		takescreenshot();
		System.out.println("Lead Accounnt Created Successfully");
	}

	//to verify text using ID
	public void verifyTextUsingID (String ID,String verifytext,String print) throws Exception{
		String D = driver.findElementById(ID).getText();
		if (D.equalsIgnoreCase(verifytext));
		try{
		takescreenshot();
		}catch(Exception e){
			throw new Exception("I/O Exception");
		}
		System.out.println(print);
	}


	// close browser

	public void closeBrowser(){
		driver.close();
	}

	//to findByName

	public void findByName(String name,String text) {
		driver.findElementByName(name).sendKeys(text);
		try {
			takescreenshot();
		} catch (Exception e) {
			
		}
		finally{
			System.out.println("Go through this Method");
		}

	}		
	//to read data from excel to send keys
	public String readDataFromExcel(String path,int sheetPosition,int username,int password) {
		File file = new File(path);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFWorkbook workbook = null;
		try {
			workbook = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFSheet sheet = workbook.getSheetAt(sheetPosition);
		XSSFRow row = sheet.getRow(0);
		
		String cellValue = row.getCell(0).getStringCellValue();
		return cellValue;
	}

	// to create header line in Excel sheet

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

	//to find element by ID and store in some temp variable

	public WebElement getElementById(String id){

		WebElement getele = driver.findElementById(id);
		return getele;

	}

	// to drag and drop web elements

	public void dragAndDrop(WebElement source,WebElement target){
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).build().perform();

	}

	// to select multiple contents using ctrl key

	public WebElement findElementByXPath (String xpath1){
		WebElement xpath =	driver.findElementByXPath(xpath1);
		return xpath;

	}

	public void createAction(){
		action = new Actions(driver);

	}

	public void actionsClickAndHold(WebElement a){
		action.clickAndHold(a);
	}
	public void actionsClick(WebElement b){
		action.click(b).release().build().perform();
	}

	
	//to use Up, Down,Enter keys 
	
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
	
	public void verifyTitle(String etitle)
    {
            String atitle = driver.getTitle();
            if(etitle.contains(atitle))
                    System.out.println("title is correct");
            else
                    System.out.println("title is wrong");
    
    }
    
    public void verifyTextByXpath(String locator, String etext)
    {
            String atext = driver.findElementByXPath(locator).getText();
            if (atext.contains(etext))
                    System.out.println("text is correct");
            else
                    System.out.println("text is wrong");
            
    }
    
    public String getText(String ID1)
    {
    String a= driver.findElementByXPath(ID1).getText();
    return a;
    }

	
}