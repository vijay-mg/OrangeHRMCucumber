package testrunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features="featurefiles/employee.feature",glue="stepdefinitions",dryRun=false)
public class EmployeeRegTest extends AbstractTestNGCucumberTests 
{

}
