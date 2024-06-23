package TestCases;

import org.testng.annotations.Test;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AutomationCore.BaseClass;
import PageClasses.QaLegendLoginPage;

public class QaLegend_TestCases extends BaseClass {
		public WebDriver driver;
		Properties props;
		FileReader reader;
		QaLegendLoginPage loginpage;
	@BeforeMethod	
		public void initialization()throws Exception {
			driver=browserinitialization("chrome");
			loginpage=new QaLegendLoginPage(driver);
			driver.manage().window().maximize();
			props=new Properties();
			reader=new FileReader("C:\\Users\\bincy\\new-eclipse-workspace\\MainProjectNew\\src\\main\\resources\\TestData\\TestData.properties");
			props.load(reader);
			driver.get(props.getProperty("url"));
	}
	
	@Test
	public void addEditNotes() {
		System.out.println("testcase1");
		loginpage.LoginToQaLegend(props.getProperty("username"),props.getProperty("password"));
	}
}
