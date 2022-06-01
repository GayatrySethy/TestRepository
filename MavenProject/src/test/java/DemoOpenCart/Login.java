package DemoOpenCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	static String driverPath = "C:\\Users\\GAYATRY\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe";
	WebDriver driver;

	@Test
	public void loginOpenCart() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("gocom");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("123");
		driver.findElement(
				By.xpath("//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]"))
				.click();

		System.out.println(driver.getTitle());
	}

}
