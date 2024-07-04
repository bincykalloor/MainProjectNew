package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QaLegendDashboard {
		WebDriver driver;
		@FindBy(xpath="//span[text()='Events']")
		WebElement eventstab;
		@FindBy(xpath="//span[text()='Notes']")
		WebElement notestab;
		@FindBy(xpath="//span[text()='Messages']")
		WebElement messagestab;
		@FindBy(xpath="//span[text()='Clients']")
		WebElement clientstab;
		@FindBy(xpath="//span[text()='Invoices']")
		WebElement invoicestab;
		@FindBy(xpath="//span[text()='Items']")
		WebElement itemstab;
		@FindBy(xpath="//span[text()='Team members']")
		WebElement teammemberstab;
		@FindBy(xpath="//span[text()='Announcements']")
		WebElement announcementtab;
		
		
		
		
		
		public QaLegendDashboard(WebDriver driver) {
				this.driver=driver;
				PageFactory.initElements(driver, this);
		}




		public void clicksOnNotesOption() {
			PageUtilities.clickOnElement(notestab);
		}
		
		public void clicksOnEventsOption() {
			PageUtilities.clickOnElement(eventstab);
		}
		
		public void clicksOnClientsOption(){
			PageUtilities.clickOnElement(clientstab);
		}

		public void clicksOnMessagesTab() {
			PageUtilities.clickOnElement(messagestab);
		}
		
		public void clicksOnInvoicesTab() {
			PageUtilities.clickOnElement(invoicestab);  
		}
		
		public void clicksOnAddItemsPage() {
			PageUtilities.clickOnElement(itemstab);
		}
		
		public void clicksOnTeamMembersTab() {
			PageUtilities.clickOnElement(teammemberstab);
		}

		public void clicksOnAnnouncementTab() {
			PageUtilities.clickOnElement(announcementtab);
		}
}




