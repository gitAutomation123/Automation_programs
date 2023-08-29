package swtichExample;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtil;

public class Example2 {

	public static void main(String[] args) {
		WebDriver driver=SeleniumUtil.setUp("chrome", "https://demo.actitime.com/login.do");
		
		//get active element from the application		
		WebElement element=SeleniumUtil.getActiveElementFromScreen();
		String activeElementPlaceholderValue=SeleniumUtil.getAttributeForElement(element, "placeholder");
		System.out.println("Is mouse pointer available in username input field? "+
				activeElementPlaceholderValue.equals("Username"));	
		//check keyboard events, type admin and press TAB button
		SeleniumUtil.typeInput(element, "admin");
		element.sendKeys(Keys.TAB);
		//now contril will be in password field, type manager and press ENTER button
		SeleniumUtil.typeInput(SeleniumUtil.getActiveElementFromScreen(), "manager");
		SeleniumUtil.getActiveElementFromScreen().sendKeys(Keys.ENTER);

	}

}
/**
open actitime and validate-
	1. by default mouse pointer is in username input field
	2. check keyboard events are mapped properly or not


*/