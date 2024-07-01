package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QaLegendAddMemberPage {
		WebDriver driver;
		@FindBy(xpath="//a[text()=' Add member']")
		WebElement addmemberfield;
		@FindBy(xpath="//input[@id='first_name']")
		WebElement firstnamefield;
		@FindBy(xpath="//input[@id='last_name']")
		WebElement lastnamefield;
		@FindBy(xpath="//button[text()=' Next']")
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
		
		
		
		
		
		
		public void addmember() {
			
		}
}
