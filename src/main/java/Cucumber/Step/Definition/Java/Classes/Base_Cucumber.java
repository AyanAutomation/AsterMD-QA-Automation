package Cucumber.Step.Definition.Java.Classes;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Cucumber {

	public static WebDriver d;
	public static String Target_url;

	@Before
	public void setup() throws IOException {
		Data_Fetcher_Cucumber f = new Data_Fetcher_Cucumber();
		String Browser = System.getProperty("Browser");
		if (Browser == null || Browser.isBlank()) Browser = System.getProperty("Browsername");
		if (Browser == null || Browser.isBlank()) Browser = f.Data_Fetcher("Browser");
		Target_url = System.getProperty("url") != null ? System.getProperty("url") : f.Data_Fetcher("Url");

		if (Browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			d = new ChromeDriver();
		} else if (Browser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			d = new FirefoxDriver();
		} else {
			throw new IllegalArgumentException("Unsupported browser: " + Browser + ". Supported values are Chrome and Firefox.");
		}

		d.manage().window().maximize();
	}

	@After
	public void Kill() {
		if (d != null) {
			d.quit();
			d = null;
		}
	}
}
