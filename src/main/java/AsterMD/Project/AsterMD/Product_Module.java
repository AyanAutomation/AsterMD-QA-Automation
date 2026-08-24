package AsterMD.Project.AsterMD;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.IntStream;

import com.aventstack.extentreports.ExtentTest;

import Listerners.Report_Listen;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Locaters.Product_Module_Locaters;
import Repeatative_codes.Repeat;

public class Product_Module extends Side_Menu_Navigator{

	
	
public WebElement Product_Module_Accessor() throws Exception {

	int step = 1;

	try {

		Report_Listen.log_print_in_report().info("──────────────────── 📦 PRODUCT MODULE ACCESS ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Initialize Product Module locators and access the Catalog module.");

		System.out.println("📦 PRODUCT MODULE ACCESS");
		System.out.println();
		System.out.println("🔹 Initializing Product Module locators and accessing the Catalog module.");
		System.out.println();

		Product_Module_Locaters p = new Product_Module_Locaters(d);

		Report_Listen.log_print_in_report().info("<b>Step " + step + ":</b> Product Module locator class initialized.");
		System.out.println("🔹 Step " + step + ": Product Module locator class initialized.");
		System.out.println();

		step++;

		Report_Listen.log_print_in_report().info("──────────────────── 🧭 CATALOG NAVIGATION ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Navigate to the Catalog option through the side menu.");

		System.out.println("🧭 CATALOG NAVIGATION");
		System.out.println();
		System.out.println("🔹 Step " + step + ": Navigating to the Catalog option through the side menu.");
		System.out.println();
        
		Side_Menu_Navigation("Catalog");

		Report_Listen.log_print_in_report().pass("✅ Catalog side-menu navigation completed successfully.");
		System.out.println("✅ Catalog side-menu navigation completed successfully.");
		System.out.println();

		step++;

		Report_Listen.log_print_in_report().info("──────────────────── 🧭 PRODUCT NAVIGATION BAR ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Verify and retrieve the Product Module top navigation bar.");

		System.out.println("🧭 PRODUCT NAVIGATION BAR");
		System.out.println();
		System.out.println("🔹 Step " + step + ": Verifying the Product Module top navigation bar.");
		System.out.println();

		p.Top_Navigation_bar();

		Report_Listen.log_print_in_report().pass("✅ Product Module top navigation bar verified successfully.");
		System.out.println("✅ Product Module top navigation bar verified successfully.");
		System.out.println();

		step++;

		Report_Listen.log_print_in_report().info("──────────────────── ➕ PRODUCT ADD ACCESS ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Retrieve the Product Add button.");

		System.out.println("➕ PRODUCT ADD ACCESS");
		System.out.println();
		System.out.println("🔹 Step " + step + ": Retrieving the Product Add button.");
		System.out.println();

		WebElement Product_Add = p.Product_Add_Button();

		Report_Listen.log_print_in_report().pass("✅ Product Add button retrieved successfully.");
		System.out.println("✅ Product Add button retrieved successfully.");
		System.out.println();

		return Product_Add;

	} catch(Exception e) {

		if(Report_Listen.log_print_in_report() != null) Report_Listen.log_print_in_report().fail("❌ Product Module access failed. Failure reason: " + e.getMessage());

		System.out.println("❌ Product Module access failed.");
		System.out.println();

		System.out.println("❌ Failure reason: " + e.getMessage());
		System.out.println();

		throw e;
	}
}



@DataProvider
public Object[][] Category_Create_Data(){

	TreeMap<String, String> data1 = new TreeMap<String, String>();
	data1.put("Category Name", "Erectile Function Therapeutic Care Products");
	data1.put("Drug Class / Code", "URO-EFT-401");
	data1.put("Description", "Therapeutic products intended for adult patients experiencing erectile dysfunction where impaired erectile response, vascular function, medication suitability, and related health factors require structured clinical assessment. This category supports products used within erectile-function treatment pathways involving medical-history review, cardiovascular risk evaluation, medication interaction screening, symptom assessment, treatment-response monitoring, and continued review of patient suitability.");

	TreeMap<String, String> data2 = new TreeMap<String, String>();
	data2.put("Category Name", "Male Ejaculatory Control Care Products");
	data2.put("Drug Class / Code", "URO-MEC-402");
	data2.put("Description", "Clinical and supportive products associated with premature ejaculation management and improvement of ejaculatory control in eligible adult patients. Products within this category may be incorporated into treatment pathways that evaluate symptom duration, sexual-health history, psychological contributors, medication use, treatment tolerance, behavioral factors, and ongoing response to therapy.");

	TreeMap<String, String> data3 = new TreeMap<String, String>();
	data3.put("Category Name", "Male Libido Wellness Support Products");
	data3.put("Drug Class / Code", "URO-MLW-403");
	data3.put("Description", "Supportive products intended for adult patients experiencing reduced sexual desire or persistent low libido. This category supports catalog products used within male wellness pathways where hormonal status, stress, medication history, sleep, emotional wellbeing, relationship factors, lifestyle influences, and other potential contributors to decreased libido may be considered during assessment and continued care.");

	TreeMap<String, String> data4 = new TreeMap<String, String>();
	data4.put("Category Name", "Testosterone Restoration Clinical Products");
	data4.put("Drug Class / Code", "ENDO-TRC-404");
	data4.put("Description", "Hormone-related products intended for clinically evaluated low testosterone and associated symptoms in eligible adult male patients. Products in this category may require baseline testosterone measurements, endocrine assessment, symptom evaluation, laboratory monitoring, dosage review, hematological and metabolic safety checks, and periodic reassessment of treatment effectiveness and hormonal balance.");

	TreeMap<String, String> data5 = new TreeMap<String, String>();
	data5.put("Category Name", "Male Fertility Clinical Support Products");
	data5.put("Drug Class / Code", "REPRO-MFC-405");
	data5.put("Description", "Clinical and supportive products associated with male infertility evaluation and fertility-management pathways. This category may include products used alongside assessment of reproductive history, semen parameters, hormonal status, lifestyle factors, medication exposure, nutritional status, underlying medical conditions, and specialist-directed monitoring of fertility-related treatment response.");

	TreeMap<String, String> data6 = new TreeMap<String, String>();
	data6.put("Category Name", "Male Pattern Hair Restoration Products");
	data6.put("Drug Class / Code", "DERM-MPH-406");
	data6.put("Description", "Hair-restoration products intended for patients experiencing male pattern hair loss characterized by progressive androgen-related thinning and reduced follicular density. Products classified under this category may support treatment programs involving scalp assessment, progression-pattern review, family history, hormonal influence, treatment adherence, hair-density monitoring, and long-term maintenance of therapeutic results.");

	TreeMap<String, String> data7 = new TreeMap<String, String>();
	data7.put("Category Name", "Alopecia Scalp Renewal Products");
	data7.put("Drug Class / Code", "DERM-ASR-407");
	data7.put("Description", "Scalp and follicular-care products intended for patients experiencing alopecia or clinically significant hair loss requiring structured evaluation and supportive management. This category supports products that may be used alongside assessment of scalp health, nutritional status, immune or hormonal factors, hair-loss pattern, treatment history, follicular condition, and measurable changes in hair growth or retention.");

	TreeMap<String, String> data8 = new TreeMap<String, String>();
	data8.put("Category Name", "Clinical Obesity Management Products");
	data8.put("Drug Class / Code", "META-COM-408");
	data8.put("Description", "Medical and supportive products intended for eligible patients with obesity requiring structured weight-management intervention. This category may support treatment programs involving nutritional planning, physical activity, behavioral modification, metabolic laboratory assessment, cardiovascular risk evaluation, monitoring of treatment tolerance, body-weight tracking, and periodic review of long-term weight-management outcomes.");

	TreeMap<String, String> data9 = new TreeMap<String, String>();
	data9.put("Category Name", "Healthy Weight Optimization Products");
	data9.put("Drug Class / Code", "META-HWO-409");
	data9.put("Description", "Products intended to support patients classified as overweight who may benefit from structured body-weight optimization and metabolic-health improvement. Items in this category may be incorporated into care pathways involving dietary guidance, physical activity, behavioral changes, weight monitoring, assessment of metabolic risk factors, lifestyle review, and evaluation of progress toward sustainable healthy-weight targets.");

	TreeMap<String, String> data10 = new TreeMap<String, String>();
	data10.put("Category Name", "Prediabetes Metabolic Support Products");
	data10.put("Drug Class / Code", "META-PMS-410");
	data10.put("Description", "Metabolic-support products intended for patients with prediabetes or elevated glucose-related risk who require structured lifestyle and metabolic-health management. This category may support care programs involving blood-glucose monitoring, nutritional modification, physical activity, weight management, laboratory review, cardiovascular risk assessment, and periodic evaluation of progression toward or prevention of Type 2 diabetes.");

	TreeMap<String, String> data11 = new TreeMap<String, String>();
	data11.put("Category Name", "Type 2 Diabetes Management Products");
	data11.put("Drug Class / Code", "META-TDM-411");
	data11.put("Description", "Clinical products intended for management of Type 2 diabetes and associated disturbances in glucose metabolism. Products within this category may be used as part of medically supervised care involving blood-glucose monitoring, HbA1c assessment, dietary management, medication review, metabolic laboratory testing, cardiovascular and renal risk evaluation, treatment adherence monitoring, and ongoing assessment of glycemic control.");

	TreeMap<String, String> data12 = new TreeMap<String, String>();
	data12.put("Category Name", "Insomnia Sleep Regulation Products");
	data12.put("Drug Class / Code", "SLEEP-ISR-412");
	data12.put("Description", "Sleep-management products intended for patients experiencing persistent difficulty initiating sleep, maintaining sleep, or obtaining restorative nighttime rest. This category supports products used within insomnia pathways where sleep patterns, medication history, behavioral factors, daytime impairment, lifestyle influences, underlying conditions, treatment tolerance, and response to ongoing sleep therapy may be evaluated.");

	TreeMap<String, String> data13 = new TreeMap<String, String>();
	data13.put("Category Name", "Sleep Breathing Support Products");
	data13.put("Drug Class / Code", "SLEEP-SBS-413");
	data13.put("Description", "Supportive products associated with sleep-related breathing concerns such as sleep apnea and impaired nighttime respiratory function. Products within this category may form part of care pathways involving sleep-quality assessment, breathing-pattern evaluation, daytime symptoms, body-weight review, cardiovascular risk factors, sleep-study findings, treatment adherence, and ongoing monitoring of sleep-related respiratory health.");

	TreeMap<String, String> data14 = new TreeMap<String, String>();
	data14.put("Category Name", "Anxiety Management Care Products");
	data14.put("Drug Class / Code", "PSY-AMC-414");
	data14.put("Description", "Clinically managed and supportive products intended for patients experiencing persistent anxiety, excessive worry, restlessness, tension, or related functional impairment. This category may support treatment pathways involving symptom assessment, emotional functioning, medical and medication history, sleep patterns, daily-life impact, previous therapy response, treatment tolerance, and continued monitoring of psychological wellbeing.");

	TreeMap<String, String> data15 = new TreeMap<String, String>();
	data15.put("Category Name", "Depression Care Management Products");
	data15.put("Drug Class / Code", "PSY-DCM-415");
	data15.put("Description", "Products associated with clinically supervised management of depression and persistent depressive symptoms affecting mood, motivation, sleep, energy, and everyday functioning. This category may include products used within care pathways involving symptom-severity assessment, previous treatment history, medication review, functional impact, emotional wellbeing, treatment-response monitoring, and periodic clinical reassessment.");

	TreeMap<String, String> data16 = new TreeMap<String, String>();
	data16.put("Category Name", "ADHD Attention Management Products");
	data16.put("Drug Class / Code", "PSY-AAM-416");
	data16.put("Description", "Clinical and supportive products associated with management of ADHD-related attention, concentration, impulsivity, and executive-function difficulties. Products classified under this category may be used within structured treatment pathways involving symptom history, daily functional impairment, behavioral assessment, medication response, cardiovascular considerations, treatment adherence, and continued monitoring of attention-related outcomes.");

	TreeMap<String, String> data17 = new TreeMap<String, String>();
	data17.put("Category Name", "Low Mood Wellness Support Products");
	data17.put("Drug Class / Code", "PSY-LMW-417");
	data17.put("Description", "Supportive products intended for patients experiencing persistent low mood, reduced motivation, diminished emotional energy, or mild impairment in everyday wellbeing. This category supports wellness-oriented care pathways where symptom duration, sleep quality, stress, daily functioning, nutritional factors, medication history, emotional health, and changes in mood over time may be reviewed.");

	TreeMap<String, String> data18 = new TreeMap<String, String>();
	data18.put("Category Name", "Focus and Concentration Support Products");
	data18.put("Drug Class / Code", "PSY-FCS-418");
	data18.put("Description", "Products intended to support patients experiencing reduced concentration, mental fatigue, difficulty sustaining attention, or impaired cognitive productivity. Products in this category may be incorporated into care pathways that evaluate sleep, stress, mood, medication use, nutritional status, workload, cognitive functioning, symptom persistence, and measurable response to supportive interventions.");

	TreeMap<String, String> data19 = new TreeMap<String, String>();
	data19.put("Category Name", "Clinical Acne Management Products");
	data19.put("Drug Class / Code", "DERM-CAM-419");
	data19.put("Description", "Dermatological products intended for patients experiencing acne involving inflammatory lesions, comedones, excess sebum, or recurrent breakouts requiring structured skin-care management. Products within this category may support treatment programs involving skin-type evaluation, acne severity, previous therapies, topical or systemic treatment suitability, treatment tolerance, scar risk, and monitoring of dermatological response.");

	TreeMap<String, String> data20 = new TreeMap<String, String>();
	data20.put("Category Name", "Eczema Barrier Care Products");
	data20.put("Drug Class / Code", "DERM-EBC-420");
	data20.put("Description", "Skin-barrier and dermatological care products intended for patients experiencing eczema, dryness, irritation, itching, or recurrent inflammatory skin changes. This category may include products supporting restoration of skin-barrier function while considering trigger exposure, disease severity, affected body areas, previous treatments, skin sensitivity, treatment adherence, and ongoing response to dermatological care.");

	TreeMap<String, String> data21 = new TreeMap<String, String>();
	data21.put("Category Name", "Rosacea Facial Care Products");
	data21.put("Drug Class / Code", "DERM-RFC-421");
	data21.put("Description", "Facial dermatology products intended for patients experiencing rosacea-related redness, flushing, visible blood vessels, inflammatory lesions, or skin sensitivity. Products classified under this category may support structured care involving trigger identification, symptom severity assessment, previous treatment history, skin-barrier evaluation, treatment tolerance, flare monitoring, and long-term management of facial symptoms.");

	TreeMap<String, String> data22 = new TreeMap<String, String>();
	data22.put("Category Name", "Migraine Neurological Care Products");
	data22.put("Drug Class / Code", "NEU-MNC-422");
	data22.put("Description", "Neurological-care products intended for patients experiencing recurrent migraine episodes involving headache, sensory sensitivity, nausea, aura, or associated functional impairment. This category may support treatment pathways that review attack frequency, symptom severity, potential triggers, medication use, previous therapeutic response, neurological history, treatment tolerance, and ongoing migraine-control outcomes.");

	TreeMap<String, String> data23 = new TreeMap<String, String>();
	data23.put("Category Name", "GERD Digestive Care Products");
	data23.put("Drug Class / Code", "GI-GDC-423");
	data23.put("Description", "Digestive-care products intended for patients experiencing gastroesophageal reflux disease, recurring heartburn, acid regurgitation, or related upper gastrointestinal symptoms. Products in this category may support care pathways involving symptom-frequency assessment, dietary patterns, medication history, lifestyle triggers, treatment response, recurrence monitoring, and evaluation of symptoms requiring further gastrointestinal investigation.");

	TreeMap<String, String> data24 = new TreeMap<String, String>();
	data24.put("Category Name", "Urinary Tract Infection Care Products");
	data24.put("Drug Class / Code", "URO-UTI-424");
	data24.put("Description", "Clinical products associated with assessment and management of urinary tract infections presenting with urinary discomfort, urgency, frequency, or related symptoms. This category may support treatment workflows involving symptom review, infection-history assessment, laboratory or urine testing when appropriate, medication suitability, treatment response, recurrence monitoring, and identification of symptoms requiring additional medical evaluation.");

	TreeMap<String, String> data25 = new TreeMap<String, String>();
	data25.put("Category Name", "Sexually Transmitted Infection Care Products");
	data25.put("Drug Class / Code", "ID-STI-425");
	data25.put("Description", "Clinical products associated with assessment, testing, treatment, and follow-up of sexually transmitted infections in eligible patients. This category supports care pathways that may involve exposure-history review, symptom assessment, laboratory testing, treatment selection, partner-related considerations, prevention guidance, treatment-response monitoring, and follow-up testing where clinically appropriate.");

	TreeMap<String, String> data26 = new TreeMap<String, String>();
	data26.put("Category Name", "HIV Metabolic Body Composition Products");
	data26.put("Drug Class / Code", "META-HMB-426");
	data26.put("Description", "Specialized metabolic-support products associated with management of body-composition and fat-distribution changes occurring in patients with HIV-associated lipodystrophy. This category may support clinically supervised care involving metabolic assessment, antiretroviral treatment history, glucose and lipid monitoring, cardiovascular risk review, body-composition evaluation, treatment-response assessment, and continued specialist oversight.");

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
		{ data20 },
		{ data21 },
		{ data22 },
		{ data23 },
		{ data24 },
		{ data25 },
		{ data26 }
	};
}

