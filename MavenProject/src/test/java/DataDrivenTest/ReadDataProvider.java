package DataDrivenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadDataProvider {
    
    static String driverPath = "C:\\Users\\GAYATRY\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe";
    
    @DataProvider(name="Testdata")
    public Object[][] getData()
    {
        Object[][] data = new Object[3][2];// 2 dimentional array rows and col
        //row 1 data
        data[0][0]="mngr294620";
        data[0][1]="ehYbydU";
        //row 2 data
        data[1][0]="mngr294620";
        data[1][1]="ehYbydU";
        //row 2 data
        data[2][0]="mngr294620";
        data[2][1]="ehYbydU";
        return data;
    }
    @Test(dataProvider="Testdata")
    public void Loginvalidation(String username, String password)
    {
        System.setProperty("webdriver.chrome.driver",driverPath);            
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/V4/");
        driver.findElement(By.name("uid")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("btnLogin")).click();
        driver.close();
    }

 

}
