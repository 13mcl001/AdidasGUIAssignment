package com.adidas.onlineshop.helper;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class OnlineShopHelper {

	public static WebDriver Driver;

	private static Logger Log = Logger.getLogger(OnlineShopHelper.class.getName());

	public static WebDriver launchBrowser(String sBrowsername, String sURL) {
		try {
			ChromeOptions options = new ChromeOptions();
			switch (sBrowsername) {
			case "FF": {
				System.setProperty("webdriver.gecko.driver", "BrowsersExe_Library/geckodriver.exe");
				Driver = new FirefoxDriver();
				Driver.manage().window().maximize();
				Driver.get(sURL);
				Log.info("Firefox browser has been launched successfully.");
				break;

			}

			case "CH": {
				String oSName = System.getProperty("os.name");
				if (oSName.contains("Windows")) {

					System.setProperty("webdriver.chrome.driver", "BrowsersExe_Library/chromedriver.exe");

				} else if (oSName.contains("Linux")) {

					System.setProperty("webdriver.chrome.driver", "BrowsersExe_Library/chromedriver_Linux");
					options.addArguments("--headless");
				} else {
					System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
				}

				Map<String, Object> prefs = new HashMap<String, Object>();
				prefs.put("profile.default_content_setting_values.notifications", 2);
				prefs.put("credentials_enable_service", false);
				prefs.put("profile.password_manager_enabled", false);
				DesiredCapabilities capabilities = DesiredCapabilities.chrome();

				options.setExperimentalOption("prefs", prefs);
				options.addArguments("disable-infobars");
				capabilities.setCapability(ChromeOptions.CAPABILITY, options);
				Driver = new ChromeDriver(capabilities);
				Driver.manage().window().maximize();
				Thread.sleep(3000);
				Driver.get(sURL);
				break;
			}

			case "IE": {
				System.setProperty("webdriver.ie.driver", "BrowsersExe_Library/IEDriverServer.exe");
				Driver = new InternetExplorerDriver();
				Driver.manage().window().maximize();
				Driver.get(sURL);
				Log.info("Internet Explorer browser has been launched successfully.");
				break;
			}
			default:
				break;

			}

		} catch (Exception e) {

			Log.error("Exception on fn_LaunchBrowser - " + e.getMessage());
		}
		return Driver;

	}
	
	public static void closeBrowser() {
		Driver.close();
	}
	
}