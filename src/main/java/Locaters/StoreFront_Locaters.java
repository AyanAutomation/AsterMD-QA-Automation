package Locaters;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Repeatative_codes.Repeat;

public class StoreFront_Locaters extends Repeat {

    @FindBy(xpath="//nav//a[@aria-label='AsterMD home']")
	private WebElement Landed_in_Store_Front_page; 
    @FindBy(id="treatments")
	private WebElement Treatments_Product_Section; 
    @FindBy(xpath="//article[contains(@class,'flex flex-col justify-between rounded-[20px]')]")
	private List<WebElement> Product_Cards; 
    @FindBy(id="treatments-grid")
	private List<WebElement> Optional_Second_Treatment_List; 
    @FindBy(xpath="//button[@value='assessment']")
	private List<WebElement> Optional_Start_Assessment_Buttons; 
    @FindBy(css="form[data-intake-form]")
	private List<WebElement> Optional_Medical_Intake_Forms; 
    @FindBy(xpath="(//button[text()='Continue'])[1]")
	private WebElement Continue_Button; 
    @FindBy(id="intake-first_name")
	private WebElement Intake_First_Name; 
    @FindBy(id="intake-last_name")
	private WebElement Intake_Last_Name; 
    @FindBy(id="intake-email")
	private WebElement Intake_Email; 
    @FindBy(id="intake-phone")
	private WebElement Intake_Phone; 
    @FindBy(id="intake-date_of_birth")
	private List<WebElement> Intake_Birth_Date; 
    @FindBy(id="intake-state")
	private List<WebElement> Intake_State; 
    @FindBy(id="intake-bmi_unit_system")
	private List<WebElement> Intake_Unit_System; 
    @FindBy(id="intake-bmi_height")
	private List<WebElement> Intake_Height; 
    @FindBy(id="intake-bmi_weight")
	private List<WebElement> Intake_Weight; 
    @FindBy(xpath="//form[@data-intake-form]//*[@data-intake-page='0']//*[@data-intake-field='primary_goal' or @data-intake-field='weight_loss_goal']")
	private List<WebElement> Medical_Intake_Goal_Fields; 
    @FindBy(xpath="//form[@data-intake-form]//*[@data-intake-page and not(@hidden)]")
	private WebElement Medical_Intake_Active_Page; 
    @FindBy(xpath="//form[@data-intake-form]//*[@data-intake-page and not(@hidden)]//*[@data-intake-field]")
	private List<WebElement> Medical_Intake_Fields; 
    @FindBy(xpath="//form[@data-intake-form]//*[@data-intake-page and not(@hidden)]//label")
	private List<WebElement> Intake_Option_Labels; 
    @FindBy(xpath="//form[@data-intake-form]//*[@data-intake-page and not(@hidden)]//button[@data-intake-action='next_page']")
	private WebElement Medical_Intake_Next_Button; 
    @FindBy(xpath="//form[@data-intake-form]//*[@data-intake-page and not(@hidden)]//button[@data-intake-action='submit']")
	private WebElement Medical_Intake_Submit_Button; 
    @FindBy(xpath="//form[@data-intake-form]//*[@data-intake-page and not(@hidden)]//button[contains(@class,'bg-primary')]")
	private WebElement NAD_Next_Button; 
    @FindBy(xpath="//div[contains(@data-intake-field,'pregnancy_status')]//label[.//span[normalize-space()='No']]")
	private List<WebElement> Optional_Pregnancy_Status_No_Options; 
    @FindBy(id="intake-additional_notes")
	private WebElement Notes_textarea; 
    @FindBy(id="checkout-address")
	private WebElement Address_Field; 
    @FindBy(id="checkout-city")
	private WebElement City_Field; 
    @FindBy(id="checkout-state")
	private WebElement State_Dropdown; 
    @FindBy(id="checkout-postal")
	private WebElement Zipcode_Field; 
    @FindBy(id="checkout-card-number")
	private WebElement Card_Number; 
    @FindBy(id="checkout-card-expiry")
	private WebElement expiry_date; 
    @FindBy(id="checkout-card-cvc")
	private WebElement Security_Code; 
    @FindBy(xpath="//label[contains(@class,'cursor-pointer') and .//input[@type='checkbox']]")
	private List<WebElement> Agree_Checkboxes; 
    @FindBy(id="checkout-pay")
	private WebElement Checkout_Pay_Button; 
    @FindBy(xpath="//h1[text()='Thank you, ']")
	private WebElement Thank_You_Message; 
    @FindBy(xpath="//h1[span[@id='thankyou-name']]/preceding-sibling::p[1]")
	private WebElement Order_Number; 
    @FindBy(xpath="//h2[normalize-space()='Intake Received & Pending Review']")
	private WebElement Order_Status; 
    @FindBy(xpath="//p[normalize-space()='Provider / Doctor Review']/following-sibling::span[1]")
	private WebElement Doctor_Review_Status; 
    @FindBy(xpath="//p[normalize-space()='Prescription & Delivery']/following-sibling::span[1]")
	private WebElement Prescription_Status; 
    @FindBy(xpath="//p[normalize-space()='Contact information']/following-sibling::p[1]")
	private WebElement Order_Email; 
    @FindBy(xpath="//p[normalize-space()='Contact information']/following-sibling::p[2]")
	private WebElement Order_Phone; 
    @FindBy(xpath="//p[normalize-space()='Payment method']/following-sibling::p[1]")
	private WebElement Payment_Method; 
    @FindBy(xpath="//p[normalize-space()='Shipping address']/following-sibling::p[1]")
	private WebElement Shipping_Address; 
    @FindBy(xpath="//p[normalize-space()='Billing address']/following-sibling::p[1]")
	private WebElement Billing_Address; 
    @FindBy(xpath="//main//img[@alt]/ancestor::div[contains(@class,'items-center') and contains(@class,'gap-3')][1]//div[contains(@class,'flex-1')]/p[1]")
	private WebElement Order_Product; 
    @FindBy(xpath="//main//img[@alt]/ancestor::div[contains(@class,'relative')][1]/span[contains(@class,'absolute')][1]")
	private WebElement Order_Quantity; 
    @FindBy(xpath="//main//img[@alt]/ancestor::div[contains(@class,'items-center') and contains(@class,'gap-3')][1]/p[contains(@class,'shrink-0')][1]")
	private WebElement Order_Item_Price; 
    @FindBy(xpath="//span[starts-with(normalize-space(),'Subtotal')]/following-sibling::span[1]")
	private WebElement Order_Subtotal; 
    @FindBy(xpath="//span[normalize-space()='Consultation Fee']/following-sibling::span[1]")
	private WebElement Consultation_Fee; 
    @FindBy(xpath="//span[normalize-space()='Total']/following-sibling::span[1]")
	private WebElement Order_Total; 
    @FindBy(xpath="//p[contains(normalize-space(.),'Your card has been charged')]")
	private WebElement Payment_Notice; 
    @FindBy(xpath="//input[@id='checkout-email' or @type='email']")
	private WebElement Checkout_Email; 
    @FindBy(xpath="//input[@id='checkout-phone' or @type='tel']")
	private WebElement Checkout_Phone; 
    @FindBy(xpath="//input[@id='checkout-first-name' or @id='checkout-first_name' or @id='checkout-first' or @name='first_name' or @autocomplete='given-name']")
	private WebElement Checkout_First_Name; 
    @FindBy(xpath="//input[@id='checkout-last-name' or @id='checkout-last_name' or @id='checkout-last' or @name='last_name' or @autocomplete='family-name']")
	private WebElement Checkout_Last_Name;
    @FindBy(xpath="//p[@role='alert' and (contains(normalize-space(.),'Too many checkout attempts from this connection') or contains(normalize-space(.),'Invalid offer id'))]")
	private List<WebElement> Checkout_Retryable_Errors; 
    @FindBy(xpath="//button[@type='submit' and @name='intent' and @value='checkout']")
	private WebElement Proceed_To_Checkout_Button;