@DataProvider
public Object[][] Lab_Test_Create_Data(){

	TreeMap<String, String> data1 = new TreeMap<String, String>();
	data1.put("Lab Test Name", "Erectile Dysfunction Hormonal Screening Panel");
	data1.put("Method", "Walk-In");
	data1.put("Price", "129.00");
	data1.put("Address Line 1", "1450 Madison Avenue");
	data1.put("Address Line 2", "Suite 305, Aster Diagnostics Center");
	data1.put("Country", "United States");
	data1.put("State", "New York");
	data1.put("City", "New York");
	data1.put("Postal Code / Zip Code", "10029");

	TreeMap<String, String> data2 = new TreeMap<String, String>();
	data2.put("Lab Test Name", "Erectile Dysfunction Metabolic Risk Panel");
	data2.put("Method", "Home Visit");
	data2.put("Price", "149.00");

	TreeMap<String, String> data3 = new TreeMap<String, String>();
	data3.put("Lab Test Name", "Erectile Dysfunction Cardiovascular Risk Screening");
	data3.put("Method", "Test Kit");
	data3.put("Kit Provided By", "Provider");
	data3.put("Price", "119.00");

	TreeMap<String, String> data4 = new TreeMap<String, String>();
	data4.put("Lab Test Name", "Hair Loss Thyroid and Ferritin Panel");
	data4.put("Method", "Home Visit");
	data4.put("Price", "139.00");

	TreeMap<String, String> data5 = new TreeMap<String, String>();
	data5.put("Lab Test Name", "Hair Loss Vitamin and Mineral Screening");
	data5.put("Method", "Test Kit");
	data5.put("Kit Provided By", "Store Owner (You)");
	data5.put("Price", "109.00");

	TreeMap<String, String> data6 = new TreeMap<String, String>();
	data6.put("Lab Test Name", "Hair Loss Androgen Hormone Profile");
	data6.put("Method", "Walk-In");
	data6.put("Price", "159.00");
	data6.put("Address Line 1", "820 North Michigan Avenue");
	data6.put("Address Line 2", "Floor 6, Hair Health Laboratory");
	data6.put("Country", "United States");
	data6.put("State", "Illinois");
	data6.put("City", "Chicago");
	data6.put("Postal Code / Zip Code", "60611");

	TreeMap<String, String> data7 = new TreeMap<String, String>();
	data7.put("Lab Test Name", "HGH Deficiency IGF-1 Screening");
	data7.put("Method", "Walk-In");
	data7.put("Price", "189.00");
	data7.put("Address Line 1", "2250 West Holcombe Boulevard");
	data7.put("Address Line 2", "Suite 410, Endocrine Diagnostics Wing");
	data7.put("Country", "United States");
	data7.put("State", "Texas");
	data7.put("City", "Houston");
	data7.put("Postal Code / Zip Code", "77030");

	TreeMap<String, String> data8 = new TreeMap<String, String>();
	data8.put("Lab Test Name", "HGH Deficiency Pituitary Hormone Panel");
	data8.put("Method", "Home Visit");
	data8.put("Price", "229.00");

	TreeMap<String, String> data9 = new TreeMap<String, String>();
	data9.put("Lab Test Name", "Growth Hormone Stimulation Assessment");
	data9.put("Method", "Walk-In");
	data9.put("Price", "375.00");
	data9.put("Address Line 1", "3100 Wilshire Boulevard");
	data9.put("Address Line 2", "Suite 720, Hormone Evaluation Center");
	data9.put("Country", "United States");
	data9.put("State", "California");
	data9.put("City", "Los Angeles");
	data9.put("Postal Code / Zip Code", "90010");

	TreeMap<String, String> data10 = new TreeMap<String, String>();
	data10.put("Lab Test Name", "Insomnia Thyroid and Iron Screening");
	data10.put("Method", "Home Visit");
	data10.put("Price", "129.00");

	TreeMap<String, String> data11 = new TreeMap<String, String>();
	data11.put("Lab Test Name", "Insomnia Vitamin D and B12 Panel");
	data11.put("Method", "Test Kit");
	data11.put("Kit Provided By", "Provider");
	data11.put("Price", "99.00");

	TreeMap<String, String> data12 = new TreeMap<String, String>();
	data12.put("Lab Test Name", "Low Mood and Focus Nutrient Deficiency Panel");
	data12.put("Method", "Test Kit");
	data12.put("Kit Provided By", "Store Owner (You)");
	data12.put("Price", "119.00");

	TreeMap<String, String> data13 = new TreeMap<String, String>();
	data13.put("Lab Test Name", "Low Mood and Focus Thyroid CBC Panel");
	data13.put("Method", "Home Visit");
	data13.put("Price", "145.00");

	TreeMap<String, String> data14 = new TreeMap<String, String>();
	data14.put("Lab Test Name", "Low Mood and Focus Metabolic Screening");
	data14.put("Method", "Walk-In");
	data14.put("Price", "135.00");
	data14.put("Address Line 1", "175 Cambridge Street");
	data14.put("Address Line 2", "Suite 402, Behavioral Health Diagnostics");
	data14.put("Country", "United States");
	data14.put("State", "Massachusetts");
	data14.put("City", "Boston");
	data14.put("Postal Code / Zip Code", "02114");

	TreeMap<String, String> data15 = new TreeMap<String, String>();
	data15.put("Lab Test Name", "Total and Free Testosterone Assessment");
	data15.put("Method", "Home Visit");
	data15.put("Price", "169.00");

	TreeMap<String, String> data16 = new TreeMap<String, String>();
	data16.put("Lab Test Name", "LH FSH and Prolactin Hormone Panel");
	data16.put("Method", "Walk-In");
	data16.put("Price", "185.00");
	data16.put("Address Line 1", "4800 North Federal Highway");
	data16.put("Address Line 2", "Suite 215, Andrology Laboratory");
	data16.put("Country", "United States");
	data16.put("State", "Florida");
	data16.put("City", "Fort Lauderdale");
	data16.put("Postal Code / Zip Code", "33308");

	TreeMap<String, String> data17 = new TreeMap<String, String>();
	data17.put("Lab Test Name", "Testosterone Therapy PSA and Hematocrit Panel");
	data17.put("Method", "Test Kit");
	data17.put("Kit Provided By", "Provider");
	data17.put("Price", "155.00");

	TreeMap<String, String> data18 = new TreeMap<String, String>();
	data18.put("Lab Test Name", "Obesity Comprehensive Metabolic Panel");
	data18.put("Method", "Home Visit");
	data18.put("Price", "149.00");

	TreeMap<String, String> data19 = new TreeMap<String, String>();
	data19.put("Lab Test Name", "Obesity HbA1c and Insulin Resistance Panel");
	data19.put("Method", "Test Kit");
	data19.put("Kit Provided By", "Store Owner (You)");
	data19.put("Price", "159.00");

	TreeMap<String, String> data20 = new TreeMap<String, String>();
	data20.put("Lab Test Name", "Obesity Lipid and Liver Function Panel");
	data20.put("Method", "Walk-In");
	data20.put("Price", "175.00");
	data20.put("Address Line 1", "950 East Washington Street");
	data20.put("Address Line 2", "Suite 330, Metabolic Health Laboratory");
	data20.put("Country", "United States");
	data20.put("State", "Arizona");
	data20.put("City", "Phoenix");
	data20.put("Postal Code / Zip Code", "85034");

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


@DataProvider
public Object[][] Product_Create_Data(){

	String Image_Path = Paths.get(System.getProperty("user.dir"), "Images").toString();

	TreeMap<String, String> data1 = new TreeMap<String, String>();
	data1.put("Product Name", "AsterVigora ED Response Tablets");
	data1.put("Product Image", Paths.get(Image_Path, "AsterVigora ED Response Tablets.png").toString());
	data1.put("Description", "A synthetic erectile-function care product created for QA automation of prescription product workflows, condition mapping, inventory controls, category selection, intake-form association, visibility configuration, SKU validation, and promotional pricing.");
	data1.put("Product Type", "Prescription");
	data1.put("Category", "Erectile Function Therapeutic Care Products");
	data1.put("Visibility", "Public");
	data1.put("Minimum Buy Quantity", "1");
	data1.put("Maximum Buy Quantity", "3");
	data1.put("Stock Count", "142");
	data1.put("Intake Form", "AsterSleep Ramelteon Sleep Intake");
	data1.put("Default SKU / Identifier", "AST-VED-701");
	data1.put("Condition Treated", "Erectile Dysfunction");
	data1.put("Restrict Multiple Active Prescriptions", "No");
	data1.put("Pricing Type", "Single Item");
	data1.put("Intro Price", "27.40");
	data1.put("Default Price", "46.90");
	data1.put("Sale Price", "38.25");
	data1.put("Sale Start Date", "09/01/2026");
	data1.put("Sales End Date", "12/31/2026");
	data1.put("Lab Test", "No");

	TreeMap<String, String> data2 = new TreeMap<String, String>();
	data2.put("Product Name", "AsterTempo Control Capsules");
	data2.put("Product Image", Paths.get(Image_Path, "AsterTempo Control Capsules.png").toString());
	data2.put("Description", "A synthetic male intimate-care product designed for automated testing of premature-ejaculation product administration, inventory quantities, patient-facing visibility, category mapping, purchase restrictions, pricing states, and unique identifier handling.");
	data2.put("Product Type", "Prescription");
	data2.put("Category", "Male Ejaculatory Control Care Products");
	data2.put("Visibility", "Hidden");
	data2.put("Minimum Buy Quantity", "1");
	data2.put("Maximum Buy Quantity", "4");
	data2.put("Stock Count", "176");
	data2.put("Intake Form", "AsterSleep Ramelteon Sleep Intake");
	data2.put("Default SKU / Identifier", "AST-TCC-702");
	data2.put("Condition Treated", "Premature Ejaculation");
	data2.put("Restrict Multiple Active Prescriptions", "No");
	data2.put("Pricing Type", "Single Item");
	data2.put("Intro Price", "24.65");
	data2.put("Default Price", "42.80");
	data2.put("Sale Price", "34.95");
	data2.put("Sale Start Date", "09/03/2026");
	data2.put("Sales End Date", "12/28/2026");
	data2.put("Lab Test", "No");

	TreeMap<String, String> data3 = new TreeMap<String, String>();
	data3.put("Product Name", "AsterAmora Libido Support Tablets");
	data3.put("Product Image", Paths.get(Image_Path, "AsterAmora Libido Support Tablets.png").toString());
	data3.put("Description", "A synthetic libido-support catalog product prepared for QA validation of male sexual-wellness workflows, condition association, stock availability, quantity boundaries, product visibility, intake-form linkage, SKU uniqueness, and pricing configuration.");
	data3.put("Product Type", "Standard");
	data3.put("Category", "Male Libido Wellness Support Products");
	data3.put("Visibility", "Public");
	data3.put("Minimum Buy Quantity", "1");
	data3.put("Maximum Buy Quantity", "5");
	data3.put("Stock Count", "213");
	data3.put("Intake Form", "AsterSleep Ramelteon Sleep Intake");
	data3.put("Default SKU / Identifier", "AST-ALS-703");
	data3.put("Condition Treated", "Low Libido");
	data3.put("Restrict Multiple Active Prescriptions", "No");
	data3.put("Pricing Type", "Single Item");
	data3.put("Intro Price", "22.30");
	data3.put("Default Price", "39.75");
	data3.put("Sale Price", "32.10");
	data3.put("Sale Start Date", "09/05/2026");
	data3.put("Sales End Date", "12/26/2026");
	data3.put("Lab Test", "No");

	TreeMap<String, String> data4 = new TreeMap<String, String>();
	data4.put("Product Name", "AsterAndrix Testosterone Support Gel");
	data4.put("Product Image", Paths.get(Image_Path, "AsterAndrix Testosterone Support Gel.png").toString());
	data4.put("Description", "A synthetic androgen-support product generated for low-testosterone prescription workflow automation. The dataset provides unique values for endocrine category mapping, stock management, quantity restrictions, visibility, intake-form configuration, identifier validation, and price-state testing.");
	data4.put("Product Type", "Prescription");
	data4.put("Category", "Testosterone Restoration Clinical Products");
	data4.put("Visibility", "Public");
	data4.put("Minimum Buy Quantity", "1");
	data4.put("Maximum Buy Quantity", "2");
	data4.put("Stock Count", "88");
	data4.put("Intake Form", "AsterSleep Ramelteon Sleep Intake");
	data4.put("Default SKU / Identifier", "AST-ATG-704");
	data4.put("Condition Treated", "Low Testosterone");
	data4.put("Restrict Multiple Active Prescriptions", "No");
	data4.put("Pricing Type", "Single Item");
	data4.put("Intro Price", "52.80");
	data4.put("Default Price", "86.45");
	data4.put("Sale Price", "72.90");
	data4.put("Sale Start Date", "09/07/2026");
	data4.put("Sales End Date", "12/24/2026");
	data4.put("Lab Test", "Yes");

	TreeMap<String, String> data5 = new TreeMap<String, String>();
	data5.put("Product Name", "AsterFertilux Male Fertility Capsules");
	data5.put("Product Image", Paths.get(Image_Path, "AsterFertilux Male Fertility Capsules.png").toString());
	data5.put("Description", "A synthetic male fertility product prepared for automation coverage of fertility-related catalog creation, condition assignment, clinical product categorization, stock values, buying restrictions, intake-form linkage, pricing, and product identifier validation.");
	data5.put("Product Type", "Prescription");
	data5.put("Category", "Male Fertility Clinical Support Products");
	data5.put("Visibility", "Hidden");
	data5.put("Minimum Buy Quantity", "1");
	data5.put("Maximum Buy Quantity", "3");
	data5.put("Stock Count", "104");
	data5.put("Intake Form", "AsterSleep Ramelteon Sleep Intake");
	data5.put("Default SKU / Identifier", "AST-FMF-705");
	data5.put("Condition Treated", "Male Infertility");
	data5.put("Restrict Multiple Active Prescriptions", "No");
	data5.put("Pricing Type", "Single Item");
	data5.put("Intro Price", "44.75");
	data5.put("Default Price", "75.60");
	data5.put("Sale Price", "62.85");
	data5.put("Sale Start Date", "09/09/2026");
	data5.put("Sales End Date", "12/22/2026");
	data5.put("Lab Test", "Yes");

	TreeMap<String, String> data6 = new TreeMap<String, String>();
	data6.put("Product Name", "AsterCrest Follicle Defense Foam");
	data6.put("Product Image", Paths.get(Image_Path, "AsterCrest Follicle Defense Foam.png").toString());
	data6.put("Description", "A synthetic follicular-care foam created for QA testing of male-pattern hair-loss product workflows. It supports validation of category association, stock management, quantity controls, visibility, product identifiers, intake-form configuration, and promotional pricing.");
	data6.put("Product Type", "Prescription");
	data6.put("Category", "Male Pattern Hair Restoration Products");
	data6.put("Visibility", "Public");
	data6.put("Minimum Buy Quantity", "1");
	data6.put("Maximum Buy Quantity", "5");
	data6.put("Stock Count", "196");
	data6.put("Intake Form", "AsterSleep Ramelteon Sleep Intake");
	data6.put("Default SKU / Identifier", "AST-CFD-706");
	data6.put("Condition Treated", "Male Pattern Hair Loss");
	data6.put("Restrict Multiple Active Prescriptions", "No");
	data6.put("Pricing Type", "Single Item");
	data6.put("Intro Price", "19.80");
	data6.put("Default Price", "36.95");
	data6.put("Sale Price", "29.70");
	data6.put("Sale Start Date", "09/11/2026");
	data6.put("Sales End Date", "12/20/2026");
	data6.put("Lab Test", "No");

	TreeMap<String, String> data7 = new TreeMap<String, String>();
	data7.put("Product Name", "AsterAlovera Scalp Renewal Serum");
	data7.put("Product Image", Paths.get(Image_Path, "AsterAlovera Scalp Renewal Serum.png").toString());
	data7.put("Description", "A synthetic scalp-renewal product intended for alopecia-related catalog automation. This dataset provides fresh descriptive content, inventory values, purchase boundaries, visibility, condition mapping, category selection, SKU information, and multiple product prices.");
	data7.put("Product Type", "Standard");
	data7.put("Category", "Alopecia Scalp Renewal Products");
	data7.put("Visibility", "Hidden");
	data7.put("Minimum Buy Quantity", "1");
	data7.put("Maximum Buy Quantity", "6");
	data7.put("Stock Count", "224");
	data7.put("Intake Form", "AsterSleep Ramelteon Sleep Intake");
	data7.put("Default SKU / Identifier", "AST-ASR-707");
	data7.put("Condition Treated", "Alopecia");
	data7.put("Restrict Multiple Active Prescriptions", "No");
	data7.put("Pricing Type", "Single Item");
	data7.put("Intro Price", "18.55");
	data7.put("Default Price", "34.70");
	data7.put("Sale Price", "27.95");
	data7.put("Sale Start Date", "09/13/2026");
	data7.put("Sales End Date", "12/18/2026");
	data7.put("Lab Test", "No");

	TreeMap<String, String> data8 = new TreeMap<String, String>();
	data8.put("Product Name", "AsterMetrix Weight Care Capsules");
	data8.put("Product Image", Paths.get(Image_Path, "AsterMetrix Weight Care Capsules.png").toString());
	data8.put("Description", "A synthetic metabolic weight-management product generated for obesity-related prescription catalog automation. It provides unique inventory quantities, condition mapping, visibility, category values, purchase limits, intake-form configuration, SKU handling, and price data.");
	data8.put("Product Type", "Prescription");
	data8.put("Category", "Clinical Obesity Management Products");
	data8.put("Visibility", "Public");
	data8.put("Minimum Buy Quantity", "1");
	data8.put("Maximum Buy Quantity", "4");
	data8.put("Stock Count", "133");
	data8.put("Intake Form", "AsterSleep Ramelteon Sleep Intake");
	data8.put("Default SKU / Identifier", "AST-MWC-708");
	data8.put("Condition Treated", "Obesity");
	data8.put("Restrict Multiple Active Prescriptions", "No");
	data8.put("Pricing Type", "Single Item");
	data8.put("Intro Price", "36.40");
	data8.put("Default Price", "61.80");
	data8.put("Sale Price", "50.25");
	data8.put("Sale Start Date", "09/15/2026");
	data8.put("Sales End Date", "12/16/2026");
	data8.put("Lab Test", "Yes");

	TreeMap<String, String> data9 = new TreeMap<String, String>();
	data9.put("Product Name", "AsterTrimora Healthy Weight Tablets");
	data9.put("Product Image", Paths.get(Image_Path, "AsterTrimora Healthy Weight Tablets.png").toString());
	data9.put("Description", "A synthetic weight-support product created for automated testing of overweight-related catalog administration. The dataset supports verification of stock controls, condition mapping, product visibility, category association, purchase boundaries, SKU uniqueness, and pricing states.");
	data9.put("Product Type", "Standard");
	data9.put("Category", "Healthy Weight Optimization Products");
	data9.put("Visibility", "Hidden");
	data9.put("Minimum Buy Quantity", "1");
	data9.put("Maximum Buy Quantity", "5");
	data9.put("Stock Count", "187");
	data9.put("Intake Form", "AsterSleep Ramelteon Sleep Intake");
	data9.put("Default SKU / Identifier", "AST-THW-709");
	data9.put("Condition Treated", "Overweight");
	data9.put("Restrict Multiple Active Prescriptions", "No");
	data9.put("Pricing Type", "Single Item");
	data9.put("Intro Price", "29.90");
	data9.put("Default Price", "51.65");
	data9.put("Sale Price", "42.20");
	data9.put("Sale Start Date", "09/17/2026");
	data9.put("Sales End Date", "12/14/2026");
	data9.put("Lab Test", "No");

	TreeMap<String, String> data10 = new TreeMap<String, String>();
	data10.put("Product Name", "AsterGlycoGuard Prediabetes Support Capsules");
	data10.put("Product Image", Paths.get(Image_Path, "AsterGlycoGuard Prediabetes Support Capsules.png").toString());
	data10.put("Description", "A synthetic glucose-management support product prepared for QA automation of prediabetes catalog pathways. The entry supports validation of metabolic categorization, condition selection, inventory levels, visibility, purchase limits, intake-form association, identifiers, and configurable pricing.");
	data10.put("Product Type", "Standard");
	data10.put("Category", "Prediabetes Metabolic Support Products");
	data10.put("Visibility", "Public");
	data10.put("Minimum Buy Quantity", "1");
	data10.put("Maximum Buy Quantity", "4");
	data10.put("Stock Count", "157");
	data10.put("Intake Form", "AsterSleep Ramelteon Sleep Intake");
	data10.put("Default SKU / Identifier", "AST-GPS-710");
	data10.put("Condition Treated", "Prediabetes");
	data10.put("Restrict Multiple Active Prescriptions", "No");
	data10.put("Pricing Type", "Single Item");
	data10.put("Intro Price", "31.25");
	data10.put("Default Price", "54.90");
	data10.put("Sale Price", "44.75");
	data10.put("Sale Start Date", "09/19/2026");
	data10.put("Sales End Date", "12/12/2026");
	data10.put("Lab Test", "Yes");

	TreeMap<String, String> data11 = new TreeMap<String, String>();
	data11.put("Product Name", "AsterDiaBalance Metabolic Tablets");
	data11.put("Product Image", Paths.get(Image_Path, "AsterDiaBalance Metabolic Tablets.png").toString());
	data11.put("Description", "A synthetic metabolic care product developed for Type 2 diabetes prescription-product testing. This dataset provides fresh condition, inventory, visibility, category, purchase-limit, intake-form, SKU, lab-test, and pricing values for automation coverage.");
	data11.put("Product Type", "Prescription");
	data11.put("Category", "Type 2 Diabetes Management Products");
	data11.put("Visibility", "Public");
	data11.put("Minimum Buy Quantity", "1");
	data11.put("Maximum Buy Quantity", "3");
	data11.put("Stock Count", "119");
	data11.put("Intake Form", "AsterSleep Ramelteon Sleep Intake");
	data11.put("Default SKU / Identifier", "AST-DMT-711");
	data11.put("Condition Treated", "Type 2 Diabetes");
	data11.put("Restrict Multiple Active Prescriptions", "No");
	data11.put("Pricing Type", "Single Item");
	data11.put("Intro Price", "42.60");
	data11.put("Default Price", "72.85");
	data11.put("Sale Price", "60.40");
	data11.put("Sale Start Date", "09/21/2026");
	data11.put("Sales End Date", "12/10/2026");
	data11.put("Lab Test", "Yes");

	TreeMap<String, String> data12 = new TreeMap<String, String>();
	data12.put("Product Name", "AsterSomnera Sleep Support Tablets");
	data12.put("Product Image", Paths.get(Image_Path, "AsterSomnera Sleep Support Tablets.png").toString());
	data12.put("Description", "A synthetic nighttime care product intended for insomnia-related catalog automation. It provides new values for condition mapping, sleep category selection, inventory controls, product visibility, buying restrictions, intake-form assignment, SKU uniqueness, and promotional pricing.");
	data12.put("Product Type", "Prescription");
	data12.put("Category", "Insomnia Sleep Regulation Products");
	data12.put("Visibility", "Hidden");
	data12.put("Minimum Buy Quantity", "1");
	data12.put("Maximum Buy Quantity", "4");
	data12.put("Stock Count", "148");
	data12.put("Intake Form", "AsterSleep Ramelteon Sleep Intake");
	data12.put("Default SKU / Identifier", "AST-SSS-712");
	data12.put("Condition Treated", "Insomnia");
	data12.put("Restrict Multiple Active Prescriptions", "No");
	data12.put("Pricing Type", "Single Item");
	data12.put("Intro Price", "21.40");
	data12.put("Default Price", "39.95");
	data12.put("Sale Price", "32.60");
	data12.put("Sale Start Date", "09/23/2026");
	data12.put("Sales End Date", "12/08/2026");
	data12.put("Lab Test", "No");

	TreeMap<String, String> data13 = new TreeMap<String, String>();
	data13.put("Product Name", "AsterAirRest Sleep Breathing Support");
	data13.put("Product Image", Paths.get(Image_Path, "AsterAirRest Sleep Breathing Support.png").toString());
	data13.put("Description", "A synthetic sleep-breathing support product created for QA coverage of sleep-apnea catalog workflows. The dataset includes varied stock, purchase limits, condition association, visibility, category mapping, identifier values, intake-form selection, and product pricing.");
	data13.put("Product Type", "Standard");
	data13.put("Category", "Sleep Breathing Support Products");
	data13.put("Visibility", "Public");
	data13.put("Minimum Buy Quantity", "1");
	data13.put("Maximum Buy Quantity", "2");
	data13.put("Stock Count", "82");
	data13.put("Intake Form", "AsterSleep Ramelteon Sleep Intake");
	data13.put("Default SKU / Identifier", "AST-ARS-713");
	data13.put("Condition Treated", "Sleep Apnea");
	data13.put("Restrict Multiple Active Prescriptions", "No");
	data13.put("Pricing Type", "Single Item");
	data13.put("Intro Price", "38.75");
	data13.put("Default Price", "66.40");
	data13.put("Sale Price", "54.90");
	data13.put("Sale Start Date", "09/25/2026");
	data13.put("Sales End Date", "12/06/2026");
	data13.put("Lab Test", "No");

	TreeMap<String, String> data14 = new TreeMap<String, String>();
	data14.put("Product Name", "AsterCalmora Anxiety Support Capsules");
	data14.put("Product Image", Paths.get(Image_Path, "AsterCalmora Anxiety Support Capsules.png").toString());
	data14.put("Description", "A synthetic emotional wellness product generated for automated anxiety-related catalog testing. This entry supports verification of condition selection, mental-health category mapping, stock levels, visibility, purchasing limits, intake-form configuration, identifiers, and pricing.");
	data14.put("Product Type", "Prescription");
	data14.put("Category", "Anxiety Management Care Products");
	data14.put("Visibility", "Hidden");
	data14.put("Minimum Buy Quantity", "1");
	data14.put("Maximum Buy Quantity", "4");
	data14.put("Stock Count", "172");
	data14.put("Intake Form", "AsterSleep Ramelteon Sleep Intake");
	data14.put("Default SKU / Identifier", "AST-CAS-714");
	data14.put("Condition Treated", "Anxiety");
	data14.put("Restrict Multiple Active Prescriptions", "No");
	data14.put("Pricing Type", "Single Item");
	data14.put("Intro Price", "25.85");
	data14.put("Default Price", "45.30");
	data14.put("Sale Price", "37.15");
	data14.put("Sale Start Date", "09/27/2026");
	data14.put("Sales End Date", "12/04/2026");
	data14.put("Lab Test", "No");

	TreeMap<String, String> data15 = new TreeMap<String, String>();
	data15.put("Product Name", "AsterMoodRise Depression Support Tablets");
	data15.put("Product Image", Paths.get(Image_Path, "AsterMoodRise Depression Support Tablets.png").toString());
	data15.put("Description", "A synthetic mood-care product prepared for prescription catalog automation involving depression-related workflows. The dataset supports validation of inventory, condition mapping, category association, visibility, purchase limits, intake-form linkage, identifiers, and product pricing.");
	data15.put("Product Type", "Prescription");
	data15.put("Category", "Depression Care Management Products");
	data15.put("Visibility", "Public");
	data15.put("Minimum Buy Quantity", "1");
	data15.put("Maximum Buy Quantity", "3");
	data15.put("Stock Count", "126");
	data15.put("Intake Form", "AsterSleep Ramelteon Sleep Intake");
	data15.put("Default SKU / Identifier", "AST-MDS-715");
	data15.put("Condition Treated", "Depression");
	data15.put("Restrict Multiple Active Prescriptions", "No");
	data15.put("Pricing Type", "Single Item");
	data15.put("Intro Price", "28.40");
	data15.put("Default Price", "49.85");
	data15.put("Sale Price", "40.75");
	data15.put("Sale Start Date", "09/29/2026");
	data15.put("Sales End Date", "12/02/2026");
	data15.put("Lab Test", "No");

	TreeMap<String, String> data16 = new TreeMap<String, String>();
	data16.put("Product Name", "AsterAttentra Focus Capsules");
	data16.put("Product Image", Paths.get(Image_Path, "AsterAttentra Focus Capsules.png").toString());
	data16.put("Description", "A synthetic attention-support product created for ADHD-related catalog automation. This dataset supplies unique condition, category, inventory, visibility, quantity-limit, intake-form, identifier, and pricing values for end-to-end product administration testing.");
	data16.put("Product Type", "Prescription");
	data16.put("Category", "ADHD Attention Management Products");
	data16.put("Visibility", "Public");
	data16.put("Minimum Buy Quantity", "1");
	data16.put("Maximum Buy Quantity", "3");
	data16.put("Stock Count", "109");
	data16.put("Intake Form", "AsterSleep Ramelteon Sleep Intake");
	data16.put("Default SKU / Identifier", "AST-AFC-716");
	data16.put("Condition Treated", "ADHD");
	data16.put("Restrict Multiple Active Prescriptions", "No");
	data16.put("Pricing Type", "Single Item");
	data16.put("Intro Price", "32.70");
	data16.put("Default Price", "56.90");
	data16.put("Sale Price", "46.25");
	data16.put("Sale Start Date", "10/01/2026");
	data16.put("Sales End Date", "12/30/2026");
	data16.put("Lab Test", "No");

	TreeMap<String, String> data17 = new TreeMap<String, String>();
	data17.put("Product Name", "AsterEaseMood Daily Support Tablets");
	data17.put("Product Image", Paths.get(Image_Path, "AsterEaseMood Daily Support Tablets.png").toString());
	data17.put("Description", "A synthetic daily emotional-wellness product intended for low-mood catalog testing. The entry provides distinct stock values, purchasing boundaries, visibility, category, condition, intake-form association, SKU information, and product prices.");
	data17.put("Product Type", "Standard");
	data17.put("Category", "Low Mood Wellness Support Products");
	data17.put("Visibility", "Hidden");
	data17.put("Minimum Buy Quantity", "1");
	data17.put("Maximum Buy Quantity", "5");
	data17.put("Stock Count", "201");
	data17.put("Intake Form", "AsterSleep Ramelteon Sleep Intake");
	data17.put("Default SKU / Identifier", "AST-EDS-717");
	data17.put("Condition Treated", "Low Mood");
	data17.put("Restrict Multiple Active Prescriptions", "No");
	data17.put("Pricing Type", "Single Item");
	data17.put("Intro Price", "20.90");
	data17.put("Default Price", "37.80");
	data17.put("Sale Price", "30.65");
	data17.put("Sale Start Date", "10/03/2026");
	data17.put("Sales End Date", "12/28/2026");
	data17.put("Lab Test", "No");

	TreeMap<String, String> data18 = new TreeMap<String, String>();
	data18.put("Product Name", "AsterConcentra Cognitive Support Capsules");
	data18.put("Product Image", Paths.get(Image_Path, "AsterConcentra Cognitive Support Capsules.png").toString());
	data18.put("Description", "A synthetic cognitive-support product developed for automated focus and concentration catalog scenarios. This dataset supports testing of condition selection, category organization, inventory management, visibility, quantity limits, intake forms, identifiers, and pricing.");
	data18.put("Product Type", "Standard");
	data18.put("Category", "Focus and Concentration Support Products");
	data18.put("Visibility", "Public");
	data18.put("Minimum Buy Quantity", "1");
	data18.put("Maximum Buy Quantity", "4");
	data18.put("Stock Count", "167");
	data18.put("Intake Form", "AsterSleep Ramelteon Sleep Intake");
	data18.put("Default SKU / Identifier", "AST-CCS-718");
	data18.put("Condition Treated", "Focus / Concentration");
	data18.put("Restrict Multiple Active Prescriptions", "No");
	data18.put("Pricing Type", "Single Item");
	data18.put("Intro Price", "23.45");
	data18.put("Default Price", "41.60");
	data18.put("Sale Price", "33.95");
	data18.put("Sale Start Date", "10/05/2026");
	data18.put("Sales End Date", "12/26/2026");
	data18.put("Lab Test", "No");

	TreeMap<String, String> data19 = new TreeMap<String, String>();
	data19.put("Product Name", "AsterClearDerm Acne Control Gel");
	data19.put("Product Image", Paths.get(Image_Path, "AsterClearDerm Acne Control Gel.png").toString());
	data19.put("Description", "A synthetic dermatology product prepared for automated acne-care catalog workflows. The entry supplies fresh condition, category, stock, purchase-limit, visibility, intake-form, identifier, and promotional-pricing values.");
	data19.put("Product Type", "Prescription");
	data19.put("Category", "Clinical Acne Management Products");
	data19.put("Visibility", "Public");
	data19.put("Minimum Buy Quantity", "1");
	data19.put("Maximum Buy Quantity", "4");
	data19.put("Stock Count", "183");
	data19.put("Intake Form", "AsterSleep Ramelteon Sleep Intake");
	data19.put("Default SKU / Identifier", "AST-CAC-719");
	data19.put("Condition Treated", "Acne");
	data19.put("Restrict Multiple Active Prescriptions", "No");
	data19.put("Pricing Type", "Single Item");
	data19.put("Intro Price", "17.80");
	data19.put("Default Price", "32.95");
	data19.put("Sale Price", "26.40");
	data19.put("Sale Start Date", "10/07/2026");
	data19.put("Sales End Date", "12/24/2026");
	data19.put("Lab Test", "No");

	TreeMap<String, String> data20 = new TreeMap<String, String>();
	data20.put("Product Name", "AsterEczena Barrier Relief Cream");
	data20.put("Product Image", Paths.get(Image_Path, "AsterEczena Barrier Relief Cream.png").toString());
	data20.put("Description", "A synthetic skin-barrier product created for eczema-related product automation. The dataset supports testing of dermatology condition mapping, product categories, inventory quantities, visibility, buying limitations, intake-form configuration, SKU uniqueness, and prices.");
	data20.put("Product Type", "Standard");
	data20.put("Category", "Eczema Barrier Care Products");
	data20.put("Visibility", "Hidden");
	data20.put("Minimum Buy Quantity", "1");
	data20.put("Maximum Buy Quantity", "5");
	data20.put("Stock Count", "218");
	data20.put("Intake Form", "AsterSleep Ramelteon Sleep Intake");
	data20.put("Default SKU / Identifier", "AST-EBR-720");
	data20.put("Condition Treated", "Eczema");
	data20.put("Restrict Multiple Active Prescriptions", "No");
	data20.put("Pricing Type", "Single Item");
	data20.put("Intro Price", "16.60");
	data20.put("Default Price", "30.75");
	data20.put("Sale Price", "24.90");
	data20.put("Sale Start Date", "10/09/2026");
	data20.put("Sales End Date", "12/22/2026");
	data20.put("Lab Test", "No");

	TreeMap<String, String> data21 = new TreeMap<String, String>();
	data21.put("Product Name", "AsterRosaCalm Facial Serum");
	data21.put("Product Image", Paths.get(Image_Path, "AsterRosaCalm Facial Serum.png").toString());
	data21.put("Description", "A synthetic facial-care product generated for rosacea catalog automation. It provides unique values for condition association, dermatology category mapping, stock, quantity restrictions, product visibility, intake-form selection, identifier storage, and pricing.");
	data21.put("Product Type", "Standard");
	data21.put("Category", "Rosacea Facial Care Products");
	data21.put("Visibility", "Public");
	data21.put("Minimum Buy Quantity", "1");
	data21.put("Maximum Buy Quantity", "4");
	data21.put("Stock Count", "174");
	data21.put("Intake Form", "AsterSleep Ramelteon Sleep Intake");
	data21.put("Default SKU / Identifier", "AST-RFS-721");
	data21.put("Condition Treated", "Rosacea");
	data21.put("Restrict Multiple Active Prescriptions", "No");
	data21.put("Pricing Type", "Single Item");
	data21.put("Intro Price", "19.95");
	data21.put("Default Price", "36.50");
	data21.put("Sale Price", "29.45");
	data21.put("Sale Start Date", "10/11/2026");
	data21.put("Sales End Date", "12/20/2026");
	data21.put("Lab Test", "No");

	TreeMap<String, String> data22 = new TreeMap<String, String>();
	data22.put("Product Name", "AsterMigraEase Headache Support Tablets");
	data22.put("Product Image", Paths.get(Image_Path, "AsterMigraEase Headache Support Tablets.png").toString());
	data22.put("Description", "A synthetic neurological care product intended for migraine-related prescription catalog automation. This entry provides fresh inventory, buying-limit, category, condition, visibility, intake-form, SKU, and pricing information.");
	data22.put("Product Type", "Prescription");
	data22.put("Category", "Migraine Neurological Care Products");
	data22.put("Visibility", "Hidden");
	data22.put("Minimum Buy Quantity", "1");
	data22.put("Maximum Buy Quantity", "3");
	data22.put("Stock Count", "121");
	data22.put("Intake Form", "AsterSleep Ramelteon Sleep Intake");
	data22.put("Default SKU / Identifier", "AST-MHS-722");
	data22.put("Condition Treated", "Migraine");
	data22.put("Restrict Multiple Active Prescriptions", "No");
	data22.put("Pricing Type", "Single Item");
	data22.put("Intro Price", "26.75");
	data22.put("Default Price", "47.90");
	data22.put("Sale Price", "39.10");
	data22.put("Sale Start Date", "10/13/2026");
	data22.put("Sales End Date", "12/18/2026");
	data22.put("Lab Test", "No");

	TreeMap<String, String> data23 = new TreeMap<String, String>();
	data23.put("Product Name", "AsterRefluxa Digestive Relief Capsules");
	data23.put("Product Image", Paths.get(Image_Path, "AsterRefluxa Digestive Relief Capsules.png").toString());
	data23.put("Description", "A synthetic digestive-care product prepared for GERD-related catalog workflows. The dataset supports testing of condition mapping, digestive category selection, stock management, visibility, quantity limits, intake-form linkage, identifiers, and promotional pricing.");
	data23.put("Product Type", "Standard");
	data23.put("Category", "GERD Digestive Care Products");
	data23.put("Visibility", "Public");
	data23.put("Minimum Buy Quantity", "1");
	data23.put("Maximum Buy Quantity", "5");
	data23.put("Stock Count", "205");
	data23.put("Intake Form", "AsterSleep Ramelteon Sleep Intake");
	data23.put("Default SKU / Identifier", "AST-RDR-723");
	data23.put("Condition Treated", "GERD");
	data23.put("Restrict Multiple Active Prescriptions", "No");
	data23.put("Pricing Type", "Single Item");
	data23.put("Intro Price", "18.25");
	data23.put("Default Price", "33.40");
	data23.put("Sale Price", "27.15");
	data23.put("Sale Start Date", "10/15/2026");
	data23.put("Sales End Date", "12/16/2026");
	data23.put("Lab Test", "No");

	TreeMap<String, String> data24 = new TreeMap<String, String>();
	data24.put("Product Name", "AsterUroCare UTI Support Tablets");
	data24.put("Product Image", Paths.get(Image_Path, "AsterUroCare UTI Support Tablets.png").toString());
	data24.put("Description", "A synthetic urinary-care product developed for UTI-related prescription product automation. This dataset provides unique condition mapping, category information, stock values, visibility, purchasing boundaries, intake-form association, SKU values, and prices.");
	data24.put("Product Type", "Prescription");
	data24.put("Category", "Urinary Tract Infection Care Products");
	data24.put("Visibility", "Public");
	data24.put("Minimum Buy Quantity", "1");
	data24.put("Maximum Buy Quantity", "3");
	data24.put("Stock Count", "137");
	data24.put("Intake Form", "AsterSleep Ramelteon Sleep Intake");
	data24.put("Default SKU / Identifier", "AST-UUS-724");
	data24.put("Condition Treated", "UTI");
	data24.put("Restrict Multiple Active Prescriptions", "No");
	data24.put("Pricing Type", "Single Item");
	data24.put("Intro Price", "21.80");
	data24.put("Default Price", "39.60");
	data24.put("Sale Price", "32.25");
	data24.put("Sale Start Date", "10/17/2026");
	data24.put("Sales End Date", "12/14/2026");
	data24.put("Lab Test", "Yes");

	TreeMap<String, String> data25 = new TreeMap<String, String>();
	data25.put("Product Name", "AsterSafeGuard STI Care Pack");
	data25.put("Product Image", Paths.get(Image_Path, "AsterSafeGuard STI Care Pack.png").toString());
	data25.put("Description", "A synthetic sexual-health care product created for automated STI-related catalog scenarios. The dataset supports condition selection, category mapping, inventory controls, visibility, purchase restrictions, intake-form assignment, product identifier testing, pricing, and lab-test workflow coverage.");
	data25.put("Product Type", "Prescription");
	data25.put("Category", "Sexually Transmitted Infection Care Products");
	data25.put("Visibility", "Hidden");
	data25.put("Minimum Buy Quantity", "1");
	data25.put("Maximum Buy Quantity", "2");
	data25.put("Stock Count", "94");
	data25.put("Intake Form", "AsterSleep Ramelteon Sleep Intake");
	data25.put("Default SKU / Identifier", "AST-SCP-725");
	data25.put("Condition Treated", "STIs");
	data25.put("Restrict Multiple Active Prescriptions", "No");
	data25.put("Pricing Type", "Single Item");
	data25.put("Intro Price", "48.90");
	data25.put("Default Price", "82.75");
	data25.put("Sale Price", "69.40");
	data25.put("Sale Start Date", "10/19/2026");
	data25.put("Sales End Date", "12/12/2026");
	data25.put("Lab Test", "Yes");

	TreeMap<String, String> data26 = new TreeMap<String, String>();
	data26.put("Product Name", "AsterLipoRestore Metabolic Support Kit");
	data26.put("Product Image", Paths.get(Image_Path, "AsterLipoRestore Metabolic Support Kit.png").toString());
	data26.put("Description", "A synthetic metabolic-care product prepared specifically for QA automation of HIV-associated lipodystrophy product workflows. The entry provides fresh condition, category, inventory, quantity, visibility, intake-form, SKU, pricing, and lab-test values.");
	data26.put("Product Type", "Prescription");
	data26.put("Category", "HIV Metabolic Body Composition Products");
	data26.put("Visibility", "Public");
	data26.put("Minimum Buy Quantity", "1");
	data26.put("Maximum Buy Quantity", "2");
	data26.put("Stock Count", "76");
	data26.put("Intake Form", "AsterSleep Ramelteon Sleep Intake");
	data26.put("Default SKU / Identifier", "AST-LMS-726");
	data26.put("Condition Treated", "HIV-Associated Lipodystrophy");
	data26.put("Restrict Multiple Active Prescriptions", "No");
	data26.put("Pricing Type", "Single Item");
	data26.put("Intro Price", "96.50");
	data26.put("Default Price", "158.90");
	data26.put("Sale Price", "134.75");
	data26.put("Sale Start Date", "10/21/2026");
	data26.put("Sales End Date", "12/10/2026");
	data26.put("Lab Test", "Yes");

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
		{ data20 },/*
		{ data21 },
		{ data22 },
		{ data23 },
		{ data24 },
		{ data25 },
		{ data26 } */
	};
}



