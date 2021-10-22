package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class LoginLogout extends ProjectSpecificMethods {
	
	@Test
	public void runLogin(String uname, String password)
	{	
		//first action is available in this page
		LoginPage lp = new LoginPage(driver);
		lp.enterUserName(uname)
		.enterPassword(password)
		.clickLoginButton()
		.clickCrmSfaLink();
	
	}

}
