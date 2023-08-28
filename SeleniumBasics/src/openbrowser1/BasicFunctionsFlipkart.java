package openbrowser1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicFunctionsFlipkart {
  public static void main(String[] args) {
	  WebDriver driver=setUp("chrome");
	  driver.get("https://www.flipkart.com/");
	 String pagesource= driver.getPageSource();
	 System.out.println(pagesource.length());
	 System.out.println(driver.getTitle());
	 System.out.println(driver.getCurrentUrl());
	 System.out.println(driver.getTitle().length());
	 System.out.println(driver.getCurrentUrl().length());
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