@DataProvider
public Object[][] combined_data_provider() {

	Object[][] Category_datas = Category_Create_Data();
	Object[][] Lab_Test_datas = Lab_Test_Create_Data();
	Object[][] Product_datas = Product_Create_Data();

	int n = IntStream.of(Category_datas.length, Lab_Test_datas.length, Product_datas.length).min().orElse(0);

	Object[][] combined_data = new Object[n][3];

	int i = 0;
	while (i < n) {
		combined_data[i][0] = Category_datas[i][0]; // Category Create Data
		combined_data[i][1] = Lab_Test_datas[i][0]; // Lab Test Create Data
		combined_data[i][2] = Product_datas[i][0]; // Product Create Data
		i++;
	}

	return combined_data;
}



@Test(dataProvider = "Lab_Test_Create_Data")
public void Lab_Test_ADD(TreeMap<String, String> data) throws Exception {

	Product_Module_Locaters p = new Product_Module_Locaters(d);

	String Lab_Test_Name = data.get("Lab Test Name");
	String Method = data.get("Method");
	String Price = data.get("Price");

	int step = 1;

	try {

		Report_Listen.log_print_in_report().info("──────────────────── 🧪 LAB TEST CREATION ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Scenario:</b> Create a new Lab Test in the Product Module.");
		Report_Listen.log_print_in_report().info("<b>Input:</b> Lab Test Name = " + Lab_Test_Name + " | Method = " + Method + " | Price = " + Price);
		Report_Listen.log_print_in_report().info("<b>Expected:</b> Lab Test should be created successfully with the selected method and configured details.");

		System.out.println("🧪 LAB TEST CREATION");
		System.out.println();
		System.out.println("🔹 Lab Test Name: " + Lab_Test_Name);
		System.out.println();
		System.out.println("🔹 Method: " + Method);
		System.out.println();
		System.out.println("🔹 Price: " + Price);
		System.out.println();

		Report_Listen.log_print_in_report().info("──────────────────── 🧭 LAB TEST TAB NAVIGATION ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Navigate to the Lab Tests tab.");

		System.out.println("🧭 LAB TEST TAB NAVIGATION");
		System.out.println();
		System.out.println("🔹 Step " + step + ": Navigating to the Lab Tests tab.");
		System.out.println();

		Product_Module_Tab_Navigator("Lab Tests");

		Report_Listen.log_print_in_report().pass("✅ Lab Tests tab opened successfully.");
		System.out.println("✅ Lab Tests tab opened successfully.");
		System.out.println();

		step++;

		Report_Listen.log_print_in_report().info("──────────────────── 📝 LAB TEST FORM ACCESS ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Open the Lab Test Add form and retrieve its primary fields.");

		System.out.println("📝 LAB TEST FORM ACCESS");
		System.out.println();
		System.out.println("🔹 Step " + step + ": Opening the Lab Test Add form.");
		System.out.println();

		WebElement Lab_Test_Add = p.Lab_Test_Add_Button();
		Lab_Test_Add.click();

		WebElement Popup_Form = p.Popup_Form();
		List<WebElement> Form_Fields = Popup_Form.findElements(By.xpath(".//input[@id='name' or @id='method' or @id='price']"));
		WebElement Name_Field = Form_Fields.get(0);
		WebElement Method_Field = Form_Fields.get(1);
		WebElement Price_Field = Form_Fields.get(2);

		Report_Listen.log_print_in_report().pass("✅ Lab Test Add form and primary input fields retrieved successfully.");
		System.out.println("✅ Lab Test Add form and primary input fields retrieved successfully.");
		System.out.println();

		step++;

		Report_Listen.log_print_in_report().info("──────────────────── ✏️ LAB TEST BASIC DETAILS ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Enter the Lab Test name.");

		System.out.println("✏️ LAB TEST BASIC DETAILS");
		System.out.println();
		System.out.println("🔹 Step " + step + ": Entering Lab Test Name: " + Lab_Test_Name);
		System.out.println();

		Name_Field.sendKeys(Lab_Test_Name);

		Report_Listen.log_print_in_report().pass("✅ Lab Test Name entered successfully.");
		System.out.println("✅ Lab Test Name entered successfully.");
		System.out.println();

		step++;

		Report_Listen.log_print_in_report().info("──────────────────── ⚙️ LAB TEST METHOD SELECTION ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Select Lab Test Method = " + Method);

		System.out.println("⚙️ LAB TEST METHOD SELECTION");
		System.out.println();
		System.out.println("🔹 Step " + step + ": Selecting Lab Test Method: " + Method);
		System.out.println();

		Method_Field.sendKeys(Method);

		WebElement Method_type_list = p.First_Virtual_List_holder();
		List<WebElement> Method_type_list_options = Method_type_list.findElements(By.xpath(".//*[contains(@class,'ant-select-item ant-select-item-option ant-select-item-option')]"));

		for(WebElement Method_option : Method_type_list_options) {

			String Method_option_text = Method_option.getText();

			if(Method_option_text.equals(Method)) {

				Method_option.click();

				Report_Listen.log_print_in_report().pass("✅ Lab Test Method selected successfully: " + Method);
				System.out.println("✅ Lab Test Method selected successfully: " + Method);
				System.out.println();

				break;
			}
		}

		if(Method.equals("Walk-In")) {

			String Address_Line_1 = data.get("Address Line 1");
			String Address_Line_2 = data.get("Address Line 2");
			String Country = data.get("Country");
			String State = data.get("State");
			String City = data.get("City");
			String Postal_Code = data.get("Postal Code / Zip Code");

			step++;

			Report_Listen.log_print_in_report().info("──────────────────── 📍 WALK-IN LOCATION DETAILS ────────────────────");
			Report_Listen.log_print_in_report().info("<b>Action:</b> Configure Walk-In laboratory address and location details.");
			Report_Listen.log_print_in_report().info("<b>Input:</b> Country = " + Country + " | State = " + State + " | City = " + City + " | Postal Code = " + Postal_Code);

			System.out.println("📍 WALK-IN LOCATION DETAILS");
			System.out.println();
			System.out.println("🔹 Step " + step + ": Entering Walk-In laboratory address details.");
			System.out.println();

			List<WebElement> Address_info_Fields = Popup_Form.findElements(By.xpath(".//input[@id='address1' or @id='address2' or @id='country' or @id='city' or @id='zip']"));
			WebElement Address_Line_1_Field = Address_info_Fields.get(0);
			WebElement Address_Line_2_Field = Address_info_Fields.get(1);
			WebElement Country_Field = Address_info_Fields.get(2);
			WebElement City_Field = Address_info_Fields.get(3);
			WebElement Postal_Code_Field = Address_info_Fields.get(4);

			Address_Line_1_Field.sendKeys(Address_Line_1);
			Address_Line_2_Field.sendKeys(Address_Line_2);

			Report_Listen.log_print_in_report().info("<b>Action:</b> Select Country = " + Country);
			System.out.println("🔹 Selecting Country: " + Country);
			System.out.println();

			Country_Field.click();
			Country_Field.clear();
			Country_Field.sendKeys(Country);

			WebElement Country_type_list = p.Second_Virtual_List_holder();
			List<WebElement> Country_type_list_options = Country_type_list.findElements(By.xpath(".//*[contains(@class,'ant-select-item ant-select-item-option ant-select-item-option')]"));

			for(WebElement Country_option : Country_type_list_options) {

				String Country_option_text = Country_option.getText();

				if(Country_option_text.equals(Country)) {

					Country_option.click();

					Report_Listen.log_print_in_report().pass("✅ Country selected successfully: " + Country);
					System.out.println("✅ Country selected successfully: " + Country);
					System.out.println();

					break;
				}
			}

			Thread.sleep(880);

			Report_Listen.log_print_in_report().info("<b>Action:</b> Select State = " + State);
			System.out.println("🔹 Selecting State: " + State);
			System.out.println();

			WebElement State_Field = Popup_Form.findElement(By.xpath(".//input[@id='state']"));
			State_Field.click();
			State_Field.clear();
			State_Field.sendKeys(State);

			WebElement State_type_list = p.Thrid_Virtual_List_holder();
			List<WebElement> State_type_list_options = State_type_list.findElements(By.xpath(".//*[contains(@class,'ant-select-item ant-select-item-option ant-select-item-option')]"));

			for(WebElement State_option : State_type_list_options) {

				String State_option_text = State_option.getText();

				if(State_option_text.equals(State)) {

					State_option.click();

					Report_Listen.log_print_in_report().pass("✅ State selected successfully: " + State);
					System.out.println("✅ State selected successfully: " + State);
					System.out.println();

					break;
				}
			}

			City_Field.clear();
			City_Field.sendKeys(City);
			Postal_Code_Field.sendKeys(Postal_Code);

			Report_Listen.log_print_in_report().pass("✅ Walk-In laboratory location details entered successfully.");
			System.out.println("✅ Walk-In laboratory location details entered successfully.");
			System.out.println();
		}

		if(Method.equals("Test Kit")) {

			String Kit_Provided_By = data.get("Kit Provided By");

			step++;

			Report_Listen.log_print_in_report().info("──────────────────── 📦 TEST KIT CONFIGURATION ────────────────────");
			Report_Listen.log_print_in_report().info("<b>Action:</b> Configure Test Kit provider.");
			Report_Listen.log_print_in_report().info("<b>Input:</b> Kit Provided By = " + Kit_Provided_By);

			System.out.println("📦 TEST KIT CONFIGURATION");
			System.out.println();
			System.out.println("🔹 Step " + step + ": Selecting Kit Provided By: " + Kit_Provided_By);
			System.out.println();

			WebElement Kit_Provided_By_Field = Popup_Form.findElement(By.xpath(".//input[@id='kit_provided_by']"));
			Kit_Provided_By_Field.sendKeys(Kit_Provided_By);

			WebElement Kit_type_list = p.Second_Virtual_List_holder();
			List<WebElement> Kit_type_list_options = Kit_type_list.findElements(By.xpath(".//*[contains(@class,'ant-select-item ant-select-item-option ant-select-item-option')]"));

			for(WebElement Kit_option : Kit_type_list_options) {

				String Kit_option_text = Kit_option.getText();

				if(Kit_option_text.equals(Kit_Provided_By)) {

					Kit_option.click();

					Report_Listen.log_print_in_report().pass("✅ Kit provider selected successfully: " + Kit_Provided_By);
					System.out.println("✅ Kit provider selected successfully: " + Kit_Provided_By);
					System.out.println();

					break;
				}
			}
		}

		step++;

		Report_Listen.log_print_in_report().info("──────────────────── 💲 LAB TEST PRICING ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Enter Lab Test Price = " + Price);

		System.out.println("💲 LAB TEST PRICING");
		System.out.println();
		System.out.println("🔹 Step " + step + ": Entering Lab Test Price: " + Price);
		System.out.println();

		Price_Field.sendKeys(Price);

		Report_Listen.log_print_in_report().pass("✅ Lab Test Price entered successfully.");
		System.out.println("✅ Lab Test Price entered successfully.");
		System.out.println();

		step++;

		Report_Listen.log_print_in_report().info("──────────────────── 💾 LAB TEST SAVE & VERIFICATION ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Save the Lab Test and verify that the creation flow completes.");

		System.out.println("💾 LAB TEST SAVE & VERIFICATION");
		System.out.println();
		System.out.println("🔹 Step " + step + ": Saving the Lab Test.");
		System.out.println();

		WebElement Save_Button = p.Save_Button();
		Save_Button.click();

		Thread.sleep(800);

		p.Lab_Test_Add_Button();

		Report_Listen.log_print_in_report().pass("✅ Lab Test created successfully: " + Lab_Test_Name);
		System.out.println("✅ Lab Test created successfully: " + Lab_Test_Name);
		System.out.println();

	} catch(Exception e) {

		if(Report_Listen.log_print_in_report() != null) Report_Listen.log_print_in_report().fail("❌ Lab Test creation failed for '" + Lab_Test_Name + "'. Failure reason: " + e.getMessage());

		System.out.println("❌ Lab Test creation failed for: " + Lab_Test_Name);
		System.out.println();

		System.out.println("❌ Failure reason: " + e.getMessage());
		System.out.println();

		throw e;
	}
}



