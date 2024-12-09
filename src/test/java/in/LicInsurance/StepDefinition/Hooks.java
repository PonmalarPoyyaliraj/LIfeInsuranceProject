package in.LicInsurance.StepDefinition;

import in.LicInsurance.BaseClass.BaseClass;
import io.cucumber.java.Before;

public class Hooks {
	BaseClass base=BaseClass.getInstance();
	@Before
	public void user_launch_the_LIC_Life_Insurance_Application() {

		base.UserLaunchbrowser();

	}
}
