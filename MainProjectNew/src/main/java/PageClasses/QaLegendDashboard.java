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
		
		
		
		
		public QaLegendDashboard(WebDriver driver) {
				this.driver=driver;
				PageFactory.initElements(driver, this);
		}




		public void clicksOnNotesOption() {
			PageUtilities.clickOnElement(notestab);
		}
}
