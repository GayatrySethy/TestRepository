package DataDrivenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ReadXML {
    static String driverPath = "C:\\\\Users\\\\GAYATRY\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe";
    WebDriver driver;
   
    @Test()
    @Parameters({"sUsername", "sPassword"})
    public void login(@Optional("mngr412627")String sUsername,@Optional("jurUqUt") String sPassword) 
    {
       
        System.setProperty("webdriver.chrome.driver",driverPath);           
        driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/V4/");
        driver.findElement(By.name("uid")).sendKeys(sUsername);
        driver.findElement(By.name("password")).sendKeys(sPassword);
        driver.findElement(By.name("btnLogin")).click();
        System.out.println(driver.getTitle());
        
        driver.close();
       
    }
}