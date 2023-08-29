package webdrivermanagerexamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtil;

public class EditV_tiger {

	public static void main(String[] args)  throws InterruptedException  {
		WebDriver driver = SeleniumUtil.setUp("Chrome","https://demo.vtiger.com/vtigercrm/");
		
 String expectedTitle = "vtiger";
String actutalTitle = driver.getTitle();
	if (actutalTitle.equals(expectedTitle)) {
	System.out.println("Login page validation is passed");
	} else {
	System.out.println("Login page validation is failed");
		}
	//validate username and pass and click button
	 driver.findElement(By.id("username"));
	WebElement pass = driver.findElement(By.id("password"));
	 driver.findElement(By.className("button")).click();
	
	//click on menu bar and select contact
	 driver.findElement(By.xpath("/html/body/div/nav/div[1]/div/div[1]/div/div[1]")).click();
    Thread.sleep(1000);
  driver.findElement(By.className("app-menu-items-wrapper")).click();
   Thread.sleep(4000);
	 driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/li[3]/a/span[1]/i")).click();
	 driver.findElement(By.xpath("//*[@id=\"Contacts_listView_basicAction_LBL_ADD_RECORD\"]")).click();
	driver.findElement(By.id("Contacts_editView_fieldName_lastname")).sendKeys("suyog");
	 Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\"EditView\"]/div[3]/div/div/button")).click();

	//back to open contact for search
	 driver.findElement(By.xpath("/html/body/div/nav/div[1]/div/div[1]/div/div[1]")).click();
	 driver.findElement(By.className("app-menu-items-wrapper")).click();
	 driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/li[3]/a/span[1]/i")).click();
	 
	 driver.findElement(By.xpath("//*[@id=\"listViewContent\"]/div/div[3]/div[2]/table/thead/tr[2]/th[3]/div/input")).sendKeys("suyog");
	 driver.findElement(By.className("btn-success")).click();
	 Thread.sleep(4000);
	
	 
	  driver.findElement(By.xpath("//*[@id=\"listViewContent\"]/div/div[3]/div[2]/table/thead/tr[1]/th[1]/div/div[1]/span/input")).click();
	//  Actions act=new Actions(driver);
	//  act.doubleClick();
	 // Thread.sleep(4000);
	//  driver.findElement(By.id("Contacts_listView_massAction_LBL_EDIT")).click();
	//  driver.findElement(By.id("Contacts_editView_fieldName_mobile")).sendKeys("999");
	//  driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/li[3]/a/span[1]/i")).click();
	 
	 
	/*driver.findElement(By.xpath("/html/body/div[1]/nav/div[1]/div/div[4]/ul/li")).click();
	Thread.sleep(4000);
	driver.findElement(By.cssSelector("span[class='quick-create-module']")).click();
	Thread.sleep(4000);
	//driver.findElement(By.id("Contacts_editView_fieldName_firstname")).sendKeys("SUYOG");
	//Thread.sleep(4000);
	//driver.findElement(By.id("Leads_editView_fieldName_lastname")).sendKeys("NIMBHORKAR");
	Thread.sleep(4000);
	WebElement o = driver.findElement(By.id("Contacts_editView_fieldName_firstname"));
	o.sendKeys("suyog");
	
	//driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/form/div[3]/center/button[2]")).click();
	*/
	
	
	

	
	
	}

	}
