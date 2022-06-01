package POM;

import java.time.Duration;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class OHRMTest {
	String driverPath="C:\\\\Users\\\\GAYATRY\\\\OneDrive\\\\Desktop\\\\selenium\\\\geckodriver-v0.31.0-win64\\\\geckodriver.exe";
	
	WebDriver driver;
	
	OHRMLoginPage objLogin;
	OHRMHomePage objHome;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", driverPath);
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test
	public void testHomePageAppearCorrect() {
		objLogin = new OHRMLoginPage(driver);
		objLogin.loginToOHRM("Admin","admin123");
		objHome = new OHRMHomePage(driver);
		
		Assert.assertTrue(objHome.getHomePageDashboardUserName().matches("^Welcome [A-z|a-z]+"));
		
		//driver.close();
	}
}