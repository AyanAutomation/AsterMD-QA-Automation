package Locaters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Repeatative_codes.Repeat;

public class Login_Locaters extends Repeat {

	@FindBy(xpath = "//*[text()='Welcome to AsterMD']")
	private WebElement Landed_in_Login_Page;

	@FindBy(id = "email")
	private WebElement id_field;

	@FindBy(id = "password")
	private WebElement password_field;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement Login_button;

	@FindBy(xpath = "//*[@class='ant-layout-sider-children']")
	private WebElement login_confirmation;
	
	@FindBy(xpath = "//*[contains(@class,'auth-error-alert')]")
	private WebElement Login_error_alert;
	@FindBy(xpath="//div[@role='progressbar']")
	private WebElement Progress_bar;

	public Login_Locaters(WebDriver d) {
		super(d);
		PageFactory.initElements(d, this);
	}

	public WebElement Landed_in_Login_Page() {
		wait_for_theElement(Landed_in_Login_Page);
		return Landed_in_Login_Page;
	}

	public WebElement id_field() {
		wait_for_theElement(id_field);
		return id_field;
	}

	public WebElement password_field() {
		wait_for_theElement(password_field);
		return password_field;
	}

	public WebElement Login_button() {
		wait_for_theElement_to_be_clickable(Login_button);
		return Login_button;
	}

	public WebElement login_confirmation() {
		wait_for_theElement(login_confirmation);
		return login_confirmation;
	}

	public WebElement Login_error_alert() {
		wait_for_theElement(Login_error_alert);
		return Login_error_alert();
	}
	
	public WebElement Progress_bar() {
		wait_for_theElement(Progress_bar);
		return Progress_bar();
	}
}
