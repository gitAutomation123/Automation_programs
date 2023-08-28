package openbrowser1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementVtiger {

	public static void main(String[] args) {
	WebDriver driver=setUp("chrome");
	driver.get("https://demo.vtiger.com/vtigercrm/");
	driver.manage().window().maximize();
	driver.findElement(By.id("username"));//sendKeys("admin");
	driver.findElement(By.id("password"));//sendKeys("password");
	driver.findElement(By.className("button")).click();
	driver.navigate().back();
	driver.get("https://www.flipkart.com/");
	
	}
		
	public static WebDriver setUp(String browserName) {
			WebDriver driver=null;
			if(browserName.equalsIgnoreCase("chrome"));{
			System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		 driver=new ChromeDriver();
			}
			return driver;
			
	}

}
