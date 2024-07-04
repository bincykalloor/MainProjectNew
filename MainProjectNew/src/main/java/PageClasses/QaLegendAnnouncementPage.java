package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QaLegendAnnouncementPage {
		
		WebDriver driver;
		@FindBy(xpath="//a[text()=' Add announcement']")
		WebElement addannouncementbutton;
		@FindBy(xpath="//input[@id='title']")
		WebElement titlefield;
		@FindBy(xpath="//div[@class='note-editable panel-body']")
		WebElement descriptionfield;
		@FindBy(xpath="//input[@id='start_date']")
		WebElement startdatefield;
		@FindBy(xpath="//input[@id='end_date']")
		WebElement enddatefield;
		@FindBy(xpath="//button[text()=' Save']")
		WebElement savebuttonfield;
		
		
		
		public QaLegendAnnouncementPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		
		
		public void addannouncement(String title,String start_date,String end_date,String description ) {
			PageUtilities.clickOnElement(addannouncementbutton);
			PageUtilities.enterText(titlefield, title);
			PageUtilities.enterText(startdatefield, start_date);
			PageUtilities.enterText(enddatefield, end_date);
			PageUtilities.clickOnElement(savebuttonfield);
		}
}
