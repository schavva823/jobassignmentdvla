package applicationpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Vehicledetailspage {
	WebDriver driver;
	public Vehicledetailspage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	@FindBy(xpath="//div[@class='column-two-thirds']//ul[@class='list-summary']//li[@class='list-summary-item']//strong[text()='FORD']") WebElement maketext;

	@FindBy(xpath="//div[@class='column-two-thirds']//ul[@class='list-summary']//li[@class='list-summary-item']//strong[text()='SILVER']") WebElement colourtext;
public String getmaketext()
{
	String make=maketext.getText();
	return make;
}
public String getcolortext()
{
	String color=colourtext.getText();
	return color;
}
}
