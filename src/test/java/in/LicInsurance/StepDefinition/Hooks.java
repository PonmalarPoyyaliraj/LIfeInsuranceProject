package in.LicInsurance.StepDefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import in.LicInsurance.BaseClass.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	BaseClass base=BaseClass.getInstance();
	@Before
	public void user_launch_the_LIC_Life_Insurance_Application() {

		base.UserLaunchbrowser();
	}
	@SuppressWarnings("deprecation")
	@After
	public void screenshottt(Scenario scenario) {
		final byte[] by = ((TakesScreenshot)base.driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(by, "image/png");
	}
	
			
	
}
