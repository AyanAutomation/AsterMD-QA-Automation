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
	private WebElement Thrid_Virtual_List_holder;  /*
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
	public List<WebElement> Form_Inputs(WebElement element){
	List<WebElement> Form_Inputs = element.findElements(By.xpath(".//input[@type='text' or @type='search' or @class='ant-input-number-input']"));
	wait_for_theElement(Form_Inputs);
	return Form_Inputs;} 
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
	return Thrid_Virtual_List_holder;}/*
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
