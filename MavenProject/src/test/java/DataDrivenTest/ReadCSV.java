package DataDrivenTest;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import au.com.bytecode.opencsv.CSVReader;

public class ReadCSV {
    static String driverPath = "C:\\Users\\GAYATRY\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe";
    public static void main(String[] args) throws IOException, CsvException, InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.gecko.driver",driverPath);           
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demo.opencart.com/");
       
        CSVReader reader = new CSVReader(new FileReader(""));
        
         // this will load content into list
          List<String[]> li=reader.readAll();
          System.out.println("Total rows that we have is "+li.size());
                   
         // create Iterator reference
          Iterator<String[]>i1= li.iterator();
           
         // Iterate all values
         while(i1.hasNext()){
             String[] str=i1.next();
        
             driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
             driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
             driver.findElement(By.name("email")).sendKeys(str[0]);
             driver.findElement(By.name("password")).sendKeys(str[1]);
             driver.findElement(By.xpath("//input[@type='submit']")).click();
             Thread.sleep(3000);
             driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
             driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
         }      
         driver.close();
        }
        
    }
