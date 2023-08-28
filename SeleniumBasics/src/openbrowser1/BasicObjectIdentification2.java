package openbrowser1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicObjectIdentification2 {

	public static void main(String[] args) {
		WebDriver driver=setUp("chrome","https://demo.automationtesting.in/Register.html");
		//driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.linkText("WebTable")).click();
		driver.navigate().back();
		//driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
		
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
	
		

	



