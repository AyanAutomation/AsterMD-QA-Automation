package Locaters;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Repeatative_codes.Repeat;

public class Channel_Module_Locaters extends Repeat{
	
	
	
	
	@FindBy(xpath="//label[@title='Client ID']")
	private WebElement CLient_Id_Label;
	@FindBy(xpath="//*[text()='New Channel']/..")
	private WebElement Channel_Add_Button;
	@FindBy(xpath="//form")
	private WebElement Form;
	@FindBy(xpath="//*[contains(@class,'ant-btn-color-primary ant-btn-variant-solid')]")
	private WebElement Submit_Button;
    @FindBy(xpath="//*[contains(@class,'apiFooter ant-flex')]//button")
	private WebElement Done_Button;
	@FindBy(xpath="//div[@class='ant-modal-body']")
	private WebElement Popup_Modal;
	@FindBy(xpath="//div[@class='ant-modal-body']//form")
	private WebElement Popup_Form;
	@FindBy(xpath="//*[text()='Next ']/..")
	private WebElement Next_Button; 
	@FindBy(xpath="//*[text()='Save']/..")
	private WebElement Save_Button; 
	@FindBy(xpath="//*[text()='Save Settings']/..")
    private WebElement Save_Settings_Button;
	@FindBy(xpath="//*[@class='ant-modal-footer']//*[text()='Save Settings']/..")
	private WebElement Modal_Save_Settings_Button;
    @FindBy(xpath="//*[text()='Create']/..")
	private WebElement Create_Button;
    @FindBy(xpath="//*[text()='Generate API Token']/..")
	private WebElement Generate_API_Token_Button; 
    @FindBy(xpath="(//*[@class='rc-virtual-list-holder'])[2]")
	private WebElement Second_Virtual_List_holder; 
    @FindBy(xpath="(//*[@class='rc-virtual-list-holder'])[3]")
	private WebElement Thrid_Virtual_List_holder;  
    @FindBy(id="search")
	private WebElement Search; 
    @FindBy(xpath="//*[contains(@class,'ant-dropdown-trigger')] ")
	private List<WebElement> Threedot_Button_in_list; 
    @FindBy(xpath="//*[contains(@class,'ant-dropdown-menu-vertical ant-dropdown-menu-light')]")
	private WebElement List_Dropdown_Menu; 
    @FindBy(xpath="//span[text()='Treatment Management']/../..")
	private WebElement Treatment_management_Section; 
    @FindBy(xpath="//div[@class='ant-notification-notice-content']")
	private WebElement Success_Toast; 
    @FindBy(xpath="(//*[contains(@class,'channels-section')])[1]//*[contains(@class,'ant-flex-align-flex-start ant-flex-vertical')]//*[contains(@class,'ant-flex-wrap-wrap ant-flex-align-center')][1]")
	private List<WebElement> First_channel_card_text_in_list; 
    
    @FindBy(xpath="//*[text()='Configuration']/..")
	public WebElement Configuration_Button; 
    @FindBy(xpath="//button[@type='button' and contains(@class,'ant-btn-primary ant-btn-color-primary ant-btn-variant-solid')]")
	private WebElement Product_Save_Button; 
    @FindBy(xpath="(//section)[2]")
	private WebElement Patient_Portal_section;  
    @FindBy(xpath="//textarea")
	private WebElement Textarea_Description_Field; 
    @FindBy(xpath="(//*[contains(@class,'ant-radio ant-wave-target')])[1]")
	private WebElement Allow_Any_IP_Radio_Button; 
    @FindBy(xpath="//label[@title='API Contact Email']/../..//input")
	private WebElement API_Contact_Mail_input; 
    @FindBy(xpath="//*[text()='Add Question']/..")
	private WebElement Add_Question_Button; 

    
    @FindBy(xpath="//input[contains(@id,'sections_1_questions')]")
	private List<WebElement> Second_Sections_All_Question_fields;
   
