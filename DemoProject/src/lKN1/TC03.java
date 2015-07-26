package lKN1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;


public class TC03 {

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
	public void f() throws InterruptedException {
		wrap.clickByLink("Advanced");
		wrap.clickByXpath("//*[@id='advs']/div[1]/button");
		wrap.clickByXpath("//*[@id='pivot-bar']/ul/li[1]/button");
		wrap.clickByXpath("//*[@id='pivot-bar']/ul/li[2]/button");
		Thread.sleep(2000);
		wrap.compareTextUsingXpath("/html/body/div[3]/div/div[2]/div/div[5]/div/div/p/strong", "//*[@id='facet-N']/fieldset/div/ol/li[4]/div/span");
	}
	@AfterMethod
	public void afterMethod() {
		wrap.closeBrowser();

	}

}
