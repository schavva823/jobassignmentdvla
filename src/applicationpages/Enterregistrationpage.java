package applicationpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Enterregistrationpage 
{
	WebDriver driver;
	public Enterregistrationpage(WebDriver ldriver) 
	{
		this.driver=ldriver;
		
	}
	@FindBy(xpath="//input[@id='Vrm'and@name='Vrm']") WebElement userinputbox;
	@FindBy(name="Continue") WebElement continuebutton;
	
	public void entervaliddetails(String vehiclenumber)
	{
		userinputbox.sendKeys(vehiclenumber);
	}
	public void clickoncontinue()
	{
		continuebutton.click();
	}
	
	
}
