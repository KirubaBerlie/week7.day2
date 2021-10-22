package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods {
	
	
	
	public MyLeadsPage(ChromeDriver driver) {
		this.driver = driver;
		
	}
	public CreateLeadPage clickCreateLeadsLink() // action + ElementName

	{
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(driver);
	}
	
	public FindLeadsPage clickFindLeadsLink() // action + ElementName

	{
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadsPage(driver);
	}


}
