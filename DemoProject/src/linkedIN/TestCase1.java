package linkedIN;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestCase1 {
		  wrapperMethodsTC1 wr=new wrapperMethodsTC1();
		    
  @Test
  public void f() throws IOException, InterruptedException {
	  String path="C:\\Users\\Lenovo\\Desktop\\loginTC.xlsx";
	  int count=wr.dataCount(path,0);
	  for (int i = 1; i < 3; i++) {
		  if(i==1)
		  {
		wr.invokeBrowser("firefox", "https://in.linkedin.com/nhome/");
		  }
		  else if(i==2)
		  {	  
		wr.invokeBrowser("chrome", "https://in.linkedin.com/nhome/");
	  }
		  else
		  {
			  wr.invokeBrowser("firefox", "https://in.linkedin.com/nhome/");
		  }
		String user_name = wr.readDataFromExcel1(path, 0, i, 0);
		String pwd_name = wr.readDataFromExcel1(path, 0, i, 1);
		String firstname=wr.readDataFromExcel1(path,0,i,2); 
		wr.findById("session_key-login", user_name);
		wr.findById("session_password-login", pwd_name);
		
		wr.clickbutton("signin");
		wr.verifyTitle("Welcome! | LinkedIn");
		//wr.verifyText("n fn field-text", firstname);
		wr.verifyFirstname("//div[@class='info']/h3/a", firstname);
		//wr.clickByXpath("//div[contains(@id,'account-sub-nav')]/../a", "Sign Out");
		wr.closeBrowser();
	}
  
  }
  

  
}
