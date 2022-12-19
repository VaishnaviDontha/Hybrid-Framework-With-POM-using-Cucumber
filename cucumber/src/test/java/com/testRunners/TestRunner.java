package com.testRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

// @CucumberOptions(
//         features = "src/test/resources/Appfeatures", 
//         glue = { "src/test/java/com/stepDefinations", "AppHooks" }, 
//         plugin = {"pretty", "html:target/cucumber-reports" }, 
//         monochrome = true)

@CucumberOptions(tags = "", features = {"src/test/resources/Appfeatures/LoginPage.feature"}, glue = {"com.stepDefinations"},
        plugin = {})
public class TestRunner extends AbstractTestNGCucumberTests {

}