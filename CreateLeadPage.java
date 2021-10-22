package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods {
	
	
	public CreateLeadPage(ChromeDriver driver) {
		System.out.println("driver name" + driver);
		this.driver = driver;
		
		
	}
	
	public CreateLeadPage enterCompanyName(String company)
	{
		System.out.println("driver name" + driver);
		System.out.println("create lead page"+ driver);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		return this;
	}
	
	
	public CreateLeadPage enterFirstName(String fname)
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		return this;
	}
	
	
	public CreateLeadPage enterLastName(String lname)
	{
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		return this;
	}
	
	public CreateLeadPage enterPrimaryPhoneNumber()
	{
	
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("88");
		return this;
	}

	
	public ViewLeadsPage clickCreateLeadButton()
	{
	
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadsPage(driver);
	}

	


}
