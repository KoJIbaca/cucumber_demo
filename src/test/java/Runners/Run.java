package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;


@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"StepDefinitions"},
        tags = "")

public class Run extends AbstractTestNGCucumberTests {

    }

