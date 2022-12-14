package com.testRunners;

import io.cucumber.testng.CucumberOptions;

public class TestRunner {

    @CucumberOptions(tags = "", features = "src/test/resources/Features/loginTest.feature", glue = "StepDefinations")
    public class TestNGTestRunner {

    }

}
