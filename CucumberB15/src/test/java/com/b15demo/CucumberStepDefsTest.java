package com.b15demo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
					monochrome = true, //console output in readable format
					features={"src/test/resources/com/b15demo/"},
							glue={"com/b15demo/"},
					//dryRun = true,
					plugin = {"pretty", 
							"html:target/cucumber-htmlreport", 
							"json:target/cucumber-report"+1+".json",
							"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"
					}
					)



public class CucumberStepDefsTest {
}