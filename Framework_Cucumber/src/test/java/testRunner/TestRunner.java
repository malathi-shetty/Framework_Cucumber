package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	//	features=".//Features//DailyTimeTable.feature",
	//	features={".//Features/"}, //-- for all features to run
	//	features={".//Features//Login.feature",".//Features//Customers.feature"}, // different feature then separte by {}
	//	features=".//Features//Login.feature",
		features=".//Features//ExpandtestingLogin.feature",
		glue={"stepDefinition"},
		dryRun=false,
		monochrome=true,
		plugin= {
				"pretty", 
				"json:test-output/JSON/JSONCucumber.json",
			
				}
	//	tags= "@sanity and not @regression"
	//tags= "@smoke or @regression and not @sanity"
	//tags= "@sanity or @regression"
		//tags= "@Sanity"
	//	tags= "not @Sanity"
		)





public class TestRunner {

}
