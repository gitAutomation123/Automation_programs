package openbrowser1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicFunctions {

	public static void main(String[] args) {

		WebDriver driver=setUp("chrome");
        driver.get("https://www.google.com");
        String pageTitle = driver.getTitle();
        System.out.println("Current page title: " + pageTitle);
        System.out.println("Page title char count: " + pageTitle.length());
        String pageUrl = driver.getCurrentUrl();
        System.out.println("Current page url: " + pageUrl);
		System.out.println("Page url char count: " + pageUrl.length());
		//driver.close();
	}
		
	public static WebDriver setUp(String browserName) {
			WebDriver driver = null;
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			return driver;
		}
	

	

}
