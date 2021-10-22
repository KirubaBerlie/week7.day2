package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.ProjectSpecificMethods;

public class FindLeadsPage extends ProjectSpecificMethods {

	public FindLeadsPage(ChromeDriver driver) {
		this.driver = driver;

	}

	public FindLeadsPage clickPhoneTab() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return this;
	}

	public FindLeadsPage enterPhoneNumber(String phoneNumber) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNumber);
		return this;
	}

	public FindLeadsPage clickFindLeadsButton() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}

	public ViewLeadsPage clickOnFirstLeadID() throws InterruptedException

	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new ViewLeadsPage(driver);
	}
	
	public FindLeadsPage findByLeadID()
	
	{
		driver.findElement(By.name("id")).sendKeys(leadID);
		return this;
	
		
	}
	
	public void verifyDeleteLead()
	{
		String text = driver.findElement(By.className("x-paging-info")).getText();
	
		System.out.println(text);
		String expectedText = "No records to display";
		Assert.assertEquals(text, expectedText);
			
	}
	
	
	
	


}
