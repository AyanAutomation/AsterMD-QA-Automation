package AsterMD.Project.AsterMD;

import java.util.List;
import java.util.TreeMap;
import java.util.stream.IntStream;

import com.aventstack.extentreports.ExtentTest;

import Listerners.Report_Listen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Locaters.Product_Module_Locaters;

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



@DataProvider(name="Category_Create_Data")
public Object[][] Category_Create_Data(){

	TreeMap<String, String> data1 = new TreeMap<String, String>();
	data1.put("Category Name", "Male Vascular Performance Support Products");
	data1.put("Drug Class / Code", "URO-MVP-301");
	data1.put("Description", "Clinical and supportive products intended for adult patients experiencing erectile dysfunction where vascular response, circulation, sexual performance, and associated health factors may require structured assessment. This category supports catalog products used within erectile-function care pathways that may involve medical evaluation, cardiovascular risk review, treatment suitability checks, and ongoing monitoring of patient response.");

	TreeMap<String, String> data2 = new TreeMap<String, String>();
	data2.put("Category Name", "Erectile Response Enhancement Care Products");
	data2.put("Drug Class / Code", "URO-ERE-302");
	data2.put("Description", "Products developed for erectile dysfunction management and related male sexual health support where improving erectile response and maintaining satisfactory sexual function are primary treatment goals. Items in this category may be used within clinically guided care programs that consider medical history, concurrent medications, cardiovascular status, and individual response to therapy.");

	TreeMap<String, String> data3 = new TreeMap<String, String>();
	data3.put("Category Name", "Male Intimate Function Management Products");
	data3.put("Drug Class / Code", "URO-MIF-303");
	data3.put("Description", "Therapeutic and supportive products associated with managing difficulties in male intimate function, particularly erectile dysfunction. This category is intended for catalog classification of products used after appropriate health screening and may support treatment pathways that evaluate symptom severity, underlying risk factors, medication interactions, and overall suitability for continued erectile-function management.");

	TreeMap<String, String> data4 = new TreeMap<String, String>();
	data4.put("Category Name", "Follicular Density Restoration Products");
	data4.put("Drug Class / Code", "DERM-FDR-304");
	data4.put("Description", "Hair-care and treatment products intended to support patients experiencing reduced follicular density, progressive thinning, or patterned hair loss. Products classified under this category may support preservation of existing hair, stimulation of follicular activity, and structured regrowth programs while allowing evaluation of scalp condition, hormonal influence, nutritional factors, and long-term treatment response.");

	TreeMap<String, String> data5 = new TreeMap<String, String>();
	data5.put("Category Name", "Androgenic Hair Loss Management Products");
	data5.put("Drug Class / Code", "DERM-AHL-305");
	data5.put("Description", "Products intended for the management of androgen-related hair thinning and progressive pattern hair loss in eligible patients. This category supports oral, topical, and supportive catalog products used within hair-restoration pathways that may involve assessment of progression pattern, family history, scalp health, hormonal contribution, treatment adherence, and expected long-term maintenance requirements.");

	TreeMap<String, String> data6 = new TreeMap<String, String>();
	data6.put("Category Name", "Scalp Regeneration and Hair Retention Products");
	data6.put("Drug Class / Code", "DERM-SRH-306");
	data6.put("Description", "Treatment and supportive products designed to encourage healthier scalp conditions, improve hair retention, and reduce progressive shedding in patients experiencing hair loss. Products within this category may be incorporated into structured regrowth programs that consider follicular health, nutritional status, hormonal factors, treatment consistency, and measurable changes in hair density over time.");

	TreeMap<String, String> data7 = new TreeMap<String, String>();
	data7.put("Category Name", "Growth Hormone Axis Support Products");
	data7.put("Drug Class / Code", "ENDO-GHA-307");
	data7.put("Description", "Specialized endocrine products associated with the management of clinically evaluated growth hormone deficiency and abnormalities of the growth hormone axis. This category supports therapies requiring structured physician supervision, hormone-level assessment, laboratory testing, dosage monitoring, evaluation of treatment effectiveness, and periodic review of metabolic and endocrine health indicators.");

	TreeMap<String, String> data8 = new TreeMap<String, String>();
	data8.put("Category Name", "Somatotropin Replacement Care Products");
	data8.put("Drug Class / Code", "ENDO-SRC-308");
	data8.put("Description", "Products intended for structured growth hormone replacement programs in patients with confirmed or clinically supported hormone deficiency. Items in this category may require regular endocrine evaluation, IGF-related laboratory monitoring, dosage adjustment, assessment of therapeutic response, and continued medical oversight to ensure appropriate treatment progression and safety.");

	TreeMap<String, String> data9 = new TreeMap<String, String>();
	data9.put("Category Name", "Endocrine Growth Restoration Products");
	data9.put("Drug Class / Code", "ENDO-EGR-309");
	data9.put("Description", "Endocrine treatment products designed to support restoration of inadequate growth hormone activity in eligible patients with documented deficiency. This category is suitable for catalog products managed through specialist treatment pathways that may include baseline hormone assessment, laboratory investigations, treatment-response monitoring, metabolic review, and long-term evaluation of endocrine function.");

	TreeMap<String, String> data10 = new TreeMap<String, String>();
	data10.put("Category Name", "Restorative Sleep Regulation Products");
	data10.put("Drug Class / Code", "SLEEP-RSR-310");
	data10.put("Description", "Products used within insomnia management pathways to support healthier sleep initiation, continuity, and restorative sleep quality. This category may include treatment options intended for patients experiencing persistent difficulty falling asleep or maintaining sleep, with consideration given to sleep behavior, medical history, contributing medications, lifestyle patterns, and ongoing response to treatment.");

	TreeMap<String, String> data11 = new TreeMap<String, String>();
	data11.put("Category Name", "Nighttime Sleep Continuity Products");
	data11.put("Drug Class / Code", "SLEEP-NSC-311");
	data11.put("Description", "Sleep-support products intended for patients who experience frequent nighttime awakenings, shortened sleep duration, or difficulty maintaining uninterrupted sleep. Products classified here may form part of structured insomnia care where sleep patterns, daytime functioning, medication history, contributing health conditions, and treatment effectiveness are periodically reviewed.");

	TreeMap<String, String> data12 = new TreeMap<String, String>();
	data12.put("Category Name", "Circadian Sleep Support and Recovery Products");
	data12.put("Drug Class / Code", "SLEEP-CSR-312");
	data12.put("Description", "Treatment and supportive products associated with improving sleep timing, sleep onset, and overall nighttime recovery in patients with insomnia-related difficulties. This category supports catalog items used within sleep-management programs that may consider circadian rhythm, behavioral factors, medication use, sleep duration, daytime impairment, and the patient's response to ongoing care.");

	TreeMap<String, String> data13 = new TreeMap<String, String>();
	data13.put("Category Name", "Emotional Resilience and Focus Support Products");
	data13.put("Drug Class / Code", "PSY-ERF-313");
	data13.put("Description", "Clinically managed products intended to support patients experiencing persistent low mood, diminished motivation, reduced concentration, or difficulty maintaining focus during daily activities. Products in this category may be used within broader mental-wellness pathways that consider symptom patterns, previous treatment response, emotional functioning, cognitive performance, and ongoing clinical monitoring.");

	TreeMap<String, String> data14 = new TreeMap<String, String>();
	data14.put("Category Name", "Cognitive Drive and Mood Balance Products");
	data14.put("Drug Class / Code", "PSY-CMB-314");
	data14.put("Description", "Products associated with treatment pathways for patients reporting reduced mental drive, persistent low mood, impaired focus, or difficulty maintaining productive concentration. This category supports catalog classification for clinically supervised options where symptom duration, functional impact, medication history, treatment response, and overall emotional wellbeing may be assessed.");

	TreeMap<String, String> data15 = new TreeMap<String, String>();
	data15.put("Category Name", "Mental Energy and Motivation Support Products");
	data15.put("Drug Class / Code", "PSY-MEM-315");
	data15.put("Description", "Therapeutic and supportive products intended for patients experiencing low motivation, reduced mental energy, persistent mood decline, or concentration-related difficulties. This category may be used for catalog items within structured mood and focus care programs involving assessment of daily functioning, symptom progression, previous treatment experience, and continued monitoring of clinical response.");

	TreeMap<String, String> data16 = new TreeMap<String, String>();
	data16.put("Category Name", "Androgen Restoration and Vitality Products");
	data16.put("Drug Class / Code", "ENDO-ARV-316");
	data16.put("Description", "Hormone-related products intended for adult patients with clinically assessed low testosterone where androgen restoration may be considered as part of a supervised treatment program. Products in this category may require testosterone measurements, symptom assessment, laboratory monitoring, periodic safety evaluation, and continued review of therapeutic effectiveness and hormonal balance.");

	TreeMap<String, String> data17 = new TreeMap<String, String>();
	data17.put("Category Name", "Male Endocrine Vitality Support Products");
	data17.put("Drug Class / Code", "ENDO-MEV-317");
	data17.put("Description", "Products associated with medical management of reduced testosterone levels and related symptoms affecting male hormonal wellbeing and vitality. This category supports therapies requiring appropriate endocrine assessment, laboratory confirmation, treatment-response monitoring, evaluation of hematological and metabolic indicators, and periodic clinical review during continued use.");

	TreeMap<String, String> data18 = new TreeMap<String, String>();
	data18.put("Category Name", "Testicular Hormone Support and Balance Products");
	data18.put("Drug Class / Code", "ENDO-THB-318");
	data18.put("Description", "Hormonal treatment and supportive products intended for clinically evaluated testosterone deficiency and related androgen imbalance in adult male patients. Products within this category may be managed through structured care pathways involving baseline hormone testing, symptom evaluation, laboratory follow-up, dosage review, safety monitoring, and assessment of long-term therapeutic outcomes.");

	TreeMap<String, String> data19 = new TreeMap<String, String>();
	data19.put("Category Name", "Metabolic Body Weight Optimization Products");
	data19.put("Drug Class / Code", "META-MWO-319");
	data19.put("Description", "Medical and supportive products intended to assist eligible patients with obesity in achieving sustainable body-weight reduction and improved metabolic health. This category may include products used alongside nutritional planning, physical activity, behavioral modification, laboratory assessment, monitoring of metabolic risk factors, and periodic review of treatment progress and weight-related outcomes.");

	TreeMap<String, String> data20 = new TreeMap<String, String>();
	data20.put("Category Name", "Obesity Metabolic Intervention Products");
	data20.put("Drug Class / Code", "META-OMI-320");
	data20.put("Description", "Products used within medically supervised obesity-management programs aimed at supporting weight reduction, improving metabolic risk profiles, and helping patients maintain healthier long-term weight outcomes. This category may support treatment pathways involving dietary modification, physical activity planning, metabolic laboratory assessment, monitoring of treatment tolerance, and regular evaluation of overall weight-management progress.");

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

	TreeMap<String, String> data1 = new TreeMap<String, String>();
	data1.put("Product Name", "AsterErecta Vardenafil Response Tablets");
	data1.put("Description", "Synthetic vardenafil-based product created for validating standard erectile dysfunction catalog configuration, category mapping, inventory, pricing, and quantity controls.");
	data1.put("Product Image", "");
	data1.put("Product Type", "Standard");
	data1.put("Category", "Men's Sexual Health Therapies");
	data1.put("Visibility", "Public");
	data1.put("Minimum Buy Quantity", "1");
	data1.put("Maximum Buy Quantity", "2");
	data1.put("Stock Count", "86");
	data1.put("Intake Form", "");
	data1.put("Default SKU / Identifier", "AST-STD-ED-201");
	data1.put("Condition Treated", "Erectile Dysfunction");
	data1.put("Restrict Multiple Active Prescriptions", "No");
	data1.put("Pricing Type", "Single Item");
	data1.put("Intro Price", "27.00");
	data1.put("Default Price", "108.00");
	data1.put("Sale Price", "94.00");
	data1.put("Sale Start Date", "09/01/2026");
	data1.put("Sales End Date", "10/01/2026");
	data1.put("Lab Test", "No");

	TreeMap<String, String> data2 = new TreeMap<String, String>();
	data2.put("Product Name", "AsterErecta Avanafil Rapid Response Tablets");
	data2.put("Description", "Synthetic avanafil-based standard catalog product designed for erectile dysfunction workflow testing with product classification, pricing, availability, and stock validation.");
	data2.put("Product Image", "");
	data2.put("Product Type", "Standard");
	data2.put("Category", "Men's Sexual Health Therapies");
	data2.put("Visibility", "Public");
	data2.put("Minimum Buy Quantity", "1");
	data2.put("Maximum Buy Quantity", "2");
	data2.put("Stock Count", "79");
	data2.put("Intake Form", "");
	data2.put("Default SKU / Identifier", "AST-STD-ED-202");
	data2.put("Condition Treated", "Erectile Dysfunction");
	data2.put("Restrict Multiple Active Prescriptions", "No");
	data2.put("Pricing Type", "Single Item");
	data2.put("Intro Price", "31.00");
	data2.put("Default Price", "124.00");
	data2.put("Sale Price", "109.00");
	data2.put("Sale Start Date", "09/02/2026");
	data2.put("Sales End Date", "10/02/2026");
	data2.put("Lab Test", "No");

	TreeMap<String, String> data3 = new TreeMap<String, String>();
	data3.put("Product Name", "AsterErecta Sildenafil Flex Support Tablets");
	data3.put("Description", "Synthetic sildenafil-based standard product generated for validating erectile dysfunction catalog records, purchasing quantities, category association, stock, and promotional pricing.");
	data3.put("Product Image", "");
	data3.put("Product Type", "Standard");
	data3.put("Category", "Men's Sexual Health Therapies");
	data3.put("Visibility", "Public");
	data3.put("Minimum Buy Quantity", "1");
	data3.put("Maximum Buy Quantity", "3");
	data3.put("Stock Count", "91");
	data3.put("Intake Form", "");
	data3.put("Default SKU / Identifier", "AST-STD-ED-203");
	data3.put("Condition Treated", "Erectile Dysfunction");
	data3.put("Restrict Multiple Active Prescriptions", "No");
	data3.put("Pricing Type", "Single Item");
	data3.put("Intro Price", "25.00");
	data3.put("Default Price", "99.00");
	data3.put("Sale Price", "86.00");
	data3.put("Sale Start Date", "09/03/2026");
	data3.put("Sales End Date", "10/03/2026");
	data3.put("Lab Test", "No");

	TreeMap<String, String> data4 = new TreeMap<String, String>();
	data4.put("Product Name", "AsterRoot Minoxidil Follicle Solution");
	data4.put("Description", "Synthetic minoxidil topical standard product for validating hair loss catalog creation, stock management, category mapping, purchase limits, and sale pricing.");
	data4.put("Product Image", "");
	data4.put("Product Type", "Standard");
	data4.put("Category", "Hair Loss and Regrowth Therapies");
	data4.put("Visibility", "Public");
	data4.put("Minimum Buy Quantity", "1");
	data4.put("Maximum Buy Quantity", "3");
	data4.put("Stock Count", "142");
	data4.put("Intake Form", "");
	data4.put("Default SKU / Identifier", "AST-STD-HL-204");
	data4.put("Condition Treated", "Hair Loss");
	data4.put("Restrict Multiple Active Prescriptions", "No");
	data4.put("Pricing Type", "Single Item");
	data4.put("Intro Price", "18.00");
	data4.put("Default Price", "61.00");
	data4.put("Sale Price", "52.00");
	data4.put("Sale Start Date", "09/04/2026");
	data4.put("Sales End Date", "10/04/2026");
	data4.put("Lab Test", "No");

	TreeMap<String, String> data5 = new TreeMap<String, String>();
	data5.put("Product Name", "AsterRoot Finasteride Follicle Support Tablets");
	data5.put("Description", "Synthetic finasteride-based standard catalog product created for validating hair loss treatment classification, SKU uniqueness, inventory, quantities, and pricing behavior.");
	data5.put("Product Image", "");
	data5.put("Product Type", "Standard");
	data5.put("Category", "Hair Loss and Regrowth Therapies");
	data5.put("Visibility", "Public");
	data5.put("Minimum Buy Quantity", "1");
	data5.put("Maximum Buy Quantity", "2");
	data5.put("Stock Count", "118");
	data5.put("Intake Form", "");
	data5.put("Default SKU / Identifier", "AST-STD-HL-205");
	data5.put("Condition Treated", "Hair Loss");
	data5.put("Restrict Multiple Active Prescriptions", "No");
	data5.put("Pricing Type", "Single Item");
	data5.put("Intro Price", "21.00");
	data5.put("Default Price", "76.00");
	data5.put("Sale Price", "66.00");
	data5.put("Sale Start Date", "09/05/2026");
	data5.put("Sales End Date", "10/05/2026");
	data5.put("Lab Test", "No");

	TreeMap<String, String> data6 = new TreeMap<String, String>();
	data6.put("Product Name", "AsterEndo Somatropin Growth Support Pen");
	data6.put("Description", "Synthetic somatropin-based standard catalog product for testing growth hormone deficiency product configuration, laboratory association, inventory, quantities, and pricing.");
	data6.put("Product Image", "");
	data6.put("Product Type", "Standard");
	data6.put("Category", "Growth Hormone Replacement Therapies");
	data6.put("Visibility", "Public");
	data6.put("Minimum Buy Quantity", "1");
	data6.put("Maximum Buy Quantity", "1");
	data6.put("Stock Count", "38");
	data6.put("Intake Form", "");
	data6.put("Default SKU / Identifier", "AST-STD-HGH-206");
	data6.put("Condition Treated", "HGH Deficiency");
	data6.put("Restrict Multiple Active Prescriptions", "No");
	data6.put("Pricing Type", "Single Item");
	data6.put("Intro Price", "135.00");
	data6.put("Default Price", "875.00");
	data6.put("Sale Price", "795.00");
	data6.put("Sale Start Date", "09/06/2026");
	data6.put("Sales End Date", "10/06/2026");
	data6.put("Lab Test", "Yes");

	TreeMap<String, String> data7 = new TreeMap<String, String>();
	data7.put("Product Name", "AsterEndo Somatrogon Weekly Support Pen");
	data7.put("Description", "Synthetic long-acting somatrogon standard product generated for validating HGH deficiency catalog classification, laboratory requirements, stock, and single-item pricing.");
	data7.put("Product Image", "");
	data7.put("Product Type", "Standard");
	data7.put("Category", "Growth Hormone Replacement Therapies");
	data7.put("Visibility", "Public");
	data7.put("Minimum Buy Quantity", "1");
	data7.put("Maximum Buy Quantity", "1");
	data7.put("Stock Count", "29");
	data7.put("Intake Form", "");
	data7.put("Default SKU / Identifier", "AST-STD-HGH-207");
	data7.put("Condition Treated", "HGH Deficiency");
	data7.put("Restrict Multiple Active Prescriptions", "No");
	data7.put("Pricing Type", "Single Item");
	data7.put("Intro Price", "164.00");
	data7.put("Default Price", "1095.00");
	data7.put("Sale Price", "985.00");
	data7.put("Sale Start Date", "09/07/2026");
	data7.put("Sales End Date", "10/07/2026");
	data7.put("Lab Test", "Yes");

	TreeMap<String, String> data8 = new TreeMap<String, String>();
	data8.put("Product Name", "AsterEndo Somatropin FlexPro Support Therapy");
	data8.put("Description", "Synthetic growth hormone support product created for validating standard HGH deficiency product setup, category selection, inventory limits, laboratory flagging, and pricing.");
	data8.put("Product Image", "");
	data8.put("Product Type", "Standard");
	data8.put("Category", "Growth Hormone Replacement Therapies");
	data8.put("Visibility", "Public");
	data8.put("Minimum Buy Quantity", "1");
	data8.put("Maximum Buy Quantity", "2");
	data8.put("Stock Count", "33");
	data8.put("Intake Form", "");
	data8.put("Default SKU / Identifier", "AST-STD-HGH-208");
	data8.put("Condition Treated", "HGH Deficiency");
	data8.put("Restrict Multiple Active Prescriptions", "No");
	data8.put("Pricing Type", "Single Item");
	data8.put("Intro Price", "152.00");
	data8.put("Default Price", "998.00");
	data8.put("Sale Price", "899.00");
	data8.put("Sale Start Date", "09/08/2026");
	data8.put("Sales End Date", "10/08/2026");
	data8.put("Lab Test", "Yes");

	TreeMap<String, String> data9 = new TreeMap<String, String>();
	data9.put("Product Name", "AsterRest Suvorexant Night Support Tablets");
	data9.put("Description", "Synthetic suvorexant-based standard product for validating insomnia catalog configuration, category mapping, inventory availability, quantities, and scheduled pricing.");
	data9.put("Product Image", "");
	data9.put("Product Type", "Standard");
	data9.put("Category", "Sleep Disorder Prescription Therapies");
	data9.put("Visibility", "Public");
	data9.put("Minimum Buy Quantity", "1");
	data9.put("Maximum Buy Quantity", "2");
	data9.put("Stock Count", "72");
	data9.put("Intake Form", "");
	data9.put("Default SKU / Identifier", "AST-STD-INS-209");
	data9.put("Condition Treated", "Insomnia");
	data9.put("Restrict Multiple Active Prescriptions", "No");
	data9.put("Pricing Type", "Single Item");
	data9.put("Intro Price", "34.00");
	data9.put("Default Price", "132.00");
	data9.put("Sale Price", "117.00");
	data9.put("Sale Start Date", "09/09/2026");
	data9.put("Sales End Date", "10/09/2026");
	data9.put("Lab Test", "No");

	TreeMap<String, String> data10 = new TreeMap<String, String>();
	data10.put("Product Name", "AsterRest Eszopiclone Sleep Cycle Tablets");
	data10.put("Description", "Synthetic eszopiclone-based standard catalog product created for testing insomnia treatment mapping, stock control, SKU configuration, and sale price handling.");
	data10.put("Product Image", "");
	data10.put("Product Type", "Standard");
	data10.put("Category", "Sleep Disorder Prescription Therapies");
	data10.put("Visibility", "Public");
	data10.put("Minimum Buy Quantity", "1");
	data10.put("Maximum Buy Quantity", "2");
	data10.put("Stock Count", "67");
	data10.put("Intake Form", "");
	data10.put("Default SKU / Identifier", "AST-STD-INS-210");
	data10.put("Condition Treated", "Insomnia");
	data10.put("Restrict Multiple Active Prescriptions", "No");
	data10.put("Pricing Type", "Single Item");
	data10.put("Intro Price", "29.00");
	data10.put("Default Price", "112.00");
	data10.put("Sale Price", "98.00");
	data10.put("Sale Start Date", "09/10/2026");
	data10.put("Sales End Date", "10/10/2026");
	data10.put("Lab Test", "No");

	TreeMap<String, String> data11 = new TreeMap<String, String>();
	data11.put("Product Name", "AsterRest Zaleplon Sleep Onset Tablets");
	data11.put("Description", "Synthetic zaleplon-based standard product generated for validating sleep disorder catalog records, insomnia condition assignment, inventory, purchase limits, and pricing.");
	data11.put("Product Image", "");
	data11.put("Product Type", "Standard");
	data11.put("Category", "Sleep Disorder Prescription Therapies");
	data11.put("Visibility", "Public");
	data11.put("Minimum Buy Quantity", "1");
	data11.put("Maximum Buy Quantity", "2");
	data11.put("Stock Count", "83");
	data11.put("Intake Form", "");
	data11.put("Default SKU / Identifier", "AST-STD-INS-211");
	data11.put("Condition Treated", "Insomnia");
	data11.put("Restrict Multiple Active Prescriptions", "No");
	data11.put("Pricing Type", "Single Item");
	data11.put("Intro Price", "23.00");
	data11.put("Default Price", "91.00");
	data11.put("Sale Price", "79.00");
	data11.put("Sale Start Date", "09/11/2026");
	data11.put("Sales End Date", "10/11/2026");
	data11.put("Lab Test", "No");

	TreeMap<String, String> data12 = new TreeMap<String, String>();
	data12.put("Product Name", "AsterClarity Escitalopram Balance Tablets");
	data12.put("Description", "Synthetic escitalopram-based standard product for validating low mood and focus catalog mapping, product visibility, inventory, quantities, and pricing configuration.");
	data12.put("Product Image", "");
	data12.put("Product Type", "Standard");
	data12.put("Category", "Mood and Focus Support Therapies");
	data12.put("Visibility", "Public");
	data12.put("Minimum Buy Quantity", "1");
	data12.put("Maximum Buy Quantity", "2");
	data12.put("Stock Count", "96");
	data12.put("Intake Form", "");
	data12.put("Default SKU / Identifier", "AST-STD-MF-212");
	data12.put("Condition Treated", "Low Mood / Focus");
	data12.put("Restrict Multiple Active Prescriptions", "No");
	data12.put("Pricing Type", "Single Item");
	data12.put("Intro Price", "20.00");
	data12.put("Default Price", "78.00");
	data12.put("Sale Price", "67.00");
	data12.put("Sale Start Date", "09/12/2026");
	data12.put("Sales End Date", "10/12/2026");
	data12.put("Lab Test", "No");

	TreeMap<String, String> data13 = new TreeMap<String, String>();
	data13.put("Product Name", "AsterClarity Fluoxetine Mood Support Capsules");
	data13.put("Description", "Synthetic fluoxetine-based standard catalog product designed for validating low mood and focus condition mapping, SKU uniqueness, inventory, and promotional pricing.");
	data13.put("Product Image", "");
	data13.put("Product Type", "Standard");
	data13.put("Category", "Mood and Focus Support Therapies");
	data13.put("Visibility", "Public");
	data13.put("Minimum Buy Quantity", "1");
	data13.put("Maximum Buy Quantity", "3");
	data13.put("Stock Count", "104");
	data13.put("Intake Form", "");
	data13.put("Default SKU / Identifier", "AST-STD-MF-213");
	data13.put("Condition Treated", "Low Mood / Focus");
	data13.put("Restrict Multiple Active Prescriptions", "No");
	data13.put("Pricing Type", "Single Item");
	data13.put("Intro Price", "18.00");
	data13.put("Default Price", "72.00");
	data13.put("Sale Price", "62.00");
	data13.put("Sale Start Date", "09/13/2026");
	data13.put("Sales End Date", "10/13/2026");
	data13.put("Lab Test", "No");

	TreeMap<String, String> data14 = new TreeMap<String, String>();
	data14.put("Product Name", "AsterClarity Venlafaxine Focus Balance Tablets");
	data14.put("Description", "Synthetic venlafaxine-based standard product generated for validating mood and focus catalog setup, category association, purchasing controls, stock, and sale pricing.");
	data14.put("Product Image", "");
	data14.put("Product Type", "Standard");
	data14.put("Category", "Mood and Focus Support Therapies");
	data14.put("Visibility", "Public");
	data14.put("Minimum Buy Quantity", "1");
	data14.put("Maximum Buy Quantity", "2");
	data14.put("Stock Count", "87");
	data14.put("Intake Form", "");
	data14.put("Default SKU / Identifier", "AST-STD-MF-214");
	data14.put("Condition Treated", "Low Mood / Focus");
	data14.put("Restrict Multiple Active Prescriptions", "No");
	data14.put("Pricing Type", "Single Item");
	data14.put("Intro Price", "26.00");
	data14.put("Default Price", "103.00");
	data14.put("Sale Price", "89.00");
	data14.put("Sale Start Date", "09/14/2026");
	data14.put("Sales End Date", "10/14/2026");
	data14.put("Lab Test", "No");

	TreeMap<String, String> data15 = new TreeMap<String, String>();
	data15.put("Product Name", "AsterAndroCore Testosterone Undecanoate Support");
	data15.put("Description", "Synthetic testosterone undecanoate standard product created for validating low testosterone catalog configuration, laboratory requirement, stock, quantities, and pricing.");
	data15.put("Product Image", "");
	data15.put("Product Type", "Standard");
	data15.put("Category", "Testosterone Replacement Therapies");
	data15.put("Visibility", "Public");
	data15.put("Minimum Buy Quantity", "1");
	data15.put("Maximum Buy Quantity", "1");
	data15.put("Stock Count", "46");
	data15.put("Intake Form", "");
	data15.put("Default SKU / Identifier", "AST-STD-LT-215");
	data15.put("Condition Treated", "Low Testosterone");
	data15.put("Restrict Multiple Active Prescriptions", "No");
	data15.put("Pricing Type", "Single Item");
	data15.put("Intro Price", "62.00");
	data15.put("Default Price", "248.00");
	data15.put("Sale Price", "224.00");
	data15.put("Sale Start Date", "09/15/2026");
	data15.put("Sales End Date", "10/15/2026");
	data15.put("Lab Test", "Yes");

	TreeMap<String, String> data16 = new TreeMap<String, String>();
	data16.put("Product Name", "AsterAndroCore Testosterone Enanthate Support");
	data16.put("Description", "Synthetic testosterone enanthate standard catalog product for validating low testosterone treatment mapping, laboratory association, inventory, SKU, and pricing.");
	data16.put("Product Image", "");
	data16.put("Product Type", "Standard");
	data16.put("Category", "Testosterone Replacement Therapies");
	data16.put("Visibility", "Public");
	data16.put("Minimum Buy Quantity", "1");
	data16.put("Maximum Buy Quantity", "1");
	data16.put("Stock Count", "51");
	data16.put("Intake Form", "");
	data16.put("Default SKU / Identifier", "AST-STD-LT-216");
	data16.put("Condition Treated", "Low Testosterone");
	data16.put("Restrict Multiple Active Prescriptions", "No");
	data16.put("Pricing Type", "Single Item");
	data16.put("Intro Price", "57.00");
	data16.put("Default Price", "229.00");
	data16.put("Sale Price", "205.00");
	data16.put("Sale Start Date", "09/16/2026");
	data16.put("Sales End Date", "10/16/2026");
	data16.put("Lab Test", "Yes");

	TreeMap<String, String> data17 = new TreeMap<String, String>();
	data17.put("Product Name", "AsterAndroCore Testosterone Nasal Gel");
	data17.put("Description", "Synthetic testosterone nasal gel standard product generated for testing low testosterone catalog classification, laboratory flagging, inventory, and scheduled pricing.");
	data17.put("Product Image", "");
	data17.put("Product Type", "Standard");
	data17.put("Category", "Testosterone Replacement Therapies");
	data17.put("Visibility", "Public");
	data17.put("Minimum Buy Quantity", "1");
	data17.put("Maximum Buy Quantity", "2");
	data17.put("Stock Count", "58");
	data17.put("Intake Form", "");
	data17.put("Default SKU / Identifier", "AST-STD-LT-217");
	data17.put("Condition Treated", "Low Testosterone");
	data17.put("Restrict Multiple Active Prescriptions", "No");
	data17.put("Pricing Type", "Single Item");
	data17.put("Intro Price", "49.00");
	data17.put("Default Price", "198.00");
	data17.put("Sale Price", "177.00");
	data17.put("Sale Start Date", "09/17/2026");
	data17.put("Sales End Date", "10/17/2026");
	data17.put("Lab Test", "Yes");

	TreeMap<String, String> data18 = new TreeMap<String, String>();
	data18.put("Product Name", "AsterLean Orlistat Weight Control Capsules");
	data18.put("Description", "Synthetic orlistat-based standard product created for validating obesity catalog configuration, medical weight-management category assignment, stock, and pricing.");
	data18.put("Product Image", "");
	data18.put("Product Type", "Standard");
	data18.put("Category", "Medical Weight Management Therapies");
	data18.put("Visibility", "Public");
	data18.put("Minimum Buy Quantity", "1");
	data18.put("Maximum Buy Quantity", "2");
	data18.put("Stock Count", "92");
	data18.put("Intake Form", "");
	data18.put("Default SKU / Identifier", "AST-STD-OB-218");
	data18.put("Condition Treated", "Obesity");
	data18.put("Restrict Multiple Active Prescriptions", "No");
	data18.put("Pricing Type", "Single Item");
	data18.put("Intro Price", "38.00");
	data18.put("Default Price", "154.00");
	data18.put("Sale Price", "137.00");
	data18.put("Sale Start Date", "09/18/2026");
	data18.put("Sales End Date", "10/18/2026");
	data18.put("Lab Test", "Yes");

	TreeMap<String, String> data19 = new TreeMap<String, String>();
	data19.put("Product Name", "AsterLean Naltrexone Bupropion Weight Support");
	data19.put("Description", "Synthetic combination weight-management standard product generated for obesity catalog testing, inventory controls, laboratory association, and promotional pricing.");
	data19.put("Product Image", "");
	data19.put("Product Type", "Standard");
	data19.put("Category", "Medical Weight Management Therapies");
	data19.put("Visibility", "Public");
	data19.put("Minimum Buy Quantity", "1");
	data19.put("Maximum Buy Quantity", "2");
	data19.put("Stock Count", "73");
	data19.put("Intake Form", "");
	data19.put("Default SKU / Identifier", "AST-STD-OB-219");
	data19.put("Condition Treated", "Obesity");
	data19.put("Restrict Multiple Active Prescriptions", "No");
	data19.put("Pricing Type", "Single Item");
	data19.put("Intro Price", "44.00");
	data19.put("Default Price", "179.00");
	data19.put("Sale Price", "159.00");
	data19.put("Sale Start Date", "09/19/2026");
	data19.put("Sales End Date", "10/19/2026");
	data19.put("Lab Test", "Yes");

	TreeMap<String, String> data20 = new TreeMap<String, String>();
	data20.put("Product Name", "AsterLean Phentermine Topiramate Balance Capsules");
	data20.put("Description", "Synthetic combination standard product created for validating obesity condition mapping, weight-management catalog configuration, stock availability, and sale pricing.");
	data20.put("Product Image", "");
	data20.put("Product Type", "Standard");
	data20.put("Category", "Medical Weight Management Therapies");
	data20.put("Visibility", "Public");
	data20.put("Minimum Buy Quantity", "1");
	data20.put("Maximum Buy Quantity", "1");
	data20.put("Stock Count", "61");
	data20.put("Intake Form", "");
	data20.put("Default SKU / Identifier", "AST-STD-OB-220");
	data20.put("Condition Treated", "Obesity");
	data20.put("Restrict Multiple Active Prescriptions", "No");
	data20.put("Pricing Type", "Single Item");
	data20.put("Intro Price", "52.00");
	data20.put("Default Price", "207.00");
	data20.put("Sale Price", "184.00");
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

		Thread.sleep(1200);

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
              
			Thread.sleep(800);
			Report_Listen.log_print_in_report().warning("⚠️ Initial Product form input retrieval failed. Retrying field retrieval.");
			System.out.println("⚠️ Initial Product form input retrieval failed. Retrying.");
			System.out.println();

			Inputs = p.Product_Add_Form_Inputs(Product_form);
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
		Report_Listen.log_print_in_report().info("<b>Action:</b> Enter Product Name and Product Description.");

		System.out.println("✏️ PRODUCT BASIC DETAILS");
		System.out.println();
		System.out.println("🔹 Step " + step + ": Entering Product Name and Description.");
		System.out.println();

		Product_Name_Input.sendKeys(Product_Name);
		Description_Input.sendKeys(Description);

		Report_Listen.log_print_in_report().pass("✅ Product Name and Description entered successfully.");
		System.out.println("✅ Product Name and Description entered successfully.");
		System.out.println();

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

		step++;

		Report_Listen.log_print_in_report().info("──────────────────── 👁️ PRODUCT VISIBILITY ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Select Product Visibility = " + Visibility);

		System.out.println("👁️ PRODUCT VISIBILITY");
		System.out.println();
		System.out.println("🔹 Selecting Product Visibility: " + Visibility);
		System.out.println();

		Product_Visibility_Input.sendKeys(Visibility);

		WebElement Product_Visibility_list = p.Thrid_Virtual_List_holder();
		List<WebElement> Product_Visibility_list_options = Product_Visibility_list.findElements(By.xpath(".//*[contains(@class,'ant-select-item ant-select-item-option ant-select-item-option')]"));

		for(WebElement option : Product_Visibility_list_options) {

			if(option.getText().equals(Visibility)) {

				option.click();

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

		Sales_Start_Date_Input.sendKeys(Sale_Start_Date);
		p.Today_Button_Calender(0).click();

		System.out.println("🔹 Entering Sale End Date: " + Sales_End_Date);
		System.out.println();

		Sales_End_Date_Input.sendKeys(Sales_End_Date);
		p.Today_Button_Calender(1).click();

		Report_Listen.log_print_in_report().pass("✅ Product Sale dates configured successfully.");
		System.out.println("✅ Product Sale dates configured successfully.");
		System.out.println();

		step++;

		Report_Listen.log_print_in_report().info("──────────────────── 💾 PRODUCT SAVE & VERIFICATION ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Save the Product and verify the success confirmation message.");

		System.out.println("💾 PRODUCT SAVE & VERIFICATION");
		System.out.println();
		System.out.println("🔹 Saving the Product.");
		System.out.println();

		WebElement Submit_Button = p.Product_Save_Button();
		Submit_Button.click();

		WebElement Confirmation_Message = p.Success_Toast();
		String Confirmation_Message_Text = Confirmation_Message.getText().trim();

		Report_Listen.log_print_in_report().pass("✅ Confirmation Message: " + Confirmation_Message_Text);
		System.out.println("✅ Confirmation message displayed: " + Confirmation_Message_Text);
		System.out.println();

		Report_Listen.log_print_in_report().pass("✅ Product creation completed successfully for Product: " + Product_Name);
		System.out.println("✅ Product creation completed successfully for Product: " + Product_Name);
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

					break;
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
