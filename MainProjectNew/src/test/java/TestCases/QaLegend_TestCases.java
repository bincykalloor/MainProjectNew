package TestCases;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
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
import Utilities.ExcelUtility;

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
	@Parameters("browser")
		public void initialization(String browser)throws Exception {
			driver=browserinitialization(browser);
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
	public void addEditNotes() throws InterruptedException {
		System.out.println("testcase1");
		loginpage.LoginToQaLegend(props.getProperty("username"),props.getProperty("password"));
		dashboard.clicksOnNotesOption();
		String notetitle=props.getProperty("notestitle")+rand.nextInt(10000);
		notespage.addNotes(notetitle, props.getProperty("description"));
		notespage.searchNotes(notetitle,driver);
		Assert.assertEquals(notespage.getNoteTitle(), notetitle);
	}
	@Test
	public void addEvents() throws InterruptedException {
		loginpage.LoginToQaLegend(props.getProperty("username"), props.getProperty("password"));
		dashboard.clicksOnEventsOption();
		eventspage.addevents("eventstitle","eventsdescription", "startdate","enddate", driver);
		
		
	}
	@Test
	public void addClients() {
		loginpage.LoginToQaLegend(props.getProperty("username"), props.getProperty("password"));
		dashboard.clicksOnClientsOption();
		String addclient=props.getProperty("companyname")+rand.nextInt(10000);
		String address=props.getProperty("address")+rand.nextInt(10000);
		String city=props.getProperty("state")+rand.nextInt(10000);
		String zip=props.getProperty("zip")+rand.nextInt(10000);
		String country=props.getProperty("country")+rand.nextInt(10000);
		String phonenumber=props.getProperty("phonenumber")+rand.nextInt(10000);
		clientspage.addclients(addclient, address, city, city, zip, country, phonenumber);
		//clientspage.addclients(props.getProperty("companyname"), props.getProperty("address"), props.getProperty("city"),props.getProperty("state"),props.getProperty("zip"),props.getProperty("country"),props.getProperty("phonenumber"));
		//clientspage.searchclients(props.getProperty("companyname"));
		
	}
	@Test
	public void composeMessage() throws IOException {
		loginpage.LoginToQaLegend(props.getProperty("username"), props.getProperty("password"));
		dashboard.clicksOnMessagesTab();
		//messagepage.composeMessage(props.getProperty("to"), props.getProperty("subject"), props.getProperty("message"));
		String subject=ExcelUtility.getString(1, 0, props.getProperty("excelpath"), "Compose")+rand.nextInt(1000);
		String message=ExcelUtility.getString(1, 1, props.getProperty("excelpath"), "Compose")+rand.nextInt(1000);
		messagepage.composeMessage(props.getProperty("to"), subject, message);
		messagepage.searchForSendMessage(subject);
		
		
		
		
	}
	
	
	@Test
	public void additems() {
		loginpage.LoginToQaLegend(props.getProperty("username"), props.getProperty("password"));
		dashboard.clicksOnAddItemsPage();
		String itemtitle=props.getProperty("itemtitle")+rand.nextInt(10000);
		String itemdescription=props.getProperty("itemdescription")+rand.nextInt(10000);
		String itemunitrate=props.getProperty("itemunittype")+rand.nextInt(10000);
		String itemrate=props.getProperty("itemrate")+rand.nextInt(10000);
		additemspage.additems(itemtitle, itemdescription, itemunitrate, itemrate);
		
		
	}
	
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}


