package utility;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenshot {


	public static void screenshotMethod(WebDriver driver, String screenshotName) throws IOException{
		
		TakesScreenshot tksScr = (TakesScreenshot)driver;
		
		File sourc = tksScr.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(sourc, new File("./Screenshots/"+screenshotName+".png"));
		
			
	}
}