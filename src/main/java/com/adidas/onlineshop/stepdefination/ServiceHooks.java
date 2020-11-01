package com.adidas.onlineshop.stepdefination;

import java.util.logging.Logger;

import com.innovaccer.utils.Config;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ServiceHooks extends com.adidas.onlineshop.commonutils.INVCommonTestBase {
	private final static Logger logger = Logger.getLogger(ServiceHooks.class.getName());
	public static Scenario scenario;


	public static Config testConfig;

	@Before
	public void  initializeTest(Scenario scenario) {
		this.scenario = scenario;
	}
	
	@After
	public void verifyStatusCode() {
		
//		String statusCode="200";
//		if (statusCode.equals(String.valueOf(StepDefinitions.STATUS_CODE))) {
//			logger.info("This step runns after All steps of a scenario");
//			Assert.assertEquals(StepDefinitions.STATUS_CODE, statusCode);
//			logger.info("Status Code is :: " + StepDefinitions.STATUS_CODE);
//		} else {
//			Assert.assertEquals(StepDefinitions.STATUS_CODE, statusCode);
//			logger.info("Status Code is not as expected :: " + StepDefinitions.STATUS_CODE);
//		}
	}
}