    @FindBy(xpath="//textarea[contains(@id,'answer')]")
	private List<WebElement> All_Answers_fields; 
    @FindBy(xpath="//span[text()='patient portal']/..")
	private WebElement Patient_Portal_Create_Button; 
    @FindBy(id="portal_name")
	private WebElement Portal_Name_Input; 
    @FindBy(xpath="//*[text()='Patient Portal']/../..//div[contains(@class,'channels-actions')]")
	private WebElement Patient; 
    @FindBy(xpath="//*[@class='ant-modal-close']")
	private WebElement Modal_close_button; 
    @FindBy(xpath="(//*[contains(@class,'channels-section')])[1]//*[contains(@class,'channels-card-row')]")
	private List<WebElement> All_Channel_Cards; 
    @FindBy(css="tr.ant-table-placeholder svg[role='img']")
	private WebElement Loader; 
    @FindBy(xpath="//div[@class='ant-tooltip ant-tooltip-css-var css-tql0nm css-var-_R_1b_ ant-tooltip-placement-top']")
	private WebElement Tooltip; 
    @FindBy(xpath="//div[@role='dialog']")
	private WebElement Pop_up; 
    @FindBy(xpath=" //*[text()='Add New Section']/..")
	private WebElement Add_Section_Button; 
    @FindBy(xpath="//div[@class='style-module__g-miaa__faqSectionCard']")
	private List<WebElement> Question_Sections; /*
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
	
	
	public Channel_Module_Locaters(WebDriver d){
	super(d);	
	PageFactory.initElements(d, this);}

	
	public WebElement CLient_Id_Label(){
	wait_for_theElement(CLient_Id_Label);
	return CLient_Id_Label;} 
	public List<WebElement> Patient_Portal_config_Form_Dropdown_fields(WebElement element){
	List<WebElement> Patient_Portal_config_Form_Dropdown_fields = element.findElements(By.xpath(".//input[contains(@aria-owns,'_r_') or @id='security_login_method'or @id='theme_font']/../.."));
	wait_for_theElement(Patient_Portal_config_Form_Dropdown_fields);
	return Patient_Portal_config_Form_Dropdown_fields;}
	public List<WebElement> Channel_Add_Form_Inputs(WebElement element){
	List<WebElement> Channel_Add_Form_Inputs = element.findElements(By.xpath(".//input[@id='channel_name' or @id='channel-ip-input']"));
	wait_for_theElement(Channel_Add_Form_Inputs);
	return Channel_Add_Form_Inputs;} 
	public List<WebElement> FAQ_Add_Form_Inputs(WebElement element){
	List<WebElement> FAQ_Add_Form_Inputs = element.findElements(By.xpath(".//*[@id='sections_0_title' or @id='sections_0_description' or @id='sections_0_questions_0_question' or @id='sections_0_questions_0_answer']"));
	wait_for_theElement(FAQ_Add_Form_Inputs);
	return FAQ_Add_Form_Inputs;} 
	public WebElement Channel_Add_Button(){
	wait_for_theElement(Channel_Add_Button);
	return Channel_Add_Button;}
	public WebElement Form(){
	wait_for_theElement(Form);
	return Form;}
    public WebElement Submit_Button(){
	wait_for_theElement(Submit_Button);
	return Submit_Button;} 
	public WebElement Popup_Modal(){
	wait_for_theElement(Popup_Modal);
	return Popup_Modal;}
	public WebElement Popup_Form(){
	wait_for_theElement(Popup_Form);
	return Popup_Form;}
	public WebElement Next_Button(){
	wait_for_theElement(Next_Button);
	return Next_Button;}
	public WebElement Generate_API_Token_Button(){
	wait_for_theElement(Generate_API_Token_Button);
	return Generate_API_Token_Button;}
	public WebElement Second_Virtual_List_holder(){
	wait_for_theElement(Second_Virtual_List_holder);
	return Second_Virtual_List_holder;} 
	public WebElement Thrid_Virtual_List_holder(){
	wait_for_theElement(Thrid_Virtual_List_holder);
	return Thrid_Virtual_List_holder;}
	public WebElement Search(){
	wait_for_theElement(Search);
	return Search;} 
	public List<WebElement> Threedot_Button_in_list (){
	wait_for_theElement(Threedot_Button_in_list);
	return Threedot_Button_in_list;} 
	public WebElement List_Dropdown_Menu(){
	wait_for_theElement(List_Dropdown_Menu);
	return List_Dropdown_Menu;}
	public WebElement Treatment_management_Section(){
	wait_for_theElement(Treatment_management_Section);
	return Treatment_management_Section;}
	public WebElement Success_Toast(){
	wait_for_theElement(Success_Toast);
	return Success_Toast;}  
	public List<WebElement> First_channel_card_text_in_list(){
	wait_for_theElement(First_channel_card_text_in_list);
	return First_channel_card_text_in_list;} 
	public WebElement Done_Button(){
	wait_for_theElement(Done_Button);
	return Done_Button;}
	public WebElement API_Contact_Mail_input(){
	wait_for_theElement(API_Contact_Mail_input);
	return API_Contact_Mail_input;} 
	public WebElement Patient_Portal_section(){
	wait_for_theElement(Patient_Portal_section);
	return Patient_Portal_section;} 
	public WebElement Textarea_Description_Field(){
	wait_for_theElement(Textarea_Description_Field);
	return Textarea_Description_Field;} 
	public WebElement Allow_Any_IP_Radio_Button(){
	wait_for_theElement(Allow_Any_IP_Radio_Button);
	return Allow_Any_IP_Radio_Button;}
	public WebElement Save_Button(){
	wait_for_theElement(Save_Button);
	return Save_Button;}
	public WebElement Save_Settings_Button(){
	wait_for_theElement(Save_Settings_Button);
	return Save_Settings_Button;} 
	public WebElement Add_Question_Button(){
	wait_for_theElement(Add_Question_Button);
	return Add_Question_Button;}
	public List<WebElement> All_Answers_fields(){
	wait_for_theElement(All_Answers_fields);
	return All_Answers_fields;} 
	public WebElement Patient_Portal_Create_Button(){
	wait_for_theElement(Patient_Portal_Create_Button);
	return Patient_Portal_Create_Button;}
	public WebElement Portal_Name_Input(){
	wait_for_theElement(Portal_Name_Input);
	return Portal_Name_Input;}
	public WebElement Create_Button(){
	wait_for_theElement(Create_Button);
	return Create_Button;} 
	public WebElement Configuration_Button(){
	wait_for_theElement(Configuration_Button);
	return Configuration_Button;}
	public WebElement Modal_Save_Settings_Button(){
	wait_for_theElement(Modal_Save_Settings_Button);
	return Modal_Save_Settings_Button;}
	public WebElement Modal_close_button(){
	wait_for_theElement(Modal_close_button);
	return Modal_close_button;} 
	public List<WebElement> All_Channel_Cards(){
	wait_for_theElement(All_Channel_Cards);
	return All_Channel_Cards;}
	public WebElement Particular_Cards_Config_Button(WebElement Card){
	WebElement Particular_Cards_Config_Button=Card.findElement(By.xpath(".//span[text()='Configuration']/.."));
	wait_for_theElement(Particular_Cards_Config_Button);
	return Particular_Cards_Config_Button;} 
	public WebElement Loader(){
    Boolean visibility=check_element_visibility(Loader,2);
    if(visibility==true){
	return Loader;}
    else{
    	return null;}} 
	public WebElement Tooltip(){
	wait_for_theElement(Tooltip);
	return Tooltip;}
	public WebElement Modal_Submit_button(){
	WebElement Modal_Submit_button=Pop_up().findElement(By.xpath(".//button[@type='button' and contains(@class,'ant-btn-primary ant-btn-color-primary ant-btn-variant-solid')]"));
	wait_for_theElement(Modal_Submit_button);
	return Modal_Submit_button;}
	public WebElement Pop_up(){
	wait_for_theElement(Pop_up);
	return Pop_up;}
	public List<WebElement> Second_Sections_All_Question_fields(){
	wait_for_theElement(Second_Sections_All_Question_fields);
	return Second_Sections_All_Question_fields;}
	public WebElement Add_Section_Button(){
	wait_for_theElement(Add_Section_Button);
	return Add_Section_Button;}
	public List<WebElement> Question_Sections(){
	wait_for_theElement(Question_Sections);
	return Question_Sections;} /*
	public WebElement (){
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
	return ;}  */

}
