package applicationpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Vehicleloginpage 

{
	WebDriver driver;
	public Vehicleloginpage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
@FindBy(xpath="//a[@ href='https://www.vehicleenquiry.service.gov.uk']") WebElement startnow;

public void clickonstart() 
{
	startnow.click();
	
}

}
