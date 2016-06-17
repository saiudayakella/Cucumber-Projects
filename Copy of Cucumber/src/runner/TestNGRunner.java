package runner;

//import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFile/login.feature",glue="stepDefinition",plugin={"html:Reports"},monochrome=true)


public class TestNGRunner extends AbstractTestNGCucumberTests {
}
