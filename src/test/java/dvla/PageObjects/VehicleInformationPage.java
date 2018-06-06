package dvla.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleInformationPage {
	
	WebDriver VehicleInformationPage;
	
	public VehicleInformationPage(WebDriver driver){
		
		VehicleInformationPage = driver;
		PageFactory.initElements(driver, this);
				
	}
	
	@FindBy(xpath=".//input[@class='form-control form-control-1-4 input-upper']")
	WebElement vehicleRegTextbox;
	
	@FindBy(name="Continue")
	WebElement continueButton;
	
	public void clickContinueButton(){
		continueButton.click();
	}
	
	public void enterRegNumber(String reg_num){
		
		vehicleRegTextbox.sendKeys(reg_num);
		
	}

}
