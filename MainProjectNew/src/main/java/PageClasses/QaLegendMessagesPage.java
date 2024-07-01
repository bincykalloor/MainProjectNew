package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QaLegendMessagesPage {
		
		WebDriver driver;
		@FindBy(xpath="//a[@title='Send message']")
		WebElement composebutton;
		@FindBy(xpath="//span[@id='select2-chosen-725']")
		WebElement tofield;
		@FindBy(xpath="//input[@id='subject']")
		WebElement subjectfield;
		@FindBy(xpath="//textarea[@placeholder='Write a message...']")
		WebElement messagefield;
		@FindBy(xpath="//button[text()=' Send']")
		WebElement sendbutton;
				


		public QaLegendMessagesPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
		
		
		public void composemessage(String tofield,String subjectfield,String messagefield) {
			PageUtilities.clickOnElement(composebutton);
			
			PageUtilities.clickOnElement(sendbutton);
			
			
		}

}