@Test(dataProvider = "Category_Create_Data")
public void Category_Add(TreeMap<String, String> data) throws Exception {

	String Category_Name_Data = data.get("Category Name");
	String Drug_Class_Code_Data = data.get("Drug Class / Code");
	String Category_Description_Data = data.get("Description");

	Product_Module_Locaters p = new Product_Module_Locaters(d);

	int step = 1;

	try {

		Report_Listen.log_print_in_report().info("──────────────────── 🗂️ CATEGORY CREATION ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Scenario:</b> Create a new Product Category.");
		Report_Listen.log_print_in_report().info("<b>Input:</b> Category Name = " + Category_Name_Data + " | Drug Class / Code = " + Drug_Class_Code_Data);
		Report_Listen.log_print_in_report().info("<b>Expected:</b> Category should be created successfully and become available in the Product Module.");

		System.out.println("🗂️ CATEGORY CREATION");
		System.out.println();
		System.out.println("🔹 Category Name: " + Category_Name_Data);
		System.out.println();
		System.out.println("🔹 Drug Class / Code: " + Drug_Class_Code_Data);
		System.out.println();

		Report_Listen.log_print_in_report().info("──────────────────── 🧭 CATEGORY TAB NAVIGATION ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Navigate to the Categories tab of the Product Module.");

		System.out.println("🧭 CATEGORY TAB NAVIGATION");
		System.out.println();
		System.out.println("🔹 Step " + step + ": Navigating to the Categories tab.");
		System.out.println();

		Product_Module_Tab_Navigator("Categories");

		Report_Listen.log_print_in_report().pass("✅ Categories tab opened successfully.");
		System.out.println("✅ Categories tab opened successfully.");
		System.out.println();

		step++;

		Report_Listen.log_print_in_report().info("──────────────────── 📝 CATEGORY FORM ACCESS ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Open the Category Add form.");

		System.out.println("📝 CATEGORY FORM ACCESS");
		System.out.println();
		System.out.println("🔹 Step " + step + ": Opening the Category Add form.");
		System.out.println();

		WebElement Category_Add = p.Category_Add_Button();
		Category_Add.click();

		WebElement Popup_Form = p.Popup_Form();

		Report_Listen.log_print_in_report().pass("✅ Category Add form displayed successfully.");
		System.out.println("✅ Category Add form displayed successfully.");
		System.out.println();

		step++;

		Report_Listen.log_print_in_report().info("──────────────────── ✏️ CATEGORY DETAILS ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Enter Category Name, Drug Class / Code and Description.");

		System.out.println("✏️ CATEGORY DETAILS");
		System.out.println();
		System.out.println("🔹 Step " + step + ": Entering Category details.");
		System.out.println();

		List<WebElement> Form_Fields = Popup_Form.findElements(By.xpath(".//input"));
		WebElement Category_Name = Form_Fields.get(0);
		WebElement Drug_Class_Field = Form_Fields.get(1);
		WebElement Category_Description = Popup_Form.findElement(By.xpath(".//textarea"));

		Category_Name.clear();
		Category_Name.sendKeys(Category_Name_Data);

		Report_Listen.log_print_in_report().info("<b>Category Name:</b> " + Category_Name_Data);
		System.out.println("✅ Category Name entered: " + Category_Name_Data);
		System.out.println();

		Drug_Class_Field.clear();
		Drug_Class_Field.sendKeys(Drug_Class_Code_Data);

		Report_Listen.log_print_in_report().info("<b>Drug Class / Code:</b> " + Drug_Class_Code_Data);
		System.out.println("✅ Drug Class / Code entered: " + Drug_Class_Code_Data);
		System.out.println();

		Category_Description.clear();
		Category_Description.sendKeys(Category_Description_Data);

		Report_Listen.log_print_in_report().info("<b>Description:</b> " + Category_Description_Data);
		System.out.println("✅ Category Description entered successfully.");
		System.out.println();

		step++;

		Report_Listen.log_print_in_report().info("──────────────────── 💾 CATEGORY SAVE & VERIFICATION ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Save the Category and verify that the Category creation flow completes.");

		System.out.println("💾 CATEGORY SAVE & VERIFICATION");
		System.out.println();
		System.out.println("🔹 Step " + step + ": Saving the Category.");
		System.out.println();

		WebElement Save_Button = p.Save_Button();
		Save_Button.click();
		WebElement Confirmation_Message = p.Success_Toast();
		String Confirmation_Message_Text = Confirmation_Message.getText().trim();

		Report_Listen.log_print_in_report().pass("✅ Confirmation Message: " + Confirmation_Message_Text);
		System.out.println("✅ Confirmation message displayed: " + Confirmation_Message_Text);
		System.out.println();
		p.Category_Add_Button();

		Report_Listen.log_print_in_report().pass("✅ Category created successfully with Category Name: " + Category_Name_Data);
		System.out.println("✅ Category created successfully with Category Name: " + Category_Name_Data);
		System.out.println();

	} catch(Exception e) {

		if(Report_Listen.log_print_in_report() != null) Report_Listen.log_print_in_report().fail("❌ Category creation failed for Category Name '" + Category_Name_Data + "'. Failure reason: " + e.getMessage());

		System.out.println("❌ Category creation failed for Category Name: " + Category_Name_Data);
		System.out.println();

		System.out.println("❌ Failure reason: " + e.getMessage());
		System.out.println();

		throw e;
	}
}
	
   
 public void Product_Module_Tab_Navigator(String Tab_Option) throws Exception {

	Product_Module_Locaters p = new Product_Module_Locaters(d);

	try {

		Report_Listen.log_print_in_report().info("──────────────────── 🧭 PRODUCT MODULE TAB NAVIGATION ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Access the Product Module and navigate to the '" + Tab_Option + "' tab.");

		System.out.println("🧭 PRODUCT MODULE TAB NAVIGATION");
		System.out.println();
		System.out.println("🔹 Navigating to Product Module tab: " + Tab_Option);
		System.out.println();

		Product_Module_Accessor();

		Report_Listen.log_print_in_report().info("<b>Action:</b> Retrieve the Product Module top navigation bar.");
		System.out.println("🔹 Retrieving the Product Module top navigation bar.");
		System.out.println();

		WebElement Nav_Bar = p.Top_Navigation_bar();

		List<WebElement> Tabs = Nav_Bar.findElements(By.xpath(".//div[@class='ant-tabs-tab']"));

		Report_Listen.log_print_in_report().info("<b>Action:</b> Search the available tabs for '" + Tab_Option + "'.");
		System.out.println("🔹 Searching available tabs for: " + Tab_Option);
		System.out.println();

		for(WebElement tab : Tabs) {

			String Tab_Name = tab.getText().trim();

			if(Tab_Name.equalsIgnoreCase(Tab_Option)) {

				tab.click();

				Report_Listen.log_print_in_report().pass("✅ Navigated to the '" + Tab_Option + "' tab successfully.");
				System.out.println("✅ Navigated to the " + Tab_Option + " tab successfully.");
				System.out.println();

				break;
			}
		}

	} catch(Exception e) {

		if(Report_Listen.log_print_in_report() != null) Report_Listen.log_print_in_report().fail("❌ Failed to navigate to the '" + Tab_Option + "' tab. Failure reason: " + e.getMessage());

		System.out.println("❌ Failed to navigate to the " + Tab_Option + " tab.");
		System.out.println();

		System.out.println("❌ Failure reason: " + e.getMessage());
		System.out.println();

		throw e;
	}
}
	   
   
	
