package library;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import factory.Browserfactory;
import factory.Dataproviderfactory;

public class Baseclass 

{
	
	public static WebDriver driver;
	public static ExtentReports report;
	public static ExtentTest logger;
	@BeforeClass
	public static void setup()
	{
		driver=Browserfactory.getbrowser("firefox");
		report =new ExtentReports("./Reports/homepagereport.html",true);
		
		logger=report.startTest("verify homepage");
		logger.log(LogStatus.INFO, "application up and running");
	driver.get(Dataproviderfactory.getconfig().getapplicationurl());
		
	}
	@AfterClass
	public  static void teardown()
	{
		Browserfactory.closebrowser(driver);
		report.endTest(logger);
		report.flush();
		
	}
	

}
