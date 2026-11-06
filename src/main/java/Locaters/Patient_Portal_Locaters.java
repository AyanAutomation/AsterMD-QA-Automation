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
    @FindBy(xpath="//div[contains(@class,'auth-error-alert')]")
	private WebElement Portal_Auth_Error_Alert;
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
    @FindBy(xpath="//div[contains(concat(' ',normalize-space(@class),' '),' ant-select-dropdown ') and not(contains(concat(' ',normalize-space(@class),' '),' ant-select-dropdown-hidden '))]//*[contains(concat(' ',normalize-space(@class),' '),' ant-select-item-option ') and not(contains(concat(' ',normalize-space(@class),' '),' ant-select-item-option-disabled '))]")
	private List<WebElement> Intake_Dropdown_Options;
    @FindBy(xpath="//div[contains(concat(' ',normalize-space(@class),' '),' ant-select-dropdown ') and not(contains(concat(' ',normalize-space(@class),' '),' ant-select-dropdown-hidden '))]//div[contains(concat(' ',normalize-space(@class),' '),' ant-select-dropdown-list-holder ')]")
	private List<WebElement> Intake_Dropdown_Scroll_Holder;
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
    @FindBy(xpath="//section[contains(@class,'canvasPreview')]")
	private WebElement Teleform_Main;
    @FindBy(xpath="//section[contains(@class,'canvasPreview')]//div[contains(@class,'formProgressMeta')]")
	private WebElement Teleform_Page_Indicator;
    @FindBy(xpath="//section[contains(@class,'canvasPreview')]//input[@type='email' and @placeholder='Enter the email used for your order']")
	private WebElement Teleform_Account_Email;
    @FindBy(xpath="//section[contains(@class,'canvasPreview')]//div[contains(@class,'fieldCard')][.//textarea]")
	private List<WebElement> Teleform_Textarea_Cards;
    @FindBy(xpath="//section[contains(@class,'canvasPreview')]//div[contains(@class,'fieldCard')][.//textarea]//textarea")
	private List<WebElement> Teleform_Textareas;
    @FindBy(xpath="//section[contains(@class,'canvasPreview')]//div[contains(@class,'fieldCard')][.//input[@type='radio' or @type='checkbox']]")
	private List<WebElement> Teleform_Choice_Cards;
    @FindBy(xpath="//section[contains(@class,'canvasPreview')]//input[@placeholder='Select date']")
	private WebElement Teleform_DOB_Input;
    @FindBy(xpath="//section[contains(@class,'canvasPreview')]//div[contains(@class,'fieldCard')][.//div[contains(@class,'fieldLabel')]/span[normalize-space()='Sex for your medical record']]//div[contains(@class,'ant-select-show-arrow')]")
	private WebElement Teleform_Sex_Dropdown;
    @FindBy(xpath="//section[contains(@class,'canvasPreview')]//input[@type='tel' and @placeholder='10-digit US mobile number']")
	private WebElement Teleform_Phone;
    @FindBy(xpath="//section[contains(@class,'canvasPreview')]//label[contains(@class,'ant-checkbox-wrapper') and contains(.,'I have read and agree to')]/span[contains(concat(' ',normalize-space(@class),' '),' ant-checkbox ')]")
	private WebElement Teleform_Terms_Consent;
    @FindBy(xpath="//section[contains(@class,'canvasPreview')]//div[contains(@class,'fieldCard')][.//div[contains(@class,'fieldLabel')]/span[normalize-space()='Which concern are you requesting care for?']]//div[contains(@class,'ant-select-show-arrow')]")
	private WebElement Teleform_Care_Reason_Dropdown;
    @FindBy(xpath="//section[contains(@class,'canvasPreview')]//div[contains(@class,'fieldCard')][.//div[contains(@class,'fieldLabel')]/span[normalize-space()='Residential state']]//div[contains(@class,'ant-select-show-arrow')]")
	private WebElement Teleform_Residential_State_Dropdown;
    @FindBy(xpath="//section[contains(@class,'canvasPreview')]//div[contains(@class,'fieldCard')][.//div[contains(@class,'fieldLabel')]/span[normalize-space()='State where you are physically located for this visit']]//div[contains(@class,'ant-select-show-arrow')]")
	private WebElement Teleform_Current_Location_State_Dropdown;
    @FindBy(xpath="//section[contains(@class,'canvasPreview')]//label[contains(@class,'ant-checkbox-wrapper') and (contains(.,'I confirm that I am the patient') or contains(.,'I have read and agree to'))]/span[contains(concat(' ',normalize-space(@class),' '),' ant-checkbox ')]")
	private List<WebElement> Teleform_Consent_Checkboxes;
    @FindBy(xpath="//div[contains(concat(' ',normalize-space(@class),' '),' ant-select-dropdown ') and not(contains(concat(' ',normalize-space(@class),' '),' ant-select-dropdown-hidden '))]//*[contains(concat(' ',normalize-space(@class),' '),' ant-select-item-option ') and not(contains(concat(' ',normalize-space(@class),' '),' ant-select-item-option-disabled '))]")
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
    @FindBy(xpath="//main//div[contains(@class,'fieldCard')][.//div[contains(@class,'fieldLabel')]/span[normalize-space()='SSN']]//input[@type='text']")
	private WebElement Teleform_SSN;
    @FindBy(xpath="//main//div[contains(@class,'fieldCard')][.//div[contains(@class,'fieldLabel')]/span[normalize-space()='File Upload']]//input[@type='file']")
	private WebElement Teleform_ID_File_Input;
    @FindBy(xpath="//main//div[contains(@class,'fieldCard')][.//div[contains(@class,'fieldLabel')]/span[normalize-space()='File Upload']]")
	private WebElement Teleform_ID_Upload_Section;
    @FindBy(xpath="//main//div[contains(@class,'fieldCard')][.//div[contains(@class,'fieldLabel')]/span[normalize-space()='File Upload']]//div[contains(@class,'fieldError') and normalize-space()='Please wait for the file upload to finish.']")
	private WebElement Teleform_ID_Upload_Pending_Message;
    @FindBy(xpath="//main//div[contains(@class,'fieldCard')][.//div[contains(@class,'fieldLabel')]/span[normalize-space()='File Upload Field']]//input[@type='file']")
	private List<WebElement> Teleform_Additional_File_Inputs;
    @FindBy(css="div[role='alert'], main div[class*='__fieldError'], main .ant-form-item-explain-error, main input:invalid, main textarea:invalid, main select:invalid")
	public List<WebElement> Teleform_Submission_Messages;
    @FindBy(xpath="//section[contains(@class,'canvasPreview')]//div[contains(@class,'fieldCard')][.//div[contains(@class,'fieldLabel')]/span[normalize-space()='Legal first name']]//input[@placeholder]")
	private WebElement Teleform_First_Name;
    @FindBy(xpath="//section[contains(@class,'canvasPreview')]//div[contains(@class,'fieldCard')][.//div[contains(@class,'fieldLabel')]/span[normalize-space()='Legal last name']]//input[@placeholder]")
	private WebElement Teleform_Last_Name;
    @FindBy(xpath="//section[contains(@class,'canvasPreview')]//div[contains(@class,'fieldCard')][.//div[contains(@class,'fieldLabel')]/span[normalize-space()='Residential street address, including apartment or unit']]//input[@placeholder]")
	private WebElement Teleform_Address;
    @FindBy(xpath="//section[contains(@class,'canvasPreview')]//div[contains(@class,'fieldCard')][.//div[contains(@class,'fieldLabel')]/span[normalize-space()='City']]//input[@placeholder]")
	private WebElement Teleform_City;
    @FindBy(xpath="//section[contains(@class,'canvasPreview')]//div[contains(@class,'fieldCard')][.//div[contains(@class,'fieldLabel')]/span[normalize-space()='ZIP code (5 digits)']]//input[@placeholder]")
	private WebElement Teleform_ZIP;
    @FindBy(xpath="//section[contains(@class,'canvasPreview')]//button[contains(@class,'ant-btn-color-default') and normalize-space()='Continue']")
	private WebElement Teleform_Continue_Button;
    @FindBy(xpath="//section[contains(@class,'canvasPreview')]//button[contains(@class,'ant-btn-color-default') and normalize-space()='Submit intake']")
	private WebElement Teleform_Submit_Button;
    @FindBy(xpath="//div[contains(@class,'__sectionBlock')]")
	private WebElement ID_Verification_Form;
    @FindBy(xpath="//div[contains(@class,'__sectionBlock')]//input[@type='text']")
	private WebElement ID_Verification_SSN;
    @FindBy(xpath="//div[contains(@class,'canvasPaper')][.//h2[normalize-space()='ID VERIFICATIONS']]//div[contains(@class,'fieldCard')][.//div[contains(@class,'fieldLabel')]/span[normalize-space()='ID Verification']]")
	private WebElement ID_Verification_Upload_Section;
    @FindBy(xpath="//div[contains(@class,'canvasPaper')][.//h2[normalize-space()='ID VERIFICATIONS']]//div[contains(@class,'fieldCard')][.//div[contains(@class,'fieldLabel')]/span[normalize-space()='ID Verification']]//input[@type='file']")
	private WebElement ID_Verification_File_Input;
    @FindBy(xpath="//div[contains(@class,'canvasPaper')][.//h2[normalize-space()='ID VERIFICATIONS']]//button[normalize-space()='Submit']")
	private WebElement ID_Verification_Submit_Button;

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
	public Boolean Portal_Auth_Error_Alert_Visible(){
		return check_element_visibility(Portal_Auth_Error_Alert, 10);
	}
	public List<WebElement> Patient_Portal_Header_Menu_Options(){
	wait_for_displayed_elements(Patient_Portal_Header_Menu_Options);
	return Patient_Portal_Header_Menu_Options;}
	public List<WebElement> Incomplete_Treatment_Cards(){
	wait_for_displayed_elements(Incomplete_Treatment_Cards);
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
	wait_for_displayed_elements(Intake_Dropdown_Options);
	return Intake_Dropdown_Options;}
	public List<WebElement> Intake_Dropdown_Scroll_Holder(){
	wait_for_displayed_elements(Intake_Dropdown_Scroll_Holder);
	return Intake_Dropdown_Scroll_Holder;}
	public WebElement Intake_Height(){
	wait_for_theElement(Intake_Height);
	return Intake_Height;}
	public WebElement Intake_Weight(){
	wait_for_theElement(Intake_Weight);
	return Intake_Weight;}
	public List<WebElement> Intake_Radio_Question_Cards(){
	wait_for_displayed_elements(Intake_Radio_Question_Cards);
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
	public WebElement Landed_in_Treatment_Page(){
	wait_for_theElement(Landed_in_Treatment_Page);
	return Landed_in_Treatment_Page;}
	public WebElement Treatment_Summary_Loader(){
	wait_for_invisibilty_of_theElement(Treatment_Summary_Loader);
	return Treatment_Summary_Loader;}
	public List<WebElement> Second_Intake_Radio_Question_Labels(){
	wait_for_displayed_elements(Second_Intake_Radio_Question_Labels);
	return Second_Intake_Radio_Question_Labels;}
	public WebElement Intake_Date_Of_Birth(){
	wait_for_theElement(Intake_Date_Of_Birth);
	return Intake_Date_Of_Birth;}
	public WebElement Active_Tab(){
	wait_for_theElement(Active_Tab);
	return Active_Tab;}
	public WebElement Teleform_Main(){
	wait_for_theElement(Teleform_Main);
	return Teleform_Main;}
	public WebElement Teleform_Page_Indicator(){
	wait_for_theElement(Teleform_Page_Indicator);
	return Teleform_Page_Indicator;}
	public WebElement Teleform_Account_Email(){
	wait_for_theElement(Teleform_Account_Email);
	return Teleform_Account_Email;}
	public List<WebElement> Teleform_Textarea_Cards(){
	wait_for_displayed_elements(Teleform_Textarea_Cards);
	return Teleform_Textarea_Cards;}
	public List<WebElement> Teleform_Textareas(){
	wait_for_displayed_elements(Teleform_Textareas);
	return Teleform_Textareas;}
	public List<WebElement> Teleform_Choice_Cards(){
	wait_for_displayed_elements(Teleform_Choice_Cards);
	return Teleform_Choice_Cards;}
	public WebElement Teleform_DOB_Input(){
	wait_for_theElement(Teleform_DOB_Input);
	return Teleform_DOB_Input;}
	public WebElement Teleform_Sex_Dropdown(){
	wait_for_theElement_to_be_clickable(Teleform_Sex_Dropdown);
	return Teleform_Sex_Dropdown;}
	public WebElement Teleform_Phone(){
	wait_for_theElement_to_be_clickable(Teleform_Phone);
	return Teleform_Phone;}
	public WebElement Teleform_Terms_Consent(){
	wait_for_theElement_to_be_clickable(Teleform_Terms_Consent);
	return Teleform_Terms_Consent;}
	public WebElement Teleform_Care_Reason_Dropdown(){
	wait_for_theElement_to_be_clickable(Teleform_Care_Reason_Dropdown);
	return Teleform_Care_Reason_Dropdown;}
	public WebElement Teleform_Residential_State_Dropdown(){
	wait_for_theElement_to_be_clickable(Teleform_Residential_State_Dropdown);
	return Teleform_Residential_State_Dropdown;}
	public WebElement Teleform_Current_Location_State_Dropdown(){
	wait_for_theElement_to_be_clickable(Teleform_Current_Location_State_Dropdown);
	return Teleform_Current_Location_State_Dropdown;}
	public List<WebElement> Teleform_Consent_Checkboxes(){
	wait_for_displayed_elements(Teleform_Consent_Checkboxes);
	return Teleform_Consent_Checkboxes;}
	public List<WebElement> Teleform_Dropdown_Options(){
	wait_for_displayed_elements(Teleform_Dropdown_Options);
	return Teleform_Dropdown_Options;}
	public WebElement Teleform_DOB_Year_Button(){
	wait_for_theElement_to_be_clickable(Teleform_DOB_Year_Button);
	return Teleform_DOB_Year_Button;}
	public WebElement Teleform_DOB_Previous_Decade(){
	wait_for_theElement_to_be_clickable(Teleform_DOB_Previous_Decade);
	return Teleform_DOB_Previous_Decade;}
	public List<WebElement> Teleform_DOB_Years(){
	wait_for_displayed_elements(Teleform_DOB_Years);
	return Teleform_DOB_Years;}
	public WebElement Teleform_DOB_Month_Button(){
	wait_for_theElement_to_be_clickable(Teleform_DOB_Month_Button);
	return Teleform_DOB_Month_Button;}
	public List<WebElement> Teleform_DOB_Months(){
	wait_for_displayed_elements(Teleform_DOB_Months);
	return Teleform_DOB_Months;}
	public List<WebElement> Teleform_DOB_Days(){
	wait_for_displayed_elements(Teleform_DOB_Days);
	return Teleform_DOB_Days;}
	public List<WebElement> Teleform_Completed_Products(){
	wait_for_displayed_elements(Teleform_Completed_Products);
	return Teleform_Completed_Products;}
	public List<WebElement> Form_error_Messages(){
	// Optional control: absence or hidden state is valid.
	return Form_error_Messages;}
	public WebElement Teleform_Submission_Success_Toast(){
	wait_for_theElement(Teleform_Submission_Success_Toast);
	return Teleform_Submission_Success_Toast;}
	public WebElement Teleform_SSN(){
	wait_for_theElement_to_be_clickable(Teleform_SSN);
	return Teleform_SSN;}
	public WebElement Teleform_ID_File_Input(){
	wait_for_enabled_element(Teleform_ID_File_Input);
	return Teleform_ID_File_Input;}
	public WebElement Teleform_ID_Upload_Section(){
	wait_for_theElement(Teleform_ID_Upload_Section);
	return Teleform_ID_Upload_Section;}
	public WebElement Teleform_ID_Upload_Pending_Message(){
	// Optional control: absence or hidden state is valid.
	return Teleform_ID_Upload_Pending_Message;}
	public List<WebElement> Teleform_Additional_File_Inputs(){
	// Optional control: absence or hidden state is valid.
	return Teleform_Additional_File_Inputs;}
	public List<WebElement> Teleform_Submission_Messages(){
	// Optional control: absence or hidden state is valid.
	return Teleform_Submission_Messages;}
	public WebElement Teleform_First_Name(){
	wait_for_theElement_to_be_clickable(Teleform_First_Name);
	return Teleform_First_Name;}
	public WebElement Teleform_Last_Name(){
	wait_for_theElement_to_be_clickable(Teleform_Last_Name);
	return Teleform_Last_Name;}
	public WebElement Teleform_Address(){
	wait_for_theElement_to_be_clickable(Teleform_Address);
	return Teleform_Address;}
	public WebElement Teleform_City(){
	wait_for_theElement_to_be_clickable(Teleform_City);
	return Teleform_City;}
	public WebElement Teleform_ZIP(){
	wait_for_theElement_to_be_clickable(Teleform_ZIP);
	return Teleform_ZIP;}
	public WebElement Teleform_Continue_Button(){
	wait_for_theElement_to_be_clickable(Teleform_Continue_Button);
	return Teleform_Continue_Button;}
	public WebElement Teleform_Submit_Button(){
	wait_for_theElement_to_be_clickable(Teleform_Submit_Button);
	return Teleform_Submit_Button;}
	public WebElement ID_Verification_Form(){
		wait_for_theElement(ID_Verification_Form);
		return ID_Verification_Form;
	}
	public WebElement ID_Verification_SSN(){
		wait_for_theElement_to_be_clickable(ID_Verification_SSN);
		return ID_Verification_SSN;
	}
	public WebElement ID_Verification_Upload_Section(){
		wait_for_theElement(ID_Verification_Upload_Section);
		return ID_Verification_Upload_Section;
	}
	public WebElement ID_Verification_File_Input(){
		wait_for_enabled_element(ID_Verification_File_Input);
		return ID_Verification_File_Input;
	}
	public WebElement ID_Verification_Submit_Button(){
		wait_for_theElement_to_be_clickable(ID_Verification_Submit_Button);
		return ID_Verification_Submit_Button;
	}

}
