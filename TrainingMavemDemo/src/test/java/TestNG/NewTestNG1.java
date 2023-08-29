package TestNG;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.SeleniumUtil;
public class NewTestNG1 extends SeleniumUtil {
	WebDriver driver;
	@BeforeMethod
	public void startUp() {
		driver = setUp("chrome", "https://www.google.com/");
	}
	@Test(priority=1)
	public void testGoogleLandingPage() {
		String expectedTitle = "Google";
		String actualTitle = getCurrentPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Google Search page not opened or its title got changed");
	}
	@Test(priority=2)
	public void testSearch() {
		getActiveElementFromScreen().sendKeys("SQL", Keys.ENTER);
		Assert.assertTrue(getCurrentTitleOfApplication().contains("SQL"), "SQL search is failed");
	}
	private String getCurrentTitleOfApplication() {
		// TODO Auto-generated method stub
		return null;
	}
	//@AfterMethod
	//public void tearDown() {
		//cleanUp();
	///}
	//private void cleanUp() {
		// TODO Auto-generated method stub
		
	}
//}