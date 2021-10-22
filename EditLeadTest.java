package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class EditLeadTest  extends ProjectSpecificMethods {
	
	
	@BeforeTest
	public void setFilename() {
		excelFileName ="EditLead";

	}
	
	@Test(dataProvider="fetchData")
	public void runEditLead(String uname, String password, String phoneNumber, String cname) throws InterruptedException
	
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
		.clickOnEditButton()
		.updateCompanyName(cname)
		.clickonUpdateButton()
		.verifyEditLead();
		
	}

}
