package library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import applicationpages.Enterregistrationpage;
import applicationpages.Validatinguserpage;
import applicationpages.Vehicleloginpage;
import factory.Dataproviderfactory;

public class Actions 
{
	
 WebDriver driver;
 public Actions(WebDriver ldriver)
 {
	 this.driver=ldriver;
 }
	
	
	public   void NavigatetoVehicleloginpage()
	{
		Vehicleloginpage login=PageFactory.initElements(driver,Vehicleloginpage.class);
		//user is on login page
		login.clickonstart();
		
	}
	public  void Navigatetoregistrationpage()
	{
		Enterregistrationpage regpage=PageFactory.initElements(driver, Enterregistrationpage.class);
		regpage.entervaliddetails(Dataproviderfactory.getExcel().getdata(0,0,0));
		regpage.clickoncontinue();
		
	}
	public  void Navigatetovalidateuserpage()
	{

		Validatinguserpage validuser=PageFactory.initElements(driver,Validatinguserpage.class);
		validuser.clickonyes();
		validuser.clickoncontinue();
		
	}
	

}
