package Locaters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Repeatative_codes.Repeat;

public class Patient_Portal_Locaters extends Repeat {

    @FindBy(id="login")
	private WebElement Yopmail_Inbox_Search; 
    @FindBy(xpath="//button[@title='Check Inbox @yopmail.com']")
	private WebElement Yopmail_Open_Inbox; 
    @FindBy(id="refresh")
	private WebElement Yopmail_Refresh; 
    @FindBy(id="ifinbox")
	private WebElement Yopmail_Inbox_Frame; 
    // Yopmail's inner message-list HTML was not supplied: verify this selector on the actual mailbox if its UI changes.
    @FindBy(xpath="(//button[contains(concat(' ',normalize-space(@class),' '),' lm ')] | //*[@id='e0'])[1]")
	private WebElement Yopmail_First_Mail; 
    @FindBy(id="ifmail")
	private WebElement Yopmail_Message_Frame; 
    @FindBy(xpath="//body[contains(.,'patient-care.trackease.net/set-password?token=')]")
	private WebElement Yopmail_Message_Body; 
    @FindBy(id="email")
	private WebElement Portal_Email; 
    @FindBy(id="password")
	private WebElement Portal_Password; 
    @FindBy(id="confirmPassword")
	private WebElement Portal_Confirm_Password; 
    @FindBy(xpath="//button[@type='submit' and .//span[normalize-space()='Continue']]")
	private WebElement Portal_Continue_Button; 
    @FindBy(xpath="//h1[normalize-space()='Patient portal']")
	private WebElement Portal_Login_Title; 

	public Patient_Portal_Locaters(WebDriver d){
	super(d);
	PageFactory.initElements(d, this);}

	public WebElement Yopmail_Inbox_Search(){
	wait_for_theElement(Yopmail_Inbox_Search);
	return Yopmail_Inbox_Search;}
	public WebElement Yopmail_Open_Inbox(){
	wait_for_theElement_to_be_clickable(Yopmail_Open_Inbox);
	return Yopmail_Open_Inbox;}
	public WebElement Yopmail_Refresh(){
	wait_for_theElement_to_be_clickable(Yopmail_Refresh);
	return Yopmail_Refresh;}
	public WebElement Yopmail_Inbox_Frame(){
	wait_for_theElement(Yopmail_Inbox_Frame);
	return Yopmail_Inbox_Frame;}
	public WebElement Yopmail_First_Mail(){
	wait_for_theElement_to_be_clickable(Yopmail_First_Mail);
	return Yopmail_First_Mail;}
	public WebElement Yopmail_Message_Frame(){
	wait_for_theElement(Yopmail_Message_Frame);
	return Yopmail_Message_Frame;}
	public WebElement Yopmail_Message_Body(){
	wait_for_theElement(Yopmail_Message_Body);
	return Yopmail_Message_Body;}
	public WebElement Portal_Email(){
	wait_for_theElement(Portal_Email);
	return Portal_Email;}
	public WebElement Portal_Password(){
	wait_for_theElement(Portal_Password);
	return Portal_Password;}
	public WebElement Portal_Confirm_Password(){
	wait_for_theElement(Portal_Confirm_Password);
	return Portal_Confirm_Password;}
	public WebElement Portal_Continue_Button(){
	wait_for_theElement_to_be_clickable(Portal_Continue_Button);
	return Portal_Continue_Button;}
	public WebElement Portal_Login_Title(){
	wait_for_theElement(Portal_Login_Title);
	return Portal_Login_Title;}
}
