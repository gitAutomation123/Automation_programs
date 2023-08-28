package openbrowser1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericWayToOpen {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		//implicit wait will wait to 30 second to load the screen before it giving exception. 
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

String h=driver.getCurrentUrl();
System.out.println(h);
String y=driver.getTitle();
System.out.println(y);

//checking editable/displayed and default value.
WebElement o=driver.findElement(By.id("username"));//why there is need to use web element.
System.out.println(o.isDisplayed());
System.out.println(o.isEnabled());
System.out.println(o.getAttribute("placeholder"));

//to logine any browser.
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
driver.findElement(By.id("loginButton")).click();

//explicit wait
WebDriverWait wait=new WebDriverWait(driver,10);
String expectedTitle="actiTIME - Enter Time-Track";
wait.until(ExpectedConditions.titleIs(expectedTitle));
System.out.println("titleafterlogin ="+driver.getTitle());

//move to the another url
driver.navigate().to("https://www.demoblaze.com/");

//multiple element handling
List<WebElement> deviceList=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));	//print count of identify devices
System.out.println("Device count: "+deviceList.size());
WebElement firstdevice= deviceList.get(0);
String devicename=firstdevice.getText();
System.out.println(devicename);
for(int i=0;i<deviceList.size();i++) {
	System.out.println(deviceList.get(i).getText());
}
//move to another url
driver.navigate().to("https://demo.automationtesting.in/Register.html");

// standard dropdown handling
WebElement skillDropdown=driver.findElement(By.id("Skills"));
Select droplist=new Select(skillDropdown);
System.out.println(droplist.isMultiple());
System.out.println(droplist.getFirstSelectedOption().getText());
System.out.println(droplist.getOptions().size());
for(int i=0;i<droplist.getOptions().size();i++) {
	System.out.println(droplist.getOptions().get(i).getText());
}
	//droplist.selectByVisibleText("Adobe Photoshop");
	droplist.selectByIndex(40);
	System.out.println("selected option is="+droplist.getFirstSelectedOption().getText());
	
//custom dropdown handling
driver.navigate().to("https://thompsonsj.com/bootstrap-select-dropdown/");
driver.findElement(By.id("bsd1-button")).click();
List<WebElement> select=driver.findElements(By.cssSelector(".dropdown-menu.show>div>a"));
System.out.println(select.size());
for(int i=0;i<select.size();i++) {
	System.out.println(select.get(i).getText());
}
	select.get(21).click();
}
}
	


