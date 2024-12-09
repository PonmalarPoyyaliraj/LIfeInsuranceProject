package in.LicInsurance.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\balap\\eclipse-workspace\\browser\\LicInsurance\\src\\test\\resources\\Feature\\LifeInsurance.feature",
                   glue= ("in.LicInsurance.StepDefinition"),
                   dryRun=false,
                   monochrome=true,
                   plugin= ("html:target//cucumber//report.html")
                     )

public class TestRunner {
	
}


