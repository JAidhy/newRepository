package utility;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ={"src/test/java/dvla/FeatureFiles"}, monochrome=true,
				tags = {"@vehicleDetailInfo"})
public class TestRunnerClass {

}
