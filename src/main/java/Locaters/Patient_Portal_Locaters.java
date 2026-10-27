package Locaters;

import java.util.List;

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
    @FindBy(xpath="//div[contains(@class,'tabGroup')]//a[contains(@href,'/')]")
	private List<WebElement> Patient_Portal_Header_Menu_Options;
    @FindBy(xpath="//*[text()='Incomplete Treatments']/../../..//div[@class='ant-collapse-panel ant-collapse-panel-active']//div[contains(@class,'ant-card ant-card-bordered')]")
	private List<WebElement> Incomplete_Treatment_Cards;
    @FindBy(xpath="//h2[normalize-space()='About You']")
	private WebElement Intake_Page_Heading;
    @FindBy(xpath="//input[@placeholder='Enter first name']")
	private WebElement Intake_First_Name;
    @FindBy(xpath="//input[@placeholder='Enter last name']")
	private WebElement Intake_Last_Name;
    @FindBy(xpath="//input[@placeholder='Enter email address']")
	private WebElement Intake_Email_Address;
    @FindBy(xpath="//input[@placeholder='Enter phone number']")
	private WebElement Intake_Phone_Number;
    @FindBy(xpath="//div[contains(@class,'fieldCard')][.//span[normalize-space()='What state do you live in?']]//div[contains(@class,'ant-select') and contains(@class,'ant-select-show-arrow')]")
	private WebElement Intake_State_Dropdown;
    @FindBy(xpath="//div[contains(@class,'fieldCard')][.//span[normalize-space()='Unit System']]//div[contains(@class,'ant-select') and contains(@class,'ant-select-show-arrow')]")
	private WebElement Intake_Unit_System_Dropdown;
    @FindBy(xpath="//div[contains(@class,'ant-select-dropdown') and not(contains(@class,'ant-select-dropdown-hidden'))]//div[contains(@class,'ant-select-item-option') and @title]")
	private List<WebElement> Intake_Dropdown_Options;
    @FindBy(xpath="//div[contains(@class,'ant-select-dropdown') and not(contains(@class,'ant-select-dropdown-hidden'))]//div[contains(@class,'ant-select-dropdown-list-holder')]")
   	private WebElement Intake_Dropdown_Scroll_Holder;
    @FindBy(xpath="//div[contains(@class,'fieldCard')][.//div[contains(@class,'fieldLabel')]//span[normalize-space()='Height']]//input[@type='number']")
	private WebElement Intake_Height;
    @FindBy(xpath="//div[contains(@class,'fieldCard')][.//div[contains(@class,'fieldLabel')]//span[normalize-space()='Weight']]//input[@type='number']")
	private WebElement Intake_Weight;
    @FindBy(xpath="//div[contains(@class,'fieldCard')][.//div[@role='radiogroup']]//label")
	private List<WebElement> Intake_Radio_Question_Cards;
    @FindBy(xpath="//button[normalize-space()='Next']")
	private WebElement Intake_Next_Button;
    @FindBy(xpath="//button[contains(@class,'canvasTabActive')][.//span[normalize-space()='Page 2']]")
	private WebElement Intake_Second_Page_Active;
    @FindBy(xpath="//div[contains(@class,'tabGroup')]")
	private WebElement Header_Tab;
    @FindBy(xpath="//h1[text()='Treatments']")
	public WebElement Landed_in_Treatment_Page;
    @FindBy(xpath="//*[name()='svg' and @aria-labelledby='treatment-summary-skeleton-aria']")
	private WebElement Treatment_Summary_Loader;
    @FindBy(xpath="//div[contains(@class,'fieldGridDynamic')]//label")
	private List<WebElement> Second_Intake_Radio_Question_Labels;
    @FindBy(xpath="//div[contains(@class,'fieldCard')][.//div[contains(@class,'fieldLabel')]/span[normalize-space()='Date of Birth']]//input[@placeholder='Select date']")
	private WebElement Intake_Date_Of_Birth;
    @FindBy(xpath="//div[@class='ant-collapse-item ant-collapse-item-active']//div[contains(@class,'ant-collapse-panel-active')]")
	public WebElement Active_Tab;


   
    
    
    
    

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
	public List<WebElement> Patient_Portal_Header_Menu_Options(){
	wait_for_theElement(Patient_Portal_Header_Menu_Options);
	return Patient_Portal_Header_Menu_Options;}
	public List<WebElement> Incomplete_Treatment_Cards(){
	wait_for_invisibilty_of_theElement(Treatment_Summary_Loader);
    wait_for_theElement(Incomplete_Treatment_Cards);
	return Incomplete_Treatment_Cards;}
	public WebElement Intake_Page_Heading(){
	wait_for_theElement(Intake_Page_Heading);
	return Intake_Page_Heading;}
	public WebElement Intake_First_Name(){
	wait_for_theElement(Intake_First_Name);
	return Intake_First_Name;}
	public WebElement Intake_Last_Name(){
	wait_for_theElement(Intake_Last_Name);
	return Intake_Last_Name;}
	public WebElement Intake_Email_Address(){
	wait_for_theElement(Intake_Email_Address);
	return Intake_Email_Address;}
	public WebElement Intake_Phone_Number(){
	wait_for_theElement(Intake_Phone_Number);
	return Intake_Phone_Number;}
	public WebElement Intake_State_Dropdown(){
	wait_for_theElement_to_be_clickable(Intake_State_Dropdown);
	return Intake_State_Dropdown;}
	public WebElement Intake_Unit_System_Dropdown(){
	wait_for_theElement_to_be_clickable(Intake_Unit_System_Dropdown);
	return Intake_Unit_System_Dropdown;}
	public List<WebElement> Intake_Dropdown_Options(){
	return Intake_Dropdown_Options;}
	public WebElement Intake_Dropdown_Scroll_Holder(){
	wait_for_theElement(Intake_Dropdown_Scroll_Holder);
	return Intake_Dropdown_Scroll_Holder;}
    public WebElement Intake_Height(){
	wait_for_theElement(Intake_Height);
	return Intake_Height;}
	public WebElement Intake_Weight(){
	wait_for_theElement(Intake_Weight);
	return Intake_Weight;}
	public List<WebElement> Intake_Radio_Question_Cards(){
	return Intake_Radio_Question_Cards;}
    public WebElement Intake_Next_Button(){
	wait_for_theElement_to_be_clickable(Intake_Next_Button);
	return Intake_Next_Button;}
	public WebElement Intake_Second_Page_Active(){
	wait_for_theElement(Intake_Second_Page_Active);
	return Intake_Second_Page_Active;}
	public WebElement Header_Tab(){
	wait_for_theElement(Header_Tab);
	return Header_Tab;}
	public List<WebElement> Second_Intake_Radio_Question_Labels(){
	return Second_Intake_Radio_Question_Labels;}
	public WebElement Intake_Date_Of_Birth(){
	wait_for_theElement(Intake_Date_Of_Birth);
	return Intake_Date_Of_Birth;}
	public WebElement Active_Tab(){
	wait_for_theElement(Active_Tab);
	return Active_Tab;}
	
}
