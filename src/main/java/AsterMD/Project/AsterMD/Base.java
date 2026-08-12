package AsterMD.Project.AsterMD;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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

		if (Browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			d = new ChromeDriver();
		} else  {
			WebDriverManager.firefoxdriver().setup();
			d = new FirefoxDriver();
		}

		d.manage().window().maximize();
	}

	@AfterMethod(alwaysRun = true)
	public void Kill() {
		if (d != null) {
    d.quit();
			
		}
	}
}
