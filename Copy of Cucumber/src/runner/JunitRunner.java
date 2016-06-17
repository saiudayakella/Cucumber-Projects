package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun=true,features="FeatureFile/login.feature",glue="stepDefinition",plugin={"html:Reports"},monochrome=true)

public class JunitRunner {
}
