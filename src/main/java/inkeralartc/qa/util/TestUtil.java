package inkeralartc.qa.util;

import org.openqa.selenium.WebElement;

public class TestUtil {
	
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 10;
	
	public void clickWebElement(WebElement element) {
		if(element.isDisplayed() && element.isEnabled()) {
			System.out.println("The element "+element+ "is clicked successfully");
			element.click();
		} else
		{
			System.out.println("The element "+element+ "is not displayed. So not clickable");
		}
	}
	
	

}
