package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QaLegendMessagesPage {
		
		WebDriver driver;
		@FindBy(xpath = "//a[text()='Compose']")
		WebElement composeTab;
		@FindBy(id = "s2id_to_user_id")
		WebElement toBox;
		@FindBy(xpath = "//div[@id='select2-drop']//input")
		WebElement toSearchBox;
		@FindBy(xpath = "//div[@class='select2-result-label']")
		WebElement senderName;
		@FindBy(xpath = "//input[@name='subject']")
		WebElement subjectBox;
		@FindBy(xpath = "//button[text()=' Send']")
		WebElement sendButton;
		@FindBy(xpath = "//textarea[@name='message']")
		WebElement writeAmessage;
		@FindBy(xpath="(//a[@class='list-group-item'])[3]")
		WebElement sendMessageTab;
		@FindBy(xpath="//input[@id='search-messages']")
		WebElement sendItemsSearchTab;
		@FindBy(xpath="//div[@class='pull-left message-row ']")
		WebElement message;

		
		
		
		

		
		public QaLegendMessagesPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
		
		
		public void composeMessage(String toField, String subjectField, String messageField) {
			PageUtilities.clickOnElement(composeTab);
			PageUtilities.clickOnElement(toBox);
			PageUtilities.enterText(toSearchBox, toField);
			PageUtilities.clickOnElement(senderName);
			PageUtilities.enterText(subjectBox, subjectField);
			PageUtilities.enterText(writeAmessage, messageField);
			PageUtilities.clickOnElement(sendButton);

		}
		
		public void searchForSendMessage(String sub) {
			PageUtilities.clickOnElement(sendMessageTab);
			PageUtilities.clickOnElement(sendItemsSearchTab);
			PageUtilities.enterText(sendItemsSearchTab, sub);
			
		}
		
		
		
}

