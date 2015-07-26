package linkedIN;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestCase2 {
  @Test
  public void Testcase2() throws IOException, InterruptedException {
	  Testcase2_wrap wm = new Testcase2_wrap();
	  Integer i;
	  String Url = "https://www.linkedin.com/nhome";
	 
	  for (i=1; i<3; i++){
		  
		  if( i==1) {
				String Browser="Firefox";	
		  		wm.invokeBrowser(Browser, Url);
		  }
		  else {
			  	String Browser="chrome";	
	  			wm.invokeBrowser(Browser, Url);
			
		  }
			
			
			String strUserName, strPassword;
			String xlPath = "C:\\Users\\Lenovo\\Desktop\\loginTC.xlsx";
			
			
			strUserName=wm.readDataFromExcel1(xlPath, 1, i, 0);
			strPassword=wm.readDataFromExcel1(xlPath, 1, i, 1);
			
			wm.enterTextById("session_key-login", strUserName);
			wm.enterTextById("session_password-login", strPassword);
			
			wm.clickbyid("signin");
			wm.clickbylinktext("Advanced");

		
			String strSearch;
			strSearch=wm.readDataFromExcel1(xlPath, 1, i, 2);
			System.out.println(strSearch);
			wm.enterTextById("advs-keywords", strSearch);
			wm.clickByClassName("submit-advs");
			Thread.sleep(30000);
			wm.gettext_fromxpath("//*[@id='results_count']/div/p/strong[1]");

			wm.gettext_fromxpath("//*[@id='results']/li[1]/div/h3/a");
			wm.gettext_fromxpath("//*[@id='results']/li[1]/div/h3/span/span/abbr");
	  
	  }
	 
  }
}
