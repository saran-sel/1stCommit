package linkedIN;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.openqa.selenium.By;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;




public class Testcase2_wrap {
	RemoteWebDriver driver;
	XSSFWorkbook workbook;
	XSSFSheet Sheet;
	
	
	public void invokeBrowser(String browserName, String url)throws IOException{
	
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
		// Maximize the browser
		driver.manage().window().maximize();
		
		// Wait for 30 seconds
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// Step 2 : open the url
		// syntax to call a method in a class ( obj.methodname(); )
		driver.get(url);
		
	}
	
	public void enterTextById(String id, String value) throws IOException{
		

		try {
			driver.findElement(By.id(id)).clear();
			driver.findElement(By.id(id)).sendKeys(value);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			//updateWorkbook(filepath, sName, description, status);
			System.out.println("The element is not persent");
		}
		
		}
	
	public void enterTextByName(String name, String value) throws IOException{
		driver.findElementByName(name).sendKeys(value);
	}
	
	public void clickByClassName(String className) throws IOException{
		driver.findElement(By.className(className)).click();
	}
	
	public void clickBycssselector(String csspath) throws IOException{
		
		driver.findElementByCssSelector(csspath).click();
	}
	
	public void clickbytagname(String tagname) throws IOException{
		
		driver.findElementByTagName(tagname).click();
		
	}
	
	public void clickbyxpath(String xpath) throws IOException{
		
		driver.findElementByXPath(xpath).click();
		
	}
	
	public void clickbylinktext(String linktext) throws IOException{
		driver.findElementByLinkText(linktext).click();
	}
	
	public void clickbyid(String id) throws IOException{
		driver.findElementById(id).click();
	}
	
	
	
	public void select_byname(String name,String text)throws IOException{
		
		Select drop=new Select(driver.findElementByName(name));
		drop.selectByVisibleText(text);
	
	}
	
	public void select_byid(String id,String text)throws IOException{
		
		Select drop=new Select(driver.findElementById(id));
		drop.selectByVisibleText(text);
	
	}
	
	public void select_byxpath(String xpath,String text)throws IOException{
		
		Select drop=new Select(driver.findElementByXPath(xpath));
		drop.selectByVisibleText(text);
	
	}
	
public void select_index(String id,int index)throws IOException{
		
		Select drop=new Select(driver.findElementById(id));
		drop.selectByIndex(index);
	
	}
	
	
	public void closeAllBrowsers() throws IOException{
	
	
	
	driver.close();
	}
	
	public void parent_Whandle ()  throws IOException{
		String parentHandle=driver.getWindowHandle();
		
		System.out.println("The main window handle is :"+parentHandle);
	}
	
	public void getallwHandles() throws IOException{
	
	Set<String> winHandles = driver.getWindowHandles();
	
	System.out.println(winHandles.size());
	
	}
	
	public void switch_primarywindow(String parentHandle) throws IOException{
		
	
	driver.switchTo().window(parentHandle);
	}
	
	
		
	public String getPrimaryWindowHandle() throws IOException{
        String s = driver.getWindowHandle();
        return s;
      }
	

    
	public void switchlastWindow() throws IOException{
		
	Set<String>wHandles = driver.getWindowHandles();
	
	for(String wHandle:wHandles) {
		driver.switchTo().window(wHandle);
	}
	 System.out.println(driver.getTitle());
	}
	
	
	
	public void switch_framebyelement(String elenmentname) throws IOException{
		
		driver.switchTo().frame(driver.findElementByClassName(elenmentname));
	}
	
	public void switch_firstframe() throws IOException{
		
		 driver.switchTo().defaultContent();
		 driver.switchTo().frame(0);
		 
	}
		
		public void accept_alert() throws IOException{
		
		 Alert a = driver.switchTo().alert();
		
		 
		 a.accept();
		}
		
		public void dismiss_alert() throws IOException{
			
			 Alert a = driver.switchTo().alert();
			
			 
			 a.dismiss();
		}
		
		public  void verify_text(String xpath, String text) throws IOException{

         String xpathtext=driver.findElementByXPath(xpath).getText();
         
         if(xpathtext.equalsIgnoreCase(text))
        	 System.out.println("The text is same");
         else 
        	 System.out.println("The text is not same");
      
			
		}
		
