package testrunners;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features="featurefiles/adminlogin.feature",glue="stepdefinitions",dryRun=false,
plugin= {"com.cucumber.listener.ExtentCucumberFormatter:reports/loginresult.html"},tags=("@tag1,@tag2"))
public class AdminLoginTest extends AbstractTestNGCucumberTests 
{

	
	
	
	
	
}
