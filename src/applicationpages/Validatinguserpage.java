package applicationpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Validatinguserpage {
	WebDriver driver;
	public Validatinguserpage(WebDriver ldriver) 
	{
		this.driver=ldriver;
		
	}
	@FindBy(id="Correct_True") WebElement usercheckbox;
	@FindBy(xpath="//button[@name='Continue']") WebElement continuebutton;
	
	public void clickonyes() 
	{
		usercheckbox.click();
		
	}
	public void clickoncontinue() 
	{
		continuebutton.click();
		
	}


}
