package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OHRMHomePage {
	WebDriver driver;
	 By homePageUserName=By.id("welcome");
	 
	 public OHRMHomePage(WebDriver driver) {
		 this.driver=driver;
	 }
	 
	 public String getHomePageDashboardUserName() {
		 return driver.findElement(homePageUserName).getText();
	 }
}