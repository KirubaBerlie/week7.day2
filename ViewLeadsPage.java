package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class ViewLeadsPage extends ProjectSpecificMethods {

	public ViewLeadsPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public void verifyNewLead() {
		boolean displayed = driver.findElement(By.xpath("//div[text()='View Lead']")).isDisplayed();
		if (displayed)
			System.err.println("New Lead created");
		else
			System.err.println("New Lead is NOT created");
	}

	public EditLeadPage clickOnEditButton()

	{
		driver.findElement(By.linkText("Edit")).click();
		return new EditLeadPage(driver);
	}

	public DuplicateLeadPage clickDuplicateLeadButton() {
		driver.findElement(By.linkText("Duplicate Lead")).click();
		return new DuplicateLeadPage(driver);
	}

	public ViewLeadsPage getLeadID()

	{
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		leadID = text.replaceAll("\\D", "");
		
		System.out.println(leadID);
		return this;
	}

	public MyLeadsPage clickDeleteLeadButton() {
		
	
		driver.findElement(By.linkText("Delete")).click();
		return new MyLeadsPage(driver);
	}

	public void verifyEditLead() {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		text = text.replaceAll("\\D", "");
		System.out.println(text);
	}

	public void verifyDuplicateLead() {

		System.out.println("test verifyDuplicateLead");
	}

}
