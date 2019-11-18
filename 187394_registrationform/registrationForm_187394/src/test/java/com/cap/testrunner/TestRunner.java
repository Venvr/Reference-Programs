package com.cap.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
       features = "src/test/java/features/Register.feature",
       glue= {"com.cg.stepdefinition"},
       //dryRun=true,
       monochrome=true,
       //strict=true,
       // tags= {"@SmokeTest,@RegressionTest","~@End2End"},
      plugin = {"html:target/Destination"}
       )

public class TestRunner {

}
