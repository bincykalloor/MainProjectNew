package TestCases;

import org.testng.annotations.Test;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AutomationCore.BaseClass;
import PageClasses.QaLegendDashboard;
import PageClasses.QaLegendLoginPage;
import PageClasses.QaLegendNotesPage;

public class QaLegend_TestCases extends BaseClass {
		public WebDriver driver;
		Properties props;
		FileReader reader;
		QaLegendLoginPage loginpage;
		String path="";
		QaLegendDashboard dashboard;
		QaLegendNotesPage notespage;
	@BeforeMethod	
		public void initialization()throws Exception {
			driver=browserinitialization("chrome");
			loginpage=new QaLegendLoginPage(driver);
			dashboard=new QaLegendDashboard(driver);
			notespage=new QaLegendNotesPage(driver);
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
		notespage.addNotes(props.getProperty("notestitle"), props.getProperty("description"));
	}
}
