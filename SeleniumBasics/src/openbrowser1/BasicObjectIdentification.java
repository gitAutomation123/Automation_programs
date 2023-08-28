package openbrowser1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicObjectIdentification {

	public static void main(String[] args) {
		WebDriver driver=setUp("chrome", "https://demo.actitime.com/login.do");
		//driver.get("https://demo.actitime.com/login.do");
		WebElement usernameInputField=driver.findElement(By.id("username"));
		usernameInputField.sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
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
