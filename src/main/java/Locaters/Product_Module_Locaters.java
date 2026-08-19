package Locaters;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Repeatative_codes.Repeat;

public class Product_Module_Locaters extends Repeat{
	
	
	
	
	@FindBy(xpath="//div[@class='ant-tabs-nav-list']")
	private WebElement Top_Navigation_bar;
	@FindBy(xpath="//*[text()='Add Product']/..")
	private WebElement Product_Add_Button;
	@FindBy(xpath="//form")
	private WebElement Form;
	@FindBy(xpath="//*[contains(@class,'ant-btn-color-primary ant-btn-variant-solid')]")
	private WebElement Submit_Button;
    @FindBy(xpath="(//*[@class='rc-virtual-list-holder'])[1]")
	private WebElement First_Virtual_List_holder;
	@FindBy(xpath="//*[text()='New Category']/..")
	private WebElement Category_Add_Button;
	@FindBy(xpath="//div[@class='ant-modal-body']//form")
	private WebElement Popup_Form;
	@FindBy(xpath="//*[text()='Save']/..")
	private WebElement Save_Button; 
    @FindBy(xpath="//*[text()='Add Lab Test']/..")
	private WebElement Lab_Test_Add_Button; 
    @FindBy(xpath="(//*[@class='rc-virtual-list-holder'])[2]")
	private WebElement Second_Virtual_List_holder; 
    @FindBy(xpath="(//*[@class='rc-virtual-list-holder'])[3]")
	private WebElement Thrid_Virtual_List_holder;  
    @FindBy(xpath="(//*[@class='rc-virtual-list-holder'])[4]")
	private WebElement Fourth_Virtual_List_holder;  
    @FindBy(id="search")
	private WebElement Search; 
    @FindBy(xpath="//*[contains(@class,'ant-dropdown-trigger')] ")
	private List<WebElement> Threedot_Button_in_list; 
    @FindBy(xpath="//*[contains(@class,'ant-dropdown-menu-vertical ant-dropdown-menu-light')]")
	private WebElement List_Dropdown_Menu; 
    @FindBy(xpath="//*[contains(@class,'ant-btn-dangerous ant-btn-color-dangerous ant-btn-variant-solid')]")
	private WebElement Red_color_Button; 
    @FindBy(xpath="//div[@class='ant-notification-notice-content']")
	public WebElement Success_Toast; 
    @FindBy(id="teleforms")
	private WebElement Intake_form_field; 
    @FindBy(xpath="(//div[@class='ant-picker-panel-layout'])[1]")
	private WebElement First_Popup_Calendar; 
    @FindBy(xpath="//button[@type='button' and contains(@class,'ant-btn-primary ant-btn-color-primary ant-btn-variant-solid')]")
	private WebElement Product_Save_Button; 
    @FindBy(xpath="(//div[@class='ant-picker-panel-layout'])[2]")
	private WebElement Second_Popup_Calendar;  
    @FindBy(xpath="//textarea")
	private WebElement Textarea_Description_Field; 
    @FindBy(xpath="//div[@class='ant-form-item-explain-error']")
	private List<WebElement> InLine_Error_Messages; 
    @FindBy(xpath="//label[@class='ant-form-item-required']")
	private List<WebElement> Required_fields;  
    @FindBy(xpath="//*[@id='product-description']")
	private WebElement Description_form; 
    @FindBy(xpath="//h1[text()='Add Product']")
	private WebElement Top_of_Product_form; 
    @FindBy(id="product_image")
	private WebElement Product_Image_Upload_Input; 
    @FindBy(xpath="//tbody//td[contains(@class,'ant-table-cell-with-append')][1]")
	private List<WebElement> List_first_column_values; /*
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
	
	
	public Product_Module_Locaters(WebDriver d){
	super(d);	
	PageFactory.initElements(d, this);}

	
	public WebElement Top_Navigation_bar(){
	wait_for_theElement(Top_Navigation_bar);
	return Top_Navigation_bar;} 
	public List<WebElement> Product_Add_Form_Inputs(WebElement element){
	List<WebElement> Product_Add_Form_Inputs = element.findElements(By.xpath(".//input[@id='name' or @id='type' or @id='categories' or @id='visibility' or @id='min_buy_qty' or @id='max_buy_qty' or @id='stock' or @id='sku' or @id='condition_treated' or @id='intro_price' or @id='sale_price' or @id='default_price'or @id='sale_start_date'or @id='sale_end_date']"));
	check_element_visibility(Product_Add_Form_Inputs,5);
	return Product_Add_Form_Inputs;} 
	public WebElement Product_Add_Button(){
	wait_for_theElement(Product_Add_Button);
	return Product_Add_Button;}
	public WebElement Form(){
	wait_for_theElement(Form);
	return Form;}
    public WebElement Submit_Button(){
	wait_for_theElement(Submit_Button);
	return Submit_Button;} 	 
	public WebElement First_Virtual_List_holder(){
	wait_for_theElement(First_Virtual_List_holder);
	return First_Virtual_List_holder;}
	public WebElement Category_Add_Button(){
	wait_for_theElement(Category_Add_Button);
	return Category_Add_Button;}
	public WebElement Popup_Form(){
	wait_for_theElement(Popup_Form);
	return Popup_Form;}
	public WebElement Save_Button(){
	wait_for_theElement(Save_Button);
	return Save_Button;}
	public WebElement Lab_Test_Add_Button(){
	wait_for_theElement(Lab_Test_Add_Button);
	return Lab_Test_Add_Button;}
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
	public WebElement Red_color_Button(){
	wait_for_theElement(Red_color_Button);
	return Red_color_Button;}
	public WebElement Success_Toast(){
	wait_for_theElement(Success_Toast);
	return Success_Toast;}  
	public WebElement Intake_form_field(){
	wait_for_theElement(Intake_form_field);
	return Intake_form_field;} 
	public WebElement First_Popup_Calendar(){
	wait_for_theElement(First_Popup_Calendar);
	return First_Popup_Calendar;}
	public WebElement Today_Button_Calender(String calender_index) {

		if (calender_index.contains("First")) {
			WebElement Today_Button_Calender_One = First_Popup_Calendar().findElement(By.xpath(".//li[@class='ant-picker-now']"));
			wait_for_theElement(Today_Button_Calender_One);
			return Today_Button_Calender_One;
		} else {
			WebElement Today_Button_Calender_Two = Second_Popup_Calendar().findElement(By.xpath(".//li[@class='ant-picker-now']"));
			wait_for_theElement(Today_Button_Calender_Two);
			return Today_Button_Calender_Two;
		}
	}
	public WebElement Product_Save_Button(){
	wait_for_theElement(Product_Save_Button);
	return Product_Save_Button;} 
	public WebElement Second_Popup_Calendar(){
	wait_for_theElement(Second_Popup_Calendar);
	return Second_Popup_Calendar;} 
	public WebElement Textarea_Description_Field(){
	wait_for_theElement(Textarea_Description_Field);
	return Textarea_Description_Field;} 
	public List<WebElement> InLine_Error_Messages(){
	wait_for_theElement(InLine_Error_Messages);
	return InLine_Error_Messages;}
	public List<WebElement> Required_fields(){
	wait_for_theElement(Required_fields);
	return Required_fields;} 
	public WebElement Description_form(){
	wait_for_theElement(Description_form);
	return Description_form;} 
	public WebElement Fourth_Virtual_List_holder(){
	wait_for_theElement(Fourth_Virtual_List_holder);
	return Fourth_Virtual_List_holder;}
	public WebElement Top_of_Product_form(){
	wait_for_theElement(Top_of_Product_form);
	return Top_of_Product_form;}
	public WebElement Product_Image_Upload_Input(){
	wait_for_presence_of_theElement(By.id("product_image"));
	return Product_Image_Upload_Input;}
	public List<WebElement> List_first_column_values(){
	wait_for_theElement(List_first_column_values);
	return List_first_column_values;}/*
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