@Test(dataProvider="combined_data_provider")
public void Product_Add(TreeMap<String, String> Category_Create_Data,TreeMap<String, String> Lab_Test_Create_Data,TreeMap<String, String> Product_data) throws Exception {

	Product_Module_Locaters p = new Product_Module_Locaters(d);
    Repeat rp = new Repeat(d);
	
	
	String Product_Name = Product_data.get("Product Name");
	String Description = Product_data.get("Description");
	String Product_Image = Product_data.get("Product Image");
	String Product_Type = Product_data.get("Product Type");
	String Category = Category_Create_Data.get("Category Name");
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
	String Lab_Test = Lab_Test_Create_Data.get("Lab Test Name");

	int step = 1;

	try {

		Report_Listen.log_print_in_report().info("──────────────────── 📦 PRODUCT CREATION ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Scenario:</b> Create a new Product in the Product Module.");
		Report_Listen.log_print_in_report().info("<b>Input:</b> Product Name = " + Product_Name + " | Product Type = " + Product_Type + " | Category = " + Category);
		Report_Listen.log_print_in_report().info("<b>Expected:</b> Product should be created successfully with the configured catalog, inventory and pricing information.");

		System.out.println("📦 PRODUCT CREATION");
		System.out.println();
		System.out.println("🔹 Product Name: " + Product_Name);
		System.out.println();
		System.out.println("🔹 Product Type: " + Product_Type);
		System.out.println();
		System.out.println("🔹 Category: " + Category);
		System.out.println();

		Report_Listen.log_print_in_report().info("──────────────────── 📝 PRODUCT FORM ACCESS ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Access the Product Module and open the Product Add form.");

		System.out.println("📝 PRODUCT FORM ACCESS");
		System.out.println();
		System.out.println("🔹 Step " + step + ": Opening the Product Add form.");
		System.out.println();

		WebElement Product_Add = Product_Module_Accessor();
		Product_Add.click();
		
        
		p.Description_form();

		WebElement Product_form = p.Form();

		Report_Listen.log_print_in_report().pass("✅ Product Add form opened successfully.");
		System.out.println("✅ Product Add form opened successfully.");
		System.out.println();

		step++;

		Report_Listen.log_print_in_report().info("──────────────────── 🔎 PRODUCT FORM FIELD RETRIEVAL ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Retrieve all required Product Add form input fields.");

		System.out.println("🔎 PRODUCT FORM FIELD RETRIEVAL");
		System.out.println();
		System.out.println("🔹 Step " + step + ": Retrieving Product Add form input fields.");
		System.out.println();

		List<WebElement> Inputs;

		try {

			Inputs = p.Product_Add_Form_Inputs(Product_form);

		} catch(Exception e) {
              
			Thread.sleep(1300);
			Report_Listen.log_print_in_report().warning("⚠️ Initial Product form input retrieval failed. Retrying field retrieval.");
			System.out.println("⚠️ Initial Product form input retrieval failed. Retrying.");
			System.out.println();
			
			Inputs = p.Product_Add_Form_Inputs(Product_form);
		}
		if(!Inputs.isEmpty()) {
		Negative_Validation_Check_for_Product_Add(Inputs,Category_Create_Data,Lab_Test_Create_Data,Product_data);}
		else{
			System.out.println("Number of input fields " +Inputs.size());
			System.out.println();
			
		}
      
		
		
		
		WebElement Product_Name_Input = Inputs.get(0);
		WebElement Description_Input = p.Textarea_Description_Field();
		WebElement Product_Type_Input = Inputs.get(1);
		WebElement Product_Category_Input = Inputs.get(2);
		WebElement Product_Visibility_Input = Inputs.get(3);
		WebElement Min_Quantity_Input = Inputs.get(4);
		WebElement Max_Quantity_Input = Inputs.get(5);
		WebElement Stock_Input = Inputs.get(6);
		WebElement Default_SKU = Inputs.get(7);
		WebElement Condition_treated_Input = Inputs.get(8);
		WebElement Intro_Input = Inputs.get(9);
		WebElement Default_Price_Input = Inputs.get(11);
		WebElement Sales_Price_Input = Inputs.get(10);
		WebElement Sales_Start_Date_Input = Inputs.get(12);
		WebElement Sales_End_Date_Input = Inputs.get(13);

		Report_Listen.log_print_in_report().pass("✅ Required Product Add form fields retrieved successfully.");
		System.out.println("✅ Required Product Add form fields retrieved successfully.");
		System.out.println();

		step++;

		Report_Listen.log_print_in_report().info("──────────────────── ✏️ PRODUCT BASIC DETAILS ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Enter Product Description.");

		System.out.println("✏️ PRODUCT BASIC DETAILS");
		System.out.println();
		System.out.println("🔹 Step " + step + ": Entering Product Description.");
		System.out.println();

		Description_Input.clear();
		Description_Input.sendKeys(Description);

		Report_Listen.log_print_in_report().pass("✅ Product Description entered successfully.");
		System.out.println("✅ Product Description entered successfully.");
		System.out.println();
		
		WebElement Image_Upload = p.Product_Image_Upload_Input();

		JavascriptExecutor js = (JavascriptExecutor)d;
		//js.executeScript("arguments[0].style.display='block';", Image_Upload);

		Image_Upload.sendKeys(Product_Image);

		

		step++;

		Report_Listen.log_print_in_report().info("──────────────────── 🏷️ PRODUCT TYPE & CATEGORY ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Select Product Type = " + Product_Type);

		System.out.println("🏷️ PRODUCT TYPE & CATEGORY");
		System.out.println();
		System.out.println("🔹 Selecting Product Type: " + Product_Type);
		System.out.println();

		Product_Type_Input.sendKeys(Product_Type);

		WebElement Prod_type_list = p.First_Virtual_List_holder();
		List<WebElement> Prod_type_list_options = Prod_type_list.findElements(By.xpath(".//*[contains(@class,'ant-select-item ant-select-item-option ant-select-item-option')]"));

		for(WebElement option : Prod_type_list_options) {

			if(option.getText().equals(Product_Type)) {

				option.click();

				Report_Listen.log_print_in_report().pass("✅ Product Type selected successfully: " + Product_Type);
				System.out.println("✅ Product Type selected successfully: " + Product_Type);
				System.out.println();

				break;
			}
		}

		Report_Listen.log_print_in_report().info("<b>Action:</b> Select Product Category = " + Category);
		System.out.println("🔹 Selecting Product Category: " + Category);
		System.out.println();

		Product_Category_Input.sendKeys(Category);

		WebElement Categories_type_list = p.Thrid_Virtual_List_holder();
		List<WebElement> Categories_type_list_options = Categories_type_list.findElements(By.xpath(".//*[contains(@class,'ant-select-item ant-select-item-option ant-select-item-option')]"));

		for(WebElement option : Categories_type_list_options) {

			if(option.getText().equals(Category)) {

				option.click();

				Report_Listen.log_print_in_report().pass("✅ Product Category selected successfully: " + Category);
				System.out.println("✅ Product Category selected successfully: " + Category);
				System.out.println();

				break;
			}
		}

		step++;

		Report_Listen.log_print_in_report().info("──────────────────── 👁️ PRODUCT VISIBILITY ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Select Product Visibility = " + Visibility);

		System.out.println("👁️ PRODUCT VISIBILITY");
		System.out.println();
		System.out.println("🔹 Selecting Product Visibility: " + Visibility);
		System.out.println();

		Product_Visibility_Input.sendKeys(Visibility);

		WebElement Product_Visibility_list = p.Second_Virtual_List_holder();
		List<WebElement> Product_Visibility_list_options = Product_Visibility_list.findElements(By.xpath(".//*[contains(@class,'ant-select-item ant-select-item-option ant-select-item-option')]"));

		for(WebElement visoption : Product_Visibility_list_options) {
            String option_Text=visoption.getText().trim();
            System.out.println("visibility option "+option_Text+" Option text from Dataprovider "+Visibility);
			if(option_Text.contains(Visibility)) {

				visoption.click();

				Report_Listen.log_print_in_report().pass("✅ Product Visibility selected successfully: " + Visibility);
				System.out.println("✅ Product Visibility selected successfully: " + Visibility);
				System.out.println();

				break;
			}
		}

		step++;

		Report_Listen.log_print_in_report().info("──────────────────── 📦 PRODUCT INVENTORY ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Configure minimum quantity, maximum quantity and stock count.");
		Report_Listen.log_print_in_report().info("<b>Input:</b> Minimum = " + Minimum_Buy_Quantity + " | Maximum = " + Maximum_Buy_Quantity + " | Stock = " + Stock_Count);

		System.out.println("📦 PRODUCT INVENTORY");
		System.out.println();
		System.out.println("🔹 Entering Product quantity and stock configuration.");
		System.out.println();

		Min_Quantity_Input.sendKeys(Minimum_Buy_Quantity);
		Max_Quantity_Input.sendKeys(Maximum_Buy_Quantity);
		Stock_Input.sendKeys(Stock_Count);

		Report_Listen.log_print_in_report().pass("✅ Product inventory configuration entered successfully.");
		System.out.println("✅ Product inventory configuration entered successfully.");
		System.out.println();

		if(Product_Type.equals("Prescription")) {

			Report_Listen.log_print_in_report().info("──────────────────── 🩺 PRESCRIPTION CONFIGURATION ────────────────────");
			Report_Listen.log_print_in_report().info("<b>Action:</b> Configure Prescription Intake Form = " + Intake_Form);

			System.out.println("🩺 PRESCRIPTION CONFIGURATION");
			System.out.println();
			System.out.println("🔹 Configuring Prescription Intake Form: " + Intake_Form);
			System.out.println();

			WebElement Intake_Form_Input = p.Intake_form_field();
			Intake_Form_Input.sendKeys(Intake_Form);
			
			WebElement Intake_Form_list = p.Fourth_Virtual_List_holder();
			List<WebElement> Intake_Form_list_options = Intake_Form_list.findElements(By.xpath(".//*[contains(@class,'ant-select-item ant-select-item-option ant-select-item-option')]"));

			for(WebElement intoption : Intake_Form_list_options) {
	            String option_Text=intoption.getText().trim();
	            System.out.println("visibility option "+option_Text+" Option text from Dataprovider "+Intake_Form);
				if(option_Text.contains(Intake_Form)) {

					intoption.click();

					Report_Listen.log_print_in_report().pass("✅ Product Visibility selected successfully: " + Intake_Form);
					System.out.println("✅ Product Visibility selected successfully: " + Intake_Form);
					System.out.println();

					break;}}
			WebElement renewal_teleforms_Input = p.renewal_teleforms();
			renewal_teleforms_Input.sendKeys(Intake_Form);
			
			WebElement renewal_teleforms_Input_list = p.Sixth_Virtual_List_holder();
			List<WebElement> renewal_teleforms_Input_options = renewal_teleforms_Input_list.findElements(By.xpath(".//*[contains(@class,'ant-select-item ant-select-item-option ant-select-item-option')]"));

			for(WebElement renewaloption : renewal_teleforms_Input_options) {
	            String reoption_Text=renewaloption.getText().trim();
	            System.out.println("visibility option "+reoption_Text+" Option text from Dataprovider "+Intake_Form);
				if(reoption_Text.contains(Intake_Form)) {

					renewaloption.click();

					Report_Listen.log_print_in_report().pass("✅ Product Visibility selected successfully: " + Intake_Form);
					System.out.println("✅ Product Visibility selected successfully: " + Intake_Form);
					System.out.println();

					break;}}

			Report_Listen.log_print_in_report().pass("✅ Prescription Intake Form entered successfully.");
			System.out.println("✅ Prescription Intake Form entered successfully.");
			System.out.println();
		}

		step++;
         
		Report_Listen.log_print_in_report().info("──────────────────── 🆔 PRODUCT IDENTIFICATION ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Enter Default SKU / Identifier and Condition Treated.");

		System.out.println("🆔 PRODUCT IDENTIFICATION");
		System.out.println();
		System.out.println("🔹 Entering SKU and Condition Treated.");
		System.out.println();

		Default_SKU.sendKeys(Default_SKU_Identifier);
		Condition_treated_Input.sendKeys(Condition_Treated);
	    WebElement Condition_treated_list;
	    if(Product_Type.equals("Prescription")){
	    
	    Condition_treated_list= p.Fifth_Virtual_List_holder();}
	    else{
		    
		    Condition_treated_list= p.Fourth_Virtual_List_holder();}
	    
	    List<WebElement> Condition_treated_list_options = Condition_treated_list.findElements(By.xpath(".//*[contains(@class,'ant-select-item ant-select-item-option ant-select-item-option')]"));

	     for(WebElement Condition_option : Condition_treated_list_options) {
		
		  String Condition_option_text =Condition_option.getText().trim();
		

		if(Condition_option_text.contains(Condition_Treated)) {

			Condition_option.click();

			Report_Listen.log_print_in_report().pass("✅ Condition Treated selected successfully: " + Condition_option);
			System.out.println("✅ Condition Treated selected successfully: " + Condition_option);
			System.out.println();

			break;
		}
	}

		Report_Listen.log_print_in_report().pass("✅ Product SKU and Condition Treated entered successfully.");
		System.out.println("✅ Product SKU and Condition Treated entered successfully.");
		System.out.println();

		step++;

		Report_Listen.log_print_in_report().info("──────────────────── 💰 PRODUCT PRICING ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Configure Product Intro Price, Default Price and Sale Price.");
		Report_Listen.log_print_in_report().info("<b>Input:</b> Intro Price = " + Intro_Price + " | Default Price = " + Default_Price + " | Sale Price = " + Sale_Price);

		System.out.println("💰 PRODUCT PRICING");
		System.out.println();
		System.out.println("🔹 Entering Product pricing details.");
		System.out.println();

		Intro_Input.sendKeys(Intro_Price);
		Default_Price_Input.sendKeys(Default_Price);
		Sales_Price_Input.sendKeys(Sale_Price);

		Report_Listen.log_print_in_report().pass("✅ Product pricing details entered successfully.");
		System.out.println("✅ Product pricing details entered successfully.");
		System.out.println();

		step++;

		Report_Listen.log_print_in_report().info("──────────────────── 📅 SALE DATE CONFIGURATION ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Configure Product Sale Start Date and Sale End Date.");
		Report_Listen.log_print_in_report().info("<b>Input:</b> Start Date = " + Sale_Start_Date + " | End Date = " + Sales_End_Date);

		System.out.println("📅 SALE DATE CONFIGURATION");
		System.out.println();
		System.out.println("🔹 Entering Sale Start Date: " + Sale_Start_Date);
		System.out.println();
		Sales_Start_Date_Input.click();
	
		WebElement Today_Button=p.Today_Button_Calender("First");
		rp.movetoelement(Today_Button);
		rp.Scroll_to_element(Today_Button);
		Thread.sleep(800);
		Today_Button.click();
		
		System.out.println("🔹 Entering Sale End Date: " + Sales_End_Date);
		System.out.println();
		Sales_End_Date_Input.click();
		WebElement Second_Today_Button=p.Today_Button_Calender("second");
		rp.movetoelement(Second_Today_Button);
		rp.Scroll_to_element(Second_Today_Button);
		Thread.sleep(800);
		Second_Today_Button.click();

	

		Report_Listen.log_print_in_report().pass("✅ Product Sale dates configured successfully.");
		System.out.println("✅ Product Sale dates configured successfully.");
		System.out.println();

		step++;

		step++;

		Report_Listen.log_print_in_report().info("──────────────────── 💾 PRODUCT SAVE ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Save the Product and verify the success confirmation message.");

		System.out.println("💾 PRODUCT SAVE");
		System.out.println();
		System.out.println("🔹 Step " + step + ": Saving the Product.");
		System.out.println();

		WebElement Submit_Button = p.Product_Save_Button();

		Report_Listen.log_print_in_report().info("<b>Action:</b> Clicking Save Product button.");
		System.out.println("🔹 Clicking Save Product button.");
		System.out.println();

		Submit_Button.click();

		WebElement Confirmation_Message = p.Success_Toast();
		String Confirmation_Message_Text = Confirmation_Message.getText().trim();

		Report_Listen.log_print_in_report().pass("✅ Product saved successfully. Confirmation Message: " + Confirmation_Message_Text);
		System.out.println("✅ Product saved successfully.");
		System.out.println("🔹 Confirmation Message: " + Confirmation_Message_Text);
		System.out.println();

		rp.wait_for_invisibilty_of_theElement(Confirmation_Message);

		step++;

		Report_Listen.log_print_in_report().info("──────────────────── 🔄 POST-SAVE REDIRECTION VALIDATION ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Verify that the application redirects to the Product List after Product creation.");

		System.out.println("🔄 POST-SAVE REDIRECTION VALIDATION");
		System.out.println();
		System.out.println("🔹 Step " + step + ": Verifying Product List redirection after Product creation.");
		System.out.println();

		WebElement Prd_Add_Button = p.Product_Add_Button;
		Boolean Visibility_Status = rp.check_element_visibility(Prd_Add_Button, 5);

		if(Visibility_Status){

			String landed_page_url = d.getCurrentUrl();

			Report_Listen.log_print_in_report().pass("✅ Post-save redirection validation passed. Product List page loaded successfully.");
			Report_Listen.log_print_in_report().info("<b>Landed Page URL:</b> " + landed_page_url);

			System.out.println("✅ Post-save redirection validation passed. Product List page loaded successfully.");
			System.out.println("🔹 Landed Page URL: " + landed_page_url);
			System.out.println();

			Report_Listen.log_print_in_report().info("──────────────────── 🔍 CREATED PRODUCT LIST VERIFICATION ────────────────────");
			Report_Listen.log_print_in_report().info("<b>Action:</b> Search the Product List and verify that the newly created Product is available.");
			Report_Listen.log_print_in_report().info("<b>Expected Product:</b> " + Product_Name);

			System.out.println("🔍 CREATED PRODUCT LIST VERIFICATION");
			System.out.println();
			System.out.println("🔹 Step " + step + ": Searching the Product List for the newly created Product.");
			System.out.println();
			System.out.println("🔹 Expected Product: " + Product_Name);
			System.out.println();

			search_a_product_in_list(Product_data);
		}
		else{

			String landed_page_url = d.getCurrentUrl();

			Report_Listen.log_print_in_report().fail("❌ Post-save redirection validation failed. Application did not redirect to the Product List after Product creation.");
			Report_Listen.log_print_in_report().fail("❌ Expected: Product List page containing the Product Add button.");
			Report_Listen.log_print_in_report().fail("❌ Actual Landed Page URL: " + landed_page_url);

			System.out.println("❌ Post-save redirection validation failed.");
			System.out.println("❌ Expected: Product List page containing the Product Add button.");
			System.out.println("❌ Actual Landed Page URL: " + landed_page_url);
			System.out.println();

			Report_Listen.log_print_in_report().warning("⚠️ Performing fallback navigation to Catalog so Product List verification can continue.");
			System.out.println("⚠️ Performing fallback navigation to Catalog so Product List verification can continue.");
			System.out.println();

			Side_Menu_Navigation("Catalog");
			Thread.sleep(800);
			p.Product_Add_Button();

			Report_Listen.log_print_in_report().pass("✅ Fallback navigation completed. Product List page is now accessible.");
			System.out.println("✅ Fallback navigation completed. Product List page is now accessible.");
			System.out.println();

			Report_Listen.log_print_in_report().info("──────────────────── 🔍 CREATED PRODUCT LIST VERIFICATION ────────────────────");
			Report_Listen.log_print_in_report().info("<b>Action:</b> Verify that the created Product exists after fallback navigation.");
			Report_Listen.log_print_in_report().info("<b>Expected Product:</b> " + Product_Name);

			System.out.println("🔍 CREATED PRODUCT LIST VERIFICATION");
			System.out.println();
			System.out.println("🔹 Searching for the created Product after fallback navigation.");
			System.out.println();
			System.out.println("🔹 Expected Product: " + Product_Name);
			System.out.println();

			search_a_product_in_list(Product_data);
		}

		step++;

		

		Report_Listen.log_print_in_report().pass("──────────────────── ✅ PRODUCT CREATION FLOW COMPLETED ────────────────────");
		Report_Listen.log_print_in_report().pass("✅ Product creation, save and Product List verification flow completed for Product: " + Product_Name);

		System.out.println("✅ PRODUCT CREATION FLOW COMPLETED");
		System.out.println();
		System.out.println("✅ Product creation, save and Product List verification flow completed for Product: " + Product_Name);
		System.out.println();

	} catch(Exception e) {

		if(Report_Listen.log_print_in_report() != null) Report_Listen.log_print_in_report().fail("❌ Product creation failed for Product '" + Product_Name + "'. Failure reason: " + e.getMessage());

		System.out.println("❌ Product creation failed for Product: " + Product_Name);
		System.out.println();

		System.out.println("❌ Failure reason: " + e.getMessage());
		System.out.println();

		throw e;
	}
}


