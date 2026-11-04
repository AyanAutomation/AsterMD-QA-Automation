package Repeatative_codes;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Repeat {

	protected final WebDriver d;

	public Repeat(WebDriver d) {
		if (d == null) throw new IllegalArgumentException("WebDriver cannot be null.");
		this.d = d;
	}

	
	public void Scroll_up(){
		
		
		JavascriptExecutor js = (JavascriptExecutor) d;

	
		js.executeScript("window.scrollBy(0, -180);");
}
	
	public void React_Input_Value_Setter(WebElement element, String value) {

		JavascriptExecutor js = (JavascriptExecutor)d;

		js.executeScript(
				"const element=arguments[0];" +
				"const value=arguments[1];" +
				"const prototype=element.tagName==='TEXTAREA' ? HTMLTextAreaElement.prototype : HTMLInputElement.prototype;" +
				"const setter=Object.getOwnPropertyDescriptor(prototype,'value').set;" +
				"setter.call(element,value);" +
				"element.dispatchEvent(new Event('input',{bubbles:true}));" +
				"element.dispatchEvent(new Event('change',{bubbles:true}));",
				element, value);
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

	public void wait_for_displayed_elements(List<WebElement> elements) {
		WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(10));
		wait.ignoring(StaleElementReferenceException.class);
		wait.until(driver -> {
			for(WebElement element : elements){
				if(element.isDisplayed()) return true;
			}
			return false;
		});
	}

	public void wait_for_enabled_element(WebElement element) {
		WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(10));
		wait.ignoring(StaleElementReferenceException.class);
		wait.until(driver -> element.isEnabled());
	}

	public void wait_for_expected_text(WebElement element, String expected) {
		WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(10));
		wait.ignoring(StaleElementReferenceException.class);
		wait.withMessage("Expected element text was not reached: " + expected);
		wait.until(driver -> element.isDisplayed() && expected.equals(element.getText().trim()));
	}

	public void wait_for_selected_value(WebElement element, String expected) {
		String expectedValue = expected.replaceAll("\\s+", "");
		WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(10));
		wait.ignoring(StaleElementReferenceException.class);
		wait.withMessage("Dropdown did not display the selected value: " + expected);
		wait.until(driver -> element.isDisplayed() && element.getText().replaceAll("\\s+", "").equalsIgnoreCase(expectedValue));
	}

	public void wait_for_text_in_elements(List<WebElement> elements, String expected) {
		WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(20));
		wait.ignoring(StaleElementReferenceException.class);
		wait.until(driver -> {
			for(WebElement element : elements){
				if(element.isDisplayed() && element.getText().contains(expected)) return true;
			}
			return false;
		});
	}

	public void wait_for_collection_text_change(List<WebElement> elements, String previousText) {
		WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(10));
		wait.ignoring(StaleElementReferenceException.class);
		wait.until(driver -> {
			String currentText = "";
			for(WebElement element : elements){
				if(element.isDisplayed()) currentText += "|" + element.getText().trim();
			}
			return !currentText.isEmpty() && !currentText.equals(previousText);
		});
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
	
	public WebElement wait_for_presence_of_theElement(By by) {

		WebDriverWait w = new WebDriverWait(d, Duration.ofSeconds(10));
		w.until(ExpectedConditions.presenceOfElementLocated(by));
		return d.findElement(by);
	}
	public void wait_for_invisibilty_of_theElement(WebElement element){
		 
	     
	   	 WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
	   	 w.until(ExpectedConditions.invisibilityOf(element));
	   	 
		 }
	
	public boolean check_element_visibility(WebElement element, int Wait_Time) {

		try {

			WebDriverWait w = new WebDriverWait(d, Duration.ofSeconds(Wait_Time));
			w.ignoring(StaleElementReferenceException.class);
			w.until(ExpectedConditions.visibilityOf(element));

			return true;

		} catch(Exception e) {

			return false;
		}
	}
	public boolean check_element_visibility(List<WebElement> elements, int Wait_Time) {

		try {

			WebDriverWait w = new WebDriverWait(d, Duration.ofSeconds(Wait_Time));
			w.until(ExpectedConditions.visibilityOfAllElements(elements));

			return true;

		} catch(Exception e) {

			return false;
		}
	}
	

public void Hard_Refresh(){

	ChromeDriver chrome = (ChromeDriver) d;

	chrome.executeCdpCommand("Network.clearBrowserCache", new HashMap<String, Object>());
	chrome.navigate().refresh();
}

	
	public void Scroll_to_element(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)d;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	public void Scroll_to_Bottom_of_Page() {
		JavascriptExecutor js = (JavascriptExecutor)d;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	}
	
	
	public void error_message_checker(List<WebElement> elements){
		
		List<WebElement> Message_Elements=elements;
		for(WebElement Message_Element:Message_Elements){
			
			WebElement Message=Message_Element;
			String Message_Text=Message.getText().trim();
			System.out.println();
			System.out.println("Error Thrown Message :- "+Message_Text);
		}
		
	}
	
	

   public void Javascript_Click(WebElement element){
	JavascriptExecutor js = (JavascriptExecutor)d;
	js.executeScript("arguments[0].click();", element);
}

	

public String Fetch_Section_HTML(WebElement Section, String Section_Name){

    String Section_HTML = Section.getDomProperty("outerHTML");

    System.out.println();
    System.out.println("============================================================");
    System.out.println("              UI SECTION HTML : " + Section_Name);
    System.out.println("============================================================");
    System.out.println(Section_HTML);
    System.out.println("============================================================");
    System.out.println("              END HTML : " + Section_Name);
    System.out.println("============================================================");

    return Section_HTML;
}

}


