package dvla.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DVLAHomePage {
	
	WebDriver DVLAHomePage;
	
	public DVLAHomePage(WebDriver driver){
		DVLAHomePage = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath=".//p[@id='get-started']/a")
	WebElement startNowButton;
	
	public void startnowButtonClick(){
		
		startNowButton.click();
	}

}