public void search_a_product_in_list(TreeMap<String, String> Prod_name) throws InterruptedException{

	String Product_Name = Prod_name.get("Product Name");
	Product_Module_Locaters p = new Product_Module_Locaters(d);
	
	Repeat rp = new Repeat(d);

	Report_Listen.log_print_in_report().info("──────────────────── 🔍 PRODUCT SEARCH VALIDATION ────────────────────");
	Report_Listen.log_print_in_report().info("<b>Expected Product:</b> " + Product_Name);
	System.out.println("🔍 PRODUCT SEARCH VALIDATION");
	System.out.println();
	System.out.println("🔹 Expected Product: " + Product_Name);
	System.out.println();

	Report_Listen.log_print_in_report().info("<b>Action:</b> Searching for Product: " + Product_Name);
	System.out.println("🔹 Searching for Product: " + Product_Name);
	System.out.println();

	WebElement Product_Search = p.Search();
	Product_Search.clear();
	Product_Search.sendKeys(Product_Name);
	Thread.sleep(1900);

	Report_Listen.log_print_in_report().pass("✅ Product Name entered successfully in the search field: " + Product_Name);
	System.out.println("✅ Product Name entered successfully in the search field: " + Product_Name);
	System.out.println();

	List<WebElement> names = p.List_first_column_values();

	Report_Listen.log_print_in_report().info("🔹 Total Product records returned after search: " + names.size());
	System.out.println("🔹 Total Product records returned after search: " + names.size());
	System.out.println();

	for(WebElement name : names){

		rp.movetoelement(name);
		Thread.sleep(650);

		WebElement Tooltip = p.tooltip();
		String list_names = Tooltip.getText().trim();

		Report_Listen.log_print_in_report().info("🔹 Searched Product: " + Product_Name + " | Fetched Product: " + list_names);
		System.out.println("🔹 Searched Product: " + Product_Name);
		System.out.println("🔹 Fetched Product: " + list_names);
		System.out.println();

		if(list_names.contains(Product_Name)){

			Report_Listen.log_print_in_report().pass("✅ Product search validation passed. Searched Product: " + Product_Name + " | Fetched Product: " + list_names);
			System.out.println("✅ Product search validation passed.");
			System.out.println("✅ Searched Product: " + Product_Name);
			System.out.println("✅ Fetched Product: " + list_names);
			System.out.println();

			break;
		}
		else{

			Report_Listen.log_print_in_report().fail("❌ Product search validation failed. Searched Product: " + Product_Name + " | Fetched Product: " + list_names);
			System.out.println("❌ Product search validation failed.");
			System.out.println("❌ Searched Product: " + Product_Name);
			System.out.println("❌ Fetched Product: " + list_names);
			System.out.println();
		}
	}}

