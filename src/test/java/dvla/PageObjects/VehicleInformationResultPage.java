package dvla.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleInformationResultPage {
	
	WebDriver VehicleInformationResultPage;
	
	public VehicleInformationResultPage(WebDriver driver){
		VehicleInformationResultPage = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(.//li[@class='list-summary-item'])[2]/span[2]")
	public WebElement makeText;
	
	@FindBy(xpath="(.//li[@class='list-summary-item'])[3]/span[2]")
	public WebElement coloutText;

}
