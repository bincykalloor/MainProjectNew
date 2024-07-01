package TestCases;

import org.testng.annotations.Test;
import java.io.FileReader;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AutomationCore.BaseClass;
import PageClasses.QaLegendAddItemPage;
import PageClasses.QaLegendAddPaymentPage;
import PageClasses.QaLegendClientsPage;
import PageClasses.QaLegendDashboard;
import PageClasses.QaLegendEventsPage;
import PageClasses.QaLegendLoginPage;
import PageClasses.QaLegendMessagesPage;
import PageClasses.QaLegendNotesPage;

public class QaLegend_TestCases extends BaseClass {
		public WebDriver driver;
		Properties props;
		FileReader reader;
		QaLegendLoginPage loginpage;
		String path="";
		QaLegendDashboard dashboard;
		QaLegendNotesPage notespage;
		QaLegendEventsPage eventspage;
		QaLegendClientsPage clientspage;
		QaLegendMessagesPage messagepage;
		QaLegendAddPaymentPage addpaymentpage;
		QaLegendAddItemPage additemspage;
		Random rand;
	@BeforeMethod	
		public void initialization()throws Exception {
			driver=browserinitialization("chrome");
			loginpage=new QaLegendLoginPage(driver);
			dashboard=new QaLegendDashboard(driver);
			notespage=new QaLegendNotesPage(driver);
			eventspage=new QaLegendEventsPage(driver);
			clientspage=new QaLegendClientsPage(driver);
			messagepage=new QaLegendMessagesPage(driver);
			addpaymentpage=new QaLegendAddPaymentPage(driver);
			additemspage=new QaLegendAddItemPage(driver);
			rand=new Random();
			driver.manage().window().maximize();
			props=new Properties();
			path=System.getProperty("user.dir")+"\\src\\main\\resources\\TestData\\TestData.properties";
			reader=new FileReader(path);
			props.load(reader);
			driver.get(props.getProperty("url"));  
	}
	
	@Test
	public void addEditNotes() {
		System.out.println("testcase1");
		loginpage.LoginToQaLegend(props.getProperty("username"),props.getProperty("password"));
		dashboard.clicksOnNotesOption();
		String notetitle=props.getProperty("notestitle")+rand.nextInt(10000);
		notespage.addNotes(notetitle, props.getProperty("description"));
		notespage.searchNotes(notetitle,driver);
		Assert.assertEquals(notespage.getNoteTitle(), notetitle);
	}
	@Test
	public void addEvents() {
		loginpage.LoginToQaLegend(props.getProperty("username"), props.getProperty("password"));
		dashboard.clicksOnEventsOption();
		eventspage.addevents(props.getProperty("eventstitle"), props.getProperty("eventsdescription"));
		
	}
	@Test
	public void addClients() {
		loginpage.LoginToQaLegend(props.getProperty("username"), props.getProperty("password"));
		dashboard.clicksOnClientsOption();
		clientspage.addclients(props.getProperty("companyname"), props.getProperty("address"), props.getProperty("city"),props.getProperty("state"),props.getProperty("zip"),props.getProperty("country"),props.getProperty("phonenumber"));
		
	}
	@Test
	public void composeMessage() {
		loginpage.LoginToQaLegend(props.getProperty("username"), props.getProperty("password"));
		dashboard.clicksOnMessagesTab();
		messagepage.composemessage(props.getProperty("to"), props.getProperty("subject"), props.getProperty("message"));
		
		
	}
	
	@Test
	public void addpayments() {
		loginpage.LoginToQaLegend(props.getProperty("username"), props.getProperty("password"));
		dashboard.clicksOnInvoicesTab();
		addpaymentpage.addpayments(props.getProperty("invoice"), props.getProperty("paymentmethod"), props.getProperty("paymentdate"), props.getProperty("amount"), props.getProperty("note"));
	}
	@Test
	public void additems() {
		loginpage.LoginToQaLegend(props.getProperty("username"), props.getProperty("password"));
		dashboard.clicksOnAddItemsPage();
		additemspage.additems(props.getProperty("itemtitle"), props.getProperty("itemdescription"), props.getProperty("itemunittype"), props.getProperty("itemrate"));
	}
}
