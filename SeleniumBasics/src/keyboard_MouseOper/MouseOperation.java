package keyboard_MouseOper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperation {

	public static void main(String[] args) {
	WebDriver driver=setUp("chrome","https://demo.automationtesting.in/Register.html");
	WebElement firstname=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
Actions act=new Actions(driver);
	//driver.sendKeys("admin");
	//act.doubleClick(firstname).build().perform();
	//act.contextClick(firstname).sendKeys(Keys.ARROW_DOWN);
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


