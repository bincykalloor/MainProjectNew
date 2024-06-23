package Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtilities {
	public static void clickOnElement(WebElement element) {
		element.click();	
		}
		
		public static void enterText(WebElement element,String value) {
			element.sendKeys(value);
		}
		public static String getElementText(WebElement element) {
			return(element.getText());
		}
		public static void clearText(WebElement element) {
			element.clear();
		}
		public static void navigateToBack(WebDriver driver) {
			driver.navigate().back();
		}
		public static String getAttribute(WebElement element,String Attribute) {
			return element.getAttribute(Attribute);
		}
		public static void moveToWebElement (WebElement element,WebDriver driver) {
			Actions actions=new Actions(driver);
			actions.moveToElement(element).build().perform();
		}
		public static void doubleClick(WebElement element,WebDriver driver) {
			Actions actions=new Actions(driver);
			actions.doubleClick().build().perform();
		}
		public static void rightClick(WebElement element,WebDriver driver) {
			Actions actions=new Actions(driver);
			actions.contextClick().build().perform();
		}
		public static void clickAndHold(WebElement element,WebDriver driver) {
			Actions actions=new Actions(driver);
			actions.clickAndHold().build().perform();
		}
		public static void acceptAnAlert(WebDriver driver) {
			driver.switchTo().alert().accept();
			}
		
		public static void cancelAnAlert(WebDriver driver) {
			driver.switchTo().alert().dismiss();
		}
		
		public static boolean isElementDisplayed(WebElement element) {
			return(element.isDisplayed());
		}
		
		public static boolean isElementEnabled(WebElement element) {
			return(element.isEnabled());
		}
		
		public static boolean isElementSelected(WebElement element) {
			return(element.isSelected());
		}
		
		public static void clickAnElement(WebDriver driver,WebElement element) {
			JavascriptExecutor executor=(JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);
		}
		
		public static void scrollThePage(WebDriver driver,WebElement element) {
			JavascriptExecutor executor=(JavascriptExecutor)driver;
			executor.executeScript("window.scrollBy(0,1000)", element);
			}
		
		public static String selectATextFromDropDown(WebElement element,String text) {
			Select dropdowntext=new Select(element);
			dropdowntext.selectByVisibleText(text);
			return text;
		}
		
		public static void enterKeyPress(WebDriver driver) {
			Actions action =new Actions(driver);
			action.sendKeys(Keys.ENTER);
			action.build().perform();
		}
		
		public static void escapeKeyPress(WebDriver driver) {
			Actions action =new Actions(driver);
			action.sendKeys(Keys.ESCAPE);
			action.build().perform();
		}
		
		public static void spaceBarKeyPress(WebDriver driver) {
			Actions action =new Actions(driver);
			action.sendKeys(Keys.SPACE);
			action.build().perform();
		}
		
		public static void altKeyPress(WebDriver driver) {
			Actions action =new Actions(driver);
			action.sendKeys(Keys.ALT);
			action.build().perform();
		}
		
		public static void controlKeyPress(WebDriver driver) {
			Actions action =new Actions(driver);
			action.sendKeys(Keys.CONTROL);
			action.build().perform();
		}
}
