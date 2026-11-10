package Locaters;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Repeatative_codes.Repeat;

public class Dr_Network_locaters extends Repeat {

	public static final By Visit_Patient = By.xpath(".//td[3]");

	
	
	@FindBy(xpath="//h1[text()='Dashboard']")
	private WebElement Landed_in_Simulator; 
    @FindBy(id="mainNav")
	private WebElement Header_Nav_Bar; 
    @FindBy(xpath="//ul[@data-bs-popper='static']")
	private WebElement Dropdown; 
    @FindBy(id="visitsTable")
	private WebElement Visit_Table; 
    @FindBy(xpath="//tr[@class='bl-row-link' and not(contains(@style, 'display: none;'))]")
	private List<WebElement> Visit_Rows;
    @FindBy(xpath="//dt[normalize-space()='masterId']/following-sibling::dd[1]")
	private WebElement Visit_Master_ID;
    @FindBy(xpath="//dt[normalize-space()='Email']/following-sibling::dd[1]")
	private WebElement Visit_Patient_Email;
    @FindBy(xpath="//input[@type='search' and @class='form-control form-control-sm']")
	private WebElement Search; 
    @FindBy(id="visitTabs")
	private WebElement Visit_details_tabs; 
    @FindBy(id="approveDoc")
	private WebElement Doctor_Name_Field; 
    @FindBy(id="endpoint")
	private WebElement Target_Endpoint; 
    @FindBy(id="event")
	private WebElement Event; 
    @FindBy(id="network")
	private WebElement network; 
    @FindBy(id="generateBtn")
	private WebElement Generate_Button;
    @FindBy(id="payload")
	private WebElement Payload_JSON;  
    @FindBy(xpath="//h6[contains(@class,'card-title')]/span[contains(@class,'status-badge') and contains(@class,'bg-success') and normalize-space()='200']")
	private WebElement Webhook_HTTP_200_Success;
    @FindBy(id="sendBtn")
	private WebElement Send_Button; /*
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; 
    @FindBy(xpath="")
	private WebElement ; */
	
	
	
	
	
	
	public Dr_Network_locaters(WebDriver d) {
		super(d);
		PageFactory.initElements(d, this);
	}
	
	
	    public WebElement Landed_in_Simulator(){
		wait_for_theElement(Landed_in_Simulator);
		return Landed_in_Simulator;} 
		public WebElement Header_Nav_Bar(){
		wait_for_theElement(Header_Nav_Bar);
		return Header_Nav_Bar;} 
		public WebElement Dropdown(){
		wait_for_theElement(Dropdown);
		return Dropdown;} 
		public WebElement Visit_Table(){
		wait_for_theElement(Visit_Table);
		return Visit_Table;} 
		public WebElement Search(){
		wait_for_theElement(Search);
		return Search;}
		public List<WebElement> Visit_Rows(){
		return Visit_Rows;}
		public WebElement Visit_ID_Cell(WebElement Row){
		String Visit_ID_Cell_XPath = ".//td[2]"; 
		WebElement Visit_ID_Cell = Row.findElement(By.xpath(Visit_ID_Cell_XPath));
		wait_for_theElement(Visit_ID_Cell);
		return Visit_ID_Cell;}
		public WebElement Visit_Master_ID(){
		wait_for_theElement(Visit_Master_ID);
		return Visit_Master_ID;}
		public WebElement Visit_Patient_Email(){
		wait_for_theElement(Visit_Patient_Email);
		return Visit_Patient_Email;}
		public WebElement Visit_details_tabs(){
		wait_for_theElement(Visit_details_tabs);
		return Visit_details_tabs;} 
		public WebElement Doctor_Name_Field(){
		wait_for_theElement(Doctor_Name_Field);
		return Doctor_Name_Field;} 
		public WebElement Target_Endpoint(){
		wait_for_theElement(Target_Endpoint);
		return Target_Endpoint;}
		public WebElement Event(){
		wait_for_theElement(Event);
		return Event;} 
		public WebElement network(){
		wait_for_theElement(network);
		return network;} 
		public WebElement Generate_Button(){
		wait_for_theElement(Generate_Button);
		return Generate_Button;}
		public WebElement Payload_JSON(){
		wait_for_theElement(Payload_JSON);
		return Payload_JSON;} 
		public Boolean Webhook_HTTP_200_Success_Visible(){
			return check_element_visibility(Webhook_HTTP_200_Success, 10);
		}
		public WebElement Send_Button(){
		wait_for_theElement(Send_Button);
		return Send_Button;}/*
		public WebElement (){
		wait_for_theElement();
		return ;}
		public WebElement (){
		wait_for_theElement();
		return ;} public WebElement (){
		wait_for_theElement();
		return ;}
		public WebElement (){
		wait_for_theElement();
		return ;}
		public WebElement (){
		wait_for_theElement();
		return ;} public WebElement (){
		wait_for_theElement();
		return ;}
		public WebElement (){
		wait_for_theElement();
		return ;}
		public WebElement (){
		wait_for_theElement();
		return ;} public WebElement (){
		wait_for_theElement();
		return ;}
		public WebElement (){
		wait_for_theElement();
		return ;}
		public WebElement (){
		wait_for_theElement();
		return ;} public WebElement (){
		wait_for_theElement();
		return ;}
		public WebElement (){
		wait_for_theElement();
		return ;}
	
	
	*/
	
	
	

}
