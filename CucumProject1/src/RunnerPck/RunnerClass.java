package RunnerPck;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFolder/sample1.feature", glue="cucum.step.dev")

public class RunnerClass {

}
