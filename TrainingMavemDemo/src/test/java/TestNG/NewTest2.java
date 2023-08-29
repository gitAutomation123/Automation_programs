package TestNG;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.SeleniumUtil;
public class NewTest2 extends SeleniumUtil{
	static WebDriver driver;
	@Test(priority=1)
	public void openBrowserAndAppURL() {		
		driver=setUp("chrome","https://demo.actitime.com/login.do");
		//validation login page opened or not
		String actualLoginPageTitle=getCurrentPageTitle();
		String expectedLoginPageTitle="actiTIME - Login";
		//System.out.println("Login page validation: "+actualLoginPageTitle.equals(expectedLoginPageTitle));
		Assert.assertEquals(actualLoginPageTitle, expectedLoginPageTitle,"Either login page not opened or page title got changed");
	}
	@Test(priority=2)
	public void validateLoginPageComponent() {
		WebElement userNameInputField=driver.findElement(By.name("username"));
		Assert.assertTrue(userNameInputField.isDisplayed(), "Username field is not displayed");
	}
	
	@Test(priority=3)
	public void loginInToApplication() {
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
		String actualLoginPageTitle=getCurrentPageTitle("actiTIME - Enter Time-Track");
		String expectedLoginPageTitle="actiTIME - Enter Time-Track";
		Assert.assertEquals(actualLoginPageTitle, expectedLoginPageTitle,"Either Home page not opened or page title got changed");
	}
}