public void Negative_Validation_Check_for_Product_Add(List<WebElement> inputs,TreeMap<String, String> Category_Create_Data,TreeMap<String, String> Lab_Test_Create_Data,TreeMap<String, String> Product_data) throws InterruptedException{
	
	Product_Module_Locaters p = new Product_Module_Locaters(d);
	Repeat rp = new Repeat(d);

	String Product_Name = Product_data.get("Product Name");
	String Description = Product_data.get("Description");
	String Product_Image = Product_data.get("Product Image");
	String Product_Type = Product_data.get("Product Type");
	String Category = Category_Create_Data.get("Category Name");
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
	String Lab_Test = Lab_Test_Create_Data.get("Lab Test Name");
	
	List<WebElement> Field_inputs = inputs;
	
	Report_Listen.log_print_in_report().info("──────────────────── NEGATIVE PRODUCT FORM VALIDATION ────────────────────");
	Report_Listen.log_print_in_report().info("Submitting the Product Add form without entering mandatory values to verify inline validation errors.");
	System.out.println("──────────────────── NEGATIVE PRODUCT FORM VALIDATION ────────────────────");
	System.out.println("🔹 Submitting the Product Add form without entering mandatory values to verify inline validation errors.");
	System.out.println();
	
	WebElement Submit_Button = p.Product_Save_Button();
	rp.Scroll_to_element(Submit_Button);
	Thread.sleep(550);
	Submit_Button.click();
	Thread.sleep(1050);
	Inline_Error_Checker();
	
	Report_Listen.log_print_in_report().info("Mandatory field inline validation check completed. Continuing with invalid Product data validation.");
	System.out.println("✅ Mandatory field inline validation check completed. Continuing with invalid Product data validation.");
	System.out.println();
	
	WebElement Product_Name_Input = null;
	WebElement Description_Input = null;
	WebElement Product_Type_Input = null;
	WebElement Product_Category_Input = null;
	WebElement Product_Visibility_Input = null;
	WebElement Min_Quantity_Input = null;
	WebElement Max_Quantity_Input = null;
	WebElement Stock_Input = null;
	WebElement Default_SKU = null;
	WebElement Condition_treated_Input = null;
	WebElement Intro_Input = null;
	WebElement Default_Price_Input = null;
	WebElement Sales_Price_Input = null;
	WebElement Sales_Start_Date_Input = null;
	WebElement Sales_End_Date_Input = null;
	
	if(Field_inputs!=null) {
		 Product_Name_Input = Field_inputs.get(0);
		 Description_Input = p.Textarea_Description_Field();
		 Product_Type_Input = Field_inputs.get(1);
		 Product_Category_Input = Field_inputs.get(2);
		 Product_Visibility_Input = Field_inputs.get(3);
		 Min_Quantity_Input = Field_inputs.get(4);
		 Max_Quantity_Input = Field_inputs.get(5);
		 Stock_Input = Field_inputs.get(6);
		 Default_SKU = Field_inputs.get(7);
		 Condition_treated_Input = Field_inputs.get(8);
		 Intro_Input = Field_inputs.get(9);
		 Default_Price_Input = Field_inputs.get(11);
		 Sales_Price_Input = Field_inputs.get(10);
		 Sales_Start_Date_Input = Field_inputs.get(12);
		 Sales_End_Date_Input = Field_inputs.get(13);
	}
	
	if(Field_inputs==null){
		WebElement Product_form = p.Form();
		List<WebElement> Fieldinputs = p.Product_Add_Form_Inputs(Product_form);
		 Product_Name_Input = Fieldinputs.get(0);
		 Description_Input = p.Textarea_Description_Field();
		 Product_Type_Input = Fieldinputs.get(1);
		 Product_Category_Input = Fieldinputs.get(2);
		 Product_Visibility_Input = Fieldinputs.get(3);
		 Min_Quantity_Input = Fieldinputs.get(4);
		 Max_Quantity_Input = Fieldinputs.get(5);
		 Stock_Input = Fieldinputs.get(6);
		 Default_SKU = Fieldinputs.get(7);
		 Condition_treated_Input = Fieldinputs.get(8);
		 Intro_Input = Fieldinputs.get(9);
		 Default_Price_Input = Fieldinputs.get(11);
		 Sales_Price_Input = Fieldinputs.get(10);
		 Sales_Start_Date_Input = Fieldinputs.get(12);
		 Sales_End_Date_Input = Fieldinputs.get(13);
	}
	
	Report_Listen.log_print_in_report().info("──────────────────── PRODUCT BASIC INFORMATION ────────────────────");
	System.out.println("──────────────────── PRODUCT BASIC INFORMATION ────────────────────");
	System.out.println();
	
	Product_Name_Input.sendKeys(Product_Name);
	
	Report_Listen.log_print_in_report().info("Product Name entered: " + Product_Name);
	System.out.println("🔹 Product Name entered: " + Product_Name);
	
	for(int n=0;n<10;n++) {
	Description_Input.sendKeys(Keys.SPACE);}
	
	Report_Listen.log_print_in_report().warning("⚠️ Invalid Value Entered | Field: Description | Value: [10 SPACE CHARACTERS]");
	System.out.println("⚠️ Invalid Value Entered | Field: Description | Value: [10 SPACE CHARACTERS]");
	System.out.println();
	
	Product_Type_Input.sendKeys(Product_Type);

	WebElement Prod_type_list = p.First_Virtual_List_holder();
	List<WebElement> Prod_type_list_options = Prod_type_list.findElements(By.xpath(".//*[contains(@class,'ant-select-item ant-select-item-option ant-select-item-option')]"));

	for(WebElement option : Prod_type_list_options) {

		if(option.getText().equals(Product_Type)) {

			option.click();

			Report_Listen.log_print_in_report().pass("✅ Product Type selected successfully: " + Product_Type);
			System.out.println("✅ Product Type selected successfully: " + Product_Type);
			System.out.println();

			break;
		}
	}
	
	Product_Category_Input.sendKeys(Category);

	WebElement Categories_type_list = p.Second_Virtual_List_holder();
	List<WebElement> Categories_type_list_options = Categories_type_list.findElements(By.xpath(".//*[contains(@class,'ant-select-item ant-select-item-option ant-select-item-option')]"));

	for(WebElement option : Categories_type_list_options) {

		if(option.getText().equals(Category)) {

			option.click();

			Report_Listen.log_print_in_report().pass("✅ Product Category selected successfully: " + Category);
			System.out.println("✅ Product Category selected successfully: " + Category);
			System.out.println();

			break;
		}
	}
	
	Product_Visibility_Input.sendKeys(Visibility);

	WebElement Product_Visibility_list = p.Thrid_Virtual_List_holder();
	List<WebElement> Product_Visibility_list_options = Product_Visibility_list.findElements(By.xpath(".//*[contains(@class,'ant-select-item ant-select-item-option ant-select-item-option')]"));

	for(WebElement Vis_option : Product_Visibility_list_options) {
		
		String Visibilty_Text = Vis_option.getText().trim();

		if(Visibilty_Text.contains(Visibility)) {

			Vis_option.click();

			Report_Listen.log_print_in_report().pass("✅ Product Visibility selected successfully: " + Visibility);
			System.out.println("✅ Product Visibility selected successfully: " + Visibility);
			System.out.println();

			break;
		}
	}
	
	Report_Listen.log_print_in_report().info("──────────────────── INVALID INVENTORY VALIDATION DATA ────────────────────");
	System.out.println("──────────────────── INVALID INVENTORY VALIDATION DATA ────────────────────");
	System.out.println();
	
	Min_Quantity_Input.sendKeys(Product_Name);
	
	Report_Listen.log_print_in_report().warning("⚠️ Invalid Value Entered | Field: Minimum Buy Quantity | Value: " + Product_Name);
	System.out.println("⚠️ Invalid Value Entered | Field: Minimum Buy Quantity | Value: " + Product_Name);
	
	Max_Quantity_Input.sendKeys(Category);
	
	Report_Listen.log_print_in_report().warning("⚠️ Invalid Value Entered | Field: Maximum Buy Quantity | Value: " + Category);
	System.out.println("⚠️ Invalid Value Entered | Field: Maximum Buy Quantity | Value: " + Category);
	
	Stock_Input.sendKeys(Visibility);
	
	Report_Listen.log_print_in_report().warning("⚠️ Invalid Value Entered | Field: Stock Count | Value: " + Visibility);
	System.out.println("⚠️ Invalid Value Entered | Field: Stock Count | Value: " + Visibility);
	System.out.println();
	
	if(Product_Type.equals("Prescription")) {

		Report_Listen.log_print_in_report().info("──────────────────── 🩺 PRESCRIPTION CONFIGURATION ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Configure Prescription Intake Form = " + Intake_Form);

		System.out.println("🩺 PRESCRIPTION CONFIGURATION");
		System.out.println();
		System.out.println("🔹 Configuring Prescription Intake Form: " + Intake_Form);
		System.out.println();

		WebElement Intake_Form_Input = p.Intake_form_field();
		Intake_Form_Input.sendKeys(Intake_Form);

		Report_Listen.log_print_in_report().pass("✅ Prescription Intake Form entered successfully.");
		System.out.println("✅ Prescription Intake Form entered successfully.");
		System.out.println();
	}
	
	Report_Listen.log_print_in_report().info("──────────────────── PRODUCT IDENTIFIER & CONDITION ────────────────────");
	System.out.println("──────────────────── PRODUCT IDENTIFIER & CONDITION ────────────────────");
	System.out.println();
	
	Default_SKU.sendKeys(Default_SKU_Identifier);
	
	Report_Listen.log_print_in_report().info("Default SKU / Identifier entered: " + Default_SKU_Identifier);
	System.out.println("🔹 Default SKU / Identifier entered: " + Default_SKU_Identifier);
	
	Condition_treated_Input.sendKeys(Condition_Treated);
	WebElement Condition_treated_list = p.Fourth_Virtual_List_holder();
	List<WebElement> Condition_treated_list_options = Condition_treated_list.findElements(By.xpath(".//*[contains(@class,'ant-select-item ant-select-item-option ant-select-item-option')]"));

	for(WebElement Condition_option : Condition_treated_list_options) {
		
		String Condition_option_text = Condition_option.getText().trim();

		if(Condition_option_text.equals(Condition_Treated)) {

			Condition_option.click();

			Report_Listen.log_print_in_report().pass("✅ Condition Treated selected successfully: " + Condition_Treated);
			System.out.println("✅ Condition Treated selected successfully: " + Condition_Treated);
			System.out.println();

			break;
		}}
	
	Report_Listen.log_print_in_report().info("──────────────────── INVALID PRICING VALIDATION DATA ────────────────────");
	System.out.println("──────────────────── INVALID PRICING VALIDATION DATA ────────────────────");
	System.out.println();
	
	Intro_Input.sendKeys(Condition_Treated);
	
	Report_Listen.log_print_in_report().warning("⚠️ Invalid Value Entered | Field: Intro Price | Value: " + Condition_Treated);
	System.out.println("⚠️ Invalid Value Entered | Field: Intro Price | Value: " + Condition_Treated);
	
	Default_Price_Input.sendKeys(Condition_Treated);
	
	Report_Listen.log_print_in_report().warning("⚠️ Invalid Value Entered | Field: Default Price | Value: " + Default_SKU_Identifier);
	System.out.println("⚠️ Invalid Value Entered | Field: Default Price | Value: " + Default_SKU_Identifier);
	
	Sales_Price_Input.sendKeys(Condition_Treated);
	
	Report_Listen.log_print_in_report().warning("⚠️ Invalid Value Entered | Field: Sale Price | Value: " + Default_SKU_Identifier);
	System.out.println("⚠️ Invalid Value Entered | Field: Sale Price | Value: " + Default_SKU_Identifier);
	System.out.println();
	
	Report_Listen.log_print_in_report().info("──────────────────── PRODUCT FORM SUBMISSION ────────────────────");
	Report_Listen.log_print_in_report().info("Submitting the Product form after completing negative validation data entry.");
	System.out.println("──────────────────── PRODUCT FORM SUBMISSION ────────────────────");
	System.out.println("🔹 Submitting the Product form after completing negative validation data entry.");
	System.out.println();
	
	rp.Scroll_to_element(Submit_Button);
	Thread.sleep(550);
	Submit_Button.click();

	WebElement Confirmation_Message = p.Success_Toast;
	Boolean Status = rp.check_element_visibility(Confirmation_Message, 3);

	if(Status!=true){
		
		Report_Listen.log_print_in_report().pass("✅ Product Add Form Validation is working successfully. Product was not created with invalid field values.");
		System.out.println("✅ Product Add Form Validation is working successfully. Product was not created with invalid field values.");
		System.out.println();
		TreeMap<String,String> Inline_Error_Data = Inline_Error_Checker();

		boolean Default_Price_Error_Found = false;

		for(Map.Entry<String,String> Error_Data : Inline_Error_Data.entrySet()){
			
			String Field_Name = Error_Data.getKey();
			String Error_Message = Error_Data.getValue();
			
			Report_Listen.log_print_in_report().info("Field: " + Field_Name + " | Inline Error: " + Error_Message);
			System.out.println("Field: " + Field_Name + " | Inline Error: " + Error_Message);
			System.out.println();
			
			if(Error_Message.trim().contains("Default Price is required")){
				
				Default_Price_Error_Found = true;
				
				Report_Listen.log_print_in_report().info("✅ Default Price validation error detected. Corrective action will be performed.");
				System.out.println("✅ Default Price validation error detected. Corrective action will be performed.");
				System.out.println();
				WebElement Default_Price_Field=d.findElement(By.xpath("//input[@id='default_price']"));
				rp.wait_for_theElement(Default_Price_Field);
				Default_Price_Field.click();
				Default_Price_Field.clear();
				Default_Price_Field.sendKeys(Default_Price);
				
				Report_Listen.log_print_in_report().pass("✅ Default Price field corrected successfully with value: " + Default_Price);
				System.out.println("✅ Default Price field corrected successfully with value: " + Default_Price);
				System.out.println();
				
				break;
			}
		}

		if(!Default_Price_Error_Found){
			
			Report_Listen.log_print_in_report().info("ℹ️ Default Price required validation error was not present.");
			System.out.println("ℹ️ Default Price required validation error was not present.");
			System.out.println();
			
		}
		rp.Scroll_to_element(p.Top_of_Product_form());
		Thread.sleep(800);
		WebElement Prod_name_Input = d.findElement(By.xpath("//input[@id='name']"));
		rp.wait_for_theElement(Prod_name_Input);
		Prod_name_Input.click();
		Prod_name_Input.clear();
		Description_Input.clear();
		Product_Type_Input.clear();
		Product_Category_Input.clear();
		Product_Visibility_Input.clear();
		Min_Quantity_Input.clear();
		Max_Quantity_Input.clear();
		Stock_Input.clear();
		Default_SKU.clear();
		Condition_treated_Input.clear();
		rp.Scroll_to_element(Intro_Input);
		Thread.sleep(800);
		Intro_Input.clear();
		Default_Price_Input.clear();
		Sales_Price_Input.clear();
		Sales_Start_Date_Input.clear();
	    Sales_End_Date_Input.clear(); 
		
		
	}
	else{
		
		Report_Listen.log_print_in_report().warning("⚠️ Product Add Form Validation is not working properly. Product was created despite invalid field values.");
		System.out.println("⚠️ Product Add Form Validation is not working properly. Product was created despite invalid field values.");
		System.out.println();
		
	}
	
	
	
}


