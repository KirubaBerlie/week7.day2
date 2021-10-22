package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	
	public LoginPage(ChromeDriver driver) {
		this.driver = driver;
		
	}

	public LoginPage enterUserName(String uname) // action + ElementName

	{
		driver.findElement(By.id("username")).sendKeys(uname);
		return this;
	}

	public LoginPage enterPassword(String password)

	{
		driver.findElement(By.id("password")).sendKeys(password);
		return this;

	}

	public HomePage clickLoginButton()

	{
		driver.findElement(By.className("decorativeSubmit")).click();
//		HomePage hp = new HomePage();
//		return hp;
		return new HomePage(driver);
	}
}
