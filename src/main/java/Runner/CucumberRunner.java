package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features= "src/main/java/Features",
                 glue = "Step",
                 tags="not @functional")
public class CucumberRunner extends AbstractTestNGCucumberTests{

	
}