	public StoreFront_Locaters(WebDriver d){
	super(d);
	PageFactory.initElements(d, this);}

	public WebElement Landed_in_Store_Front_page(){
	wait_for_theElement(Landed_in_Store_Front_page);
	return Landed_in_Store_Front_page;}
	public WebElement Treatments_Product_Section(){
	wait_for_theElement(Treatments_Product_Section);
	return Treatments_Product_Section;}
	public List<WebElement> Product_Cards(){
	wait_for_theElement(Product_Cards);
	return Product_Cards;}
	public List<WebElement> Optional_Second_Treatment_List(){
	return Optional_Second_Treatment_List;}
	public List<WebElement> Optional_Start_Assessment_Buttons(){
	return Optional_Start_Assessment_Buttons;}
	public List<WebElement> Optional_Medical_Intake_Forms(){
	return Optional_Medical_Intake_Forms;}
	public WebElement Continue_Button(){
	wait_for_theElement(Continue_Button);
	return Continue_Button;}
	public WebElement Intake_First_Name(){
	wait_for_theElement(Intake_First_Name);
	return Intake_First_Name;}
	public WebElement Intake_Last_Name(){
	wait_for_theElement(Intake_Last_Name);
	return Intake_Last_Name;}
	public WebElement Intake_Email(){
	wait_for_theElement(Intake_Email);
	return Intake_Email;}
	public WebElement Intake_Phone(){
	wait_for_theElement(Intake_Phone);
	return Intake_Phone;}
	public List<WebElement> Intake_Birth_Date(){
	return Intake_Birth_Date;}
	public List<WebElement> Intake_State(){
	return Intake_State;}
	public List<WebElement> Intake_Unit_System(){
	return Intake_Unit_System;}
	public List<WebElement> Intake_Height(){
	return Intake_Height;}
	public List<WebElement> Intake_Weight(){
	return Intake_Weight;}
	public List<WebElement> Medical_Intake_Goal_Fields(){
	return Medical_Intake_Goal_Fields;}
	public WebElement Medical_Intake_Active_Page(){
	wait_for_theElement(Medical_Intake_Active_Page);
	return Medical_Intake_Active_Page;}
	public List<WebElement> Medical_Intake_Fields(){
	return Medical_Intake_Fields;}
	public List<WebElement> Intake_Option_Labels(){
	return Intake_Option_Labels;}
	public WebElement Medical_Intake_Next_Button(){
	wait_for_theElement_to_be_clickable(Medical_Intake_Next_Button);
	return Medical_Intake_Next_Button;}
	public WebElement Medical_Intake_Submit_Button(){
	wait_for_theElement_to_be_clickable(Medical_Intake_Submit_Button);
	return Medical_Intake_Submit_Button;}
	public WebElement NAD_Next_Button(){
	wait_for_theElement_to_be_clickable(NAD_Next_Button);
	return NAD_Next_Button;}
	public List<WebElement> Optional_Pregnancy_Status_No_Options(){
	return Optional_Pregnancy_Status_No_Options;}
	public WebElement Notes_textarea(){
	wait_for_theElement(Notes_textarea);
	return Notes_textarea;}
	public WebElement Address_Field(){
	wait_for_theElement(Address_Field);
	return Address_Field;}
	public WebElement City_Field(){
	wait_for_theElement(City_Field);
	return City_Field;}
	public WebElement State_Dropdown(){
	wait_for_theElement(State_Dropdown);
	return State_Dropdown;}
	public WebElement Zipcode_Field(){
	wait_for_theElement(Zipcode_Field);
	return Zipcode_Field;}
	public WebElement Card_Number(){
	wait_for_theElement(Card_Number);
	return Card_Number;}
	public WebElement expiry_date(){
	wait_for_theElement_to_be_clickable(expiry_date);
	return expiry_date;}
	public WebElement Security_Code(){
	wait_for_theElement(Security_Code);
	return Security_Code;}
	public List<WebElement> Agree_Checkboxes(){
	wait_for_theElement(Agree_Checkboxes);
	return Agree_Checkboxes;}
	public WebElement Checkout_Pay_Button(){
	wait_for_theElement_to_be_clickable(Checkout_Pay_Button);
	return Checkout_Pay_Button;}
	public WebElement Thank_You_Message(){
	wait_for_theElement(Thank_You_Message);
	return Thank_You_Message;}
	public WebElement Order_Number(){
	wait_for_theElement(Order_Number);
	return Order_Number;}
	public WebElement Order_Status(){
	wait_for_theElement(Order_Status);
	return Order_Status;}
	public WebElement Doctor_Review_Status(){
	wait_for_theElement(Doctor_Review_Status);
	return Doctor_Review_Status;}
	public WebElement Prescription_Status(){
	wait_for_theElement(Prescription_Status);
	return Prescription_Status;}
	public WebElement Order_Email(){
	wait_for_theElement(Order_Email);
	return Order_Email;}
	public WebElement Order_Phone(){
	wait_for_theElement(Order_Phone);
	return Order_Phone;}
	public WebElement Payment_Method(){
	wait_for_theElement(Payment_Method);
	return Payment_Method;}
	public WebElement Shipping_Address(){
	wait_for_theElement(Shipping_Address);
	return Shipping_Address;}
	public WebElement Billing_Address(){
	wait_for_theElement(Billing_Address);
	return Billing_Address;}
	public WebElement Order_Product(){
	wait_for_theElement(Order_Product);
	return Order_Product;}
	public WebElement Order_Quantity(){
	wait_for_theElement(Order_Quantity);
	return Order_Quantity;}
	public WebElement Order_Item_Price(){
	wait_for_theElement(Order_Item_Price);
	return Order_Item_Price;}
	public WebElement Order_Subtotal(){
	wait_for_theElement(Order_Subtotal);
	return Order_Subtotal;}
	public WebElement Consultation_Fee(){
	wait_for_theElement(Consultation_Fee);
	return Consultation_Fee;}
	public WebElement Order_Total(){
	wait_for_theElement(Order_Total);
	return Order_Total;}
	public WebElement Payment_Notice(){
	wait_for_theElement(Payment_Notice);
	return Payment_Notice;}
	public WebElement Second_Treatment_List(){
	WebElement Treatment_List = Optional_Second_Treatment_List.get(0);
	wait_for_theElement(Treatment_List);
	return Treatment_List;}
	public WebElement Star_Assesment_Button(){
	WebElement Assesment_Button = Optional_Start_Assessment_Buttons.get(0);
	wait_for_theElement(Assesment_Button);
	return Assesment_Button;}
	public WebElement Checkout_Email(){
	wait_for_theElement(Checkout_Email);
	return Checkout_Email;}
	public WebElement Checkout_Phone(){
	wait_for_theElement(Checkout_Phone);
	return Checkout_Phone;}
	public WebElement Checkout_First_Name(){
	wait_for_theElement(Checkout_First_Name);
	return Checkout_First_Name;}
	public WebElement Checkout_Last_Name(){
	wait_for_theElement(Checkout_Last_Name);
	return Checkout_Last_Name;}
	public List<WebElement> Checkout_Retryable_Errors(){
	return Checkout_Retryable_Errors;}
	public WebElement Proceed_To_Checkout_Button(){
	wait_for_theElement_to_be_clickable(Proceed_To_Checkout_Button);
	return Proceed_To_Checkout_Button;}

    
}
