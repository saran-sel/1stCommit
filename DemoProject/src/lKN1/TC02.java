package lKN1;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TC02 {
	
	WrapperMethods wrap = new WrapperMethods();
	
	@BeforeMethod
	public void beforeMethod() throws Exception {

		wrap.invokeBrowser("firefox", "http://linkedin.com");
		wrap.enterByID("session_key-login",	wrap.dataFromExcel("D:\\LocalData\\z007885\\Desktop\\linkedIN\\TestData.xlsx", 0, 1, 0));
		wrap.enterByID("session_password-login",wrap.dataFromExcel("D:\\LocalData\\z007885\\Desktop\\linkedIN\\TestData.xlsx", 0, 1, 1));
		wrap.verifyTextUsingID("signin", "The Signin Button is Present");
		wrap.clickByID("signin");
	}

	@Test
	public void f() throws IOException, Exception {
		for (int i=1; i<2; i++){
			wrap.clickByLink("Advanced");
			wrap.enterByID("advs-keywords", wrap.dataFromExcel("D:\\LocalData\\z007885\\Desktop\\linkedIN\\TestData.xlsx", 1, i, 0));
		}
		wrap.clickByName("submit");
		wrap.verifyTextByXpath("//*[@id='results_count']/div/p/strong[1]", "The no of results match 1,370,562 ", "Incorrect results");
		wrap.verifyTextUsingLink("Subbu Subramanian", "The displayed name is Subbu Subramanian", "Incorrect name");
		wrap.verifyTextByXpath("//*[@id='results']/li[1]/div/h3/span/span/abbr", "Subbu Subramanian is a 2nd degree contact", "KO");
		
		wrap.clickByID("img-defer-id-1-35340");
		wrap.clickByLink(" Sign Out ");

	}


	@AfterMethod
	public void afterMethod() {
	}

}
