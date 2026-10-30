package Locaters;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Listerners.Report_Listen;
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
    @FindBy(xpath="//div[@id='mailctn']//div[@id='mail'][contains(.,'https://testdemo.logistial.com/set-password?token=')]")
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
    @FindBy(xpath="//main")
	private WebElement Teleform_Main;
    @FindBy(xpath="//main//div[contains(@class,'formProgressMeta')]")
	private WebElement Teleform_Page_Indicator;
    @FindBy(xpath="//main//button[contains(@class,'ant-btn-color-default')]")
	private List<WebElement> Teleform_Buttons;
    @FindBy(xpath="//main//input[@placeholder]")
	private List<WebElement> Teleform_Inputs;
    @FindBy(xpath="//main//input[@type='email' and @placeholder='Enter Email Address']")
	private WebElement Teleform_Account_Email;
    @FindBy(xpath="//main//div[contains(@class,'fieldCard')][.//textarea]")
	private List<WebElement> Teleform_Textarea_Cards;
    @FindBy(xpath="//main//div[contains(@class,'fieldCard')][.//textarea]//textarea")
	private List<WebElement> Teleform_Textareas;
    @FindBy(xpath="//main//div[contains(@class,'fieldCard')][.//input[@type='radio' or @type='checkbox']]")
	private List<WebElement> Teleform_Choice_Cards;
    @FindBy(xpath="//main//input[@placeholder='Select date']")
	private WebElement Teleform_DOB_Input;
    @FindBy(xpath="//main//div[contains(@class,'fieldCard')][.//span[normalize-space()='BIOLOGICAL SEX AT BIRTH']]//div[contains(@class,'ant-select-show-arrow')]")
	private WebElement Teleform_Sex_Dropdown;
    @FindBy(xpath="//main//input[@type='tel' and @placeholder='Enter phone number']")
	private WebElement Teleform_Phone;
    @FindBy(xpath="//main//label[contains(@class,'ant-checkbox-wrapper') and contains(.,'I agree to')]/span[contains(concat(' ',normalize-space(@class),' '),' ant-checkbox ')]")
	private WebElement Teleform_Terms_Consent;
    @FindBy(xpath="//div[contains(@class,'ant-select-dropdown') and not(contains(@class,'ant-select-dropdown-hidden'))]//div[contains(@class,'ant-select-item-option') and @title]")
	private List<WebElement> Teleform_Dropdown_Options;
    @FindBy(xpath="//div[contains(@class,'ant-picker-dropdown') and not(contains(@class,'ant-picker-dropdown-hidden'))]//button[contains(@class,'ant-picker-year-btn')]")
	private WebElement Teleform_DOB_Year_Button;
    @FindBy(xpath="//div[contains(@class,'ant-picker-dropdown') and not(contains(@class,'ant-picker-dropdown-hidden'))]//button[contains(@class,'ant-picker-header-super-prev-btn')]")
	private WebElement Teleform_DOB_Previous_Decade;
    @FindBy(xpath="//div[contains(@class,'ant-picker-year-panel')]//td[contains(@class,'ant-picker-cell-in-view')]")
	private List<WebElement> Teleform_DOB_Years;
    @FindBy(xpath="//div[contains(@class,'ant-picker-dropdown') and not(contains(@class,'ant-picker-dropdown-hidden'))]//button[contains(@class,'ant-picker-month-btn')]")
	private WebElement Teleform_DOB_Month_Button;
    @FindBy(xpath="//div[contains(@class,'ant-picker-month-panel')]//td[contains(@class,'ant-picker-cell-in-view')]")
	private List<WebElement> Teleform_DOB_Months;
    @FindBy(xpath="//div[contains(@class,'ant-picker-date-panel')]//td[@title and contains(@class,'ant-picker-cell-in-view') and not(contains(@class,'ant-picker-cell-disabled'))]")
	private List<WebElement> Teleform_DOB_Days;
    @FindBy(xpath="//main//div[contains(@class,'summaryText')]//h3")
	private List<WebElement> Teleform_Completed_Products;
    @FindBy(xpath="//div[contains(@class,'__fieldError')]")
	public List<WebElement> Form_error_Messages;
    @FindBy(xpath="//div[@role='alert' and contains(@class,'app-toast--success')][.//div[contains(@class,'ant-notification-notice-title') and normalize-space()='Action Successful'] and .//div[contains(@class,'ant-notification-notice-description') and normalize-space()='Submitted successfully.']]")
	public WebElement Teleform_Submission_Success_Toast;
    @FindBy(xpath="//section[.//h2[normalize-space()='ID VERIFICATION']]//div[contains(@class,'fieldCard')][.//span[normalize-space()='SSN']]//input[@type='text']")
    private WebElement ID_Verification_SSN;
    @FindBy(xpath="//section[.//h2[normalize-space()='ID VERIFICATION']]//div[contains(@class,'fieldCard')][.//span[normalize-space()='ID Verification']]//input[@type='file']")
    private WebElement ID_Verification_File_Input;
    @FindBy(xpath="//section[.//h2[normalize-space()='ID VERIFICATION']]//div[contains(@class,'uploadCardName')]")
    private WebElement ID_Verification_Uploaded_File_Name;
    @FindBy(xpath="//section[.//h2[normalize-space()='ID VERIFICATION']]//button[.//span[normalize-space()='Submit']]")
    private WebElement ID_Verification_Submit;
    @FindBy(xpath="//section[.//h2[normalize-space()='ID VERIFICATION']]//h2[normalize-space()='ID VERIFICATION']")
    private WebElement ID_Verification_Title;
    @FindBy(xpath="//div[@role='alert' and contains(@class,'app-toast--success')]")
    public WebElement ID_Verification_Success_Toast;
    @FindBy(xpath="(//div[contains(@class,'__uploadGrid')]//div[contains(@class,'teleforms-module-') and contains(@class,'__uploadCard')])[1]")
    public WebElement Upload_image_card;

    

    

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
	public WebElement Teleform_Main(){
	Boolean Visible = check_element_visibility(Teleform_Main, 5);
	if(Visible) return Teleform_Main;
	else throw Teleform_Locator_Failure("Teleform main container is not visible.");}
	public WebElement Teleform_Page_Indicator(){
	Boolean Visible = check_element_visibility(Teleform_Page_Indicator, 5);
	if(Visible) return Teleform_Page_Indicator;
	else throw Teleform_Locator_Failure("Teleform page indicator is not visible.");}
	public WebElement Teleform_Account_Email(){
	Boolean Visible = check_element_visibility(Teleform_Account_Email, 5);
	if(Visible) return Teleform_Account_Email;
	else throw Teleform_Locator_Failure("Teleform account email field is not visible.");}
	public WebElement Teleform_DOB_Input(){
	Boolean Visible = check_element_visibility(Teleform_DOB_Input, 5);
	if(Visible) return Teleform_DOB_Input;
	else throw Teleform_Locator_Failure("Teleform Date of Birth field is not visible.");}
	public WebElement Teleform_Sex_Dropdown(){
	Boolean Visible = check_element_visibility(Teleform_Sex_Dropdown, 5);
	if(Visible) return Teleform_Sex_Dropdown;
	else throw Teleform_Locator_Failure("Biological Sex dropdown is not visible.");}
	public WebElement Teleform_Phone(){
	Boolean Visible = check_element_visibility(Teleform_Phone, 5);
	if(Visible) return Teleform_Phone;
	else throw Teleform_Locator_Failure("Teleform phone number field is not visible.");}
	
	public WebElement Teleform_Terms_Consent(){
	Boolean Visible = check_element_visibility(Teleform_Terms_Consent, 5);
	if(Visible) 
	{ 
		wait_for_theElement_to_be_clickable(Teleform_Terms_Consent);
		movetoelement(Teleform_Terms_Consent);
		return Teleform_Terms_Consent;}
	else {
	throw Teleform_Locator_Failure("Terms and Telehealth Consent checkbox is not visible.");}}
	
    public WebElement Teleform_Button(String Text){
    System.out.println("Searching for Teleform button with text: " + Text);
	Boolean Buttons_Visible = check_element_visibility(Teleform_Buttons, 10);
	if(Buttons_Visible){
		for(WebElement Button : Teleform_Buttons){
			if(Button.getText().trim().equalsIgnoreCase(Text)){
				Boolean Button_Visible = check_element_visibility(Button, 5);
				if(Button_Visible){
					return Button;
				}
				else{
					throw Teleform_Locator_Failure("Teleform button not visible: " + Text);
				}}}
		throw Teleform_Locator_Failure("Teleform button not found: " + Text);}
	else{
		throw Teleform_Locator_Failure("Teleform buttons are not visible.");
	    }}

	public WebElement Teleform_Field(String Label){
	for(WebElement Input : Teleform_Inputs){
		if(Label.equalsIgnoreCase(Input.getDomAttribute("placeholder"))){
			Boolean Visible = check_element_visibility(Input, 5);
			if(Visible) return Input;
			else throw Teleform_Locator_Failure("Teleform input is not visible: " + Label);
		}
	}
	throw Teleform_Locator_Failure("Teleform input not found: " + Label);}
	public WebElement Teleform_Textarea(String Question){
	for(int n=0;n<Teleform_Textarea_Cards.size();n++){
		if(Teleform_Textarea_Cards.get(n).getText().contains(Question)){
			WebElement Textarea = Teleform_Textareas.get(n);
			Boolean Visible = check_element_visibility(Textarea, 5);
			if(Visible) return Textarea;
			else throw Teleform_Locator_Failure("Teleform textarea is not visible: " + Question);
		}
	}
	throw Teleform_Locator_Failure("Teleform textarea not found: " + Question);}
	public List<WebElement> Teleform_Choice_Cards(){
	Boolean Visible = check_element_visibility(Teleform_Choice_Cards, 5);
	if(Visible) return Teleform_Choice_Cards;
	else throw Teleform_Locator_Failure("Teleform choice question cards are not visible.");}
	public WebElement Teleform_Question_Label(WebElement Question_Card){
	WebElement Label = Question_Card.findElement(By.xpath(".//div[contains(@class,'fieldLabel')]/span[1]"));
	Boolean Visible = check_element_visibility(Label, 5);
	if(Visible) return Label;
	else throw Teleform_Locator_Failure("Teleform question label is not visible.");}
	public WebElement Teleform_Choice_Option(WebElement Question_Card, String Answer){
	List<WebElement> Options = Question_Card.findElements(By.xpath(".//label[contains(@class,'ant-radio-wrapper') or contains(@class,'ant-checkbox-wrapper')]"));
	for(WebElement Option : Options){
		if(Option.getText().trim().equalsIgnoreCase(Answer)){
			Boolean Visible = check_element_visibility(Option, 5);
			if(Visible) return Option;
			else throw Teleform_Locator_Failure("Teleform answer option is not visible: " + Answer);
		}
	}
	throw Teleform_Locator_Failure("Teleform answer option not found: " + Answer);}
	
