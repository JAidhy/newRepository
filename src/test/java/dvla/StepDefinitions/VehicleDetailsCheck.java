package dvla.StepDefinitions;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dvla.PageObjects.DVLAHomePage;
import dvla.PageObjects.VehicleInformationPage;
import dvla.PageObjects.VehicleInformationResultPage;
import junit.framework.Assert;
import utility.CommonWebDriver;
import utility.ReadFile;
import utility.TakeScreenshot;
import utility.VehicleDetail;

public class VehicleDetailsCheck extends CommonWebDriver {

	@Given("^I am on vehicle information page$")
	public void i_am_on_vehicle_information_page() throws Throwable {
		commonMethod();//Initialize the browser using commonMethod of CommonWebDriver class 

		DVLAHomePage DVLAHomePageObject = new DVLAHomePage(driver);
		DVLAHomePageObject.startnowButtonClick();

	}

	@When("^I search for a registration number '(.*)'$")
	public void i_search_for_a_registration_number_LN_CMV(String reg_num) throws Throwable {

		VehicleInformationPage vehicleInformationPage = new VehicleInformationPage(driver);
		vehicleInformationPage.enterRegNumber(reg_num);//Enter registration number
		vehicleInformationPage.clickContinueButton();//Click continue button to navigate to vehicle details page

	}

	@Then("^Vehicle details are displayed for '(.*)'$")
	public void vehicle_details_are_displayed_for_LN_CMV(String reg_number) throws Throwable {

		List<VehicleDetail> VehicleListNew = new ArrayList<VehicleDetail>();
		VehicleListNew = ReadFile.readCsv();

		VehicleInformationPage vehicleInformationPage = new VehicleInformationPage(driver);
		VehicleInformationResultPage vehicleInformationResultPage = new VehicleInformationResultPage(driver);
		String make = "";
		String colour = "";
		for (VehicleDetail item : VehicleListNew) {
			if (item.getReg_number().equalsIgnoreCase(reg_number)) {
				colour = item.getColour();
				make = item.getMake();

				break;
			}

		}
		String actualColourText = vehicleInformationResultPage.coloutText.getText(); //Saving WebElement as String
		String actualMakeText = vehicleInformationResultPage.makeText.getText(); ////Saving WebElement as String

		Assert.assertEquals(make, actualMakeText);
		Assert.assertEquals(colour, actualColourText);

		TakeScreenshot takescreenshot = new TakeScreenshot();
		takescreenshot.screenshotMethod(driver, "vehicleInfo");//Take screenshot using TakeScreenshot class
	}
}
