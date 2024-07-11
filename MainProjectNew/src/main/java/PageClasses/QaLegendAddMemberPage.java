package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QaLegendAddMemberPage {
		WebDriver driver;
		@FindBy(xpath="//a[text()=' Add member']")
		WebElement addmemberfield;
		@FindBy(xpath="//input[@id='first_name']")
		WebElement firstnamefield;
		@FindBy(xpath="//input[@id='last_name']")
		WebElement lastnamefield;
		@FindBy(xpath="//button[@class='btn btn-info']")
		WebElement nextbutton;
		@FindBy(xpath="//input[@id='job_title']")
		WebElement jobtitlefield;
		@FindBy(xpath="//input[@id='salary']")
		WebElement salaryfield;
		@FindBy(xpath="//button[@class='btn btn-info']")
		WebElement nextbuttonfield;
		@FindBy(xpath="//input[@id='email']")
		WebElement emailfield;
		@FindBy(xpath="//input[@id='password']")
		WebElement passwordfield;
		@FindBy(xpath="//button[text()=' Save']")
		WebElement savebutton;
		
		
		
		
		
		
		public QaLegendAddMemberPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}



		public void addmember(String firstname,String lastname ) {
			PageUtilities.clickOnElement(addmemberfield);
			PageUtilities.enterText(firstnamefield, firstname);
			PageUtilities.enterText(lastnamefield, lastname);
			PageUtilities.clickOnElement(addmemberfield); 
		}
}
