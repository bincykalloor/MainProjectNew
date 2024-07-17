package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QaLegendNotesPage {
		WebDriver driver;
		@FindBy(xpath="//div[@class='title-button-group']/a")
		WebElement addnotesbutton;
		@FindBy(xpath="//input[@id='title']")
		WebElement titlefield;
		@FindBy(xpath="//textarea[@id='description']")
		WebElement descriptionfield;
		@FindBy(xpath="//button[@class='btn btn-primary']")
		WebElement savebutton;
		@FindBy(xpath="//div[@id='note-table_filter']//input")
		WebElement notessearchbox;
		@FindBy(xpath="(//a[@class='edit'])[1]")
		WebElement searchtitle;
		
		
		
		public QaLegendNotesPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}



		public void addNotes(String title,String description) {
			PageUtilities.clickOnElement(addnotesbutton);
			PageUtilities.enterText(titlefield, title);
			PageUtilities.enterText(descriptionfield, description);
			PageUtilities.clickOnElement(savebutton);
		}
		
	 public void searchNotes(String title,WebDriver driver) throws InterruptedException {
		 Thread.sleep(2000);
		 PageUtilities.enterText(notessearchbox, title);
		 PageUtilities.clickAnElement(driver,notessearchbox);
	 }
	 
	 public String getNoteTitle() {
		 String gettitle=PageUtilities.getElementText(searchtitle);
		 return gettitle;
		
}
}

