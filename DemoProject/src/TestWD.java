import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class TestWD {

	public static void main(String[] args) throws FileNotFoundException {

		FirefoxDriver driver = new FirefoxDriver();

		//url
		driver.get("url");
		driver.navigate().to("url");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//explicit wait and Exception handling
		try{
			Thread.sleep(1000);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("exception handled");
		}
		//Alert handling

		Alert a = driver.switchTo().alert();
		a.accept();
		a.dismiss();
		a.sendKeys("");
		a.getText();

		//Frames

		driver.switchTo().frame(driver.findElementByXPath(""));
		//to return main screen from frame
		driver.switchTo().defaultContent();
		//window handling(parent handle taking)

		String parent=	driver.getWindowHandle();
		//getting all window handle
		Set<String>handles =driver.getWindowHandles();
		//switching to last window
		for(String obj :handles){
			driver.switchTo().window(obj);
		}
		driver.switchTo().window(parent);
		
		//takescreenshot
		
		File obj= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(obj, new File("path"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//dropdown select
		
		Select drop = new Select(driver.findElementByName(""));
		drop.selectByIndex(0);
		drop.selectByValue("");
		drop.selectByVisibleText("");
		//Actions not Action--ok
		Actions action = new Actions(driver);
		WebElement x= driver.findElementById("");
		WebElement y= driver.findElementById("");
		action.dragAndDrop(x, y).build().perform();
		
		//excel read
		
		File file = new File("");
		FileInputStream fis = new FileInputStream("");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet= workbook.getSheetAt(0);
		XSSFRow row= sheet.getRow(0);
		System.out.println(sheet.getRow(0));
		
		//excel write
		
		File file1 = new File("");
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet1 = wb.createSheet("Yamini");
		XSSFRow row1 = sheet1.createRow(0);
		//we are writing a cell
		//dont put nin sysout
		//error will come
		row1.createCell(0).setCellValue("Saravanan");
		System.out.println("Writing successful");
		
		
		
		



	}

}
