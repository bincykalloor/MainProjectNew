package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QaLegendClientsPage {
		WebDriver driver;
		@FindBy(xpath="//a[@class='btn btn-default']")
		WebElement addclientbutton;
		@FindBy(xpath="//input[@name='company_name']")
		WebElement companynamefield;
		@FindBy(xpath="//textarea[@id='address']")
		WebElement addressfield;
		@FindBy(xpath="//input[@id='city']")
		WebElement cityfield;
		@FindBy(xpath="//input[@id='state']")
		WebElement statefield;
		@FindBy(xpath="//input[@id='zip']")
		WebElement zipfield;
		@FindBy(xpath="//input[@id='country']")
		WebElement countryfield;
		@FindBy(xpath="//input[@id='phone']")
		WebElement phonenumberfield;
		@FindBy(xpath="//button[text()=' Save']")
		WebElement savebutton;
		
		
		
		
		
		
		
		public QaLegendClientsPage(WebDriver driver) {
				this.driver=driver;
				PageFactory.initElements(driver, this);
		}







		public void addclients(String company_name,String address,String city,String state,String zip,String country,String phonenumber) {
				PageUtilities.clickOnElement(addclientbutton);
				PageUtilities.enterText(companynamefield, company_name);
				PageUtilities.enterText(addressfield, address);
				PageUtilities.enterText(cityfield, city);
				PageUtilities.enterText(statefield, state);
				PageUtilities.enterText(zipfield, zip);
				PageUtilities.enterText(countryfield, country);
				PageUtilities.enterText(phonenumberfield, phonenumber);
				PageUtilities.clickOnElement(savebutton);
		}
		
}
