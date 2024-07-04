package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QaLegendForgotPassword {
		WebDriver driver;
		@FindBy(xpath="//a[text()='Forgot password?']")
		WebElement fogotpasswordlink;
		@FindBy(id="email")
		WebElement enteremailid;
		@FindBy(xpath="//button[text()='Send']")
		WebElement sendbutton;
		
		
		
		
		
		public QaLegendForgotPassword(WebDriver driver) {
				this.driver=driver;
				PageFactory.initElements(driver, this);
		}





		public void forgotPasswordLink(String email) {
			PageUtilities.clickOnElement(fogotpasswordlink);
			PageUtilities.enterText(enteremailid, email);
			PageUtilities.clickOnElement(sendbutton);
		}
		
}
