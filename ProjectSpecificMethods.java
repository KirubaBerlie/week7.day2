package base;

import utils.ReadExcel;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethods {

	public ChromeDriver driver;
	public static String leadID;
	public String excelFileName;

	@BeforeMethod
	public void preCondition() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("driver name" + driver);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterMethod
	public void postCondition() {
		driver.close();
	}

	@DataProvider(name = "fetchData")
	public String[][] sendData() throws IOException {

		return ReadExcel.readData(excelFileName);

	}
}
