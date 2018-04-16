package testcases;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;

import applicationpages.Vehicledetailspage;
import factory.Dataproviderfactory;
import library.Actions;
import library.Baseclass;
import library.Utility;

public class Verifywithexceldata extends Baseclass 
{
	
@Test 
public  void verifywithexcel() 
{
	Actions act=new Actions(driver);
	act.NavigatetoVehicleloginpage();
	logger.log(LogStatus.INFO, "user entering the number");
	logger.log(LogStatus.INFO, logger.addScreenCapture(Utility.capturescreenshot(driver,"user is on login page")));
	
	//user is entering the vehicle number
	act.Navigatetoregistrationpage();
	logger.log(LogStatus.INFO, logger.addScreenCapture(Utility.capturescreenshot(driver,"user is  on validing page")));
	logger.log(LogStatus.INFO, "validating the details");
	//validating the correct user
	act.Navigatetovalidateuserpage();
	logger.log(LogStatus.INFO, logger.addScreenCapture(Utility.capturescreenshot(driver,"user is on details page")));
	logger.log(LogStatus.INFO, "user is on the vehicle details page");
	
	
	
	//user is on the vehilcedetailspage
	Vehicledetailspage validdetails=PageFactory.initElements(driver,Vehicledetailspage.class);
	
	//System.out.println(validdetails.getmaketext());
	//System.out.println(validdetails.getcolortext());
String makedata=Dataproviderfactory.getExcel().getdata(0, 0, 1);
String colordata=Dataproviderfactory.getExcel().getdata(0, 0, 2);
Assert.assertTrue(makedata.contains(validdetails.getmaketext()));
Assert.assertTrue(colordata.contains(validdetails.getcolortext()));
logger.log(LogStatus.INFO, "vehicle data is as expected");


}

}