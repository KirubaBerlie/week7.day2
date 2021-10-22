package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods {

	
	public EditLeadPage(ChromeDriver driver) {
		this.driver = driver;
		
	}
	
	public EditLeadPage updateCompanyName(String cname)
	{
		
		WebElement updateCompany = driver.findElement(By.id("updateLeadForm_companyName"));
		updateCompany.clear();
		updateCompany.sendKeys(cname);
		return this;
		
	}
	
	public ViewLeadsPage clickonUpdateButton()
	{
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadsPage(driver);
	}
}
	
	