		public  void gettext_fromxpath(String xpath) throws IOException{

	         String xpathtext=driver.findElementByXPath(xpath).getText();
	         System.out.println(xpathtext);
		}

		public  void verify_Title(String TitleGiven) throws IOException{

       String BrowserTitle= driver.getTitle();
         
         
         if(BrowserTitle.equalsIgnoreCase(TitleGiven))
        	 System.out.println("The Title is same");
         else 
        	 System.out.println("The Title is not same");
		}
		

		public  void verify_Url(String xpath, String Url) throws IOException{

         String xpathUrl=driver.findElementByXPath(xpath).getText();
         
         if(xpathUrl.equalsIgnoreCase(Url))
        	 System.out.println("The Url is same");
         else 
        	 System.out.println("The Url is not same");
		}
         
		public void Screenshot() throws IOException{

		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Siva\\Desktop\\TestLeaf-Selenium\\Snap.jpg"));
		
}
		//To create workbook,sheet,header
		
		public void createWorkbook(String sName,String stepNo, String description, String status,String snapshot,String filepath) throws IOException{
			workbook=new XSSFWorkbook();
	        Sheet=workbook.createSheet(sName);
			XSSFRow row=Sheet.createRow(0);
			
			row.createCell(0).setCellValue(stepNo);
			row.createCell(1).setCellValue(description);
			row.createCell(2).setCellValue(status);
			row.createCell(3).setCellValue(snapshot);
			
			saveReport( filepath);
			
		}
         
		  //To update the existing workbook
		
		public void updateWorkbook(String filepath,String sName,String description,String status) throws IOException{
			
			workbook=new XSSFWorkbook(new FileInputStream(new File(filepath)));
			Sheet=workbook.getSheet(sName);
			int lastrownum=Sheet.getLastRowNum();
			XSSFRow row=Sheet.createRow(lastrownum+1);
			row.createCell(0).setCellValue(lastrownum+1);
			row.createCell(1).setCellValue(description);
			row.createCell(2).setCellValue(status);
			saveReport(filepath);
		}
	
		//To save the excelfile
		
		
		public void saveReport(String filepath) throws IOException{
			
			
			FileOutputStream fos=new FileOutputStream(new File(filepath));
			
			workbook.write(fos);
			fos.close();
		}
		
		
		
		//To fetch data from the workbook
		
		public String fetchdata(String filepath,String sName) throws IOException{
			
			workbook=new XSSFWorkbook(new FileInputStream(new File(filepath)));
			Sheet=workbook.getSheet(sName);
			XSSFRow row=Sheet.getRow(0);
			String searchp=row.getCell(0).getStringCellValue();
			return searchp;
			
					
			
		}
		

		public String fetchalldata(String filepath,String sName,int row,int column) throws IOException{
			
			workbook=new XSSFWorkbook(new FileInputStream(new File(filepath)));
			Sheet=workbook.getSheet(sName);
			XSSFRow newrow=Sheet.getRow(row);
			
			String searchvalue=newrow.getCell(column).getStringCellValue();
			return searchvalue;
					
			
		}
			
			
			
			
		
		
		public int fetchnumericdata(String filepath,String sName) throws IOException{
			
			workbook=new XSSFWorkbook(new FileInputStream(new File(filepath)));
			Sheet=workbook.getSheet(sName);
			XSSFRow row1=Sheet.getRow(1);
			int selectp= (int) row1.getCell(0).getNumericCellValue();
			return selectp;
			
		}
		
		//To select product through index
		public void getproductusingindex(String xpath, int index) throws IOException{
			
			List <WebElement> mobiles	= driver.findElementsByXPath(xpath);
			
			System.out.println(mobiles.size());
			
			
			mobiles.get(index).click();
		}
	
		
		public String readDataFromExcel1(String path,int sheetPosition, int row1, int cell1) {
			File file = new File(path);
			FileInputStream fis = null;
			try {
				fis = new FileInputStream(file);
			} 
			catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				workbook = new XSSFWorkbook(fis);
			} 
			catch (IOException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
			}
			        
			XSSFSheet sheet = workbook.getSheetAt(sheetPosition);
			XSSFRow row = sheet.getRow(row1);
			String text = row.getCell(cell1).getStringCellValue();
			return text;
		
		}

}




