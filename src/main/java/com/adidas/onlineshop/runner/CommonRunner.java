package com.adidas.onlineshop.runner;

import com.adidas.onlineshop.commonutils.INVCommonTestBase;

import cucumber.api.CucumberOptions;

@CucumberOptions(features = "src/test/resources/feature/", glue = { "com/adidas/onlineshop/stepdefination" }, tags = {
		"@OnlineShopping" }, monochrome = true, strict = true, dryRun = false, plugin = { "pretty",
				"html:target/cucumber-reports/cucumber-pretty", "json:target/cucumber-reports/Userrunner.json",
				"rerun:target/cucumber-reports/rerun.txt" })

public class CommonRunner extends INVCommonTestBase {

}