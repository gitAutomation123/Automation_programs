package webdrivermanagerexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.SeleniumUtil;

public class openfirefoxbrowser {

	public static void main(String[] args) {
WebDriver driver=	SeleniumUtil.setUp("chrome","https://www.facebook.com/" );
driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("999");
driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("99");
	
	
	}

}
