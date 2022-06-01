package PageFactory;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageFactory.HomePage;
import PageFactory.LoginPage;

public class OHRMTest {
	
String driverPath ="D:\\firefoxdriver\\geckodriver.exe";
	
	WebDriver driver;
	
	LoginPage objLogin;
	
	HomePage objHomePage;
	
	@BeforeTest
	
	public void setup() {
		
		System.setProperty("webdriver.gecko.driver", driverPath);
		 
		 driver= new FirefoxDriver();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test(priority=0)
	
	public void test_Home_Page_Apper_Correct() {
		
		objLogin= new LoginPage(driver);
		
		objLogin.loginToOHRM("Admin", "admin123");
		
		objHomePage = new HomePage(driver);
		
		Assert.assertTrue(objHomePage.getHomePageDashboardUserName().matches("^Welcome.*"));
		
		driver.close();
	}
	
	

}