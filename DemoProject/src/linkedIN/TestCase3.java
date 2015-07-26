package linkedIN;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestCase3 {
	WrapperMethods wm = new WrapperMethods();
	@Test
	public void firefox() throws IOException, Exception {
		for (int i = 1; i < 3; i++) {


			if(i==1)
				wm.invokeBrowser("firefox","https://www.linkedin.com/uas/login?goback=&trk=hb_signin");
			else
				wm.invokeBrowser("chrome",
						"https://www.linkedin.com/uas/login?goback=&trk=hb_signin");

			wm.findById("session_key-login", wm.readDataFromExcel(
					"C:\\Users\\Lenovo\\Desktop\\loginTC.xlsx", 2, i, 0));
			wm.findById("session_password-login", wm.readDataFromExcel(
					"C:\\Users\\Lenovo\\Desktop\\loginTC.xlsx", 2, i, 1));
			wm.clickbutton("btn-primary");
			wm.verifyTitle("Sign In | LinkedIn");
			wm.clickByLink("Advanced");
			wm.clickByXpath("//*[@id='advs']/div[1]/button");
			wm.clickByXpath("//*[@id='pivot-bar']/ul/li[1]/button");
			wm.clickByXpath("//*[@id='pivot-bar']/ul/li[2]/button");
			String text1 = wm.getText("//*[@id='results_count']/div/p/strong");
			String text2 = wm.getText("//*[@id='facet-N']/fieldset/div/ol/li[3]/div/span");
			System.out.println(text1);
			System.out.println(text2);
			if (text1.contains(text2))
				System.out.println("resutls are same");
			else
				System.out.println("results are wrong");
			wm.closeBrowser();
		}

	}

}