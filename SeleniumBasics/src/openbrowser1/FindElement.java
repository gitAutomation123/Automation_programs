package openbrowser1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) {
		WebDriver driver=setUp("chrome","https://www.flipkart.com/");
		//driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("_1_3w1N")).click();
		driver.findElement(By.className("_2IX_2- VJZDxU")).sendKeys("suyog");
		//driver.findElement(By.className("_3AWRsL")).click();
	//	driver.findElement(By.id("loginButton")).click();
		
	}
		
	public static WebDriver setUp(String browserName, String appUrl) {
		WebDriver driver=null;
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appUrl);
		return driver;
			}

	}


