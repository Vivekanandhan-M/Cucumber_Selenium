package com.qa.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "C:\\Users\\ADMIN\\eclipse-workspace\\RestAssuredAPI\\CucumberGradle_git\\Cucumber_Selenium\\src\\test\\java\\com\\qa\\Feature",
	glue = {"com.qa.Stepdefinition"},
	format = {"pretty" ,"html:test-result","json:json-result/acme.json"},
	dryRun = false,
	monochrome = true,
	strict = true
		)

public class TestRunner {

}
