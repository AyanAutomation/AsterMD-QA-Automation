package AsterMD.Project.AsterMD;

import java.util.List;
import java.util.TreeMap;

import com.aventstack.extentreports.ExtentTest;

import Listerners.Report_Listen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Locaters.Product_Module_Locaters;

public class Product_Module extends Side_Menu_Navigator{

	
	
public WebElement Product_Module_Accessor() throws Exception {
	
	
	ExtentTest log = Report_Listen.log_print_in_report();
	int step = 1;

	log.info("Product Module Step " + step + ": Initializing Product Module locators.");
	System.out.println("🔹 Product Module Step " + step + ": Initializing Product Module locators.");

	Product_Module_Locaters p = new Product_Module_Locaters(d);
	
	
	step++;

	log.info("Product Module Step " + step + ": Navigating to the Catalog option through the side menu.");
	System.out.println("🔹 Product Module Step " + step + ": Navigating to the Catalog option through the side menu.");

	Side_Menu_Navigation("Catalog");

	log.pass("Catalog side-menu navigation flow completed.");
	System.out.println("✅ Catalog side-menu navigation flow completed.");
	step++;

	log.info("Product Module Step " + step + ": Verifying the Product Module top navigation bar.");
	System.out.println("🔹 Product Module Step " + step + ": Verifying the Product Module top navigation bar.");

	p.Top_Navigation_bar();

	log.pass("Product Module top navigation bar verified successfully.");
	System.out.println("✅ Product Module top navigation bar verified successfully.");
	step++;

	log.info("Product Module Step " + step + ": Retrieving the Product Add button.");
	System.out.println("🔹 Product Module Step " + step + ": Retrieving the Product Add button.");
	
	WebElement Product_Add = p.Product_Add_Button();
 
	return Product_Add;
	
}
   
@DataProvider(name="Category_Create_Data")
public Object[][] Category_Create_Data(){

	TreeMap<String, String> data1 = new TreeMap<String, String>();
	data1.put("Category Name", "Men's Sexual Health Therapies");
	data1.put("Drug Class / Code", "MSH-PDE5-001");
	data1.put("Description", "Prescription therapies used for the clinical management of erectile dysfunction and related men's sexual health conditions following medical assessment.");

	TreeMap<String, String> data2 = new TreeMap<String, String>();
	data2.put("Category Name", "Hair Loss and Regrowth Therapies");
	data2.put("Drug Class / Code", "DERM-HLR-002");
	data2.put("Description", "Prescription and topical therapies used to reduce progressive hair loss and support hair regrowth in eligible patients with diagnosed alopecia.");

	TreeMap<String, String> data3 = new TreeMap<String, String>();
	data3.put("Category Name", "Growth Hormone Replacement Therapies");
	data3.put("Drug Class / Code", "ENDO-GHR-003");
	data3.put("Description", "Specialty hormone replacement therapies used for patients with clinically confirmed growth hormone deficiency under ongoing medical and laboratory monitoring.");

	TreeMap<String, String> data4 = new TreeMap<String, String>();
	data4.put("Category Name", "Sleep Disorder Prescription Therapies");
	data4.put("Drug Class / Code", "NEU-SLP-004");
	data4.put("Description", "Prescription therapies used to manage insomnia and related sleep disturbances after assessment of sleep patterns, medical history, and treatment suitability.");

	TreeMap<String, String> data5 = new TreeMap<String, String>();
	data5.put("Category Name", "Mood and Focus Support Therapies");
	data5.put("Drug Class / Code", "PSY-MFS-005");
	data5.put("Description", "Clinically supervised therapies used to support patients experiencing persistent low mood, reduced motivation, concentration difficulty, or impaired focus.");

	TreeMap<String, String> data6 = new TreeMap<String, String>();
	data6.put("Category Name", "Testosterone Replacement Therapies");
	data6.put("Drug Class / Code", "ENDO-TRT-006");
	data6.put("Description", "Prescription testosterone replacement therapies used for clinically confirmed low testosterone following medical evaluation and appropriate laboratory testing.");

	TreeMap<String, String> data7 = new TreeMap<String, String>();
	data7.put("Category Name", "Medical Weight Management Therapies");
	data7.put("Drug Class / Code", "META-WGT-007");
	data7.put("Description", "Prescription therapies used as part of a medically supervised weight-management program for eligible patients with obesity or related metabolic risk factors.");

	return new Object[][] {
		{ data1 },
		{ data2 },
		{ data3 },
		{ data4 },
		{ data5 },
		{ data6 },
		{ data7 }
	};
}



@Test(dataProvider = "Category_Create_Data")
public void Category_Add(TreeMap<String, String> data) throws Exception {
	ExtentTest log = Report_Listen.log_print_in_report();
	int step = 1;
	String Category_Name_Data = data.get("Category Name");
	String Drug_Class_Code_Data = data.get("Drug Class / Code");
	String Category_Description_Data = data.get("Description");

	try {
		log.info("Step " + step + ": Starting the Category creation flow.");
		System.out.println("🔹 Step " + step + ": Starting the Category creation flow.");
		step++;

		Product_Module_Locaters p = new Product_Module_Locaters(d);

		log.info("Step " + step + ": Product Module locator class initialized successfully.");
		System.out.println("🔹 Step " + step + ": Product Module locator class initialized successfully.");
		step++;

		

		log.info("Step " + step + ": Category creation test data retrieved from the DataProvider.");
		log.info("Category Name: " + Category_Name_Data);
		log.info("Drug Class / Code: " + Drug_Class_Code_Data);
		log.info("Description: " + Category_Description_Data);
		System.out.println("🔹 Step " + step + ": Category creation test data retrieved from the DataProvider.");
		System.out.println("   ➤ Category Name: " + Category_Name_Data);
		System.out.println("   ➤ Drug Class / Code: " + Drug_Class_Code_Data);
		System.out.println("   ➤ Description: " + Category_Description_Data);
		step++;

		log.info("Step " + step + ": Navigating to the Categories tab of the Product Module.");
		System.out.println("🔹 Step " + step + ": Navigating to the Categories tab of the Product Module.");

		Product_Module_Tab_Navigator("Categories");

		log.pass("Step " + step + ": Categories tab opened successfully.");
		System.out.println("✅ Step " + step + ": Categories tab opened successfully.");
		step++;

		log.info("Step " + step + ": Retrieving the Category Add button.");
		System.out.println("🔹 Step " + step + ": Retrieving the Category Add button.");

		WebElement Category_Add = p.Category_Add_Button();

		log.pass("Step " + step + ": Category Add button retrieved successfully.");
		System.out.println("✅ Step " + step + ": Category Add button retrieved successfully.");
		step++;

		log.info("Step " + step + ": Clicking the Category Add button.");
		System.out.println("🔹 Step " + step + ": Clicking the Category Add button.");

		Category_Add.click();

		log.pass("Step " + step + ": Category Add button clicked successfully.");
		System.out.println("✅ Step " + step + ": Category Add button clicked successfully.");
		step++;

		log.info("Step " + step + ": Retrieving the Category creation popup form.");
		System.out.println("🔹 Step " + step + ": Retrieving the Category creation popup form.");

		WebElement Popup_Form = p.Popup_Form();

		log.pass("Step " + step + ": Category creation popup form displayed successfully.");
		System.out.println("✅ Step " + step + ": Category creation popup form displayed successfully.");
		step++;

		log.info("Step " + step + ": Retrieving input fields from the Category creation popup form.");
		System.out.println("🔹 Step " + step + ": Retrieving input fields from the Category creation popup form.");

		List<WebElement> Form_Fields = Popup_Form.findElements(By.xpath(".//input"));
		WebElement Category_Name = Form_Fields.get(0);
		WebElement Drug_Class_Field = Form_Fields.get(1);
		WebElement Category_Description = Popup_Form.findElement(By.xpath(".//textarea"));

		log.pass("Step " + step + ": Category Name, Drug Class / Code and Description fields retrieved successfully.");
		System.out.println("✅ Step " + step + ": Category Name, Drug Class / Code and Description fields retrieved successfully.");
		step++;

		log.info("Step " + step + ": Entering the Category Name: " + Category_Name_Data);
		System.out.println("🔹 Step " + step + ": Entering the Category Name: " + Category_Name_Data);

		Category_Name.clear();
		Category_Name.sendKeys(Category_Name_Data);

		log.pass("Step " + step + ": Category Name entered successfully.");
		System.out.println("✅ Step " + step + ": Category Name entered successfully.");
		step++;

		log.info("Step " + step + ": Entering the Drug Class / Code: " + Drug_Class_Code_Data);
		System.out.println("🔹 Step " + step + ": Entering the Drug Class / Code: " + Drug_Class_Code_Data);

		Drug_Class_Field.clear();
		Drug_Class_Field.sendKeys(Drug_Class_Code_Data);

		log.pass("Step " + step + ": Drug Class / Code entered successfully.");
		System.out.println("✅ Step " + step + ": Drug Class / Code entered successfully.");
		step++;

		log.info("Step " + step + ": Entering the Category Description.");
		System.out.println("🔹 Step " + step + ": Entering the Category Description.");

		Category_Description.clear();
		Category_Description.sendKeys(Category_Description_Data);

		log.pass("Step " + step + ": Category Description entered successfully.");
		System.out.println("✅ Step " + step + ": Category Description entered successfully.");
		step++;

		log.info("Step " + step + ": Retrieving the Save button.");
		System.out.println("🔹 Step " + step + ": Retrieving the Save button.");

		WebElement Save_Button = p.Save_Button();

		log.pass("Step " + step + ": Save button retrieved successfully.");
		System.out.println("✅ Step " + step + ": Save button retrieved successfully.");
		step++;

		log.info("Step " + step + ": Clicking the Save button to create the Category.");
		System.out.println("🔹 Step " + step + ": Clicking the Save button to create the Category.");

		Save_Button.click();

		log.pass("Step " + step + ": Save button clicked successfully.");
		System.out.println("✅ Step " + step + ": Save button clicked successfully.");
		step++;

		log.info("Step " + step + ": Verifying that the Category creation process completed and the Category Add button is available again.");
		System.out.println("🔹 Step " + step + ": Verifying that the Category creation process completed and the Category Add button is available again.");

		p.Category_Add_Button();

		log.pass("Category created successfully with Category Name: " + Category_Name_Data);
		System.out.println("✅ Category created successfully with Category Name: " + Category_Name_Data);
	} catch (Exception e) {
		if (log != null) log.fail("Category creation failed for Category Name '" + Category_Name_Data + "'. Failure reason: " + e.getMessage());
		System.out.println("❌ Category creation failed for Category Name: " + Category_Name_Data);
		System.out.println("❌ Failure reason: " + e.getMessage());
		throw e;
	}
}
	
   
   public void Product_Module_Tab_Navigator(String Tab_Option) throws Exception{
	   
	   Product_Module_Locaters p = new Product_Module_Locaters(d);
	   
	   
	   WebElement Nav_Bar;
	/*   try {
		   Nav_Bar=p.Top_Navigation_bar();} */
	//   catch(Exception e) {
		   Product_Module_Accessor();
		   Nav_Bar=p.Top_Navigation_bar();
		  // }
	   List<WebElement> Tabs=Nav_Bar.findElements(By.xpath(".//div[@class='ant-tabs-tab']"));
	   for(WebElement tab:Tabs) {
		   String Tab_Name=tab.getText().trim();
	       if(Tab_Name.equalsIgnoreCase(Tab_Option)) {
	    	   tab.click();
	    	   System.out.println("✅ Navigated to the "+ Tab_Option +" tab successfully.");
	    	   break;}}}
	   
   
	
@Test(dataProvider="Product_Create_Data")
public void Product_Add(TreeMap<String, String> Product_data) throws Exception{
	
	Product_Module_Locaters p = new Product_Module_Locaters(d);
	
	String Product_Name = Product_data.get("Product Name");
	String Description = Product_data.get("Description");
	String Product_Image = Product_data.get("Product Image");
	String Product_Type = Product_data.get("Product Type");
	String Category = Product_data.get("Category");
	String Visibility = Product_data.get("Visibility");
	String Minimum_Buy_Quantity = Product_data.get("Minimum Buy Quantity");
	String Maximum_Buy_Quantity = Product_data.get("Maximum Buy Quantity");
	String Stock_Count = Product_data.get("Stock Count");
	String Intake_Form = Product_data.get("Intake Form");
	String Default_SKU_Identifier = Product_data.get("Default SKU / Identifier");
	String Condition_Treated = Product_data.get("Condition Treated");
	String Restrict_Multiple_Active_Prescriptions = Product_data.get("Restrict Multiple Active Prescriptions");
	String Pricing_Type = Product_data.get("Pricing Type");
	String Intro_Price = Product_data.get("Intro Price");
	String Default_Price = Product_data.get("Default Price");
	String Sale_Price = Product_data.get("Sale Price");
	String Sale_Start_Date = Product_data.get("Sale Start Date");
	String Sales_End_Date = Product_data.get("Sales End Date");
	String Lab_Test = Product_data.get("Lab Test");
	
	
	WebElement Product_Add = Product_Module_Accessor();
	Product_Add.click();
	Thread.sleep(800);
	WebElement Product_form= p.Form();
	List<WebElement> Inputs;

	try {
		
		Inputs = p.Form_Inputs(Product_form);

		
	} catch (Exception e) {
		

		Inputs = p.Form_Inputs(Product_form);

		
	}
    WebElement Product_Name_Input = Inputs.get(0);
    WebElement Product_Type_Input = Inputs.get(1);
    WebElement Product_Category_Input = Inputs.get(2);
    WebElement Product_Visibility_Input = Inputs.get(3);
    WebElement Min_Quantity_Input = Inputs.get(4);
    WebElement Max_Quantity_Input = Inputs.get(5);
    WebElement Stock_Input = Inputs.get(6);
    WebElement Eigth_input = Inputs.get(7);
    WebElement Condition_treated_Input = Inputs.get(8);
    WebElement Intro_Input = Inputs.get(9);
    WebElement Default_Price_Input = Inputs.get(10);
    WebElement Sales_Price_Input = Inputs.get(11);
    
    
    
    Product_Name_Input.sendKeys(Product_Name);
    Product_Type_Input.sendKeys(Product_Type);
    WebElement Prod_type_list=   p.First_Virtual_List_holder();
	List<WebElement> Prod_type_list_options = Prod_type_list.findElements(By.xpath(".//*[contains(@class,'ant-select-item ant-select-item-option ant-select-item-option')]"));
    for(WebElement option : Prod_type_list_options) {
		if(option.getText().equals(Product_Type)) {
			option.click();
			break;
		}}
    Product_Category_Input.sendKeys(Category);
    
}	
	

@DataProvider
public Object[][] Product_Create_Data(){

	TreeMap<String, String> data1 = new TreeMap<String, String>();
	data1.put("Product Name", "AsterVigor Sildenafil Response Therapy");
	data1.put("Description", "Synthetic prescription catalog product containing a sildenafil-based PDE5 inhibitor therapy for the erectile dysfunction treatment workflow.");
	data1.put("Product Image", "");
	data1.put("Product Type", "Prescription");
	data1.put("Category", "Men's Sexual Health Therapies");
	data1.put("Visibility", "Public");
	data1.put("Minimum Buy Quantity", "1");
	data1.put("Maximum Buy Quantity", "1");
	data1.put("Stock Count", "74");
	data1.put("Intake Form", "Erectile Dysfunction Intake Form");
	data1.put("Default SKU / Identifier", "AST-WELL-ED-101");
	data1.put("Condition Treated", "Erectile Dysfunction");
	data1.put("Restrict Multiple Active Prescriptions", "Yes");
	data1.put("Pricing Type", "Single Item");
	data1.put("Intro Price", "29.00");
	data1.put("Default Price", "119.00");
	data1.put("Sale Price", "105.00");
	data1.put("Sale Start Date", "09/01/2026");
	data1.put("Sales End Date", "10/01/2026");
	data1.put("Lab Test", "No");

	TreeMap<String, String> data2 = new TreeMap<String, String>();
	data2.put("Product Name", "AsterVigor Tadalafil Daily Therapy");
	data2.put("Description", "Synthetic tadalafil-based prescription product created for validating daily erectile dysfunction treatment, inventory, intake, pricing, and restriction workflows.");
	data2.put("Product Image", "");
	data2.put("Product Type", "Prescription");
	data2.put("Category", "Men's Sexual Health Therapies");
	data2.put("Visibility", "Public");
	data2.put("Minimum Buy Quantity", "1");
	data2.put("Maximum Buy Quantity", "1");
	data2.put("Stock Count", "68");
	data2.put("Intake Form", "Erectile Dysfunction Intake Form");
	data2.put("Default SKU / Identifier", "AST-WELL-ED-102");
	data2.put("Condition Treated", "Erectile Dysfunction");
	data2.put("Restrict Multiple Active Prescriptions", "Yes");
	data2.put("Pricing Type", "Single Item");
	data2.put("Intro Price", "35.00");
	data2.put("Default Price", "139.00");
	data2.put("Sale Price", "124.00");
	data2.put("Sale Start Date", "09/02/2026");
	data2.put("Sales End Date", "10/02/2026");
	data2.put("Lab Test", "No");

	TreeMap<String, String> data3 = new TreeMap<String, String>();
	data3.put("Product Name", "AsterVigor Tadalafil On-Demand Therapy");
	data3.put("Description", "Synthetic on-demand tadalafil prescription product for testing erectile dysfunction product creation, quantity controls, condition mapping, and scheduled sale pricing.");
	data3.put("Product Image", "");
	data3.put("Product Type", "Prescription");
	data3.put("Category", "Men's Sexual Health Therapies");
	data3.put("Visibility", "Public");
	data3.put("Minimum Buy Quantity", "1");
	data3.put("Maximum Buy Quantity", "2");
	data3.put("Stock Count", "81");
	data3.put("Intake Form", "Erectile Dysfunction Intake Form");
	data3.put("Default SKU / Identifier", "AST-WELL-ED-103");
	data3.put("Condition Treated", "Erectile Dysfunction");
	data3.put("Restrict Multiple Active Prescriptions", "Yes");
	data3.put("Pricing Type", "Single Item");
	data3.put("Intro Price", "32.00");
	data3.put("Default Price", "129.00");
	data3.put("Sale Price", "115.00");
	data3.put("Sale Start Date", "09/03/2026");
	data3.put("Sales End Date", "10/03/2026");
	data3.put("Lab Test", "No");

	TreeMap<String, String> data4 = new TreeMap<String, String>();
	data4.put("Product Name", "AsterFollicle Finasteride Maintenance Therapy");
	data4.put("Description", "Synthetic finasteride-based prescription product created for validating the male-pattern hair loss catalog, intake form, SKU, pricing, and inventory workflow.");
	data4.put("Product Image", "");
	data4.put("Product Type", "Prescription");
	data4.put("Category", "Hair Loss and Regrowth Therapies");
	data4.put("Visibility", "Public");
	data4.put("Minimum Buy Quantity", "1");
	data4.put("Maximum Buy Quantity", "1");
	data4.put("Stock Count", "93");
	data4.put("Intake Form", "Hair Loss Intake Form");
	data4.put("Default SKU / Identifier", "AST-WELL-HL-104");
	data4.put("Condition Treated", "Hair Loss");
	data4.put("Restrict Multiple Active Prescriptions", "Yes");
	data4.put("Pricing Type", "Single Item");
	data4.put("Intro Price", "24.00");
	data4.put("Default Price", "89.00");
	data4.put("Sale Price", "78.00");
	data4.put("Sale Start Date", "09/04/2026");
	data4.put("Sales End Date", "10/04/2026");
	data4.put("Lab Test", "No");

	TreeMap<String, String> data5 = new TreeMap<String, String>();
	data5.put("Product Name", "AsterFollicle Minoxidil Topical Foam");
	data5.put("Description", "Synthetic minoxidil topical hair-regrowth product for testing standard product creation, hair loss condition mapping, inventory limits, and promotional pricing.");
	data5.put("Product Image", "");
	data5.put("Product Type", "Standard");
	data5.put("Category", "Hair Loss and Regrowth Therapies");
	data5.put("Visibility", "Public");
	data5.put("Minimum Buy Quantity", "1");
	data5.put("Maximum Buy Quantity", "3");
	data5.put("Stock Count", "126");
	data5.put("Intake Form", "");
	data5.put("Default SKU / Identifier", "AST-WELL-HL-105");
	data5.put("Condition Treated", "Hair Loss");
	data5.put("Restrict Multiple Active Prescriptions", "No");
	data5.put("Pricing Type", "Single Item");
	data5.put("Intro Price", "19.00");
	data5.put("Default Price", "64.00");
	data5.put("Sale Price", "55.00");
	data5.put("Sale Start Date", "09/05/2026");
	data5.put("Sales End Date", "10/05/2026");
	data5.put("Lab Test", "No");

	TreeMap<String, String> data6 = new TreeMap<String, String>();
	data6.put("Product Name", "AsterGrowth Somatropin Daily Replacement");
	data6.put("Description", "Synthetic daily somatropin prescription product for validating growth hormone replacement catalog, intake, laboratory requirement, stock, and pricing workflows.");
	data6.put("Product Image", "");
	data6.put("Product Type", "Prescription");
	data6.put("Category", "Growth Hormone Replacement Therapies");
	data6.put("Visibility", "Public");
	data6.put("Minimum Buy Quantity", "1");
	data6.put("Maximum Buy Quantity", "1");
	data6.put("Stock Count", "34");
	data6.put("Intake Form", "HGH Deficiency Intake Form");
	data6.put("Default SKU / Identifier", "AST-WELL-HGH-106");
	data6.put("Condition Treated", "HGH Deficiency");
	data6.put("Restrict Multiple Active Prescriptions", "Yes");
	data6.put("Pricing Type", "Single Item");
	data6.put("Intro Price", "149.00");
	data6.put("Default Price", "925.00");
	data6.put("Sale Price", "845.00");
	data6.put("Sale Start Date", "09/06/2026");
	data6.put("Sales End Date", "10/06/2026");
	data6.put("Lab Test", "Yes");

	TreeMap<String, String> data7 = new TreeMap<String, String>();
	data7.put("Product Name", "AsterGrowth Somapacitan Weekly Replacement");
	data7.put("Description", "Synthetic long-acting somapacitan prescription product created for testing weekly growth hormone replacement, required laboratory testing, intake, and purchase restrictions.");
	data7.put("Product Image", "");
	data7.put("Product Type", "Prescription");
	data7.put("Category", "Growth Hormone Replacement Therapies");
	data7.put("Visibility", "Public");
	data7.put("Minimum Buy Quantity", "1");
	data7.put("Maximum Buy Quantity", "1");
	data7.put("Stock Count", "27");
	data7.put("Intake Form", "HGH Deficiency Intake Form");
	data7.put("Default SKU / Identifier", "AST-WELL-HGH-107");
	data7.put("Condition Treated", "HGH Deficiency");
	data7.put("Restrict Multiple Active Prescriptions", "Yes");
	data7.put("Pricing Type", "Single Item");
	data7.put("Intro Price", "175.00");
	data7.put("Default Price", "1180.00");
	data7.put("Sale Price", "1065.00");
	data7.put("Sale Start Date", "09/07/2026");
	data7.put("Sales End Date", "10/07/2026");
	data7.put("Lab Test", "Yes");

	TreeMap<String, String> data8 = new TreeMap<String, String>();
	data8.put("Product Name", "AsterGrowth Lonapegsomatropin Weekly Therapy");
	data8.put("Description", "Synthetic long-acting growth hormone replacement product for validating HGH deficiency condition selection, laboratory association, inventory, and prescription restrictions.");
	data8.put("Product Image", "");
	data8.put("Product Type", "Prescription");
	data8.put("Category", "Growth Hormone Replacement Therapies");
	data8.put("Visibility", "Public");
	data8.put("Minimum Buy Quantity", "1");
	data8.put("Maximum Buy Quantity", "1");
	data8.put("Stock Count", "31");
	data8.put("Intake Form", "HGH Deficiency Intake Form");
	data8.put("Default SKU / Identifier", "AST-WELL-HGH-108");
	data8.put("Condition Treated", "HGH Deficiency");
	data8.put("Restrict Multiple Active Prescriptions", "Yes");
	data8.put("Pricing Type", "Single Item");
	data8.put("Intro Price", "185.00");
	data8.put("Default Price", "1245.00");
	data8.put("Sale Price", "1120.00");
	data8.put("Sale Start Date", "09/08/2026");
	data8.put("Sales End Date", "10/08/2026");
	data8.put("Lab Test", "Yes");

	TreeMap<String, String> data9 = new TreeMap<String, String>();
	data9.put("Product Name", "AsterSleep Ramelteon Onset Therapy");
	data9.put("Description", "Synthetic ramelteon prescription product designed for validating insomnia treatment catalog creation, intake selection, restricted prescriptions, and pricing.");
	data9.put("Product Image", "");
	data9.put("Product Type", "Prescription");
	data9.put("Category", "Sleep Disorder Prescription Therapies");
	data9.put("Visibility", "Public");
	data9.put("Minimum Buy Quantity", "1");
	data9.put("Maximum Buy Quantity", "1");
	data9.put("Stock Count", "77");
	data9.put("Intake Form", "Insomnia Intake Form");
	data9.put("Default SKU / Identifier", "AST-WELL-INS-109");
	data9.put("Condition Treated", "Insomnia");
	data9.put("Restrict Multiple Active Prescriptions", "Yes");
	data9.put("Pricing Type", "Single Item");
	data9.put("Intro Price", "28.00");
	data9.put("Default Price", "109.00");
	data9.put("Sale Price", "96.00");
	data9.put("Sale Start Date", "09/09/2026");
	data9.put("Sales End Date", "10/09/2026");
	data9.put("Lab Test", "No");

	TreeMap<String, String> data10 = new TreeMap<String, String>();
	data10.put("Product Name", "AsterSleep Lemborexant Dual-Action Therapy");
	data10.put("Description", "Synthetic lemborexant prescription product for testing sleep-onset and sleep-maintenance catalog workflows, stock control, intake forms, and sale pricing.");
	data10.put("Product Image", "");
	data10.put("Product Type", "Prescription");
	data10.put("Category", "Sleep Disorder Prescription Therapies");
	data10.put("Visibility", "Public");
	data10.put("Minimum Buy Quantity", "1");
	data10.put("Maximum Buy Quantity", "1");
	data10.put("Stock Count", "59");
	data10.put("Intake Form", "Insomnia Intake Form");
	data10.put("Default SKU / Identifier", "AST-WELL-INS-110");
	data10.put("Condition Treated", "Insomnia");
	data10.put("Restrict Multiple Active Prescriptions", "Yes");
	data10.put("Pricing Type", "Single Item");
	data10.put("Intro Price", "39.00");
	data10.put("Default Price", "149.00");
	data10.put("Sale Price", "134.00");
	data10.put("Sale Start Date", "09/10/2026");
	data10.put("Sales End Date", "10/10/2026");
	data10.put("Lab Test", "No");

	TreeMap<String, String> data11 = new TreeMap<String, String>();
	data11.put("Product Name", "AsterSleep Doxepin Maintenance Therapy");
	data11.put("Description", "Synthetic low-dose doxepin prescription product created for testing insomnia condition mapping, intake processing, SKU uniqueness, stock, and restricted prescriptions.");
	data11.put("Product Image", "");
	data11.put("Product Type", "Prescription");
	data11.put("Category", "Sleep Disorder Prescription Therapies");
	data11.put("Visibility", "Public");
	data11.put("Minimum Buy Quantity", "1");
	data11.put("Maximum Buy Quantity", "1");
	data11.put("Stock Count", "66");
	data11.put("Intake Form", "Insomnia Intake Form");
	data11.put("Default SKU / Identifier", "AST-WELL-INS-111");
	data11.put("Condition Treated", "Insomnia");
	data11.put("Restrict Multiple Active Prescriptions", "Yes");
	data11.put("Pricing Type", "Single Item");
	data11.put("Intro Price", "26.00");
	data11.put("Default Price", "99.00");
	data11.put("Sale Price", "87.00");
	data11.put("Sale Start Date", "09/11/2026");
	data11.put("Sales End Date", "10/11/2026");
	data11.put("Lab Test", "No");

	TreeMap<String, String> data12 = new TreeMap<String, String>();
	data12.put("Product Name", "AsterMind Sertraline Mood Therapy");
	data12.put("Description", "Synthetic sertraline-based prescription product for validating the low mood and focus pathway, medical intake, inventory, pricing, and prescription restrictions.");
	data12.put("Product Image", "");
	data12.put("Product Type", "Prescription");
	data12.put("Category", "Mood and Focus Support Therapies");
	data12.put("Visibility", "Public");
	data12.put("Minimum Buy Quantity", "1");
	data12.put("Maximum Buy Quantity", "1");
	data12.put("Stock Count", "88");
	data12.put("Intake Form", "Mood and Focus Intake Form");
	data12.put("Default SKU / Identifier", "AST-WELL-MF-112");
	data12.put("Condition Treated", "Low Mood / Focus");
	data12.put("Restrict Multiple Active Prescriptions", "Yes");
	data12.put("Pricing Type", "Single Item");
	data12.put("Intro Price", "22.00");
	data12.put("Default Price", "84.00");
	data12.put("Sale Price", "73.00");
	data12.put("Sale Start Date", "09/12/2026");
	data12.put("Sales End Date", "10/12/2026");
	data12.put("Lab Test", "No");

	TreeMap<String, String> data13 = new TreeMap<String, String>();
	data13.put("Product Name", "AsterMind Bupropion Mood Support Therapy");
	data13.put("Description", "Synthetic bupropion-based prescription product created for testing low mood and focus catalog workflows, intake association, stock, and pricing.");
	data13.put("Product Image", "");
	data13.put("Product Type", "Prescription");
	data13.put("Category", "Mood and Focus Support Therapies");
	data13.put("Visibility", "Public");
	data13.put("Minimum Buy Quantity", "1");
	data13.put("Maximum Buy Quantity", "1");
	data13.put("Stock Count", "72");
	data13.put("Intake Form", "Mood and Focus Intake Form");
	data13.put("Default SKU / Identifier", "AST-WELL-MF-113");
	data13.put("Condition Treated", "Low Mood / Focus");
	data13.put("Restrict Multiple Active Prescriptions", "Yes");
	data13.put("Pricing Type", "Single Item");
	data13.put("Intro Price", "25.00");
	data13.put("Default Price", "94.00");
	data13.put("Sale Price", "82.00");
	data13.put("Sale Start Date", "09/13/2026");
	data13.put("Sales End Date", "10/13/2026");
	data13.put("Lab Test", "No");

	TreeMap<String, String> data14 = new TreeMap<String, String>();
	data14.put("Product Name", "AsterMind Desvenlafaxine Balance Therapy");
	data14.put("Description", "Synthetic desvenlafaxine-based prescription product for validating condition selection, clinical intake, concurrent-prescription restriction, stock, and scheduled pricing.");
	data14.put("Product Image", "");
	data14.put("Product Type", "Prescription");
	data14.put("Category", "Mood and Focus Support Therapies");
	data14.put("Visibility", "Public");
	data14.put("Minimum Buy Quantity", "1");
	data14.put("Maximum Buy Quantity", "1");
	data14.put("Stock Count", "64");
	data14.put("Intake Form", "Mood and Focus Intake Form");
	data14.put("Default SKU / Identifier", "AST-WELL-MF-114");
	data14.put("Condition Treated", "Low Mood / Focus");
	data14.put("Restrict Multiple Active Prescriptions", "Yes");
	data14.put("Pricing Type", "Single Item");
	data14.put("Intro Price", "31.00");
	data14.put("Default Price", "116.00");
	data14.put("Sale Price", "102.00");
	data14.put("Sale Start Date", "09/14/2026");
	data14.put("Sales End Date", "10/14/2026");
	data14.put("Lab Test", "No");

	TreeMap<String, String> data15 = new TreeMap<String, String>();
	data15.put("Product Name", "AsterAndro Testosterone Gel Replacement");
	data15.put("Description", "Synthetic testosterone gel prescription product for validating confirmed low-testosterone treatment, laboratory association, intake, pricing, and inventory workflows.");
	data15.put("Product Image", "");
	data15.put("Product Type", "Prescription");
	data15.put("Category", "Testosterone Replacement Therapies");
	data15.put("Visibility", "Public");
	data15.put("Minimum Buy Quantity", "1");
	data15.put("Maximum Buy Quantity", "1");
	data15.put("Stock Count", "49");
	data15.put("Intake Form", "Low Testosterone Intake Form");
	data15.put("Default SKU / Identifier", "AST-WELL-LT-115");
	data15.put("Condition Treated", "Low Testosterone");
	data15.put("Restrict Multiple Active Prescriptions", "Yes");
	data15.put("Pricing Type", "Single Item");
	data15.put("Intro Price", "59.00");
	data15.put("Default Price", "239.00");
	data15.put("Sale Price", "215.00");
	data15.put("Sale Start Date", "09/15/2026");
	data15.put("Sales End Date", "10/15/2026");
	data15.put("Lab Test", "Yes");

	TreeMap<String, String> data16 = new TreeMap<String, String>();
	data16.put("Product Name", "AsterAndro Testosterone Cypionate Injection");
	data16.put("Description", "Synthetic testosterone cypionate prescription product created for testing low-testosterone diagnosis workflows, required labs, stock, intake, and quantity limits.");
	data16.put("Product Image", "");
	data16.put("Product Type", "Prescription");
	data16.put("Category", "Testosterone Replacement Therapies");
	data16.put("Visibility", "Public");
	data16.put("Minimum Buy Quantity", "1");
	data16.put("Maximum Buy Quantity", "1");
	data16.put("Stock Count", "43");
	data16.put("Intake Form", "Low Testosterone Intake Form");
	data16.put("Default SKU / Identifier", "AST-WELL-LT-116");
	data16.put("Condition Treated", "Low Testosterone");
	data16.put("Restrict Multiple Active Prescriptions", "Yes");
	data16.put("Pricing Type", "Single Item");
	data16.put("Intro Price", "65.00");
	data16.put("Default Price", "265.00");
	data16.put("Sale Price", "238.00");
	data16.put("Sale Start Date", "09/16/2026");
	data16.put("Sales End Date", "10/16/2026");
	data16.put("Lab Test", "Yes");

	TreeMap<String, String> data17 = new TreeMap<String, String>();
	data17.put("Product Name", "AsterAndro Testosterone Transdermal Therapy");
	data17.put("Description", "Synthetic transdermal testosterone replacement product for validating low-testosterone catalog configuration, laboratory requirements, prescription intake, and pricing.");
	data17.put("Product Image", "");
	data17.put("Product Type", "Prescription");
	data17.put("Category", "Testosterone Replacement Therapies");
	data17.put("Visibility", "Public");
	data17.put("Minimum Buy Quantity", "1");
	data17.put("Maximum Buy Quantity", "1");
	data17.put("Stock Count", "52");
	data17.put("Intake Form", "Low Testosterone Intake Form");
	data17.put("Default SKU / Identifier", "AST-WELL-LT-117");
	data17.put("Condition Treated", "Low Testosterone");
	data17.put("Restrict Multiple Active Prescriptions", "Yes");
	data17.put("Pricing Type", "Single Item");
	data17.put("Intro Price", "54.00");
	data17.put("Default Price", "219.00");
	data17.put("Sale Price", "196.00");
	data17.put("Sale Start Date", "09/17/2026");
	data17.put("Sales End Date", "10/17/2026");
	data17.put("Lab Test", "Yes");

	TreeMap<String, String> data18 = new TreeMap<String, String>();
	data18.put("Product Name", "AsterWeight Semaglutide Management Therapy");
	data18.put("Description", "Synthetic semaglutide-based prescription product created for validating medical weight-management intake, laboratory association, inventory, and pricing workflows.");
	data18.put("Product Image", "");
	data18.put("Product Type", "Prescription");
	data18.put("Category", "Medical Weight Management Therapies");
	data18.put("Visibility", "Public");
	data18.put("Minimum Buy Quantity", "1");
	data18.put("Maximum Buy Quantity", "1");
	data18.put("Stock Count", "38");
	data18.put("Intake Form", "Obesity Weight Management Intake Form");
	data18.put("Default SKU / Identifier", "AST-WELL-OB-118");
	data18.put("Condition Treated", "Obesity");
	data18.put("Restrict Multiple Active Prescriptions", "Yes");
	data18.put("Pricing Type", "Single Item");
	data18.put("Intro Price", "89.00");
	data18.put("Default Price", "429.00");
	data18.put("Sale Price", "389.00");
	data18.put("Sale Start Date", "09/18/2026");
	data18.put("Sales End Date", "10/18/2026");
	data18.put("Lab Test", "Yes");

	TreeMap<String, String> data19 = new TreeMap<String, String>();
	data19.put("Product Name", "AsterWeight Tirzepatide Management Therapy");
	data19.put("Description", "Synthetic tirzepatide-based prescription product for testing obesity treatment catalog creation, clinical intake, stock restrictions, laboratory requirements, and pricing.");
	data19.put("Product Image", "");
	data19.put("Product Type", "Prescription");
	data19.put("Category", "Medical Weight Management Therapies");
	data19.put("Visibility", "Public");
	data19.put("Minimum Buy Quantity", "1");
	data19.put("Maximum Buy Quantity", "1");
	data19.put("Stock Count", "35");
	data19.put("Intake Form", "Obesity Weight Management Intake Form");
	data19.put("Default SKU / Identifier", "AST-WELL-OB-119");
	data19.put("Condition Treated", "Obesity");
	data19.put("Restrict Multiple Active Prescriptions", "Yes");
	data19.put("Pricing Type", "Single Item");
	data19.put("Intro Price", "99.00");
	data19.put("Default Price", "475.00");
	data19.put("Sale Price", "429.00");
	data19.put("Sale Start Date", "09/19/2026");
	data19.put("Sales End Date", "10/19/2026");
	data19.put("Lab Test", "Yes");

	TreeMap<String, String> data20 = new TreeMap<String, String>();
	data20.put("Product Name", "AsterWeight Liraglutide Management Therapy");
	data20.put("Description", "Synthetic liraglutide-based prescription product designed for validating obesity condition mapping, medical intake, required laboratory testing, stock, and sale pricing.");
	data20.put("Product Image", "");
	data20.put("Product Type", "Prescription");
	data20.put("Category", "Medical Weight Management Therapies");
	data20.put("Visibility", "Public");
	data20.put("Minimum Buy Quantity", "1");
	data20.put("Maximum Buy Quantity", "1");
	data20.put("Stock Count", "41");
	data20.put("Intake Form", "Obesity Weight Management Intake Form");
	data20.put("Default SKU / Identifier", "AST-WELL-OB-120");
	data20.put("Condition Treated", "Obesity");
	data20.put("Restrict Multiple Active Prescriptions", "Yes");
	data20.put("Pricing Type", "Single Item");
	data20.put("Intro Price", "79.00");
	data20.put("Default Price", "395.00");
	data20.put("Sale Price", "356.00");
	data20.put("Sale Start Date", "09/20/2026");
	data20.put("Sales End Date", "10/20/2026");
	data20.put("Lab Test", "Yes");

	return new Object[][] {
		{ data1 },
		{ data2 },
		{ data3 },
		{ data4 },
		{ data5 },
		{ data6 },
		{ data7 },
		{ data8 },
		{ data9 },
		{ data10 },
		{ data11 },
		{ data12 },
		{ data13 },
		{ data14 },
		{ data15 },
		{ data16 },
		{ data17 },
		{ data18 },
		{ data19 },
		{ data20 }
	};
}




	
}
