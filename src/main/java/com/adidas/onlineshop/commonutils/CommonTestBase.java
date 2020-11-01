package com.adidas.onlineshop.commonutils;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

public class CommonTestBase extends AbstractTestNGCucumberTests {

	protected TestNGCucumberRunner testNGCucumberRunner;

	@Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
	public void feature(CucumberFeatureWrapper features) {

		testNGCucumberRunner.runCucumber(features.getCucumberFeature());

	}

	@DataProvider
	public Object[][] features() {
		return testNGCucumberRunner.provideFeatures();

	}

}
