package Repeatative_codes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Repeat {

	protected final WebDriver d;

	public Repeat(WebDriver d) {
		if (d == null) throw new IllegalArgumentException("WebDriver cannot be null.");
		this.d = d;
	}

	public void wait_for_theElement(WebElement element) {
		WebDriverWait w = new WebDriverWait(d, Duration.ofSeconds(10));
		w.until(ExpectedConditions.visibilityOf(element));
	}

	public void wait_for_theElement(List<WebElement> element) {
		if (element == null || element.isEmpty()) throw new IllegalArgumentException("Element list is null or empty. Check the locator or timing.");
		WebDriverWait w = new WebDriverWait(d, Duration.ofSeconds(10));
		w.until(ExpectedConditions.visibilityOfAllElements(element));
	}

	public void wait_for_theElement_to_be_clickable(WebElement element) {
		WebDriverWait w = new WebDriverWait(d, Duration.ofSeconds(10));
		w.until(ExpectedConditions.elementToBeClickable(element));
	}

	public String wait_for_alert_and_accept() {
		WebDriverWait w = new WebDriverWait(d, Duration.ofSeconds(10));
		Alert alert = w.until(ExpectedConditions.alertIsPresent());
		String message = alert.getText();
		alert.accept();
		return message;
	}

	public void movetoelement(WebElement element) {
		Actions a = new Actions(d);
		a.moveToElement(element).build().perform();
	}
	
	
	
	
	public boolean check_element_visibility(WebElement element, int Wait_Time) {

		try {

			WebDriverWait w = new WebDriverWait(d, Duration.ofSeconds(Wait_Time));
			w.until(ExpectedConditions.visibilityOf(element));

			return true;

		} catch(Exception e) {

			return false;
		}
	}
	public void Scroll_to_element(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)d;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
}
