package com.hooksSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	
	@RunWith(Cucumber.class)
	@CucumberOptions(
					
					monochrome=true,
					dryRun=false,/////(See the concept of dry run properly)
					
					features= {"src/test/resources/com/hooksFF/"},
					glue={"com/hooksSD/"},
					
					plugin={"pretty",
							"html:target/cucumber-htmlreport",
							"json:target/cucumber-report5.json",
							"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport5.html"
					}
			
			)
	
	public class RunHooksTest {	
	

}
	
	
	//////DRY run sees that Step Definition file is missiong or not
	
	/////C:\3rd dec\CucumberB15\target---Go in this path to see Extent Reports.
	
	
	////"html:target/cucumber-htmlreport",(These Files added in POM)
	////"json:target/cucumber-report5.json",
	////"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport5.html"
	
