package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QaLegendAddPaymentPage {
		WebDriver driver;
		@FindBy(xpath="(//a[text()=' Add payment'])[1]")
		WebElement addpaymentbutton;
		@FindBy(xpath="//div[@id='s2id_invoice_id']")
		WebElement invoicefield;
		@FindBy(xpath="(//input[@class='select2-input'])[5]")
		WebElement paymentmethodfield;
		@FindBy(xpath="//input[@id='invoice_payment_date']")
		WebElement paymentdatefield;
		@FindBy(xpath="//input[@id='invoice_payment_amount']")
		WebElement paymentamountfield;
		@FindBy(xpath="//textarea[@id='invoice_payment_note']")
		WebElement notefield;
		@FindBy(xpath="//button[text()=' Save']")
		WebElement savebutton;
		
		
		
				public QaLegendAddPaymentPage(WebDriver driver) {
				this.driver=driver;
				PageFactory.initElements(driver, this);
		}




				public void addpayments(String invoice,String paymentmethod,String paymentdate,String amount,String note) {
					PageUtilities.clickOnElement(addpaymentbutton);
					PageUtilities.enterText(invoicefield, invoice);
					PageUtilities.enterText(paymentmethodfield, paymentmethod);
					PageUtilities.enterText(paymentdatefield, paymentdate);
					PageUtilities.enterText(paymentamountfield, amount);
					PageUtilities.enterText(notefield, note);
					PageUtilities.clickOnElement(savebutton);
		}
		
}
