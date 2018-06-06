package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonWebDriver {
	
	public static WebDriver driver;
	
	public static WebDriver commonMethod(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JaspreetSingh\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gov.uk/get-vehicle-information-from-dvla");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		return driver;
		
	}
	

}