public TreeMap<String,String> Inline_Error_Checker(){
	
	Product_Module_Locaters p = new Product_Module_Locaters(d);
	TreeMap<String,String> Inline_Error_Data = new TreeMap<String,String>();
	
	Report_Listen.log_print_in_report().info("========== INLINE ERROR VALIDATION STARTED ==========");
	System.out.println("========== INLINE ERROR VALIDATION STARTED ==========");
	System.out.println();
	
	List<WebElement> Asterix_feilds = p.Required_fields();
	List<WebElement> Inline_errors = p.InLine_Error_Messages();
	
	Report_Listen.log_print_in_report().info("Total Required Fields Found: " + Asterix_feilds.size());
	Report_Listen.log_print_in_report().info("Total Inline Error Messages Found: " + Inline_errors.size());
	System.out.println("Total Required Fields Found: " + Asterix_feilds.size());
	System.out.println("Total Inline Error Messages Found: " + Inline_errors.size());
	System.out.println();
	
	if(Asterix_feilds.size()==Inline_errors.size()){
		
		Report_Listen.log_print_in_report().pass("✅ Required field count and Inline Error count matched successfully.");
		System.out.println("✅ Required field count and Inline Error count matched successfully.");
		System.out.println();
		Report_Listen.log_print_in_report().pass("✅ Inline Error validation completed successfully for all required fields.");
		System.out.println();
		System.out.println("✅ Inline Error validation completed successfully for all required fields.");
		System.out.println();
		
	}
	else{
		
		Report_Listen.log_print_in_report().warning("⚠️ Required field count and Inline Error count mismatch. Required Fields: " + Asterix_feilds.size() + " | Inline Errors: " + Inline_errors.size());
		System.out.println("⚠️ Required field count and Inline Error count mismatch. Required Fields: " + Asterix_feilds.size() + " | Inline Errors: " + Inline_errors.size());
		System.out.println();
		
	}
	
	for(int m=0;m<Inline_errors.size();m++){
		
		String Label_Name = Asterix_feilds.get(m).getText().trim();
		String Error_Message = Inline_errors.get(m).getText().trim();
		
		Inline_Error_Data.put(Label_Name, Error_Message);
		
		Report_Listen.log_print_in_report().info("Required Field " + (m+1) + ": " + Label_Name + " | Inline Error: " + Error_Message);
		System.out.println("Required Field " + (m+1) + ": " + Label_Name + " | Inline Error: " + Error_Message);
		
	}
	
	Report_Listen.log_print_in_report().info("========== INLINE ERROR VALIDATION COMPLETED ==========");
	System.out.println("========== INLINE ERROR VALIDATION COMPLETED ==========");
	System.out.println();
	
	return Inline_Error_Data;
}




@Test(dataProvider="Product_Create_Data")
public void Product_Delete(TreeMap<String, String> Product_data) throws Exception {

	String Product_Name = Product_data.get("Product Name");

	Product_Module_Locaters p = new Product_Module_Locaters(d);

	try {

		Report_Listen.log_print_in_report().info("──────────────────── 🗑️ PRODUCT DELETION ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Scenario:</b> Search and delete a Product from the Product Module.");
		Report_Listen.log_print_in_report().info("<b>Input:</b> Product Name = " + Product_Name);
		Report_Listen.log_print_in_report().info("<b>Expected:</b> Matching Product should be located and deleted successfully.");

		System.out.println("🗑️ PRODUCT DELETION");
		System.out.println();
		System.out.println("🔹 Product Name: " + Product_Name);
		System.out.println();

		Report_Listen.log_print_in_report().info("──────────────────── 📦 PRODUCT MODULE ACCESS ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Access the Product Module before searching for the Product.");

		System.out.println("📦 PRODUCT MODULE ACCESS");
		System.out.println();
		System.out.println("🔹 Accessing Product Module.");
		System.out.println();

		Product_Module_Accessor();

		Report_Listen.log_print_in_report().pass("✅ Product Module accessed successfully.");
		System.out.println("✅ Product Module accessed successfully.");
		System.out.println();

		Report_Listen.log_print_in_report().info("──────────────────── 🔎 PRODUCT SEARCH ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Search for Product = " + Product_Name);

		System.out.println("🔎 PRODUCT SEARCH");
		System.out.println();
		System.out.println("🔹 Searching for Product: " + Product_Name);
		System.out.println();

		WebElement Product_Search = p.Search();
		Product_Search.sendKeys(Product_Name);

		Thread.sleep(1800);

		Report_Listen.log_print_in_report().pass("✅ Product search completed successfully.");
		System.out.println("✅ Product search completed successfully.");
		System.out.println();

		Report_Listen.log_print_in_report().info("──────────────────── 🗑️ DELETE PRODUCT ACTION ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Open the Product action menu and select Delete.");

		System.out.println("🗑️ DELETE PRODUCT ACTION");
		System.out.println();
		System.out.println("🔹 Selecting Delete from the Product action menu.");
		System.out.println();
		
		List<WebElement> ThreeDot_Buttons = p.Threedot_Button_in_list();

		Three_Dot_Menu_Option_Selector(ThreeDot_Buttons,"Delete");

		Report_Listen.log_print_in_report().pass("✅ Product deletion flow completed successfully for: " + Product_Name);
		System.out.println("✅ Product deletion flow completed successfully for: " + Product_Name);
		System.out.println();

	} catch(Exception e) {

		if(Report_Listen.log_print_in_report() != null) Report_Listen.log_print_in_report().fail("❌ Product deletion failed for '" + Product_Name + "'. Failure reason: " + e.getMessage());

		System.out.println("❌ Product deletion failed for: " + Product_Name);
		System.out.println();

		System.out.println("❌ Failure reason: " + e.getMessage());
		System.out.println();

		throw e;
	}
}


public void Three_Dot_Menu_Option_Selector(List<WebElement> Number_of_Button,String Option) throws Exception {

	Product_Module_Locaters p = new Product_Module_Locaters(d);

	String Option_to_be_selected = Option.trim();

	try {

		Report_Listen.log_print_in_report().info("──────────────────── ⋮ ACTION MENU SELECTION ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Open the three-dot action menu and select '" + Option_to_be_selected + "'.");

		System.out.println("⋮ ACTION MENU SELECTION");
		System.out.println();
		System.out.println("🔹 Opening three-dot menu and searching for option: " + Option_to_be_selected);
		System.out.println();

		List<WebElement> ThreeDot_Buttons = Number_of_Button;
        Main_loop:
		for(WebElement ThreeDot_Button : ThreeDot_Buttons) {

			WebElement Button = ThreeDot_Button;
			Button.click();

			WebElement Option_List = p.List_Dropdown_Menu();
			List<WebElement> Options = Option_List.findElements(By.xpath(".//li"));

			for(WebElement Option_Element : Options) {

				String Option_Text = Option_Element.getText().trim();

				if(Option_Text.equalsIgnoreCase(Option_to_be_selected)) {

					Report_Listen.log_print_in_report().info("<b>Action:</b> Select menu option = " + Option_to_be_selected);
					System.out.println("🔹 Selecting menu option: " + Option_to_be_selected);
					System.out.println();

					Option_Element.click();

					Report_Listen.log_print_in_report().pass("✅ " + Option_to_be_selected + " option selected successfully.");
					System.out.println("✅ " + Option_to_be_selected + " option selected successfully.");
					System.out.println();

					Report_Listen.log_print_in_report().info("──────────────────── ⚠️ ACTION CONFIRMATION ────────────────────");
					Report_Listen.log_print_in_report().info("<b>Action:</b> Confirm the '" + Option_to_be_selected + "' operation from the confirmation popup.");

					System.out.println("⚠️ ACTION CONFIRMATION");
					System.out.println();
					System.out.println("🔹 Confirming " + Option_to_be_selected + " operation.");
					System.out.println();

					WebElement Popup_Delete_button = p.Red_color_Button();
					Popup_Delete_button.click();

					Thread.sleep(800);

					Report_Listen.log_print_in_report().info("──────────────────── ✅ ACTION RESULT VERIFICATION ────────────────────");
					Report_Listen.log_print_in_report().info("<b>Action:</b> Capture and verify the success confirmation message.");

					System.out.println("✅ ACTION RESULT VERIFICATION");
					System.out.println();
					System.out.println("🔹 Verifying success confirmation message.");
					System.out.println();

					WebElement Confirmation_Message = p.Success_Toast();
					String Confirmation_Message_Text = Confirmation_Message.getText().trim();

					Report_Listen.log_print_in_report().pass("✅ Confirmation Message: " + Confirmation_Message_Text);
					System.out.println("✅ Confirmation message displayed: " + Confirmation_Message_Text);
					System.out.println();

					break Main_loop;
				}
			}
		}

	} catch(Exception e) {

		if(Report_Listen.log_print_in_report() != null) Report_Listen.log_print_in_report().fail("❌ Three-dot menu option selection failed for '" + Option_to_be_selected + "'. Failure reason: " + e.getMessage());

		System.out.println("❌ Three-dot menu option selection failed for: " + Option_to_be_selected);
		System.out.println();

		System.out.println("❌ Failure reason: " + e.getMessage());
		System.out.println();

		throw e;
	}
}






	
}
