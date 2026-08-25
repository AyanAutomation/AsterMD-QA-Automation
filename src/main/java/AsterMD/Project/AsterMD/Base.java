package AsterMD.Project.AsterMD;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public WebDriver d;
	public String Target_url;

	@BeforeMethod
	public void setup() throws IOException {
		Data_Reader f = new Data_Reader();
		String Browser = System.getProperty("Browser");
		if (Browser == null || Browser.isBlank()) Browser = System.getProperty("Browsername");
		if (Browser == null || Browser.isBlank()) Browser = f.Data_Fetcher("Browser");
		Target_url = System.getProperty("url") != null ? System.getProperty("url") : f.Data_Fetcher("Url");

		if (Browser.trim().toLowerCase().contains("chrome")) {
			
			WebDriverManager.chromedriver().setup(); // Automatically downloads/configures the compatible ChromeDriver.

			ChromeOptions options = new ChromeOptions(); // Creates ChromeOptions object to configure Chrome before browser launch.

			if(Browser.trim().toLowerCase().contains("headless")){ // Checks whether Browser value also contains "headless", e.g. "Chrome Headless".

				options.addArguments("--headless=new"); // Starts Chrome without opening the visible browser UI.
			}

			d = new ChromeDriver(options); // Launches Chrome using the configured ChromeOptions.

		} 
		
		if (Browser.trim().toLowerCase().contains("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options = new FirefoxOptions();
			
			if(Browser.trim().toLowerCase().contains("headless")){
				options.addArguments("-headless");
			}
			
			d = new FirefoxDriver(options);
		}
		
		if(Browser.trim().toLowerCase().contains("edge")){
			
			WebDriverManager.edgedriver().setup();
			EdgeOptions options = new EdgeOptions();
			
			if(Browser.trim().toLowerCase().contains("headless")){
				options.addArguments("--headless=new");
			}
			
			d = new EdgeDriver(options);
		}
		
		d.manage().window().maximize();
	}

	@AfterMethod(alwaysRun = true) // Runs after every TestNG test method even when the test fails.
	public void Kill() {
		if (d != null) {
  	d.quit();
			
		}
	}
}