public WebElement Teleform_Dropdown_Option(String Option){
	Boolean Visible = check_element_visibility(Teleform_Dropdown_Options, 5);
	if(!Visible) throw Teleform_Locator_Failure("Teleform dropdown options are not visible.");
	for(WebElement Item : Teleform_Dropdown_Options){
		String Item_Text = Item.getDomAttribute("title");
		if(Item_Text.equalsIgnoreCase(Option)){
			Visible = check_element_visibility(Item, 5);
			if(Visible) return Item;
			else throw Teleform_Locator_Failure("Teleform dropdown option not visible: " + Option);
		}
	}
	throw Teleform_Locator_Failure("Teleform dropdown option not found: " + Option);}

public WebElement ID_Verification_SSN(){
	Boolean Visible = check_element_visibility(ID_Verification_SSN, 5);
	if(Visible){
		wait_for_theElement_to_be_clickable(ID_Verification_SSN);
		movetoelement(ID_Verification_SSN);
		return ID_Verification_SSN;
	}
	else{
		throw Teleform_Locator_Failure("ID Verification SSN field is not visible.");
	}
}
public WebElement ID_Verification_File_Input(){
	return ID_Verification_File_Input;
}
public WebElement ID_Verification_Uploaded_File_Name(){
	Boolean Visible = check_element_visibility(ID_Verification_Uploaded_File_Name, 5);
	if(Visible){
		movetoelement(ID_Verification_Uploaded_File_Name);
		return ID_Verification_Uploaded_File_Name;
	}
	else{
		throw Teleform_Locator_Failure("ID Verification uploaded file was not displayed.");
	}
}
public WebElement ID_Verification_Submit(){
	Boolean Visible = check_element_visibility(ID_Verification_Submit, 5);
	if(Visible){
		wait_for_theElement_to_be_clickable(ID_Verification_Submit);
		movetoelement(ID_Verification_Submit);
		return ID_Verification_Submit;
	}
	else{
		throw Teleform_Locator_Failure("ID Verification Submit button is not visible.");
	   } }
    public WebElement ID_Verification_Title(){
	Boolean Visible = check_element_visibility(ID_Verification_Title, 5);
	if(Visible){
		return ID_Verification_Title;
	}
	else{
		throw Teleform_Locator_Failure("ID Verification form title is not visible.");
	}}   
    public WebElement Teleform_DOB_Year_Button(){
	Boolean Visible = check_element_visibility(Teleform_DOB_Year_Button, 5);
	if(Visible) return Teleform_DOB_Year_Button;
	else throw Teleform_Locator_Failure("DOB calendar year-selection button is not visible.");}
	public WebElement Teleform_DOB_Previous_Decade(){
	Boolean Visible = check_element_visibility(Teleform_DOB_Previous_Decade, 5);
	if(Visible) return Teleform_DOB_Previous_Decade;
	else throw Teleform_Locator_Failure("DOB calendar previous-decade button is not visible.");}
	public List<WebElement> Teleform_DOB_Year_Options(String Year){
	Boolean Visible = check_element_visibility(Teleform_DOB_Years, 5);
	if(!Visible) throw Teleform_Locator_Failure("DOB calendar year options are not visible.");
	List<WebElement> Options = new ArrayList<>();
	for(WebElement Option : Teleform_DOB_Years){
		if(Option.getText().trim().equals(Year)) Options.add(Option);
	}
	return Options;}
	public WebElement Teleform_DOB_Month_Button(){
	Boolean Visible = check_element_visibility(Teleform_DOB_Month_Button, 5);
	if(Visible) return Teleform_DOB_Month_Button;
	else throw Teleform_Locator_Failure("DOB calendar month-selection button is not visible.");}

