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
   
@DataProvider
 public Object[][] Category_Create_Data(){

	TreeMap<String, String> data1 = new TreeMap<String, String>();
	data1.put("Category Name", "Rare Metabolic Enzyme Replacement Therapies");
	data1.put("Drug Class / Code", "MET-ERT-001");
	data1.put("Description", "Specialty therapies used to replace deficient or missing enzymes in patients with rare inherited metabolic and lysosomal storage disorders.");

	TreeMap<String, String> data2 = new TreeMap<String, String>();
	data2.put("Category Name", "Pulmonary Arterial Hypertension Targeted Agents");
	data2.put("Drug Class / Code", "CARD-PAH-002");
	data2.put("Description", "Targeted medicines used to manage pulmonary arterial hypertension by reducing pulmonary vascular resistance and improving cardiopulmonary function.");

	TreeMap<String, String> data3 = new TreeMap<String, String>();
	data3.put("Category Name", "Autoimmune Biologic Immunomodulators");
	data3.put("Drug Class / Code", "IMM-BIO-003");
	data3.put("Description", "Biologic therapies designed to regulate specific immune pathways involved in severe autoimmune and chronic inflammatory diseases.");

	TreeMap<String, String> data4 = new TreeMap<String, String>();
	data4.put("Category Name", "Multiple Sclerosis Disease-Modifying Therapies");
	data4.put("Drug Class / Code", "NEU-MS-004");
	data4.put("Description", "Disease-modifying therapies used to reduce relapse frequency, inflammatory activity, and progression in different forms of multiple sclerosis.");

	TreeMap<String, String> data5 = new TreeMap<String, String>();
	data5.put("Category Name", "Cystic Fibrosis CFTR Modulator Therapies");
	data5.put("Drug Class / Code", "PUL-CFTR-005");
	data5.put("Description", "Specialty medicines that target defective CFTR protein function in eligible patients diagnosed with cystic fibrosis.");

	TreeMap<String, String> data6 = new TreeMap<String, String>();
	data6.put("Category Name", "Hereditary Angioedema Preventive Therapies");
	data6.put("Drug Class / Code", "IMM-HAE-006");
	data6.put("Description", "Preventive and maintenance therapies used to reduce the frequency and severity of hereditary angioedema attacks.");

	TreeMap<String, String> data7 = new TreeMap<String, String>();
	data7.put("Category Name", "Advanced Heart Failure Support Therapies");
	data7.put("Drug Class / Code", "CARD-HF-007");
	data7.put("Description", "Specialty cardiovascular therapies used to support patients with advanced or treatment-resistant heart failure under close medical supervision.");

	TreeMap<String, String> data8 = new TreeMap<String, String>();
	data8.put("Category Name", "Epilepsy Rescue and Maintenance Therapies");
	data8.put("Drug Class / Code", "NEU-EPI-008");
	data8.put("Description", "Prescription therapies used for ongoing seizure control and emergency management of acute or prolonged epileptic episodes.");

	TreeMap<String, String> data9 = new TreeMap<String, String>();
	data9.put("Category Name", "Endocrine Hormone Replacement Therapies");
	data9.put("Drug Class / Code", "ENDO-HRT-009");
	data9.put("Description", "Hormone replacement medicines used to manage clinically diagnosed endocrine deficiencies and related hormonal disorders.");

	TreeMap<String, String> data10 = new TreeMap<String, String>();
	data10.put("Category Name", "Hemophilia Coagulation Factor Therapies");
	data10.put("Drug Class / Code", "HEMA-CFT-010");
	data10.put("Description", "Coagulation factor replacement and related specialty therapies used to prevent or control bleeding in patients with hemophilia.");

	TreeMap<String, String> data11 = new TreeMap<String, String>();
	data11.put("Category Name", "Sickle Cell Disease-Modifying Therapies");
	data11.put("Drug Class / Code", "HEMA-SCD-011");
	data11.put("Description", "Specialty medicines used to reduce vaso-occlusive complications and modify the clinical progression of sickle cell disease.");

	TreeMap<String, String> data12 = new TreeMap<String, String>();
	data12.put("Category Name", "Neutropenia Colony-Stimulating Therapies");
	data12.put("Drug Class / Code", "HEMA-CSF-012");
	data12.put("Description", "Colony-stimulating therapies used to increase neutrophil production and reduce infection risk in patients with severe neutropenia.");

	TreeMap<String, String> data13 = new TreeMap<String, String>();
	data13.put("Category Name", "Severe Asthma Monoclonal Antibody Therapies");
	data13.put("Drug Class / Code", "RESP-MAB-013");
	data13.put("Description", "Targeted monoclonal antibody therapies used for severe asthma that remains uncontrolled despite standard inhaled treatment.");

	TreeMap<String, String> data14 = new TreeMap<String, String>();
	data14.put("Category Name", "Chronic Kidney Disease Erythropoiesis Therapies");
	data14.put("Drug Class / Code", "RENAL-ESA-014");
	data14.put("Description", "Erythropoiesis-stimulating therapies used to manage anemia associated with chronic kidney disease and reduced red blood cell production.");

	TreeMap<String, String> data15 = new TreeMap<String, String>();
	data15.put("Category Name", "Pulmonary Fibrosis Antifibrotic Therapies");
	data15.put("Drug Class / Code", "PUL-AFT-015");
	data15.put("Description", "Antifibrotic specialty medicines used to slow functional decline and disease progression in selected pulmonary fibrosis conditions.");

	TreeMap<String, String> data16 = new TreeMap<String, String>();
	data16.put("Category Name", "Rheumatoid Arthritis JAK Inhibitor Therapies");
	data16.put("Drug Class / Code", "RHEUM-JAK-016");
	data16.put("Description", "Targeted oral immunomodulatory therapies used in the management of moderate-to-severe rheumatoid arthritis.");

	TreeMap<String, String> data17 = new TreeMap<String, String>();
	data17.put("Category Name", "Psoriasis Systemic Biologic Therapies");
	data17.put("Drug Class / Code", "DERM-PSO-017");
	data17.put("Description", "Systemic biologic therapies used for moderate-to-severe plaque psoriasis and related immune-mediated dermatologic conditions.");

	TreeMap<String, String> data18 = new TreeMap<String, String>();
	data18.put("Category Name", "Migraine CGRP Preventive Therapies");
	data18.put("Drug Class / Code", "NEU-CGRP-018");
	data18.put("Description", "CGRP-targeted specialty therapies used to prevent or reduce the frequency and severity of recurrent migraine episodes.");

	TreeMap<String, String> data19 = new TreeMap<String, String>();
	data19.put("Category Name", "Inflammatory Bowel Disease Advanced Therapies");
	data19.put("Drug Class / Code", "GASTRO-IBD-019");
	data19.put("Description", "Advanced biologic and targeted therapies used to manage moderate-to-severe Crohn's disease and ulcerative colitis.");

	TreeMap<String, String> data20 = new TreeMap<String, String>();
	data20.put("Category Name", "Neurodegenerative Disease Specialty Therapies");
	data20.put("Drug Class / Code", "NEU-NDT-020");
	data20.put("Description", "Specialty therapies used for the clinical management of progressive neurodegenerative disorders requiring structured monitoring and specialist oversight.");

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
public Object[][] Product_Create_Data() {

	TreeMap<String, String> data1 = new TreeMap<String, String>();
	data1.put("Product Name", "AsterOnco Lumina Lung Targeted Therapy");
	data1.put("Description", "Synthetic prescription product created for validating solid tumor catalog, intake form, inventory, restriction, pricing, and prescription workflow behavior for non-small cell lung cancer.");
	data1.put("Product Image", "");
	data1.put("Product Type", "Prescription");
	data1.put("Category", "Oncology – Solid Tumor Therapies");
	data1.put("Visibility", "Public");
	data1.put("Minimum Buy Quantity", "1");
	data1.put("Maximum Buy Quantity", "1");
	data1.put("Stock Count", "48");
	data1.put("Intake Form", "AsterMD Solid Tumor Intake Form");
	data1.put("Default SKU / Identifier", "AST-ONC-ST-001");
	data1.put("Condition Treated", "Non-Small Cell Lung Cancer");
	data1.put("Restrict Multiple Active Prescriptions", "Yes");
	data1.put("Pricing Type", "Single Item");
	data1.put("Intro Price", "199.00");
	data1.put("Default Price", "1450.00");
	data1.put("Sale Price", "1299.00");
	data1.put("Sale Start Date", "08/10/2026");
	data1.put("Sales End Date", "09/10/2026");
	data1.put("Lab Test", "No");

	TreeMap<String, String> data2 = new TreeMap<String, String>();
	data2.put("Product Name", "AsterOnco Aurora Breast Precision Therapy");
	data2.put("Description", "Synthetic prescription product designed to test regulated breast oncology product creation, prescription intake association, purchasing limits, stock management, and promotional pricing.");
	data2.put("Product Image", "");
	data2.put("Product Type", "Prescription");
	data2.put("Category", "Oncology – Solid Tumor Therapies");
	data2.put("Visibility", "Public");
	data2.put("Minimum Buy Quantity", "1");
	data2.put("Maximum Buy Quantity", "2");
	data2.put("Stock Count", "56");
	data2.put("Intake Form", "AsterMD Solid Tumor Intake Form");
	data2.put("Default SKU / Identifier", "AST-ONC-ST-002");
	data2.put("Condition Treated", "Breast Cancer");
	data2.put("Restrict Multiple Active Prescriptions", "Yes");
	data2.put("Pricing Type", "Single Item");
	data2.put("Intro Price", "225.00");
	data2.put("Default Price", "1680.00");
	data2.put("Sale Price", "1515.00");
	data2.put("Sale Start Date", "08/12/2026");
	data2.put("Sales End Date", "09/12/2026");
	data2.put("Lab Test", "No");

	TreeMap<String, String> data3 = new TreeMap<String, String>();
	data3.put("Product Name", "AsterOnco Meridian Colorectal Therapy");
	data3.put("Description", "Synthetic colorectal oncology prescription product for testing medical catalog classification, intake form enforcement, SKU uniqueness, active prescription restriction, quantities, and sale dates.");
	data3.put("Product Image", "");
	data3.put("Product Type", "Prescription");
	data3.put("Category", "Oncology – Solid Tumor Therapies");
	data3.put("Visibility", "Public");
	data3.put("Minimum Buy Quantity", "1");
	data3.put("Maximum Buy Quantity", "1");
	data3.put("Stock Count", "37");
	data3.put("Intake Form", "AsterMD Solid Tumor Intake Form");
	data3.put("Default SKU / Identifier", "AST-ONC-ST-003");
	data3.put("Condition Treated", "Colorectal Cancer");
	data3.put("Restrict Multiple Active Prescriptions", "Yes");
	data3.put("Pricing Type", "Single Item");
	data3.put("Intro Price", "189.00");
	data3.put("Default Price", "1325.00");
	data3.put("Sale Price", "1190.00");
	data3.put("Sale Start Date", "08/15/2026");
	data3.put("Sales End Date", "09/15/2026");
	data3.put("Lab Test", "No");

	TreeMap<String, String> data4 = new TreeMap<String, String>();
	data4.put("Product Name", "AsterOnco Solid Tumor Care Organizer");
	data4.put("Description", "Synthetic standard care-support product for organizing treatment documents, appointment notes, medication schedules, and oncology care instructions without creating a prescription workflow.");
	data4.put("Product Image", "");
	data4.put("Product Type", "Standard");
	data4.put("Category", "Oncology – Solid Tumor Therapies");
	data4.put("Visibility", "Public");
	data4.put("Minimum Buy Quantity", "1");
	data4.put("Maximum Buy Quantity", "4");
	data4.put("Stock Count", "125");
	data4.put("Intake Form", "");
	data4.put("Default SKU / Identifier", "AST-ONC-ST-004");
	data4.put("Condition Treated", "Solid Tumor Supportive Care");
	data4.put("Restrict Multiple Active Prescriptions", "No");
	data4.put("Pricing Type", "Single Item");
	data4.put("Intro Price", "19.00");
	data4.put("Default Price", "64.00");
	data4.put("Sale Price", "55.00");
	data4.put("Sale Start Date", "08/18/2026");
	data4.put("Sales End Date", "09/18/2026");
	data4.put("Lab Test", "No");

	TreeMap<String, String> data5 = new TreeMap<String, String>();
	data5.put("Product Name", "AsterOnco Symptom Journal Add-On");
	data5.put("Description", "Synthetic oncology add-on containing a symptom journal and treatment-tracking materials for validating add-on classification, inventory limits, condition mapping, and independent pricing.");
	data5.put("Product Image", "");
	data5.put("Product Type", "Add-On");
	data5.put("Category", "Oncology – Solid Tumor Therapies");
	data5.put("Visibility", "Public");
	data5.put("Minimum Buy Quantity", "1");
	data5.put("Maximum Buy Quantity", "3");
	data5.put("Stock Count", "94");
	data5.put("Intake Form", "");
	data5.put("Default SKU / Identifier", "AST-ONC-ST-005");
	data5.put("Condition Treated", "Oncology Treatment Symptom Support");
	data5.put("Restrict Multiple Active Prescriptions", "No");
	data5.put("Pricing Type", "Single Item");
	data5.put("Intro Price", "12.00");
	data5.put("Default Price", "39.00");
	data5.put("Sale Price", "32.00");
	data5.put("Sale Start Date", "08/20/2026");
	data5.put("Sales End Date", "09/20/2026");
	data5.put("Lab Test", "No");

	TreeMap<String, String> data6 = new TreeMap<String, String>();
	data6.put("Product Name", "AsterHema Nova AML Prescription Therapy");
	data6.put("Description", "Synthetic prescription product for validating acute myeloid leukemia catalog records, mandatory hematology intake selection, restricted active prescriptions, stock, SKU, and price processing.");
	data6.put("Product Image", "");
	data6.put("Product Type", "Prescription");
	data6.put("Category", "Oncology – Hematologic Malignancies");
	data6.put("Visibility", "Public");
	data6.put("Minimum Buy Quantity", "1");
	data6.put("Maximum Buy Quantity", "1");
	data6.put("Stock Count", "29");
	data6.put("Intake Form", "AsterMD Hematology Intake Form");
	data6.put("Default SKU / Identifier", "AST-ONC-HM-006");
	data6.put("Condition Treated", "Acute Myeloid Leukemia");
	data6.put("Restrict Multiple Active Prescriptions", "Yes");
	data6.put("Pricing Type", "Single Item");
	data6.put("Intro Price", "275.00");
	data6.put("Default Price", "2150.00");
	data6.put("Sale Price", "1950.00");
	data6.put("Sale Start Date", "08/22/2026");
	data6.put("Sales End Date", "09/22/2026");
	data6.put("Lab Test", "No");

	TreeMap<String, String> data7 = new TreeMap<String, String>();
	data7.put("Product Name", "AsterHema Lymphora Precision Therapy");
	data7.put("Description", "Synthetic regulated lymphoma prescription product created to test hematologic malignancy categorization, medical intake linkage, maximum purchase enforcement, and sale price validation.");
	data7.put("Product Image", "");
	data7.put("Product Type", "Prescription");
	data7.put("Category", "Oncology – Hematologic Malignancies");
	data7.put("Visibility", "Public");
	data7.put("Minimum Buy Quantity", "1");
	data7.put("Maximum Buy Quantity", "2");
	data7.put("Stock Count", "34");
	data7.put("Intake Form", "AsterMD Hematology Intake Form");
	data7.put("Default SKU / Identifier", "AST-ONC-HM-007");
	data7.put("Condition Treated", "Diffuse Large B-Cell Lymphoma");
	data7.put("Restrict Multiple Active Prescriptions", "Yes");
	data7.put("Pricing Type", "Single Item");
	data7.put("Intro Price", "260.00");
	data7.put("Default Price", "1980.00");
	data7.put("Sale Price", "1785.00");
	data7.put("Sale Start Date", "08/25/2026");
	data7.put("Sales End Date", "09/25/2026");
	data7.put("Lab Test", "No");

	TreeMap<String, String> data8 = new TreeMap<String, String>();
	data8.put("Product Name", "AsterHema Myelora Maintenance Therapy");
	data8.put("Description", "Synthetic multiple myeloma prescription catalog product for validating regulated product creation, intake form requirements, purchase quantities, restricted concurrent prescriptions, and pricing.");
	data8.put("Product Image", "");
	data8.put("Product Type", "Prescription");
	data8.put("Category", "Oncology – Hematologic Malignancies");
	data8.put("Visibility", "Public");
	data8.put("Minimum Buy Quantity", "1");
	data8.put("Maximum Buy Quantity", "1");
	data8.put("Stock Count", "42");
	data8.put("Intake Form", "AsterMD Hematology Intake Form");
	data8.put("Default SKU / Identifier", "AST-ONC-HM-008");
	data8.put("Condition Treated", "Multiple Myeloma");
	data8.put("Restrict Multiple Active Prescriptions", "Yes");
	data8.put("Pricing Type", "Single Item");
	data8.put("Intro Price", "240.00");
	data8.put("Default Price", "1875.00");
	data8.put("Sale Price", "1690.00");
	data8.put("Sale Start Date", "08/28/2026");
	data8.put("Sales End Date", "09/28/2026");
	data8.put("Lab Test", "No");

	TreeMap<String, String> data9 = new TreeMap<String, String>();
	data9.put("Product Name", "AsterHema Care Coordination Pack");
	data9.put("Description", "Synthetic standard hematology support pack for storing consultation records, treatment schedules, emergency contact information, care instructions, and follow-up documentation.");
	data9.put("Product Image", "");
	data9.put("Product Type", "Standard");
	data9.put("Category", "Oncology – Hematologic Malignancies");
	data9.put("Visibility", "Public");
	data9.put("Minimum Buy Quantity", "1");
	data9.put("Maximum Buy Quantity", "5");
	data9.put("Stock Count", "138");
	data9.put("Intake Form", "");
	data9.put("Default SKU / Identifier", "AST-ONC-HM-009");
	data9.put("Condition Treated", "Hematologic Malignancy Supportive Care");
	data9.put("Restrict Multiple Active Prescriptions", "No");
	data9.put("Pricing Type", "Single Item");
	data9.put("Intro Price", "21.00");
	data9.put("Default Price", "72.00");
	data9.put("Sale Price", "61.00");
	data9.put("Sale Start Date", "09/01/2026");
	data9.put("Sales End Date", "10/01/2026");
	data9.put("Lab Test", "No");

	TreeMap<String, String> data10 = new TreeMap<String, String>();
	data10.put("Product Name", "AsterHema Infusion Visit Comfort Add-On");
	data10.put("Description", "Synthetic hematology add-on product for testing optional supportive-product creation, category assignment, SKU handling, stock availability, quantity limits, and promotional pricing.");
	data10.put("Product Image", "");
	data10.put("Product Type", "Add-On");
	data10.put("Category", "Oncology – Hematologic Malignancies");
	data10.put("Visibility", "Public");
	data10.put("Minimum Buy Quantity", "1");
	data10.put("Maximum Buy Quantity", "3");
	data10.put("Stock Count", "87");
	data10.put("Intake Form", "");
	data10.put("Default SKU / Identifier", "AST-ONC-HM-010");
	data10.put("Condition Treated", "Infusion Visit Support");
	data10.put("Restrict Multiple Active Prescriptions", "No");
	data10.put("Pricing Type", "Single Item");
	data10.put("Intro Price", "15.00");
	data10.put("Default Price", "49.00");
	data10.put("Sale Price", "42.00");
	data10.put("Sale Start Date", "09/03/2026");
	data10.put("Sales End Date", "10/03/2026");
	data10.put("Lab Test", "No");

	TreeMap<String, String> data11 = new TreeMap<String, String>();
	data11.put("Product Name", "AsterTransplant RenalGuard Maintenance Therapy");
	data11.put("Description", "Synthetic kidney transplant prescription product for validating immunosuppressant category selection, transplant intake association, restricted active prescriptions, stock, and controlled quantities.");
	data11.put("Product Image", "");
	data11.put("Product Type", "Prescription");
	data11.put("Category", "Organ Transplant Immunosuppressants");
	data11.put("Visibility", "Public");
	data11.put("Minimum Buy Quantity", "1");
	data11.put("Maximum Buy Quantity", "1");
	data11.put("Stock Count", "44");
	data11.put("Intake Form", "AsterMD Transplant Intake Form");
	data11.put("Default SKU / Identifier", "AST-TRN-IM-011");
	data11.put("Condition Treated", "Kidney Transplant");
	data11.put("Restrict Multiple Active Prescriptions", "Yes");
	data11.put("Pricing Type", "Single Item");
	data11.put("Intro Price", "175.00");
	data11.put("Default Price", "1180.00");
	data11.put("Sale Price", "1060.00");
	data11.put("Sale Start Date", "09/05/2026");
	data11.put("Sales End Date", "10/05/2026");
	data11.put("Lab Test", "No");

	TreeMap<String, String> data12 = new TreeMap<String, String>();
	data12.put("Product Name", "AsterTransplant HepaShield Maintenance Therapy");
	data12.put("Description", "Synthetic liver transplant prescription product created for testing regulated immunosuppressant catalog workflows, required intake forms, purchase restrictions, inventory, and sale pricing.");
	data12.put("Product Image", "");
	data12.put("Product Type", "Prescription");
	data12.put("Category", "Organ Transplant Immunosuppressants");
	data12.put("Visibility", "Public");
	data12.put("Minimum Buy Quantity", "1");
	data12.put("Maximum Buy Quantity", "2");
	data12.put("Stock Count", "39");
	data12.put("Intake Form", "AsterMD Transplant Intake Form");
	data12.put("Default SKU / Identifier", "AST-TRN-IM-012");
	data12.put("Condition Treated", "Liver Transplant");
	data12.put("Restrict Multiple Active Prescriptions", "Yes");
	data12.put("Pricing Type", "Single Item");
	data12.put("Intro Price", "185.00");
	data12.put("Default Price", "1260.00");
	data12.put("Sale Price", "1135.00");
	data12.put("Sale Start Date", "09/08/2026");
	data12.put("Sales End Date", "10/08/2026");
	data12.put("Lab Test", "No");

	TreeMap<String, String> data13 = new TreeMap<String, String>();
	data13.put("Product Name", "AsterTransplant CardioGraft Maintenance Therapy");
	data13.put("Description", "Synthetic heart transplant prescription catalog entry for validating prescription-only fields, transplant condition mapping, active prescription restriction, SKU uniqueness, and pricing behavior.");
	data13.put("Product Image", "");
	data13.put("Product Type", "Prescription");
	data13.put("Category", "Organ Transplant Immunosuppressants");
	data13.put("Visibility", "Public");
	data13.put("Minimum Buy Quantity", "1");
	data13.put("Maximum Buy Quantity", "1");
	data13.put("Stock Count", "31");
	data13.put("Intake Form", "AsterMD Transplant Intake Form");
	data13.put("Default SKU / Identifier", "AST-TRN-IM-013");
	data13.put("Condition Treated", "Heart Transplant");
	data13.put("Restrict Multiple Active Prescriptions", "Yes");
	data13.put("Pricing Type", "Single Item");
	data13.put("Intro Price", "210.00");
	data13.put("Default Price", "1490.00");
	data13.put("Sale Price", "1340.00");
	data13.put("Sale Start Date", "09/10/2026");
	data13.put("Sales End Date", "10/10/2026");
	data13.put("Lab Test", "No");

	TreeMap<String, String> data14 = new TreeMap<String, String>();
	data14.put("Product Name", "AsterTransplant Medication Organizer");
	data14.put("Description", "Synthetic standard transplant-support product for organizing medicine schedules, refill information, transplant-team contacts, follow-up dates, and general care documentation.");
	data14.put("Product Image", "");
	data14.put("Product Type", "Standard");
	data14.put("Category", "Organ Transplant Immunosuppressants");
	data14.put("Visibility", "Public");
	data14.put("Minimum Buy Quantity", "1");
	data14.put("Maximum Buy Quantity", "4");
	data14.put("Stock Count", "116");
	data14.put("Intake Form", "");
	data14.put("Default SKU / Identifier", "AST-TRN-IM-014");
	data14.put("Condition Treated", "Post-Transplant Medication Management");
	data14.put("Restrict Multiple Active Prescriptions", "No");
	data14.put("Pricing Type", "Single Item");
	data14.put("Intro Price", "18.00");
	data14.put("Default Price", "59.00");
	data14.put("Sale Price", "50.00");
	data14.put("Sale Start Date", "09/12/2026");
	data14.put("Sales End Date", "10/12/2026");
	data14.put("Lab Test", "No");

	TreeMap<String, String> data15 = new TreeMap<String, String>();
	data15.put("Product Name", "AsterTransplant Monitoring Journal Add-On");
	data15.put("Description", "Synthetic transplant add-on journal for testing supportive-product categorization, post-transplant monitoring condition mapping, quantities, stock count, and sale-date validation.");
	data15.put("Product Image", "");
	data15.put("Product Type", "Add-On");
	data15.put("Category", "Organ Transplant Immunosuppressants");
	data15.put("Visibility", "Public");
	data15.put("Minimum Buy Quantity", "1");
	data15.put("Maximum Buy Quantity", "3");
	data15.put("Stock Count", "91");
	data15.put("Intake Form", "");
	data15.put("Default SKU / Identifier", "AST-TRN-IM-015");
	data15.put("Condition Treated", "Post-Transplant Monitoring");
	data15.put("Restrict Multiple Active Prescriptions", "No");
	data15.put("Pricing Type", "Single Item");
	data15.put("Intro Price", "13.00");
	data15.put("Default Price", "44.00");
	data15.put("Sale Price", "37.00");
	data15.put("Sale Start Date", "09/15/2026");
	data15.put("Sales End Date", "10/15/2026");
	data15.put("Lab Test", "No");

	TreeMap<String, String> data16 = new TreeMap<String, String>();
	data16.put("Product Name", "AsterHIV CoreControl ART Therapy");
	data16.put("Description", "Synthetic antiretroviral prescription product created for testing HIV therapy category selection, mandatory medical intake association, active prescription restriction, and inventory control.");
	data16.put("Product Image", "");
	data16.put("Product Type", "Prescription");
	data16.put("Category", "Antiretroviral Therapy for HIV");
	data16.put("Visibility", "Public");
	data16.put("Minimum Buy Quantity", "1");
	data16.put("Maximum Buy Quantity", "1");
	data16.put("Stock Count", "63");
	data16.put("Intake Form", "AsterMD HIV Therapy Intake Form");
	data16.put("Default SKU / Identifier", "AST-HIV-ART-016");
	data16.put("Condition Treated", "HIV-1 Infection");
	data16.put("Restrict Multiple Active Prescriptions", "Yes");
	data16.put("Pricing Type", "Single Item");
	data16.put("Intro Price", "95.00");
	data16.put("Default Price", "685.00");
	data16.put("Sale Price", "615.00");
	data16.put("Sale Start Date", "09/18/2026");
	data16.put("Sales End Date", "10/18/2026");
	data16.put("Lab Test", "No");

	TreeMap<String, String> data17 = new TreeMap<String, String>();
	data17.put("Product Name", "AsterHIV ResistancePath ART Therapy");
	data17.put("Description", "Synthetic regulated antiretroviral product for validating treatment-experienced HIV condition mapping, prescription intake selection, controlled quantities, unique SKU, and pricing.");
	data17.put("Product Image", "");
	data17.put("Product Type", "Prescription");
	data17.put("Category", "Antiretroviral Therapy for HIV");
	data17.put("Visibility", "Public");
	data17.put("Minimum Buy Quantity", "1");
	data17.put("Maximum Buy Quantity", "1");
	data17.put("Stock Count", "46");
	data17.put("Intake Form", "AsterMD HIV Therapy Intake Form");
	data17.put("Default SKU / Identifier", "AST-HIV-ART-017");
	data17.put("Condition Treated", "Treatment-Experienced HIV-1 Infection");
	data17.put("Restrict Multiple Active Prescriptions", "Yes");
	data17.put("Pricing Type", "Single Item");
	data17.put("Intro Price", "115.00");
	data17.put("Default Price", "820.00");
	data17.put("Sale Price", "738.00");
	data17.put("Sale Start Date", "09/20/2026");
	data17.put("Sales End Date", "10/20/2026");
	data17.put("Lab Test", "No");

	TreeMap<String, String> data18 = new TreeMap<String, String>();
	data18.put("Product Name", "AsterHIV Continuum ART Maintenance Therapy");
	data18.put("Description", "Synthetic HIV maintenance prescription product for testing antiretroviral catalog workflows, intake form enforcement, multiple-prescription restriction, stock validation, and scheduled sale pricing.");
	data18.put("Product Image", "");
	data18.put("Product Type", "Prescription");
	data18.put("Category", "Antiretroviral Therapy for HIV");
	data18.put("Visibility", "Public");
	data18.put("Minimum Buy Quantity", "1");
	data18.put("Maximum Buy Quantity", "2");
	data18.put("Stock Count", "58");
	data18.put("Intake Form", "AsterMD HIV Therapy Intake Form");
	data18.put("Default SKU / Identifier", "AST-HIV-ART-018");
	data18.put("Condition Treated", "HIV Antiretroviral Maintenance");
	data18.put("Restrict Multiple Active Prescriptions", "Yes");
	data18.put("Pricing Type", "Single Item");
	data18.put("Intro Price", "89.00");
	data18.put("Default Price", "640.00");
	data18.put("Sale Price", "575.00");
	data18.put("Sale Start Date", "09/22/2026");
	data18.put("Sales End Date", "10/22/2026");
	data18.put("Lab Test", "No");

	TreeMap<String, String> data19 = new TreeMap<String, String>();
	data19.put("Product Name", "AsterHIV ART Adherence Support Pack");
	data19.put("Description", "Synthetic standard HIV care-support product containing adherence planning materials, refill reminders, appointment notes, and treatment-information organization resources.");
	data19.put("Product Image", "");
	data19.put("Product Type", "Standard");
	data19.put("Category", "Antiretroviral Therapy for HIV");
	data19.put("Visibility", "Public");
	data19.put("Minimum Buy Quantity", "1");
	data19.put("Maximum Buy Quantity", "5");
	data19.put("Stock Count", "142");
	data19.put("Intake Form", "");
	data19.put("Default SKU / Identifier", "AST-HIV-ART-019");
	data19.put("Condition Treated", "ART Medication Adherence");
	data19.put("Restrict Multiple Active Prescriptions", "No");
	data19.put("Pricing Type", "Single Item");
	data19.put("Intro Price", "16.00");
	data19.put("Default Price", "54.00");
	data19.put("Sale Price", "46.00");
	data19.put("Sale Start Date", "09/25/2026");
	data19.put("Sales End Date", "10/25/2026");
	data19.put("Lab Test", "No");

	TreeMap<String, String> data20 = new TreeMap<String, String>();
	data20.put("Product Name", "AsterHIV Care Travel Organizer Add-On");
	data20.put("Description", "Synthetic HIV care add-on for organizing treatment information during travel and validating add-on type handling, category mapping, inventory limits, and promotional pricing.");
	data20.put("Product Image", "");
	data20.put("Product Type", "Add-On");
	data20.put("Category", "Antiretroviral Therapy for HIV");
	data20.put("Visibility", "Public");
	data20.put("Minimum Buy Quantity", "1");
	data20.put("Maximum Buy Quantity", "3");
	data20.put("Stock Count", "103");
	data20.put("Intake Form", "");
	data20.put("Default SKU / Identifier", "AST-HIV-ART-020");
	data20.put("Condition Treated", "HIV Care Travel Support");
	data20.put("Restrict Multiple Active Prescriptions", "No");
	data20.put("Pricing Type", "Single Item");
	data20.put("Intro Price", "14.00");
	data20.put("Default Price", "47.00");
	data20.put("Sale Price", "39.00");
	data20.put("Sale Start Date", "09/28/2026");
	data20.put("Sales End Date", "10/28/2026");
	data20.put("Lab Test", "No");

	return new Object[][] {
		{ data1 },/*
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
		{ data20 } */
	};
}




	
}
