package testcases;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import library.Actions;
import library.Baseclass;
import library.Utility;

public class Verifyvehicleregistrationdetails extends Baseclass

{
	
	
@Test
public void Verifyvalidvehicle()
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
	
	
String txt=	driver.findElement(By.xpath("//div[@class='related-links']//h2[text()='Vehicle details']")).getText();
//checking the validations
   Assert.assertTrue(txt.contains("Vehicle details"));
   logger.log(LogStatus.PASS, "vehicle details are checked");
  
}


}
