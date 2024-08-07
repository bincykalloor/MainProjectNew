package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QaLegendEventsPage {
	
		WebDriver driver;
		@FindBy(xpath="(//a[@title='Add event'])[2]")
		WebElement addeventsbutton;
		@FindBy(xpath="//input[@id='title']")
		WebElement titlefield;
		@FindBy(xpath="//textarea[@id='description']")
		WebElement descriptionfield;
		@FindBy(xpath="//input[@id='start_date']")
		WebElement startdatefield;
		@FindBy(xpath="//input[@id='end_date']")
		WebElement enddatefield;
		@FindBy(xpath="//input[@id='start_time']")
		WebElement starttimefield;
		@FindBy(xpath="//input[@id='end_time']")
		WebElement endtimefield;
		@FindBy(xpath="//button[text()=' Save']")
		WebElement savebutton;
		
		
		
		
		
		public QaLegendEventsPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		public void addevents(String title,String eventdescription,String startdate,String enddate,WebDriver driver) throws InterruptedException {
			PageUtilities.clickOnElement(addeventsbutton);
			Thread.sleep(5000);
			PageUtilities.enterText(titlefield, title);
			PageUtilities.enterText(descriptionfield,eventdescription);
			//PageUtilities.clickOnElement(startdatefield);
			PageUtilities.enterText(startdatefield, startdate);
		//	PageUtilities.clickOnElement(enddatefield);
			PageUtilities.enterText(enddatefield, enddate);
			PageUtilities.clickOnElement(starttimefield);
			//PageUtilities.clickOnElement(endtimefield);
			PageUtilities.clickAnElement(driver, titlefield);
			PageUtilities.clickAnElement(driver,savebutton);
		}
		
		
		
		
}
