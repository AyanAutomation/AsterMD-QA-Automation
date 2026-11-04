package Locaters;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Repeatative_codes.Repeat;

public class Settings_Module_Locater extends Repeat{

    @FindBy(xpath="//ul[contains(@class,'ant-menu ant-menu-root ant-menu-inline ant-menu-light')]")
	private WebElement Submenu;
    @FindBy(xpath="//div[contains(@class,'__anchor-component')]//div[contains(@class,'pt-16 pb-16 ')]")
	public List<WebElement> Cards;
    @FindBy(xpath="//h2[normalize-space()='Extensions']")
	private WebElement Landed_in_extension_Module;
    @FindBy(xpath="//div[contains(@class,'ant-modal-body')]//form[.//input[@name='verification_process']]")
	private WebElement Popup_Form;
    @FindBy(xpath="//div[contains(@class,'ant-modal-body')]//input[@name='verification_process' and @value='patient_portal']")
	private WebElement Verify_in_Patient_Portal_Radio;
    @FindBy(xpath="//div[contains(@class,'ant-modal-body')]//label[.//input[@name='verification_process' and @value='patient_portal']]")
	private WebElement Verify_in_Patient_Portal_Option;
    @FindBy(xpath="//div[contains(@class,'ant-modal-body')]//input[@id='id_upload']")
	private WebElement ID_Upload_Checkbox;
    @FindBy(xpath="//div[contains(@class,'ant-modal-body')]//label[.//input[@id='id_upload']]")
	private WebElement ID_Upload_Option;
    @FindBy(xpath="//div[contains(@class,'ant-modal-body')]//input[@id='ssn_input']")
	private WebElement SSN_Input_Checkbox;
    @FindBy(xpath="//div[contains(@class,'ant-modal-body')]//label[.//input[@id='ssn_input']]")
	private WebElement SSN_Input_Option;
    @FindBy(xpath="//div[contains(@class,'ant-modal-body')]//input[@id='verification_form']/..")
	private WebElement Verification_Form_Dropdown;
    @FindBy(xpath="//div[contains(@class,'ant-modal-body')]//input[@id='verification_form']")
	private WebElement Verification_Form_Search;
    @FindBy(xpath="div.ant-select-dropdown:not(.ant-select-dropdown-hidden) div.ant-select-item-option")
	private List<WebElement> Verification_Form_Options;
    @FindBy(xpath="//span[text()='Save Settings']/..")
	private WebElement Save_Button;
    @FindBy(xpath="//span[text()='Cancel']/..")
	private WebElement Cancel_Button;
    @FindBy(xpath="//div[@class='ant-notification-notice-content']")
	public WebElement Success_Toast;

	public Settings_Module_Locater(WebDriver d){
		super(d);
		PageFactory.initElements(d, this);
	}

	public WebElement Submenu(){
		wait_for_theElement(Submenu);
		return Submenu;
	}

	public List<WebElement> Cards(){
		wait_for_theElement(Cards);
		return Cards;
	}

	public WebElement Landed_in_extension_Module(){
		wait_for_theElement(Landed_in_extension_Module);
		return Landed_in_extension_Module;
	}

	public WebElement Popup_Form(){
		wait_for_theElement(Popup_Form);
		return Popup_Form;
	}

	public WebElement Verify_in_Patient_Portal_Radio(){
		wait_for_theElement(Verify_in_Patient_Portal_Option);
		return Verify_in_Patient_Portal_Radio;
	}

	public WebElement Verify_in_Patient_Portal_Option(){
		wait_for_theElement_to_be_clickable(Verify_in_Patient_Portal_Option);
		return Verify_in_Patient_Portal_Option;
	}

	public WebElement ID_Upload_Checkbox(){
		wait_for_theElement(ID_Upload_Option);
		return ID_Upload_Checkbox;
	}

	public WebElement ID_Upload_Option(){
		wait_for_theElement_to_be_clickable(ID_Upload_Option);
		return ID_Upload_Option;
	}

	public WebElement SSN_Input_Checkbox(){
		wait_for_theElement(SSN_Input_Option);
		return SSN_Input_Checkbox;
	}

	public WebElement SSN_Input_Option(){
		wait_for_theElement_to_be_clickable(SSN_Input_Option);
		return SSN_Input_Option;
	}

	public WebElement Verification_Form_Dropdown(){
		wait_for_theElement_to_be_clickable(Verification_Form_Dropdown);
		Scroll_to_element(Verification_Form_Dropdown);
		return Verification_Form_Dropdown;
	}

	public WebElement Verification_Form_Search(){
		wait_for_theElement_to_be_clickable(Verification_Form_Search);
		return Verification_Form_Search;
	}

	public List<WebElement> Verification_Form_Options(){
		wait_for_theElement(Verification_Form_Options);
		return Verification_Form_Options;
	}

	public WebElement Save_Button(){
		wait_for_theElement_to_be_clickable(Save_Button);
		return Save_Button;
	}

	public WebElement Cancel_Button(){
		wait_for_theElement_to_be_clickable(Cancel_Button);
		return Cancel_Button;
	}

	public WebElement Success_Toast(){
		wait_for_theElement(Success_Toast);
		return Success_Toast;
	}
}
