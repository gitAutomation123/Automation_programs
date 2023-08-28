package keyboard_MouseOper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardOperation {

	public static void main(String[] args) {
		WebDriver driver = setUp("chrome", "https://www.flipkart.com/");
		driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL,"r"));
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL, Keys.END));
		//driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL, Keys.HOME));
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


