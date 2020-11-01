package com.adidas.onlineshop.pom;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.adidas.onlineshop.helper.OnlineShopHelper;

public class OnlineShopping {

	private final static Logger logger = Logger.getLogger(OnlineShopping.class);
	private static WebElement element = null;
	private static List<WebElement> elementlist = null;

	public static WebElement clickOnCategoryType() {

		try {
			element = OnlineShopHelper.Driver.findElement(By.xpath("//a[contains(text(),'Laptops')]"));
			logger.info("Successfully clicked on category type");
		} catch (Exception e) {
			logger.info("Issue while selecting category type" + e.getMessage());

		}
		return element;

	}
	
	public static WebElement selectALaptopFromAListOfLaptop(String laptopName) {

		try {
			element = OnlineShopHelper.Driver.findElement(By.xpath("//a[contains(text(),'"+laptopName+")]"));
			logger.info("Successfully selected a laptop "+ laptopName );
		} catch (Exception e) {
			logger.info("Issue While selecting a laptop" + e.getMessage());

		}
		return element;

	}
	
	public static WebElement clickOnAddToCartButton() {

		try {
			element = OnlineShopHelper.Driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]"));
			logger.info("Successfully clicked on Add to cart Button");
		} catch (Exception e) {
			logger.info("Issue While clicking on Add to cart Button");

		}
		return element;

	}
	
	public static WebElement clickOnConfirmationButton() {

		try {
			OnlineShopHelper.Driver.switchTo().alert().accept();
			logger.info("Successfully clicked on Confirmation Button" );
		} catch (Exception e) {
			logger.info("Issue while clicking on Confirmation Button" + e.getMessage());

		}
		return element;

	}
	
	public static WebElement navigateToTheHomePage() {

		try {
			element = OnlineShopHelper.Driver.findElement(By.xpath("//a[@id='nava']"));
			logger.info("Successfully naviagted to the homapage" );
		} catch (Exception e) {
			logger.info("Issue while navigating to the homepage" + e.getMessage());

		}
		return element;

	}
	
	public static WebElement redirectToTheCart() {

		try {
			element = OnlineShopHelper.Driver.findElement(By.xpath("//a[@id='cartur']"));
			logger.info("Successfully naviagted to the cart" );
		} catch (Exception e) {
			logger.info("Issue while navigating to the cart" + e.getMessage());

		}
		return element;

	}
	
	public static WebElement deleteSelectedItemFromCart() {

		try {
			element = OnlineShopHelper.Driver.findElement(By.xpath("//tr//td[contains(text(),'Dell i7 8gb')]/following-sibling::td/a"));
			logger.info("Successfully deleted item from the cart" );
		} catch (Exception e) {
			logger.info("Issue while deleting item from the cart" + e.getMessage());

		}
		return element;

	}
	
	public static WebElement clickOnPlaceOrderButton() {

		try {
			element = OnlineShopHelper.Driver.findElement(By.xpath("//button[contains(text(),'Place Order')]"));
			logger.info("Successfully clicked on Place order button" );
		} catch (Exception e) {
			logger.info("Issue while clicking on Place order button" + e.getMessage());

		}
		return element;

	}
	
	public static WebElement enterName() {

		try {
			element = OnlineShopHelper.Driver.findElement(By.xpath("//input[@id='name']"));
			logger.info("Successfully entered Name" );
		} catch (Exception e) {
			logger.info("Issue entering Name" + e.getMessage());

		}
		return element;

	}
	
	public static WebElement enterCountry() {

		try {
			element = OnlineShopHelper.Driver.findElement(By.xpath("//input[@id='country']"));
			logger.info("Successfully entered Country" );
		} catch (Exception e) {
			logger.info("Issue while entering Country Name" + e.getMessage());

		}
		return element;

	}
	
	public static WebElement enterCity() {

		try {
			element = OnlineShopHelper.Driver.findElement(By.xpath("//input[@id='city']"));
			logger.info("Successfully entered city" );
		} catch (Exception e) {
			logger.info("Issue while entering city name" + e.getMessage());

		}
		return element;

	}
	
	public static WebElement enterCreditCardDetails() {

		try {
			element = OnlineShopHelper.Driver.findElement(By.xpath("//input[@id='card']"));
			logger.info("Successfully entered creditcard details" );
		} catch (Exception e) {
			logger.info("Issue while Entered creditcard details" + e.getMessage());

		}
		return element;

	}
	
	public static WebElement enterMonth() {

		try {
			element = OnlineShopHelper.Driver.findElement(By.xpath("//input[@id='month']"));
			logger.info("Successfully entered month" );
		} catch (Exception e) {
			logger.info("Issue while entering month" + e.getMessage());

		}
		return element;

	}
	
	public static WebElement enterYear() {

		try {
			element = OnlineShopHelper.Driver.findElement(By.xpath("//input[@id='year']"));
			logger.info("Successfully entered year" );
		} catch (Exception e) {
			logger.info("Issue while entering year" + e.getMessage());

		}
		return element;

	}
	
	public static WebElement clickOnPurchaseButton() {

		try {
			element = OnlineShopHelper.Driver.findElement(By.xpath("//input[@id='year']"));
			logger.info("Successfully clicked on Purchase button" );
		} catch (Exception e) {
			logger.info("Issue while clicking on purchase Button" + e.getMessage());

		}
		return element;

	}
	
	public static WebElement fetchPurchaseDetails() {

		try {
			element = OnlineShopHelper.Driver.findElement(By.xpath("//p[@class='lead text-muted ']"));
			logger.info("Successfully received  Purchase details" );
		} catch (Exception e) {
			logger.info("Issue while receiving purchase details " + e.getMessage());

		}
		return element;

	}
	
	public static WebElement clickOnOkButton() {

		try {
			element = OnlineShopHelper.Driver.findElement(By.xpath("//button[contains(text(),'OK')]"));
			logger.info("Successfully clicked on Ok button" );
		} catch (Exception e) {
			logger.info("Issue while clicking on Ok Button" + e.getMessage());

		}
		return element;

	}
	
	public static List<WebElement> DisclaimerList() {

		try {
			elementlist = OnlineShopHelper.Driver.findElements(By.xpath("//a[@id='dicalimer-dismiss-button']"));
			logger.info("Select Disclaimer List");
		} catch (Exception e) {
			logger.info("Fail to locate the element {}", e);
		}
		return elementlist;
	}

}
