package lKN1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TC01 {
	
	WrapperMethods wrap = new WrapperMethods();
	@BeforeMethod
	public void beforeMethod() throws Exception {

		wrap.invokeBrowser("firefox", "http://linkedin.com");

		wrap.enterByID("session_key-login",	wrap.dataFromExcel("D:\\LocalData\\z007885\\Desktop\\linkedIN\\TestData.xlsx", 0, 1, 0));
		wrap.enterByID("session_password-login",wrap.dataFromExcel("D:\\LocalData\\z007885\\Desktop\\linkedIN\\TestData.xlsx", 0, 1, 1));
		wrap.verifyTextUsingID("signin", "The Signin Button is Present");
		wrap.clickByID("signin");
		//wrap.hover("//*[@id='img-defer-id-1-16101']");
	}

	@Test
	public void f() throws InterruptedException {

		wrap.verifyTitleName("The title is incorrect");
		Thread.sleep(2000);
	}

	@AfterMethod
	public void afterMethod() {
		wrap.closeBrowser();
	}
}
