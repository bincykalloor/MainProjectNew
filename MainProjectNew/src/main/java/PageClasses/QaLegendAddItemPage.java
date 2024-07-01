package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QaLegendAddItemPage {
		WebDriver driver;
		@FindBy(xpath="//a[text()=' Add item']")
		WebElement additembutton;
		@FindBy(xpath="//input[@id='title']")
		WebElement titlefield;
		@FindBy(xpath="//textarea[@id='description']")
		WebElement descriptionfield;
		@FindBy(xpath="//input[@id='unit_type']")
		WebElement unitfield;
		@FindBy(xpath="//input[@id='item_rate']")
		WebElement itemratefield;
		@FindBy(xpath="//button[text()=' Save']")
		WebElement savebutton;
		
		
		
		
		
		public QaLegendAddItemPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}





		public void additems(String title,String description,String unit,String itemrate) {
			PageUtilities.clickOnElement(additembutton);
			PageUtilities.enterText(titlefield, title);
			PageUtilities.enterText(descriptionfield, description);
			PageUtilities.enterText(unitfield, unit);
			PageUtilities.enterText(itemratefield, itemrate);
			PageUtilities.clickOnElement(savebutton);
		}
		
}