public WebElement Teleform_DOB_Month_Option(String Month){
	Boolean Visible = check_element_visibility(Teleform_DOB_Months, 5);
	if(!Visible) throw Teleform_Locator_Failure("DOB month options are not visible.");
	for(WebElement Option : Teleform_DOB_Months){
		String Month_Text = Option.getText().trim();
		if(Month_Text.equalsIgnoreCase(Month)) return Option;
	}
	throw Teleform_Locator_Failure("DOB month not found: " + Month);}

	public WebElement Teleform_DOB_Day_Option(String Date){
	for(WebElement Option : Teleform_DOB_Days){
		if(Date.equals(Option.getDomAttribute("title"))){
			Boolean Visible = check_element_visibility(Option, 5);
			if(Visible) return Option;
			else throw Teleform_Locator_Failure("DOB calendar day is not visible: " + Date);}}
	throw Teleform_Locator_Failure("DOB calendar day not found: " + Date);}
	public WebElement Teleform_Completed_Product(String Product_Name){
	for(WebElement Product : Teleform_Completed_Products){
		if(Product.getText().trim().equalsIgnoreCase(Product_Name)){
			Boolean Visible = check_element_visibility(Product, 5);
			if(Visible) return Product;
			else throw Teleform_Locator_Failure("Completed treatment is not visible: " + Product_Name);}}
	throw Teleform_Locator_Failure("Completed treatment not found: " + Product_Name);}
    private IllegalStateException Teleform_Locator_Failure(String Reason){
	System.out.println("❌ " + Reason);
	Report_Listen.log_print_in_report().fail(Reason);
	return new IllegalStateException(Reason);}

    }
