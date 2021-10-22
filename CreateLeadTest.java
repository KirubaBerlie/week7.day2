package testcases;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class CreateLeadTest  extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setFilename() {
		excelFileName ="CreateLead";

	}
	
	@Test(dataProvider="fetchData")
	public void runCreateLead(String uname, String password, String company, String fname, String lname ) {
		
		LoginPage lp  = new LoginPage(driver);
		lp.enterUserName(uname)
		.enterPassword(password)
		.clickLoginButton()
		.clickCrmSfaLink()
		.clickLeadsLink()
		.clickCreateLeadsLink()
		.enterCompanyName(company)
		.enterFirstName(fname)
		.enterLastName(lname)
		.clickCreateLeadButton()
		.verifyNewLead();
//		new LoginPage()
//		.enterUserName()
//		.enterPassword()
//		.clickLoginButton()
//		;
//		
	}
	

}
