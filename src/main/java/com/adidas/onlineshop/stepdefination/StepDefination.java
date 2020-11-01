package com.adidas.onlineshop.stepdefination;

import java.util.logging.Logger;

import org.testng.Assert;

import com.adidas.onlineshop.helper.OnlineShopHelper;
import com.adidas.onlineshop.pom.OnlineShopping;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class StepDefination {
	private final static Logger logger = Logger.getLogger(StepDefination.class.getName());

	@And("^launch Browser$")
	public void launchBrowser() throws InterruptedException {
		Thread.sleep(5000);
		logger.info("Launching Chrome Browser");
		OnlineShopHelper.launchBrowser("CH", "https://www.demoblaze.com/index.html");

	}
	
	@And("^Click on laptop Category$")
	public void selectlaptopAsCategoryType() throws InterruptedException {
		Thread.sleep(3000);
		logger.info("Selecting Laptop as a category type for shopping");
		OnlineShopping.clickOnCategoryType().click();

	}
	
	@And("^Select a laptop\"([^\"]*)\"$")
	public void selectAlaptop(String laptopName) throws InterruptedException {
		Thread.sleep(2000);
		logger.info("Selecting a laptop from a list of laptops");
		OnlineShopping.selectALaptopFromAListOfLaptop(laptopName).click();;

	}
	
	@And("^Click on Add to cart$")
	public void AddItemToTheCart() throws InterruptedException {
		Thread.sleep(3000);
		logger.info("Adding Items to the Cart");
		OnlineShopping.clickOnAddToCartButton().click();

	}
	
	@And("^Accept pop up confirmation$")
	public void AcceptPopUpConfirmation() throws InterruptedException {
		Thread.sleep(3000);
		logger.info("Accepting the popUp Confirmation");
		OnlineShopping.clickOnConfirmationButton();

	}
	
	@And("^Return to the homepage$")
	public void returnToTheHomePage() throws InterruptedException {
		Thread.sleep(3000);
		logger.info("Returning to the Homepage");
		OnlineShopping.navigateToTheHomePage();

	}
	
	@And("^Navigate to the cart$")
	public void navigateToTheCart() throws InterruptedException {
		Thread.sleep(3000);
		logger.info("Navigating to the cart");
		OnlineShopping.redirectToTheCart().click();

	}
	
	@And("^Delete item from the cart$")
	public void deleteItemFromTheCart() throws InterruptedException {
		Thread.sleep(3000);
		logger.info("Deleting Items from the cart");
		OnlineShopping.deleteSelectedItemFromCart().click();

	}
	
	@And("^Place order to purchase$")
	public void placeOrderToPurchase() throws InterruptedException {
		Thread.sleep(3000);
		logger.info("Placing the Order");
		OnlineShopping.clickOnPlaceOrderButton().click();

	}
	
	@And("^Fill the form$")
	public void fillTheForm() throws InterruptedException {
		logger.info("Filling the form Details");
		Thread.sleep(3000);
		OnlineShopping.enterName().click();
		Thread.sleep(2000);
		OnlineShopping.enterCountry().click();
		Thread.sleep(2000);
		OnlineShopping.enterCity().click();
		Thread.sleep(2000);
		OnlineShopping.enterCreditCardDetails().click();
		Thread.sleep(2000);
		OnlineShopping.enterMonth().click();
		Thread.sleep(2000);
		OnlineShopping.enterYear().click();

	}
	
	@And("^Purchase the Items$")
	public void purchaseTheItems() throws InterruptedException {
		Thread.sleep(3000);
		logger.info("Purchasing the Items");
		OnlineShopping.clickOnPurchaseButton().click();

	}
	
	@And("^Get the Purchase details$")
	public void getThePurchaseDetails() throws InterruptedException {
		Thread.sleep(3000);
		logger.info("Reflecting the Purchase details");
		String purchaseDetails = OnlineShopping.fetchPurchaseDetails().getText();
		String str [ ] = purchaseDetails.split("");
		
	}
	
	@And("^Validate The Purchase Amout$")
	public void validateTheAmount() throws InterruptedException {
		Thread.sleep(3000);
		logger.info("Validating the purchase Amount");
		Assert.assertEquals("", "");

	}
	
	@And("^Finish the shopping$")
	public void finishTheShopping() throws InterruptedException {
		Thread.sleep(3000);
		logger.info("Finishing the Shopping");
		OnlineShopping.clickOnOkButton().click();
		Thread.sleep(2000);
		OnlineShopHelper.closeBrowser();
	}
	
}
