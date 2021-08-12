package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Actions {
	public static WebDriver driver;
	
	public static void scrollByElement(By xpath) {
		
		try {
			Thread.sleep(5000);
			WebElement element = driver.findElement(xpath);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);			

		} catch (Exception e) {
			
		}
	}

}
