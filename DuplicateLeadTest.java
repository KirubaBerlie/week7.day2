package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class DuplicateLeadTest extends ProjectSpecificMethods {
	
	
	
	@BeforeTest
	public void setFilename() {
		excelFileName ="DuplicateLead";

	}
	
	@Test(dataProvider="fetchData")
	public void runDuplicateLead(String uname, String password, String phoneNumber) throws InterruptedException
	
	
	{
		new LoginPage(driver)
		.enterUserName(uname)
		.enterPassword(password)
		.clickLoginButton()
		.clickCrmSfaLink()
		.clickLeadsLink()
		.clickFindLeadsLink()
		.clickPhoneTab()
		.enterPhoneNumber(phoneNumber)
		.clickFindLeadsButton()
		.clickOnFirstLeadID()
		.clickDuplicateLeadButton()
		.clickOnCreateLeadButton()
		.verifyDuplicateLead();
		
	}
	
	
	
	

}
