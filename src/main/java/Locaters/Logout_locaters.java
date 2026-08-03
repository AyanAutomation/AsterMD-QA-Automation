package Locaters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Repeatative_codes.Repeat;

public class Logout_locaters extends Repeat {

	@FindBy(id = "logout2")
	private WebElement logout_button;

	@FindBy(id = "login2")
	private WebElement logout_confirmation;

	public Logout_locaters(WebDriver d) {
		super(d);
		PageFactory.initElements(d, this);
	}

	public WebElement logout_button() {
		wait_for_theElement_to_be_clickable(logout_button);
		return logout_button;
	}

	public WebElement logout_confirmation() {
		wait_for_theElement(logout_confirmation);
		return logout_confirmation;
	}
}
