package AsterMD.Project.AsterMD;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.NoSuchElementException;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.IntStream;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;

import Listerners.Report_Listen;
import Locaters.Channel_Module_Locaters;
import Locaters.Product_Module_Locaters;
import Repeatative_codes.Repeat;



public class Channels_Module extends Patient_Module{
	
	public WebElement Channel_Module_Accessor() throws Exception {

	Channel_Module_Locaters p = new Channel_Module_Locaters(d);

	System.out.println();
	System.out.println("---------------- CHANNEL MODULE ----------------");
	System.out.println("Action : Open Channels module");

	Report_Listen.log_print_in_report().info("---------------- CHANNEL MODULE ----------------");
	Report_Listen.log_print_in_report().info("Action: Open Channels module");

	Side_Menu_Navigation("Channels");

	WebElement Add_Button = p.Channel_Add_Button();

	System.out.println("Result : PASS");
	System.out.println();

	Report_Listen.log_print_in_report().pass("Result: PASS - Channels module opened successfully.");

	return Add_Button;
}
	
	
	
@DataProvider
public Object[][] Channel_Create_Data() {

	TreeMap<String, String> data1 = new TreeMap<String, String>();
	data1.put("Channel Name", "RheinCare Public API");
	data1.put("Access Rule", "Allow access from any IP address");
	data1.put("API Contact Email", "rheincare.public.api@yopmail.com");

	TreeMap<String, String> data2 = new TreeMap<String, String>();
	data2.put("Channel Name", "RheinCare Partner Integration API");
	data2.put("Access Rule", "Allow access from whitelisted IP addresses only");
	data2.put("Whitelist IP Address 1", "192.0.2.10");
	data2.put("Whitelist IP Address 2", "198.51.100.25");
	data2.put("Whitelist IP Address 3", "203.0.113.15");
	data2.put("Whitelist IP Address 4", "192.0.2.26");
	data2.put("Whitelist IP Address 5", "198.51.100.37");
	data2.put("Whitelist IP Address 6", "203.0.113.48");
	data2.put("Whitelist IP Address 7", "192.0.2.59");
	data2.put("Whitelist IP Address 8", "198.51.100.70");
	data2.put("Whitelist IP Address 9", "203.0.113.81");
	data2.put("Whitelist IP Address 10", "192.0.2.92");
	data2.put("Whitelist IP Address 11", "198.51.100.103");
	data2.put("Whitelist IP Address 12", "203.0.113.114");
	data2.put("API Contact Email", "rheincare.partner.integration@yopmail.com");

	TreeMap<String, String> data3 = new TreeMap<String, String>();
	data3.put("Channel Name", "RheinCare Mobile App API");
	data3.put("Access Rule", "Allow access from whitelisted IP addresses only");
	data3.put("Whitelist IP Address 1", "203.0.113.50");
	data3.put("Whitelist IP Address 2", "203.0.113.51");
	data3.put("Whitelist IP Address 3", "203.0.113.52");
	data3.put("Whitelist IP Address 4", "203.0.113.53");
	data3.put("Whitelist IP Address 5", "203.0.113.54");
	data3.put("Whitelist IP Address 6", "203.0.113.55");
	data3.put("Whitelist IP Address 7", "203.0.113.56");
	data3.put("Whitelist IP Address 8", "203.0.113.57");
	data3.put("Whitelist IP Address 9", "203.0.113.58");
	data3.put("Whitelist IP Address 10", "203.0.113.59");
	data3.put("Whitelist IP Address 11", "203.0.113.60");
	data3.put("Whitelist IP Address 12", "203.0.113.61");
	data3.put("API Contact Email", "rheincare.mobile.app@yopmail.com");

	TreeMap<String, String> data4 = new TreeMap<String, String>();
	data4.put("Channel Name", "RheinCare Web Portal API");
	data4.put("Access Rule", "Allow access from any IP address");
	data4.put("API Contact Email", "rheincare.web.portal@yopmail.com");

	TreeMap<String, String> data5 = new TreeMap<String, String>();
	data5.put("Channel Name", "RheinCare Telehealth API");
	data5.put("Access Rule", "Allow access from whitelisted IP addresses only");
	data5.put("Whitelist IP Address 1", "192.0.2.0/28");
	data5.put("Whitelist IP Address 2", "198.51.100.0/30");
	data5.put("Whitelist IP Address 3", "203.0.113.0/29");
	data5.put("Whitelist IP Address 4", "192.0.2.32/28");
	data5.put("Whitelist IP Address 5", "198.51.100.32/29");
	data5.put("Whitelist IP Address 6", "203.0.113.32/28");
	data5.put("Whitelist IP Address 7", "192.0.2.64/29");
	data5.put("Whitelist IP Address 8", "198.51.100.64/28");
	data5.put("Whitelist IP Address 9", "203.0.113.64/30");
	data5.put("Whitelist IP Address 10", "192.0.2.96/28");
	data5.put("Whitelist IP Address 11", "198.51.100.96/29");
	data5.put("Whitelist IP Address 12", "203.0.113.96/28");
	data5.put("API Contact Email", "rheincare.telehealth@yopmail.com");

	TreeMap<String, String> data6 = new TreeMap<String, String>();
	data6.put("Channel Name", "RheinCare Internal Services API");
	data6.put("Access Rule", "Allow access from whitelisted IP addresses only");
	data6.put("Whitelist IP Address 1", "2001:db8:100::10");
	data6.put("Whitelist IP Address 2", "2001:db8:100::11");
	data6.put("Whitelist IP Address 3", "2001:db8:100::12");
	data6.put("Whitelist IP Address 4", "2001:db8:100::13");
	data6.put("Whitelist IP Address 5", "2001:db8:100::14");
	data6.put("Whitelist IP Address 6", "2001:db8:100::15");
	data6.put("Whitelist IP Address 7", "2001:db8:100::16");
	data6.put("Whitelist IP Address 8", "2001:db8:100::17");
	data6.put("Whitelist IP Address 9", "2001:db8:100::18");
	data6.put("Whitelist IP Address 10", "2001:db8:100::19");
	data6.put("Whitelist IP Address 11", "2001:db8:100::20");
	data6.put("Whitelist IP Address 12", "2001:db8:100::21");
	data6.put("API Contact Email", "rheincare.internal.services@yopmail.com");

	TreeMap<String, String> data7 = new TreeMap<String, String>();
	data7.put("Channel Name", "RheinCare Analytics API");
	data7.put("Access Rule", "Allow access from whitelisted IP addresses only");
	data7.put("Whitelist IP Address 1", "2001:db8:200::/64");
	data7.put("Whitelist IP Address 2", "192.0.2.128/29");
	data7.put("Whitelist IP Address 3", "198.51.100.128/28");
	data7.put("Whitelist IP Address 4", "203.0.113.128/29");
	data7.put("Whitelist IP Address 5", "2001:db8:201::/64");
	data7.put("Whitelist IP Address 6", "192.0.2.144/28");
	data7.put("Whitelist IP Address 7", "198.51.100.144/29");
	data7.put("Whitelist IP Address 8", "203.0.113.144/28");
	data7.put("Whitelist IP Address 9", "2001:db8:202::/64");
	data7.put("Whitelist IP Address 10", "192.0.2.160/29");
	data7.put("Whitelist IP Address 11", "198.51.100.160/28");
	data7.put("Whitelist IP Address 12", "203.0.113.160/29");
	data7.put("API Contact Email", "rheincare.analytics@yopmail.com");

	TreeMap<String, String> data8 = new TreeMap<String, String>();
	data8.put("Channel Name", "RheinCare Doctor Network API");
	data8.put("Access Rule", "Allow access from any IP address");
	data8.put("API Contact Email", "rheincare.doctor.network@yopmail.com");

	TreeMap<String, String> data9 = new TreeMap<String, String>();
	data9.put("Channel Name", "RheinCare Order Management API");
	data9.put("Access Rule", "Allow access from whitelisted IP addresses only");
	data9.put("Whitelist IP Address 1", "198.51.100.80");
	data9.put("Whitelist IP Address 2", "198.51.100.81");
	data9.put("Whitelist IP Address 3", "198.51.100.82");
	data9.put("Whitelist IP Address 4", "2001:db8:300::20");
	data9.put("Whitelist IP Address 5", "192.0.2.180");
	data9.put("Whitelist IP Address 6", "203.0.113.181");
	data9.put("Whitelist IP Address 7", "198.51.100.182");
	data9.put("Whitelist IP Address 8", "2001:db8:300::21");
	data9.put("Whitelist IP Address 9", "192.0.2.183");
	data9.put("Whitelist IP Address 10", "203.0.113.184");
	data9.put("Whitelist IP Address 11", "198.51.100.185");
	data9.put("Whitelist IP Address 12", "2001:db8:300::22");
	data9.put("API Contact Email", "rheincare.order.management@yopmail.com");

	TreeMap<String, String> data10 = new TreeMap<String, String>();
	data10.put("Channel Name", "RheinCare Secure Client API");
	data10.put("Access Rule", "Allow access from whitelisted IP addresses only");
	data10.put("Whitelist IP Address 1", "192.0.2.200");
	data10.put("Whitelist IP Address 2", "192.0.2.201");
	data10.put("Whitelist IP Address 3", "203.0.113.0/29");
	data10.put("Whitelist IP Address 4", "2001:db8:400::/64");
	data10.put("Whitelist IP Address 5", "198.51.100.202");
	data10.put("Whitelist IP Address 6", "203.0.113.203");
	data10.put("Whitelist IP Address 7", "192.0.2.204");
	data10.put("Whitelist IP Address 8", "2001:db8:401::/64");
	data10.put("Whitelist IP Address 9", "198.51.100.205");
	data10.put("Whitelist IP Address 10", "203.0.113.206");
	data10.put("Whitelist IP Address 11", "192.0.2.207");
	data10.put("Whitelist IP Address 12", "2001:db8:402::/64");
	data10.put("API Contact Email", "rheincare.secure.client@yopmail.com");

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
		{ data10 } 
	};
}	
	
@DataProvider
public Object[][] FAQ_Section_Create_Data(){

	TreeMap<String, String> data1 = new TreeMap<String, String>();
	data1.put("Section Count", "3");

	data1.put("Section 1 Group Name", "Account and Login");
	data1.put("Section 1 Icon", "User");
	data1.put("Section 1 Group Description", "Common questions about creating an account, signing in, passwords, verification, and accessing the patient portal.");
	data1.put("Section 1 Question Count", "6");
	data1.put("Section 1 Question 1", "How do I create a patient portal account?");
	data1.put("Section 1 Answer 1", "Use the registration option provided by your healthcare organization and complete the required personal information.");
	data1.put("Section 1 Question 2", "How do I log in to my account?");
	data1.put("Section 1 Answer 2", "Enter your registered email address and password on the patient portal login page.");
	data1.put("Section 1 Question 3", "What should I do if I forgot my password?");
	data1.put("Section 1 Answer 3", "Select Forgot Password and follow the instructions sent to your registered email address.");
	data1.put("Section 1 Question 4", "Why am I unable to log in?");
	data1.put("Section 1 Answer 4", "Check that your email and password are correct and confirm that your account is active.");
	data1.put("Section 1 Question 5", "What happens if my account becomes locked?");
	data1.put("Section 1 Answer 5", "Follow the account recovery instructions or contact the support team for assistance.");
	data1.put("Section 1 Question 6", "Who should I contact for account access problems?");
	data1.put("Section 1 Answer 6", "Contact the patient portal support team when normal account recovery options do not resolve the issue.");

	data1.put("Section 2 Group Name", "Profile and Personal Information");
	data1.put("Section 2 Icon", "User");
	data1.put("Section 2 Group Description", "Information about managing personal details, contact information, addresses, and patient profile settings.");
	data1.put("Section 2 Question Count", "5");
	data1.put("Section 2 Question 1", "How can I update my personal information?");
	data1.put("Section 2 Answer 1", "Open your profile settings and edit the personal information fields that are available.");
	data1.put("Section 2 Question 2", "How can I update my phone number?");
	data1.put("Section 2 Answer 2", "Edit your phone number from the contact information section of your profile.");
	data1.put("Section 2 Question 3", "How do I change my home address?");
	data1.put("Section 2 Answer 3", "Open your profile and update the address fields with your current information.");
	data1.put("Section 2 Question 4", "Why can I not edit some profile fields?");
	data1.put("Section 2 Answer 4", "Certain information may be restricted and require assistance from the healthcare organization.");
	data1.put("Section 2 Question 5", "Do I need to save after editing my profile?");
	data1.put("Section 2 Answer 5", "Yes, use the available save or update action to apply your changes.");

	data1.put("Section 3 Group Name", "Appointments");
	data1.put("Section 3 Icon", "User");
	data1.put("Section 3 Group Description", "Questions about scheduling, reviewing, rescheduling, and managing healthcare appointments.");
	data1.put("Section 3 Question Count", "5");
	data1.put("Section 3 Question 1", "How do I schedule an appointment?");
	data1.put("Section 3 Answer 1", "Use the appointment scheduling option available in your patient portal.");
	data1.put("Section 3 Question 2", "How can I view my upcoming appointments?");
	data1.put("Section 3 Answer 2", "Open the appointments section to review your scheduled visits.");
	data1.put("Section 3 Question 3", "Can I reschedule an appointment?");
	data1.put("Section 3 Answer 3", "Use the reschedule option when it is available for the selected appointment.");
	data1.put("Section 3 Question 4", "How do I cancel an appointment?");
	data1.put("Section 3 Answer 4", "Open the appointment details and select the cancellation option if permitted.");
	data1.put("Section 3 Question 5", "Who should I contact for scheduling assistance?");
	data1.put("Section 3 Answer 5", "Contact the healthcare organization when you cannot complete scheduling through the portal.");


	TreeMap<String, String> data2 = new TreeMap<String, String>();
	data2.put("Section Count", "3");

	data2.put("Section 1 Group Name", "Telehealth Visits");
	data2.put("Section 1 Icon", "User");
	data2.put("Section 1 Group Description", "Information about online consultations, virtual appointments, connection requirements, and telehealth visits.");
	data2.put("Section 1 Question Count", "6");
	data2.put("Section 1 Question 1", "What is a telehealth visit?");
	data2.put("Section 1 Answer 1", "A telehealth visit allows you to meet with an authorized healthcare provider remotely.");
	data2.put("Section 1 Question 2", "How do I join my telehealth appointment?");
	data2.put("Section 1 Answer 2", "Open the scheduled appointment and use the available join option.");
	data2.put("Section 1 Question 3", "What device can I use?");
	data2.put("Section 1 Answer 3", "Use a supported computer, tablet, or mobile device with internet access.");
	data2.put("Section 1 Question 4", "Do I need a camera?");
	data2.put("Section 1 Answer 4", "Video appointments generally require a functioning camera when video consultation is used.");
	data2.put("Section 1 Question 5", "What happens if my internet disconnects?");
	data2.put("Section 1 Answer 5", "Reconnect to the visit or follow the communication instructions provided by your care team.");
	data2.put("Section 1 Question 6", "What should I do if the telehealth visit fails?");
	data2.put("Section 1 Answer 6", "Contact your care team or technical support using the available portal support options.");

	data2.put("Section 2 Group Name", "Prescriptions and Medications");
	data2.put("Section 2 Icon", "User");
	data2.put("Section 2 Group Description", "Patient questions related to prescriptions, medication information, treatment instructions, and active medications.");
	data2.put("Section 2 Question Count", "6");
	data2.put("Section 2 Question 1", "Where can I see my active prescriptions?");
	data2.put("Section 2 Answer 1", "Open the prescriptions or medications section of your patient portal.");
	data2.put("Section 2 Question 2", "How do I know if a prescription is active?");
	data2.put("Section 2 Answer 2", "Check the status displayed with the prescription details.");
	data2.put("Section 2 Question 3", "Can I request a refill?");
	data2.put("Section 2 Answer 3", "Use the refill option when it is available for your prescription.");
	data2.put("Section 2 Question 4", "Why is my prescription pending?");
	data2.put("Section 2 Answer 4", "A pending prescription may still require clinical review, approval, or processing.");
	data2.put("Section 2 Question 5", "Can I have multiple active prescriptions?");
	data2.put("Section 2 Answer 5", "This depends on the products, treatment rules, and clinical decisions associated with your care.");
	data2.put("Section 2 Question 6", "Who can approve my prescription?");
	data2.put("Section 2 Answer 6", "Prescription approval is handled by an appropriately authorized healthcare provider.");

	data2.put("Section 3 Group Name", "Pharmacy and Refills");
	data2.put("Section 3 Icon", "User");
	data2.put("Section 3 Group Description", "Information about pharmacy selection, prescription processing, medication refills, and pharmacy-related status.");
	data2.put("Section 3 Question Count", "5");
	data2.put("Section 3 Question 1", "How do I select a pharmacy?");
	data2.put("Section 3 Answer 1", "Choose an available pharmacy through the pharmacy selection option in your portal.");
	data2.put("Section 3 Question 2", "Can I change my pharmacy?");
	data2.put("Section 3 Answer 2", "You can change the selected pharmacy when the portal allows pharmacy updates.");
	data2.put("Section 3 Question 3", "How do I request a medication refill?");
	data2.put("Section 3 Answer 3", "Open the eligible prescription and select the available refill option.");
	data2.put("Section 3 Question 4", "Why is my refill unavailable?");
	data2.put("Section 3 Answer 4", "The prescription may not currently be eligible for another refill.");
	data2.put("Section 3 Question 5", "Who should I contact about pharmacy problems?");
	data2.put("Section 3 Answer 5", "Contact the pharmacy or your healthcare team based on the type of issue.");


	TreeMap<String, String> data3 = new TreeMap<String, String>();
	data3.put("Section Count", "3");

	data3.put("Section 1 Group Name", "Orders and Delivery");
	data3.put("Section 1 Icon", "User");
	data3.put("Section 1 Group Description", "Questions related to patient orders, order status, shipping information, delivery addresses, and tracking.");
	data3.put("Section 1 Question Count", "5");
	data3.put("Section 1 Question 1", "Where can I see my orders?");
	data3.put("Section 1 Answer 1", "Open the orders section of your patient portal.");
	data3.put("Section 1 Question 2", "How do I check my order status?");
	data3.put("Section 1 Answer 2", "The current status is displayed within your order details.");
	data3.put("Section 1 Question 3", "Can I track my shipment?");
	data3.put("Section 1 Answer 3", "Tracking information may become available after an order has shipped.");
	data3.put("Section 1 Question 4", "Can I change my delivery address?");
	data3.put("Section 1 Answer 4", "Address changes depend on the current order processing stage.");
	data3.put("Section 1 Question 5", "What should I do if my package is delayed?");
	data3.put("Section 1 Answer 5", "Review tracking information and contact support when additional assistance is needed.");

	data3.put("Section 2 Group Name", "Payments and Billing");
	data3.put("Section 2 Icon", "User");
	data3.put("Section 2 Group Description", "Common questions about payments, charges, billing status, payment methods, and transaction information.");
	data3.put("Section 2 Question Count", "5");
	data3.put("Section 2 Question 1", "How do I pay for an order?");
	data3.put("Section 2 Answer 1", "Use an available payment method during the patient checkout process.");
	data3.put("Section 2 Question 2", "Which payment methods are accepted?");
	data3.put("Section 2 Answer 2", "Available payment methods are displayed during checkout.");
	data3.put("Section 2 Question 3", "How do I know whether payment succeeded?");
	data3.put("Section 2 Answer 3", "Check the payment or order status shown after the transaction.");
	data3.put("Section 2 Question 4", "Why did my payment fail?");
	data3.put("Section 2 Answer 4", "Confirm the payment information and contact your payment provider when necessary.");
	data3.put("Section 2 Question 5", "Who can help with billing questions?");
	data3.put("Section 2 Answer 5", "Contact the billing or patient support team for transaction-related assistance.");

	data3.put("Section 3 Group Name", "Insurance and Coverage");
	data3.put("Section 3 Icon", "User");
	data3.put("Section 3 Group Description", "Information about insurance details, healthcare coverage, eligibility information, and patient insurance records.");
	data3.put("Section 3 Question Count", "5");
	data3.put("Section 3 Question 1", "Can I add insurance information?");
	data3.put("Section 3 Answer 1", "Enter insurance information when insurance fields are available in your patient account.");
	data3.put("Section 3 Question 2", "How do I update my insurance?");
	data3.put("Section 3 Answer 2", "Use the available insurance management section or contact support.");
	data3.put("Section 3 Question 3", "How do I know if my treatment is covered?");
	data3.put("Section 3 Answer 3", "Coverage depends on your insurance plan and the services being provided.");
	data3.put("Section 3 Question 4", "Can I pay without insurance?");
	data3.put("Section 3 Answer 4", "Self-payment options depend on the services and payment methods available.");
	data3.put("Section 3 Question 5", "Where can I ask insurance questions?");
	data3.put("Section 3 Answer 5", "Contact your insurer or the appropriate healthcare billing support team.");


	TreeMap<String, String> data4 = new TreeMap<String, String>();
	data4.put("Section Count", "3");

	data4.put("Section 1 Group Name", "Lab Tests");
	data4.put("Section 1 Icon", "User");
	data4.put("Section 1 Group Description", "Questions covering laboratory tests, test methods, appointments, results, processing, and patient lab information.");
	data4.put("Section 1 Question Count", "6");
	data4.put("Section 1 Question 1", "Where can I see my laboratory tests?");
	data4.put("Section 1 Answer 1", "Open the lab tests section of your patient portal.");
	data4.put("Section 1 Question 2", "What is a walk-in lab test?");
	data4.put("Section 1 Answer 2", "A walk-in test is completed at the designated laboratory location.");
	data4.put("Section 1 Question 3", "What is a home visit lab test?");
	data4.put("Section 1 Answer 3", "A home visit test involves sample collection at an eligible patient location.");
	data4.put("Section 1 Question 4", "What is a test kit?");
	data4.put("Section 1 Answer 4", "A test kit provides materials required for the configured sample collection process.");
	data4.put("Section 1 Question 5", "Where can I see lab results?");
	data4.put("Section 1 Answer 5", "Results may appear in the patient portal after they are released.");
	data4.put("Section 1 Question 6", "Who should I contact about a lab test?");
	data4.put("Section 1 Answer 6", "Contact the relevant laboratory or healthcare support team for assistance.");

	data4.put("Section 2 Group Name", "Home Test Kits");
	data4.put("Section 2 Icon", "User");
	data4.put("Section 2 Group Description", "Information regarding patient test kits, kit delivery, sample collection, return procedures, and test-kit status.");
	data4.put("Section 2 Question Count", "5");
	data4.put("Section 2 Question 1", "How do I receive my test kit?");
	data4.put("Section 2 Answer 1", "The kit will follow the delivery process configured for the selected laboratory test.");
	data4.put("Section 2 Question 2", "What is included in the kit?");
	data4.put("Section 2 Answer 2", "Kit contents depend on the specific test and required sample.");
	data4.put("Section 2 Question 3", "How do I use the test kit?");
	data4.put("Section 2 Answer 3", "Follow the collection instructions supplied with the kit.");
	data4.put("Section 2 Question 4", "How do I return my sample?");
	data4.put("Section 2 Answer 4", "Follow the return or shipping instructions supplied with the test kit.");
	data4.put("Section 2 Question 5", "Who do I contact about my kit?");
	data4.put("Section 2 Answer 5", "Use the available patient support channel for kit-related assistance.");

	data4.put("Section 3 Group Name", "Medical Records");
	data4.put("Section 3 Icon", "User");
	data4.put("Section 3 Group Description", "Questions related to viewing patient records, clinical history, documents, medical information, and record access.");
	data4.put("Section 3 Question Count", "5");
	data4.put("Section 3 Question 1", "Where can I view my medical records?");
	data4.put("Section 3 Answer 1", "Open the medical records or health information section of your portal.");
	data4.put("Section 3 Question 2", "Can I download my records?");
	data4.put("Section 3 Answer 2", "Downloading is available when this functionality is enabled.");
	data4.put("Section 3 Question 3", "Can I see my treatment history?");
	data4.put("Section 3 Answer 3", "Available treatment history may appear within your patient record.");
	data4.put("Section 3 Question 4", "What should I do if a record is incorrect?");
	data4.put("Section 3 Answer 4", "Contact your healthcare organization to report information that may require correction.");
	data4.put("Section 3 Question 5", "Who can help me obtain a medical record?");
	data4.put("Section 3 Answer 5", "Contact your healthcare organization's patient records or support team.");


	TreeMap<String, String> data5 = new TreeMap<String, String>();
	data5.put("Section Count", "4");

	data5.put("Section 1 Group Name", "Treatment Plans");
	data5.put("Section 1 Icon", "User");
	data5.put("Section 1 Group Description", "Information regarding patient treatment plans, treatment status, recommendations, follow-up, and ongoing care.");
	data5.put("Section 1 Question Count", "5");
	data5.put("Section 1 Question 1", "Where can I see my treatment plan?");
	data5.put("Section 1 Answer 1", "Open the treatment section of your patient account when a plan has been assigned.");
	data5.put("Section 1 Question 2", "Who creates my treatment plan?");
	data5.put("Section 1 Answer 2", "An authorized healthcare provider determines the appropriate treatment plan.");
	data5.put("Section 1 Question 3", "Can my treatment plan change?");
	data5.put("Section 1 Answer 3", "Your provider may adjust treatment based on clinical review and your response.");
	data5.put("Section 1 Question 4", "Can treatment require laboratory tests?");
	data5.put("Section 1 Answer 4", "Your provider may require laboratory testing when appropriate for the treatment.");
	data5.put("Section 1 Question 5", "Who should I contact about my treatment?");
	data5.put("Section 1 Answer 5", "Contact your assigned healthcare team for treatment-specific questions.");

	data5.put("Section 2 Group Name", "Intake Forms and Health Questions");
	data5.put("Section 2 Icon", "User");
	data5.put("Section 2 Group Description", "Guidance for completing patient intake forms, health questionnaires, required questions, answers, and submission.");
	data5.put("Section 2 Question Count", "5");
	data5.put("Section 2 Question 1", "Why do I need to complete an intake form?");
	data5.put("Section 2 Answer 1", "The form collects information needed for appropriate clinical evaluation.");
	data5.put("Section 2 Question 2", "Do I have to answer every question?");
	data5.put("Section 2 Answer 2", "Questions marked as required must be completed before submission.");
	data5.put("Section 2 Question 3", "Why are additional questions appearing?");
	data5.put("Section 2 Answer 3", "Some questions may appear based on answers you provided earlier.");
	data5.put("Section 2 Question 4", "What happens after I submit the form?");
	data5.put("Section 2 Answer 4", "The submitted information becomes available for the next configured step in your care.");
	data5.put("Section 2 Question 5", "Who should I contact about an intake form?");
	data5.put("Section 2 Answer 5", "Contact your healthcare team or patient portal support for assistance.");

	data5.put("Section 3 Group Name", "Privacy and Security");
	data5.put("Section 3 Icon", "User");
	data5.put("Section 3 Group Description", "Questions about account protection, privacy, secure access, sessions, passwords, and protecting patient information.");
	data5.put("Section 3 Question Count", "6");
	data5.put("Section 3 Question 1", "How is my patient account protected?");
	data5.put("Section 3 Answer 1", "Use your account only through authorized portal access and keep your credentials private.");
	data5.put("Section 3 Question 2", "Should I share my password?");
	data5.put("Section 3 Answer 2", "No, do not share your patient portal password with unauthorized individuals.");
	data5.put("Section 3 Question 3", "Why does the portal automatically log me out?");
	data5.put("Section 3 Answer 3", "Automatic logout helps protect your information after periods of inactivity.");
	data5.put("Section 3 Question 4", "What should I do if my password is exposed?");
	data5.put("Section 3 Answer 4", "Change your password immediately and review your account activity.");
	data5.put("Section 3 Question 5", "How do I report a security problem?");
	data5.put("Section 3 Answer 5", "Contact the authorized patient portal support channel immediately.");
	data5.put("Section 3 Question 6", "Why is portal security important?");
	data5.put("Section 3 Answer 6", "The patient portal contains sensitive personal and healthcare information that requires protected access.");

	data5.put("Section 4 Group Name", "Notifications and Messages");
	data5.put("Section 4 Icon", "User");
	data5.put("Section 4 Group Description", "Information related to patient notifications, email alerts, reminders, healthcare messages, and communication preferences.");
	data5.put("Section 4 Question Count", "5");
	data5.put("Section 4 Question 1", "Where can I see my notifications?");
	data5.put("Section 4 Answer 1", "Open the notifications area available in your patient portal.");
	data5.put("Section 4 Question 2", "Can I receive appointment reminders?");
	data5.put("Section 4 Answer 2", "Appointment reminders may be sent when enabled.");
	data5.put("Section 4 Question 3", "Can I receive prescription updates?");
	data5.put("Section 4 Answer 3", "Prescription status notifications may be available according to your portal settings.");
	data5.put("Section 4 Question 4", "Where can I read provider messages?");
	data5.put("Section 4 Answer 4", "Open the patient messaging or communication area if available.");
	data5.put("Section 4 Question 5", "Who should I contact if notifications do not work?");
	data5.put("Section 4 Answer 5", "Contact patient portal support if your configured notifications are consistently unavailable.");


	TreeMap<String, String> data6 = new TreeMap<String, String>();
	data6.put("Section Count", "4");

	data6.put("Section 1 Group Name", "Cancellations and Refunds");
	data6.put("Section 1 Icon", "User");
	data6.put("Section 1 Group Description", "Information regarding cancellation requests, orders, appointments, refunds, payment reversals, and refund status.");
	data6.put("Section 1 Question Count", "5");
	data6.put("Section 1 Question 1", "Can I cancel an order?");
	data6.put("Section 1 Answer 1", "Order cancellation depends on whether fulfillment has already started.");
	data6.put("Section 1 Question 2", "How do I request a refund?");
	data6.put("Section 1 Answer 2", "Use the applicable support process for the order or payment.");
	data6.put("Section 1 Question 3", "Can every order be refunded?");
	data6.put("Section 1 Answer 3", "Refund eligibility depends on the applicable product, order, and fulfillment conditions.");
	data6.put("Section 1 Question 4", "Why is my refund still pending?");
	data6.put("Section 1 Answer 4", "The refund may still be processing through the applicable payment system.");
	data6.put("Section 1 Question 5", "Who should I contact regarding a refund?");
	data6.put("Section 1 Answer 5", "Contact the patient billing or support team for refund-related assistance.");

	data6.put("Section 2 Group Name", "Technical Support");
	data6.put("Section 2 Icon", "User");
	data6.put("Section 2 Group Description", "Help for common technical problems involving browsers, portal pages, mobile devices, forms, loading issues, and account functionality.");
	data6.put("Section 2 Question Count", "6");
	data6.put("Section 2 Question 1", "What should I do if the portal does not load?");
	data6.put("Section 2 Answer 1", "Check your internet connection and refresh the page before trying again.");
	data6.put("Section 2 Question 2", "Can I use the portal on my phone?");
	data6.put("Section 2 Answer 2", "Yes, when the patient portal supports mobile browser access.");
	data6.put("Section 2 Question 3", "Why can I not submit a form?");
	data6.put("Section 2 Answer 3", "Check for required fields, validation messages, and connection problems.");
	data6.put("Section 2 Question 4", "Why was I logged out unexpectedly?");
	data6.put("Section 2 Answer 4", "Your session may have expired because of inactivity or another security condition.");
	data6.put("Section 2 Question 5", "What information should I provide when reporting a bug?");
	data6.put("Section 2 Answer 5", "Describe the problem, affected page, action performed, and any displayed error message.");
	data6.put("Section 2 Question 6", "How do I contact technical support?");
	data6.put("Section 2 Answer 6", "Use the patient portal support option provided by your healthcare organization.");

	data6.put("Section 3 Group Name", "Care Team and Providers");
	data6.put("Section 3 Icon", "User");
	data6.put("Section 3 Group Description", "Questions about healthcare providers, assigned care teams, provider communication, consultations, and clinical support.");
	data6.put("Section 3 Question Count", "5");
	data6.put("Section 3 Question 1", "Where can I see my healthcare provider?");
	data6.put("Section 3 Answer 1", "Provider information may be displayed within your appointments or treatment details.");
	data6.put("Section 3 Question 2", "How do I contact my provider?");
	data6.put("Section 3 Answer 2", "Use the communication options provided within your patient portal.");
	data6.put("Section 3 Question 3", "Who approves my treatment?");
	data6.put("Section 3 Answer 3", "An appropriately authorized healthcare provider handles clinical treatment decisions.");
	data6.put("Section 3 Question 4", "Can I schedule a follow-up with my provider?");
	data6.put("Section 3 Answer 4", "Use available appointment scheduling options for eligible follow-up visits.");
	data6.put("Section 3 Question 5", "What if I cannot contact my provider?");
	data6.put("Section 3 Answer 5", "Use another available care-team or patient support communication option.");

	data6.put("Section 4 Group Name", "Patient Portal General Help");
	data6.put("Section 4 Icon", "User");
	data6.put("Section 4 Group Description", "General patient portal questions covering navigation, available services, account usage, patient information, and common portal actions.");
	data6.put("Section 4 Question Count", "5");
	data6.put("Section 4 Question 1", "What can I do in the patient portal?");
	data6.put("Section 4 Answer 1", "Available functionality may include managing healthcare information, treatments, orders, appointments, and communications.");
	data6.put("Section 4 Question 2", "Where is the patient dashboard?");
	data6.put("Section 4 Answer 2", "The dashboard is generally displayed after successfully signing in.");
	data6.put("Section 4 Question 3", "How do I navigate between portal sections?");
	data6.put("Section 4 Answer 3", "Use the available menu or navigation controls.");
	data6.put("Section 4 Question 4", "Why are some features unavailable?");
	data6.put("Section 4 Answer 4", "Features may depend on your account, treatment, healthcare organization, and portal configuration.");
	data6.put("Section 4 Question 5", "Where can I get additional portal help?");
	data6.put("Section 4 Answer 5", "Use the patient support information provided by your healthcare organization.");

	return new Object[][] {
		{ data1 },
		{ data2 },
		{ data3 },
		{ data4 },
		{ data5 },
		{ data6 }
	};
}

@DataProvider
public Object[][] Patient_Portal_Combined_Data(){

	Object[][] Patient_Portal_datas = Patient_Portal_Create_Data();
	Object[][] FAQ_Section_datas = FAQ_Section_Create_Data();

	int n = IntStream.of(Patient_Portal_datas.length, FAQ_Section_datas.length).min().orElse(0);

	Object[][] combined_data = new Object[n][2];

	int i = 0;
	while(i < n){

		combined_data[i][0] = Patient_Portal_datas[i][0]; // Patient Portal Create and Configuration Data
		combined_data[i][1] = FAQ_Section_datas[i][0]; // Patient Portal FAQ Section Data

		i++;
	}

	return combined_data;
}
	

@Test(dataProvider="Channel_Create_Data")
public void Channel_Add(TreeMap<String, String> Channel_data) throws Exception{
		
	Channel_Module_Locaters p = new Channel_Module_Locaters(d);
	Repeat rp = new Repeat(d);
		
	String Channel_Name = Channel_data.get("Channel Name");
	String Access_Rule = Channel_data.get("Access Rule");
	String API_Contact_Mail = Channel_data.get("API Contact Email");
	
	System.out.println();
	System.out.println("============================================================");
	System.out.println("                    CHANNEL CREATION");
	System.out.println("============================================================");
	System.out.println("Channel Name : " + Channel_Name);
	System.out.println("Access Rule  : " + Access_Rule);
	System.out.println("API Email    : " + API_Contact_Mail);
	System.out.println();

	Report_Listen.log_print_in_report().info("---------------- CHANNEL CREATION ----------------");
	Report_Listen.log_print_in_report().info("Channel Name: " + Channel_Name);
	Report_Listen.log_print_in_report().info("Access Rule: " + Access_Rule);
	Report_Listen.log_print_in_report().info("API Contact Email: " + API_Contact_Mail);
	
	WebElement Channel_Add_Button = Channel_Module_Accessor();
	Channel_Add_Button.click();
	
	System.out.println("---------------- CHANNEL TYPE ----------------");
	System.out.println("Action : Select API Channel");

	Report_Listen.log_print_in_report().info("Action: Select API Channel");
	
	WebElement Popup = p.Popup_Modal();
	List<WebElement> Cards = Popup.findElements(By.xpath(".//*[contains(@class,'_channelTypeCard')]"));
	WebElement API_Channel = Cards.get(0);
	API_Channel.click();
	
	WebElement Next_Button = p.Next_Button();
	rp.movetoelement(Next_Button);
	Next_Button.click();
	
	System.out.println("Result : PASS");
	System.out.println();

	Report_Listen.log_print_in_report().pass("Result: PASS - API Channel selected successfully.");
	
	WebElement Channel_Form = p.Popup_Form();
	List<WebElement> Inputs;

	try{
		Inputs = p.Channel_Add_Form_Inputs(Channel_Form);
	}
	catch(Exception e){
		Thread.sleep(800);

		System.out.println("Action : Retry Channel form field retrieval");

		Report_Listen.log_print_in_report().info("Action: Retry Channel form field retrieval");

		Inputs = p.Channel_Add_Form_Inputs(Channel_Form);
	}
	
	System.out.println("---------------- CHANNEL DETAILS ----------------");
	
	WebElement Channel_Name_Input_Field = Inputs.get(0);
	Channel_Name_Input_Field.sendKeys(Channel_Name);

	System.out.println("Channel Name : " + Channel_Name);
	System.out.println("Access Rule  : " + Access_Rule);

	Report_Listen.log_print_in_report().info("Channel Name: " + Channel_Name);
	Report_Listen.log_print_in_report().info("Access Rule: " + Access_Rule);
	
	if(Channel_data.containsKey("Whitelist IP Address 1") && Access_Rule.contains("Allow access from whitelisted IP addresses only")){
		
		int Whitelist_IP_Count = 0;
		
		for(String Key : Channel_data.keySet()){
			if(Key.contains("Whitelist IP Address")){
				Whitelist_IP_Count++;
			}
		}
		
		System.out.println("Whitelist IP Count : " + Whitelist_IP_Count);

		Report_Listen.log_print_in_report().info("Whitelist IP Count: " + Whitelist_IP_Count);
		
		WebElement Whitelist_IP_Addresses_Input_Field = Inputs.get(1);
		
		for(int i=1;i<=Whitelist_IP_Count;i++){
			
			String Ip_Address = Channel_data.get("Whitelist IP Address " + i);
			
			Whitelist_IP_Addresses_Input_Field.sendKeys(Ip_Address);
			Whitelist_IP_Addresses_Input_Field.sendKeys(Keys.ENTER);
			
			System.out.println("IP " + i + " : " + Ip_Address);
		}
	}
	
	if(Access_Rule.contains("Allow access from any IP address")){
		
		WebElement Allow_Any_Ip = p.Allow_Any_IP_Radio_Button();
		rp.movetoelement(Allow_Any_Ip);
		Allow_Any_Ip.click();
	}
	
	System.out.println("Result : PASS");
	System.out.println();

	Report_Listen.log_print_in_report().pass("Result: PASS - Channel details entered successfully.");
	
	System.out.println("---------------- API TOKEN ----------------");
	System.out.println("Action : Generate API token");

	Report_Listen.log_print_in_report().info("Action: Generate API token");
	
	WebElement Submit_Button = p.Next_Button();
	Submit_Button.click();
	
	WebElement Generate_Button = p.Generate_API_Token_Button();
	rp.movetoelement(Generate_Button);
	Generate_Button.click();
	
	WebElement ClientIdLabel = p.CLient_Id_Label();
	WebElement Client_Id_Label_Value = ClientIdLabel.findElement(By.xpath("./../..//input"));
	rp.wait_for_theElement(Client_Id_Label_Value);
	
	String Client_Id = Client_Id_Label_Value.getAttribute("value");
	
	System.out.println("Client ID : " + Client_Id);
	System.out.println("Result    : PASS");
	System.out.println();

	Report_Listen.log_print_in_report().info("Client ID: " + Client_Id);
	Report_Listen.log_print_in_report().pass("Result: PASS - API token generated successfully.");
	
	System.out.println("---------------- CHANNEL SAVE ----------------");
	System.out.println("API Contact Email : " + API_Contact_Mail);
	
	WebElement API_Mail_Input = p.API_Contact_Mail_input();
	API_Mail_Input.sendKeys(API_Contact_Mail);
	
	p.Done_Button().click();
	
	WebElement Confirmation_Message = p.Success_Toast();
	String Confirmation_Message_Text = Confirmation_Message.getText().trim();

	System.out.println("Message : " + Confirmation_Message_Text);
	System.out.println("Result  : PASS");
	System.out.println();

	Report_Listen.log_print_in_report().info("Confirmation Message: " + Confirmation_Message_Text);
	Report_Listen.log_print_in_report().pass("Result: PASS - Channel saved successfully.");
	
	System.out.println("---------------- CHANNEL LIST VERIFICATION ----------------");
	System.out.println("Expected : " + Channel_Name);

	Report_Listen.log_print_in_report().info("Expected Channel: " + Channel_Name);
	
	List<WebElement> Card_texts = p.First_channel_card_text_in_list();
	boolean Channel_Found = false;
	
	for(WebElement Card_text : Card_texts){
		
		String Text = Card_text.getText().trim();
		
		if(Text.contains(Channel_Name)){
			Channel_Found = true;

			System.out.println("Actual   : " + Text);
			System.out.println("Result   : PASS");

			Report_Listen.log_print_in_report().info("Actual Channel: " + Text);
			Report_Listen.log_print_in_report().pass("Result: PASS - Created Channel found in Channel list.");

			break;
		}
	}

	if(Channel_Found==false){

		System.out.println("Actual   : Channel not found");
		System.out.println("Result   : FAIL");
		System.out.println("Reason   : Created Channel was not available in the Channel list.");

		Report_Listen.log_print_in_report().info("Actual: Channel not found");
		Report_Listen.log_print_in_report().fail("Result: FAIL");
		Report_Listen.log_print_in_report().fail("Reason: Created Channel was not available in the Channel list.");
	}

	System.out.println();
	System.out.println("============================================================");
	System.out.println("              CHANNEL CREATION COMPLETED");
	System.out.println("============================================================");
	System.out.println("Channel : " + Channel_Name);
	System.out.println("Result  : " + (Channel_Found ? "PASS" : "FAIL"));
	System.out.println();

	Report_Listen.log_print_in_report().info("---------------- CHANNEL CREATION COMPLETED ----------------");

	if(Channel_Found){
		Report_Listen.log_print_in_report().pass("Result: PASS - Channel creation completed successfully: " + Channel_Name);
	}
	else{
		Report_Listen.log_print_in_report().fail("Result: FAIL - Channel creation verification failed: " + Channel_Name);
	}
}





@Test(dataProvider="Product_Create_Data", dataProviderClass=Product_Module.class)
public void Product_Assign_in_Channel_Add(TreeMap<String, String> Product_data) throws Exception {

	Channel_Module_Locaters p = new Channel_Module_Locaters(d);
	Repeat rp = new Repeat(d);

	String Product_Name = Product_data.get("Product Name");

	boolean Product_Assigned = false;

	try {

		System.out.println();
		System.out.println("============================================================");
		System.out.println("             PRODUCT ASSIGNMENT TO CHANNEL");
		System.out.println("============================================================");
		System.out.println("Product : " + Product_Name);
		System.out.println();

		Report_Listen.log_print_in_report().info("---------------- PRODUCT ASSIGNMENT TO CHANNEL ----------------");
		Report_Listen.log_print_in_report().info("Product: " + Product_Name);

		System.out.println("---------------- CHANNEL ACCESS ----------------");
		System.out.println("Action : Open Channel configuration");

		Report_Listen.log_print_in_report().info("Action: Open Channel configuration");

		Channel_Module_Accessor();
		Thread.sleep(580);

		List<WebElement> Card = p.All_Channel_Cards();
		WebElement First_Card = Card.get(0);
		WebElement First_Card_Config_Button = p.Particular_Cards_Config_Button(First_Card);
		First_Card_Config_Button.click();

		WebElement Form = p.Form();
		Thread.sleep(880);

		System.out.println("Result : PASS");
		System.out.println();

		Report_Listen.log_print_in_report().pass("Channel configuration opened successfully.");

		System.out.println("---------------- PRODUCTS SECTION ----------------");
		System.out.println("Action : Open Assign Products");

		Report_Listen.log_print_in_report().info("Action: Open Assign Products");

		WebElement Products_Section = Form.findElement(By.xpath(".//div[@id='products']"));
		rp.wait_for_theElement(Products_Section);
		rp.Scroll_to_element(Products_Section);
		rp.Scroll_up();

		WebElement Assign_Product_Button = Products_Section.findElement(By.xpath(".//button[@type='button' and contains(@class,'ant-btn-color-primary ant-btn-variant-solid')]"));
		rp.wait_for_theElement(Assign_Product_Button);
		Assign_Product_Button.click();
		Thread.sleep(800);

		WebElement modal = p.Popup_Modal();

		WebElement First_Loader = p.Loader();

		if(First_Loader != null){
			rp.wait_for_invisibilty_of_theElement(First_Loader);
		}

		System.out.println("Result : PASS");
		System.out.println();

		Report_Listen.log_print_in_report().pass("Assign Products section opened successfully.");

		System.out.println("---------------- PRODUCT SEARCH ----------------");
		System.out.println("Expected : " + Product_Name);

		Report_Listen.log_print_in_report().info("Expected Product: " + Product_Name);

		WebElement modal_search_box = modal.findElement(By.xpath(".//*[@id='search']"));
		rp.wait_for_theElement(modal_search_box);
		modal_search_box.sendKeys(Product_Name);

		WebElement Loader = p.Loader();

		if(Loader != null){
			rp.wait_for_invisibilty_of_theElement(Loader);
		}

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(d).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofMillis(500)).ignoring(NoSuchElementException.class).ignoring(StaleElementReferenceException.class);

		List<WebElement> modal_Table_rows = wait.until(driver -> {

			List<WebElement> rows = modal.findElements(By.xpath(".//tbody//tr[contains(@class,'ant-table-row ant-table-row-level-')]"));

			if(!rows.isEmpty()){
				return rows;
			}

			return null;
		});

		Main_Loop:
		for(WebElement modal_Table_row : modal_Table_rows){

			List<WebElement> name_column_datas = modal_Table_row.findElements(By.xpath(".//td[2]"));
			WebElement checkbox = modal_Table_row.findElement(By.xpath(".//label"));

			for(WebElement name_column_data : name_column_datas){

				String name_text = name_column_data.getText().trim();

				if(name_text.endsWith("...")){

					rp.movetoelement(name_column_data);
					Thread.sleep(650);

					WebElement Tooltip = p.Tooltip();
					String list_names = Tooltip.getText().trim();

					if(list_names.contains(Product_Name)){

						System.out.println("Actual   : " + list_names);
						System.out.println("Result   : PASS");
						System.out.println();

						Report_Listen.log_print_in_report().info("Actual Product: " + list_names);
						Report_Listen.log_print_in_report().pass("Product search validation passed.");

						System.out.println("---------------- PRODUCT ASSIGNMENT ----------------");
						System.out.println("Action : Assign Product to Channel");

						Report_Listen.log_print_in_report().info("Action: Assign Product to Channel");

						checkbox.click();

						WebElement Submit_Button = p.Modal_Submit_button();
						Submit_Button.click();
						rp.wait_for_invisibilty_of_theElement(Submit_Button);

						WebElement Confirmation_Message = p.Success_Toast();
						String Confirmation_Message_Text = Confirmation_Message.getText().trim();

						System.out.println("Message : " + Confirmation_Message_Text);
						System.out.println("Result  : PASS");
						System.out.println();

						Report_Listen.log_print_in_report().info("Confirmation Message: " + Confirmation_Message_Text);
						Report_Listen.log_print_in_report().pass("Product assigned successfully.");

						Product_Assigned = true;

						break Main_Loop;
					}
				}
				else{

					if(name_text.contains(Product_Name)){

						System.out.println("Actual   : " + name_text);
						System.out.println("Result   : PASS");
						System.out.println();

						Report_Listen.log_print_in_report().info("Actual Product: " + name_text);
						Report_Listen.log_print_in_report().pass("Product search validation passed.");

						System.out.println("---------------- PRODUCT ASSIGNMENT ----------------");
						System.out.println("Action : Assign Product to Channel");

						Report_Listen.log_print_in_report().info("Action: Assign Product to Channel");

						checkbox.click();

						WebElement Submit_Button = p.Modal_Submit_button();
						Submit_Button.click();
						rp.wait_for_invisibilty_of_theElement(Submit_Button);

						WebElement Confirmation_Message = p.Success_Toast();
						String Confirmation_Message_Text = Confirmation_Message.getText().trim();

						System.out.println("Message : " + Confirmation_Message_Text);
						System.out.println("Result  : PASS");
						System.out.println();

						Report_Listen.log_print_in_report().info("Confirmation Message: " + Confirmation_Message_Text);
						Report_Listen.log_print_in_report().pass("Product assigned successfully.");

						Product_Assigned = true;

						break Main_Loop;
					}
				}
			}
		}

		if(Product_Assigned){

			System.out.println("============================================================");
			System.out.println("          PRODUCT ASSIGNMENT COMPLETED");
			System.out.println("============================================================");
			System.out.println("Product : " + Product_Name);
			System.out.println("Result  : PASS");
			System.out.println();

			Report_Listen.log_print_in_report().pass("---------------- PRODUCT ASSIGNMENT COMPLETED ----------------");
			Report_Listen.log_print_in_report().pass("Product assigned successfully: " + Product_Name);
		}
		else{

			throw new Exception("Searched Product was not found in Assign Products search results: " + Product_Name);
		}
	}
	catch(Exception e){

		System.out.println("---------------- PRODUCT ASSIGNMENT FAILED ----------------");
		System.out.println("Product : " + Product_Name);
		System.out.println("Result  : FAIL");
		System.out.println("Reason  : " + e.getMessage());
		System.out.println();

		Report_Listen.log_print_in_report().fail("Product assignment failed: " + Product_Name);
		Report_Listen.log_print_in_report().fail("Reason: " + e.getMessage());

		throw e;
	}
}


public void Patient_Portal_FAQ_Add(TreeMap<String, String> FAQ_data) throws Exception{

	Channel_Module_Locaters p = new Channel_Module_Locaters(d);
	Repeat rp = new Repeat(d);
	JavascriptExecutor js = (JavascriptExecutor)d;

	WebElement Treatment_Management_Section;

	String SectionCount = FAQ_data.get("Section Count");
	int Section_count = Integer.parseInt(SectionCount);

	System.out.println();
	System.out.println("============================================================");
	System.out.println("                 PATIENT PORTAL FAQ");
	System.out.println("============================================================");
	System.out.println("Section Count : " + Section_count);
	System.out.println();

	Report_Listen.log_print_in_report().info("---------------- PATIENT PORTAL FAQ ----------------");
	Report_Listen.log_print_in_report().info("Section Count: " + Section_count);

	Boolean visiblitiy = rp.check_element_visibility(p.Form(), 5);

	if(visiblitiy!=true){

		System.out.println("---------------- PORTAL CONFIGURATION ----------------");
		System.out.println("Action : Open Patient Portal configuration");

		Report_Listen.log_print_in_report().info("Action: Open Patient Portal configuration");

		Channel_Module_Accessor();

		WebElement Patient_portal_section_in_list = p.Patient_Portal_section();
		rp.Scroll_to_element(Patient_portal_section_in_list);
		Thread.sleep(500);

		List<WebElement> Buttons = Patient_portal_section_in_list.findElements(By.xpath(".//button[contains(@class,'ant-btn-variant-outlined')]"));
		rp.wait_for_theElement(Buttons);

		WebElement Config_Button = Buttons.get(0);
		Config_Button.click();

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(d).withTimeout(Duration.ofSeconds(80)).pollingEvery(Duration.ofMillis(500)).ignoring(NoSuchElementException.class).ignoring(StaleElementReferenceException.class);
		WebElement Form = wait.until(driver -> p.Form());

		System.out.println("Result : PASS");
		System.out.println();

		Report_Listen.log_print_in_report().pass("Patient Portal configuration opened successfully.");
	}

	Treatment_Management_Section = p.Treatment_management_Section();

	List<WebElement> Cards = Treatment_Management_Section.findElements(By.xpath(".//*[contains(@class,'ant-typography text-dark')]/../../.."));
	rp.wait_for_theElement(Cards);

	System.out.println("---------------- FAQ CONFIGURATION ----------------");
	System.out.println("Action : Open Treatment FAQs");

	Report_Listen.log_print_in_report().info("Action: Open Treatment FAQs");

	for(WebElement Card : Cards){

		WebElement Card_Text_element = Card.findElement(By.xpath(".//*[contains(@class,'ant-typography text-dark')]"));
		rp.wait_for_theElement(Card_Text_element);

		String Card_Text = Card_Text_element.getText().trim();

		if(Card_Text.contains("Treatment FAQs")){

			WebElement Toggle_Button = Card.findElement(By.xpath(".//button"));
			rp.wait_for_theElement(Toggle_Button);
			rp.Scroll_to_element(Toggle_Button);
			Thread.sleep(500);
			Toggle_Button.click();

			break;
		}
	}

	FluentWait<WebDriver> newwait = new FluentWait<WebDriver>(d).withTimeout(Duration.ofSeconds(80)).pollingEvery(Duration.ofMillis(500)).ignoring(NoSuchElementException.class).ignoring(StaleElementReferenceException.class);
	WebElement Popup_Frm = newwait.until(driver -> p.Popup_Form());

	System.out.println("Result : PASS");
	System.out.println();

	Report_Listen.log_print_in_report().pass("Treatment FAQs configuration opened successfully.");

	System.out.println("---------------- FAQ SECTION CREATION ----------------");
	System.out.println("Required Sections : " + Section_count);
	System.out.println("Default Sections  : 1");

	Report_Listen.log_print_in_report().info("Required FAQ Sections: " + Section_count);
	Report_Listen.log_print_in_report().info("Default FAQ Sections: 1");

	for(int m=1;m<Section_count;m++){

		WebElement Section_Button = p.Add_Section_Button();
		rp.Scroll_to_element(Section_Button);
		Section_Button.click();
	}

	List<WebElement> Question_Sections = p.Question_Sections();
	rp.wait_for_theElement(Question_Sections);

	System.out.println("Created Sections  : " + Question_Sections.size());
	System.out.println();

	Report_Listen.log_print_in_report().info("Created FAQ Sections: " + Question_Sections.size());

	for(int s=0;s<Section_count;s++){

		int Section_Number = s+1;

		String Group_Title = FAQ_data.get("Section " + Section_Number + " Group Name");
		String Group_Description = FAQ_data.get("Section " + Section_Number + " Group Description");
		String QuestionCount = FAQ_data.get("Section " + Section_Number + " Question Count");
		int Question_Answer_Count = Integer.parseInt(QuestionCount);

		WebElement Question_Section = Question_Sections.get(s);

		System.out.println();
		System.out.println("---------------- FAQ SECTION " + Section_Number + " ----------------");
		System.out.println("Group Name : " + Group_Title);
		System.out.println("Questions  : " + Question_Answer_Count);

		Report_Listen.log_print_in_report().info("---------------- FAQ SECTION " + Section_Number + " ----------------");
		Report_Listen.log_print_in_report().info("Group Name: " + Group_Title);
		Report_Listen.log_print_in_report().info("Question Count: " + Question_Answer_Count);

		WebElement GroupName_input = Question_Section.findElement(By.xpath(".//input[contains(@id,'title')]"));
		rp.wait_for_theElement(GroupName_input);

		WebElement Group_Description_input = Question_Section.findElement(By.xpath(".//textarea[contains(@id,'description')]"));
		rp.wait_for_theElement(Group_Description_input);

		GroupName_input.clear();
		GroupName_input.sendKeys(Group_Title);

		Group_Description_input.clear();
		js.executeScript("const el=arguments[0]; const value=arguments[1]; const setter=Object.getOwnPropertyDescriptor(HTMLTextAreaElement.prototype,'value').set; setter.call(el,value); el.dispatchEvent(new Event('input',{bubbles:true})); el.dispatchEvent(new Event('change',{bubbles:true}));", Group_Description_input, Group_Description);

		System.out.println("Group Details : Entered");

		Report_Listen.log_print_in_report().pass("Section " + Section_Number + " Group Name and Description entered successfully.");

		for(int k=1;k<Question_Answer_Count;k++){

			WebElement Add_Question_Button = Question_Section.findElement(By.xpath(".//*[text()='Add Question']/.."));
			rp.Scroll_to_element(Add_Question_Button);
			Add_Question_Button.click();
		}

		List<WebElement> All_Question_input = Question_Section.findElements(By.xpath(".//input[contains(@id,'_questions')]"));
		rp.wait_for_theElement(All_Question_input);

		List<WebElement> All_Answers_input = Question_Section.findElements(By.xpath(".//textarea[contains(@id,'_answer')]"));
		rp.wait_for_theElement(All_Answers_input);

		for(int q=0;q<Question_Answer_Count;q++){

			int Question_Number = q+1;

			String Input_question = FAQ_data.get("Section " + Section_Number + " Question " + Question_Number);
			String Input_Answer = FAQ_data.get("Section " + Section_Number + " Answer " + Question_Number);

			WebElement Questioninput = All_Question_input.get(q);
			Questioninput.clear();

			WebElement Answerinput = All_Answers_input.get(q);
			Answerinput.clear();

			js.executeScript("const el=arguments[0]; const value=arguments[1]; const setter=Object.getOwnPropertyDescriptor(HTMLInputElement.prototype,'value').set; setter.call(el,value); el.dispatchEvent(new Event('input',{bubbles:true})); el.dispatchEvent(new Event('change',{bubbles:true}));", Questioninput, Input_question);

			js.executeScript("const el=arguments[0]; const value=arguments[1]; const setter=Object.getOwnPropertyDescriptor(HTMLTextAreaElement.prototype,'value').set; setter.call(el,value); el.dispatchEvent(new Event('input',{bubbles:true})); el.dispatchEvent(new Event('change',{bubbles:true}));", Answerinput, Input_Answer);
		}

		System.out.println("Question/Answer Sets : " + Question_Answer_Count);
		System.out.println("Result               : PASS");
		System.out.println();

		Report_Listen.log_print_in_report().pass("Section " + Section_Number + " configured successfully with " + Question_Answer_Count + " Question/Answer sets.");
	}

	System.out.println("---------------- FAQ SAVE ----------------");
	System.out.println("Action : Save FAQ configuration");

	Report_Listen.log_print_in_report().info("Action: Save FAQ configuration");

	WebElement Modal_Save_Button = p.Save_Button();
	rp.Scroll_to_element(Modal_Save_Button);
	Modal_Save_Button.click();
	rp.wait_for_invisibilty_of_theElement(Modal_Save_Button);

	WebElement Save_Settings = p.Save_Settings_Button();
	Save_Settings.click();

	WebElement Confirmation_Message = p.Success_Toast();
	String Confirmation_Message_Text = Confirmation_Message.getText().trim();

	System.out.println("Message : " + Confirmation_Message_Text);
	System.out.println("Result  : PASS");
	System.out.println();

	Report_Listen.log_print_in_report().info("Confirmation Message: " + Confirmation_Message_Text);
	Report_Listen.log_print_in_report().pass("Patient Portal FAQ configuration saved successfully.");

	System.out.println("============================================================");
	System.out.println("                FAQ CONFIGURATION COMPLETED");
	System.out.println("============================================================");
	System.out.println("Sections : " + Section_count);
	System.out.println("Result   : PASS");
	System.out.println();

	Report_Listen.log_print_in_report().pass("---------------- FAQ CONFIGURATION COMPLETED ----------------");
}


public void Patient_Portal_FAQ_Validator(TreeMap<String, String> FAQ_data, SoftAssert softAssert) throws Exception{

	Channel_Module_Locaters p = new Channel_Module_Locaters(d);
	Repeat rp = new Repeat(d);

	WebElement Treatment_Management_Section;

	String SectionCount = FAQ_data.get("Section Count");
	int Section_count = Integer.parseInt(SectionCount);

	System.out.println();
	System.out.println("============================================================");
	System.out.println("             PATIENT PORTAL FAQ VALIDATION");
	System.out.println("============================================================");
	System.out.println("Expected Sections : " + Section_count);
	System.out.println();

	Report_Listen.log_print_in_report().info("---------------- PATIENT PORTAL FAQ VALIDATION ----------------");
	Report_Listen.log_print_in_report().info("Expected Section Count: " + Section_count);

	Boolean visiblitiy = rp.check_element_visibility(p.Form(), 5);

	if(visiblitiy!=true){

		System.out.println("---------------- PORTAL CONFIGURATION ----------------");
		System.out.println("Action : Open Patient Portal configuration");

		Report_Listen.log_print_in_report().info("Action: Open Patient Portal configuration");

		Channel_Module_Accessor();

		WebElement Patient_portal_section_in_list = p.Patient_Portal_section();
		rp.Scroll_to_element(Patient_portal_section_in_list);
		Thread.sleep(500);

		List<WebElement> Buttons = Patient_portal_section_in_list.findElements(By.xpath(".//button[contains(@class,'ant-btn-variant-outlined')]"));
		rp.wait_for_theElement(Buttons);

		WebElement Config_Button = Buttons.get(0);
		Config_Button.click();

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(d).withTimeout(Duration.ofSeconds(80)).pollingEvery(Duration.ofMillis(500)).ignoring(NoSuchElementException.class).ignoring(StaleElementReferenceException.class);
		WebElement Form = wait.until(driver -> p.Form());

		System.out.println("Result : PASS");
		System.out.println();

		Report_Listen.log_print_in_report().pass("Patient Portal configuration opened successfully.");
	}

	Treatment_Management_Section = p.Treatment_management_Section();
	rp.wait_for_theElement(Treatment_Management_Section);
	rp.Scroll_to_element(Treatment_Management_Section);
	rp.Scroll_up();
	Thread.sleep(500);

	List<WebElement> Cards = Treatment_Management_Section.findElements(By.xpath(".//*[contains(@class,'ant-typography text-dark')]/../../.."));
	rp.wait_for_theElement(Cards);

	System.out.println("---------------- FAQ CONFIGURATION ----------------");
	System.out.println("Action : Open Treatment FAQs configuration");

	Report_Listen.log_print_in_report().info("Action: Open Treatment FAQs configuration");

	for(WebElement Card : Cards){

		WebElement Card_Text_element = Card.findElement(By.xpath(".//*[contains(@class,'ant-typography text-dark')]"));
		rp.wait_for_theElement(Card_Text_element);

		String Card_Text = Card_Text_element.getText().trim();

		if(Card_Text.contains("Treatment FAQs")){

			WebElement Toggle_Button = Card.findElement(By.xpath(".//button"));
			rp.wait_for_theElement(Toggle_Button);
			rp.Scroll_to_element(Toggle_Button);
			Thread.sleep(500);
			Toggle_Button.click();

			break;
		}
	}

	FluentWait<WebDriver> newwait = new FluentWait<WebDriver>(d).withTimeout(Duration.ofSeconds(80)).pollingEvery(Duration.ofMillis(500)).ignoring(NoSuchElementException.class).ignoring(StaleElementReferenceException.class);
	WebElement Popup_Frm = newwait.until(driver -> p.Popup_Form());

	System.out.println("Result : PASS");
	System.out.println();

	Report_Listen.log_print_in_report().pass("Treatment FAQs configuration opened successfully.");

	List<WebElement> Question_Sections = p.Question_Sections();
	rp.wait_for_theElement(Question_Sections);

	int Actual_Section_Count = Question_Sections.size();

	System.out.println("---------------- FAQ SECTION COUNT VALIDATION ----------------");
	System.out.println("Expected : " + Section_count);
	System.out.println("Actual   : " + Actual_Section_Count);

	Report_Listen.log_print_in_report().info("Expected FAQ Section Count: " + Section_count);
	Report_Listen.log_print_in_report().info("Actual FAQ Section Count: " + Actual_Section_Count);

	if(Actual_Section_Count==Section_count){

		System.out.println("Result   : PASS");
		System.out.println();

		Report_Listen.log_print_in_report().pass("FAQ Section count validation passed.");
	}
	else{

		System.out.println("Result   : FAIL");
		System.out.println("Reason   : FAQ Section count does not match.");
		System.out.println();

		Report_Listen.log_print_in_report().fail("FAQ Section count validation failed.");
		Report_Listen.log_print_in_report().fail("Expected: " + Section_count + " | Actual: " + Actual_Section_Count);

		softAssert.assertEquals(Actual_Section_Count, Section_count, "FAQ Section count validation failed.");
	}

	int Section_Validation_Count = Math.min(Section_count, Actual_Section_Count);

	for(int s=0;s<Section_Validation_Count;s++){

		int Section_Number = s+1;

		String Group_Title = FAQ_data.get("Section " + Section_Number + " Group Name");
		String Group_Description = FAQ_data.get("Section " + Section_Number + " Group Description");
		String QuestionCount = FAQ_data.get("Section " + Section_Number + " Question Count");
		int Question_Answer_Count = Integer.parseInt(QuestionCount);

		WebElement Question_Section = Question_Sections.get(s);

		System.out.println();
		System.out.println("---------------- FAQ SECTION " + Section_Number + " VALIDATION ----------------");
		System.out.println("Group Name : " + Group_Title);
		System.out.println("Questions  : " + Question_Answer_Count);
		System.out.println();

		Report_Listen.log_print_in_report().info("---------------- FAQ SECTION " + Section_Number + " VALIDATION ----------------");
		Report_Listen.log_print_in_report().info("Expected Group Name: " + Group_Title);
		Report_Listen.log_print_in_report().info("Expected Question Count: " + Question_Answer_Count);

		WebElement GroupName_input = Question_Section.findElement(By.xpath(".//input[contains(@id,'title')]"));
		rp.wait_for_theElement(GroupName_input);

		WebElement Group_Description_input = Question_Section.findElement(By.xpath(".//textarea[contains(@id,'description')]"));
		rp.wait_for_theElement(Group_Description_input);

		String Actual_Group_Title = GroupName_input.getDomProperty("value").trim();
		String Actual_Group_Description = Group_Description_input.getDomProperty("value").trim();

		System.out.println("Field    : Group Name");
		System.out.println("Expected : " + Group_Title);
		System.out.println("Actual   : " + Actual_Group_Title);

		if(Actual_Group_Title.equals(Group_Title)){

			System.out.println("Result   : PASS");
			System.out.println();

			Report_Listen.log_print_in_report().info("Expected Group Name: " + Group_Title);
			Report_Listen.log_print_in_report().info("Actual Group Name: " + Actual_Group_Title);
			Report_Listen.log_print_in_report().pass("Section " + Section_Number + " Group Name validation passed.");
		}
		else{

			System.out.println("Result   : FAIL");
			System.out.println("Reason   : Group Name does not match.");
			System.out.println();

			Report_Listen.log_print_in_report().fail("Section " + Section_Number + " Group Name validation failed.");
			Report_Listen.log_print_in_report().fail("Expected: " + Group_Title);
			Report_Listen.log_print_in_report().fail("Actual: " + Actual_Group_Title);

			softAssert.assertEquals(Actual_Group_Title, Group_Title, "Section " + Section_Number + " Group Name validation failed.");
		}

		System.out.println("Field    : Group Description");
		System.out.println("Expected : " + Group_Description);
		System.out.println("Actual   : " + Actual_Group_Description);

		if(Actual_Group_Description.equals(Group_Description)){

			System.out.println("Result   : PASS");
			System.out.println();

			Report_Listen.log_print_in_report().pass("Section " + Section_Number + " Group Description validation passed.");
		}
		else{

			System.out.println("Result   : FAIL");
			System.out.println("Reason   : Group Description does not match.");
			System.out.println();

			Report_Listen.log_print_in_report().fail("Section " + Section_Number + " Group Description validation failed.");
			Report_Listen.log_print_in_report().fail("Expected: " + Group_Description);
			Report_Listen.log_print_in_report().fail("Actual: " + Actual_Group_Description);

			softAssert.assertEquals(Actual_Group_Description, Group_Description, "Section " + Section_Number + " Group Description validation failed.");
		}

		List<WebElement> All_Question_input = Question_Section.findElements(By.xpath(".//input[contains(@id,'_questions')]"));
		rp.wait_for_theElement(All_Question_input);

		List<WebElement> All_Answers_input = Question_Section.findElements(By.xpath(".//textarea[contains(@id,'_answer')]"));
		rp.wait_for_theElement(All_Answers_input);

		int Actual_Question_Count = All_Question_input.size();
		int Actual_Answer_Count = All_Answers_input.size();

		System.out.println("---------------- SECTION " + Section_Number + " FAQ COUNT ----------------");
		System.out.println("Expected Questions : " + Question_Answer_Count);
		System.out.println("Actual Questions   : " + Actual_Question_Count);
		System.out.println("Expected Answers   : " + Question_Answer_Count);
		System.out.println("Actual Answers     : " + Actual_Answer_Count);

		Report_Listen.log_print_in_report().info("Section " + Section_Number + " Expected Question Count: " + Question_Answer_Count);
		Report_Listen.log_print_in_report().info("Section " + Section_Number + " Actual Question Count: " + Actual_Question_Count);
		Report_Listen.log_print_in_report().info("Section " + Section_Number + " Expected Answer Count: " + Question_Answer_Count);
		Report_Listen.log_print_in_report().info("Section " + Section_Number + " Actual Answer Count: " + Actual_Answer_Count);

		if(Actual_Question_Count==Question_Answer_Count){

			System.out.println("Question Count Result : PASS");

			Report_Listen.log_print_in_report().pass("Section " + Section_Number + " Question count validation passed.");
		}
		else{

			System.out.println("Question Count Result : FAIL");

			Report_Listen.log_print_in_report().fail("Section " + Section_Number + " Question count validation failed.");

			softAssert.assertEquals(Actual_Question_Count, Question_Answer_Count, "Section " + Section_Number + " Question count validation failed.");
		}

		if(Actual_Answer_Count==Question_Answer_Count){

			System.out.println("Answer Count Result   : PASS");
			System.out.println();

			Report_Listen.log_print_in_report().pass("Section " + Section_Number + " Answer count validation passed.");
		}
		else{

			System.out.println("Answer Count Result   : FAIL");
			System.out.println();

			Report_Listen.log_print_in_report().fail("Section " + Section_Number + " Answer count validation failed.");

			softAssert.assertEquals(Actual_Answer_Count, Question_Answer_Count, "Section " + Section_Number + " Answer count validation failed.");
		}

		System.out.println("---------------- SECTION " + Section_Number + " INDIVIDUAL FAQ VALIDATION ----------------");

		int Validation_Count = Math.min(Question_Answer_Count, Math.min(Actual_Question_Count, Actual_Answer_Count));

		for(int q=0;q<Validation_Count;q++){

			int Question_Number = q+1;

			String Expected_Question = FAQ_data.get("Section " + Section_Number + " Question " + Question_Number);
			String Expected_Answer = FAQ_data.get("Section " + Section_Number + " Answer " + Question_Number);

			WebElement Questioninput = All_Question_input.get(q);
			WebElement Answerinput = All_Answers_input.get(q);

			String Actual_Question = Questioninput.getDomProperty("value").trim();
			String Actual_Answer = Answerinput.getDomProperty("value").trim();

			boolean Question_Matched = Actual_Question.equals(Expected_Question);
			boolean Answer_Matched = Actual_Answer.equals(Expected_Answer);

			if(Question_Matched && Answer_Matched){

				System.out.println("FAQ " + Question_Number + " : PASS");

				Report_Listen.log_print_in_report().pass("Section " + Section_Number + " FAQ " + Question_Number + " Question and Answer validation passed.");
			}

			if(!Question_Matched){

				System.out.println();
				System.out.println("FAQ      : " + Question_Number);
				System.out.println("Field    : Question");
				System.out.println("Expected : " + Expected_Question);
				System.out.println("Actual   : " + Actual_Question);
				System.out.println("Result   : FAIL");

				Report_Listen.log_print_in_report().fail("Section " + Section_Number + " FAQ " + Question_Number + " Question validation failed.");
				Report_Listen.log_print_in_report().fail("Expected: " + Expected_Question);
				Report_Listen.log_print_in_report().fail("Actual: " + Actual_Question);

				softAssert.assertEquals(Actual_Question, Expected_Question, "Section " + Section_Number + " Question " + Question_Number + " validation failed.");
			}

			if(!Answer_Matched){

				System.out.println();
				System.out.println("FAQ      : " + Question_Number);
				System.out.println("Field    : Answer");
				System.out.println("Expected : " + Expected_Answer);
				System.out.println("Actual   : " + Actual_Answer);
				System.out.println("Result   : FAIL");

				Report_Listen.log_print_in_report().fail("Section " + Section_Number + " FAQ " + Question_Number + " Answer validation failed.");
				Report_Listen.log_print_in_report().fail("Expected: " + Expected_Answer);
				Report_Listen.log_print_in_report().fail("Actual: " + Actual_Answer);

				softAssert.assertEquals(Actual_Answer, Expected_Answer, "Section " + Section_Number + " Answer " + Question_Number + " validation failed.");
			}
		}

		System.out.println();
		System.out.println("Section " + Section_Number + " Result : Validation Completed");
		System.out.println();

		Report_Listen.log_print_in_report().info("Section " + Section_Number + " validation completed.");
	}

	System.out.println("============================================================");
	System.out.println("             FAQ VALIDATION COMPLETED");
	System.out.println("============================================================");
	System.out.println("Sections Checked : " + Section_Validation_Count);
	System.out.println();

	Report_Listen.log_print_in_report().info("---------------- FAQ VALIDATION COMPLETED ----------------");
	Report_Listen.log_print_in_report().info("FAQ Sections Checked: " + Section_Validation_Count);
}






@DataProvider
public Object[][] Patient_Portal_Create_Data(){

	TreeMap<String, String> data1 = new TreeMap<String, String>();
	data1.put("Portal Name", "ElbeCare Patient Compass");
	data1.put("Portal URL", "patients.rheincare-medizin.de");
	data1.put("Status", "Inactive");
	data1.put("Description", "ElbeCare Patient Compass provides a secure digital environment where patients can review treatment information, manage care activities, access support resources, and interact with available healthcare services.");
	data1.put("Enable Search Engine Indexing", "Disabled");
	data1.put("Login Method", "Magic Link (Email + Order ID)");
	data1.put("Two-Factor Authentication", "Available with Email & Password only");
	data1.put("Cancellation Offer", "Enabled");
	data1.put("Discount Amount", "14");
	data1.put("Offer Cooldown", "410");
	data1.put("Automatic Approval", "Enabled");
	data1.put("Approval Timing", "Immediately");
	data1.put("Maximum Extension", "395");
	data1.put("Maximum Reduction", "372");
	data1.put("Request Immediate Refill", "Enabled");
	data1.put("Archive Completed Treatments After", "430");
	data1.put("Delete Archived Treatments After", "845");
	data1.put("Emergency Contact Country Code", "+49");
	data1.put("Emergency Contact Number", "3026003101");
	data1.put("Emergency Contact Title", "ElbeCare Urgent Patient Assistance");
	data1.put("Emergency Contact Description", "Use this contact when an urgent treatment-related issue requires prompt assistance from the ElbeCare patient-support team.");
	data1.put("Emergency Disclaimer", "For serious or life-threatening symptoms, immediately contact the appropriate local emergency medical service.");

	TreeMap<String, String> data2 = new TreeMap<String, String>();
	data2.put("Portal Name", "MainMed Patient Access");
	data2.put("Portal URL", "patients.rheincare-medizin.de");
	data2.put("Status", "Inactive");
	data2.put("Description", "MainMed Patient Access allows patients to securely manage healthcare information, treatment progress, digital service interactions, and available patient-support resources.");
	data2.put("Enable Search Engine Indexing", "Enabled");
	data2.put("Login Method", "Magic Link (Email + Order ID)");
	data2.put("Two-Factor Authentication", "Available with Email & Password only");
	data2.put("Cancellation Offer", "Enabled");
	data2.put("Discount Amount", "19");
	data2.put("Offer Cooldown", "465");
	data2.put("Automatic Approval", "Enabled");
	data2.put("Approval Timing", "Immediately");
	data2.put("Maximum Extension", "420");
	data2.put("Maximum Reduction", "385");
	data2.put("Request Immediate Refill", "Disabled");
	data2.put("Archive Completed Treatments After", "510");
	data2.put("Delete Archived Treatments After", "925");
	data2.put("Emergency Contact Country Code", "+49");
	data2.put("Emergency Contact Number", "6926003102");
	data2.put("Emergency Contact Title", "MainMed Emergency Support Desk");
	data2.put("Emergency Contact Description", "Patients may contact this support desk when an urgent concern develops during an active treatment or care-management process.");
	data2.put("Emergency Disclaimer", "This patient-support contact does not replace professional ambulance, hospital, or emergency physician services.");

	TreeMap<String, String> data3 = new TreeMap<String, String>();
	data3.put("Portal Name", "Schwarzwald Care Connect");
	data3.put("Portal URL", "patients.rheincare-medizin.de");
	data3.put("Status", "Inactive");
	data3.put("Description", "Schwarzwald Care Connect provides patients with protected online access to treatment details, healthcare resources, care-management tools, and digital support functionality.");
	data3.put("Enable Search Engine Indexing", "Disabled");
	data3.put("Login Method", "Magic Link (Email + Order ID)");
	data3.put("Two-Factor Authentication", "Available with Email & Password only");
	data3.put("Cancellation Offer", "Enabled");
	data3.put("Discount Amount", "23");
	data3.put("Offer Cooldown", "520");
	data3.put("Automatic Approval", "Enabled");
	data3.put("Approval Timing", "Immediately");
	data3.put("Maximum Extension", "445");
	data3.put("Maximum Reduction", "405");
	data3.put("Request Immediate Refill", "Enabled");
	data3.put("Archive Completed Treatments After", "570");
	data3.put("Delete Archived Treatments After", "1025");
	data3.put("Emergency Contact Country Code", "+49");
	data3.put("Emergency Contact Number", "76126003103");
	data3.put("Emergency Contact Title", "Schwarzwald Patient Safety Line");
	data3.put("Emergency Contact Description", "Contact the patient safety line for urgent questions involving treatment complications, unexpected symptoms, or immediate healthcare-support needs.");
	data3.put("Emergency Disclaimer", "Seek emergency medical assistance immediately if symptoms are severe, rapidly worsening, or potentially life-threatening.");

	TreeMap<String, String> data4 = new TreeMap<String, String>();
	data4.put("Portal Name", "HanseVital Patient Portal");
	data4.put("Portal URL", "patients.rheincare-medizin.de");
	data4.put("Status", "Inactive");
	data4.put("Description", "HanseVital Patient Portal delivers a centralized digital patient experience for managing treatments, reviewing healthcare information, accessing support services, and maintaining continuity of care.");
	data4.put("Enable Search Engine Indexing", "Enabled");
	data4.put("Login Method", "Magic Link (Email + Order ID)");
	data4.put("Two-Factor Authentication", "Available with Email & Password only");
	data4.put("Cancellation Offer", "Enabled");
	data4.put("Discount Amount", "16");
	data4.put("Offer Cooldown", "575");
	data4.put("Automatic Approval", "Enabled");
	data4.put("Approval Timing", "Immediately");
	data4.put("Maximum Extension", "470");
	data4.put("Maximum Reduction", "415");
	data4.put("Request Immediate Refill", "Enabled");
	data4.put("Archive Completed Treatments After", "625");
	data4.put("Delete Archived Treatments After", "1140");
	data4.put("Emergency Contact Country Code", "+49");
	data4.put("Emergency Contact Number", "4026003104");
	data4.put("Emergency Contact Title", "HanseVital Urgent Care Support");
	data4.put("Emergency Contact Description", "Use this support service for urgent treatment concerns requiring timely assistance from the HanseVital patient-care team.");
	data4.put("Emergency Disclaimer", "Digital urgent-care support must not delay contacting emergency medical professionals when immediate intervention is necessary.");

	TreeMap<String, String> data5 = new TreeMap<String, String>();
	data5.put("Portal Name", "IsarHealth Care Bridge");
	data5.put("Portal URL", "patients.rheincare-medizin.de");
	data5.put("Status", "Inactive");
	data5.put("Description", "IsarHealth Care Bridge connects patients to secure treatment-management features, healthcare information, care resources, and available patient-support services.");
	data5.put("Enable Search Engine Indexing", "Disabled");
	data5.put("Login Method", "Magic Link (Email + Order ID)");
	data5.put("Two-Factor Authentication", "Available with Email & Password only");
	data5.put("Cancellation Offer", "Enabled");
	data5.put("Discount Amount", "21");
	data5.put("Offer Cooldown", "625");
	data5.put("Automatic Approval", "Enabled");
	data5.put("Approval Timing", "Immediately");
	data5.put("Maximum Extension", "495");
	data5.put("Maximum Reduction", "435");
	data5.put("Request Immediate Refill", "Disabled");
	data5.put("Archive Completed Treatments After", "680");
	data5.put("Delete Archived Treatments After", "1225");
	data5.put("Emergency Contact Country Code", "+49");
	data5.put("Emergency Contact Number", "8926003105");
	data5.put("Emergency Contact Title", "IsarHealth Immediate Assistance");
	data5.put("Emergency Contact Description", "This contact provides prompt patient assistance for urgent treatment-related issues, medication concerns, or unexpected healthcare needs.");
	data5.put("Emergency Disclaimer", "Contact emergency medical services immediately when a condition may pose an immediate risk to health or life.");

	TreeMap<String, String> data6 = new TreeMap<String, String>();
	data6.put("Portal Name", "NeckarMed Digital Patient");
	data6.put("Portal URL", "patients.rheincare-medizin.de");
	data6.put("Status", "Inactive");
	data6.put("Description", "NeckarMed Digital Patient offers secure access to treatment progress, healthcare resources, patient services, and digital tools intended to support ongoing care.");
	data6.put("Enable Search Engine Indexing", "Enabled");
	data6.put("Login Method", "Magic Link (Email + Order ID)");
	data6.put("Two-Factor Authentication", "Available with Email & Password only");
	data6.put("Cancellation Offer", "Enabled");
	data6.put("Discount Amount", "26");
	data6.put("Offer Cooldown", "675");
	data6.put("Automatic Approval", "Enabled");
	data6.put("Approval Timing", "Immediately");
	data6.put("Maximum Extension", "515");
	data6.put("Maximum Reduction", "450");
	data6.put("Request Immediate Refill", "Enabled");
	data6.put("Archive Completed Treatments After", "725");
	data6.put("Delete Archived Treatments After", "1290");
	data6.put("Emergency Contact Country Code", "+49");
	data6.put("Emergency Contact Number", "71126003106");
	data6.put("Emergency Contact Title", "NeckarMed Urgent Patient Line");
	data6.put("Emergency Contact Description", "Patients can use this urgent line when an active treatment concern requires rapid guidance or support from the healthcare-service team.");
	data6.put("Emergency Disclaimer", "For severe medical symptoms requiring immediate attention, contact local emergency response services first.");

	TreeMap<String, String> data7 = new TreeMap<String, String>();
	data7.put("Portal Name", "MoselCare Health Link");
	data7.put("Portal URL", "patients.rheincare-medizin.de");
	data7.put("Status", "Inactive");
	data7.put("Description", "MoselCare Health Link provides a secure patient-facing connection to treatment information, healthcare support, care-management services, and account resources.");
	data7.put("Enable Search Engine Indexing", "Disabled");
	data7.put("Login Method", "Magic Link (Email + Order ID)");
	data7.put("Two-Factor Authentication", "Available with Email & Password only");
	data7.put("Cancellation Offer", "Enabled");
	data7.put("Discount Amount", "11");
	data7.put("Offer Cooldown", "730");
	data7.put("Automatic Approval", "Enabled");
	data7.put("Approval Timing", "Immediately");
	data7.put("Maximum Extension", "540");
	data7.put("Maximum Reduction", "470");
	data7.put("Request Immediate Refill", "Disabled");
	data7.put("Archive Completed Treatments After", "780");
	data7.put("Delete Archived Treatments After", "1345");
	data7.put("Emergency Contact Country Code", "+49");
	data7.put("Emergency Contact Number", "26126003107");
	data7.put("Emergency Contact Title", "MoselCare Emergency Patient Support");
	data7.put("Emergency Contact Description", "Urgent patient concerns involving treatment, symptoms, or care instructions may be directed to this dedicated support contact.");
	data7.put("Emergency Disclaimer", "This service is not a substitute for professional emergency care during a critical or life-threatening medical event.");

	TreeMap<String, String> data8 = new TreeMap<String, String>();
	data8.put("Portal Name", "AlpenMedi Patient Hub");
	data8.put("Portal URL", "patients.rheincare-medizin.de");
	data8.put("Status", "Inactive");
	data8.put("Description", "AlpenMedi Patient Hub provides centralized digital access to active treatments, healthcare information, care services, and patient-support resources.");
	data8.put("Enable Search Engine Indexing", "Enabled");
	data8.put("Login Method", "Magic Link (Email + Order ID)");
	data8.put("Two-Factor Authentication", "Available with Email & Password only");
	data8.put("Cancellation Offer", "Enabled");
	data8.put("Discount Amount", "28");
	data8.put("Offer Cooldown", "785");
	data8.put("Automatic Approval", "Enabled");
	data8.put("Approval Timing", "Immediately");
	data8.put("Maximum Extension", "565");
	data8.put("Maximum Reduction", "490");
	data8.put("Request Immediate Refill", "Enabled");
	data8.put("Archive Completed Treatments After", "835");
	data8.put("Delete Archived Treatments After", "1425");
	data8.put("Emergency Contact Country Code", "+49");
	data8.put("Emergency Contact Number", "86126003108");
	data8.put("Emergency Contact Title", "AlpenMedi Urgent Medical Help");
	data8.put("Emergency Contact Description", "Use this contact when an urgent treatment or patient-care concern requires immediate assistance from the available healthcare-support team.");
	data8.put("Emergency Disclaimer", "Call local emergency services immediately when urgent professional medical intervention is required.");

	TreeMap<String, String> data9 = new TreeMap<String, String>();
	data9.put("Portal Name", "WeserHealth Direct");
	data9.put("Portal URL", "patients.rheincare-medizin.de");
	data9.put("Status", "Inactive");
	data9.put("Description", "WeserHealth Direct enables patients to securely access treatment-management tools, healthcare information, care resources, and digital support functionality.");
	data9.put("Enable Search Engine Indexing", "Disabled");
	data9.put("Login Method", "Magic Link (Email + Order ID)");
	data9.put("Two-Factor Authentication", "Available with Email & Password only");
	data9.put("Cancellation Offer", "Enabled");
	data9.put("Discount Amount", "15");
	data9.put("Offer Cooldown", "825");
	data9.put("Automatic Approval", "Enabled");
	data9.put("Approval Timing", "Immediately");
	data9.put("Maximum Extension", "590");
	data9.put("Maximum Reduction", "510");
	data9.put("Request Immediate Refill", "Enabled");
	data9.put("Archive Completed Treatments After", "875");
	data9.put("Delete Archived Treatments After", "1490");
	data9.put("Emergency Contact Country Code", "+49");
	data9.put("Emergency Contact Number", "42126003109");
	data9.put("Emergency Contact Title", "WeserHealth Patient Response Desk");
	data9.put("Emergency Contact Description", "The patient response desk provides urgent guidance when treatment-related concerns or unexpected healthcare issues require prompt review.");
	data9.put("Emergency Disclaimer", "Patients experiencing severe symptoms should seek emergency medical care rather than waiting for digital support.");

	TreeMap<String, String> data10 = new TreeMap<String, String>();
	data10.put("Portal Name", "SpreeCare Patient Gateway");
	data10.put("Portal URL", "patients.rheincare-medizin.de");
	data10.put("Status", "Inactive");
	data10.put("Description", "SpreeCare Patient Gateway provides secure digital access to treatment services, care information, healthcare resources, and patient-support tools.");
	data10.put("Enable Search Engine Indexing", "Enabled");
	data10.put("Login Method", "Magic Link (Email + Order ID)");
	data10.put("Two-Factor Authentication", "Available with Email & Password only");
	data10.put("Cancellation Offer", "Enabled");
	data10.put("Discount Amount", "17");
	data10.put("Offer Cooldown", "875");
	data10.put("Automatic Approval", "Enabled");
	data10.put("Approval Timing", "Immediately");
	data10.put("Maximum Extension", "615");
	data10.put("Maximum Reduction", "530");
	data10.put("Request Immediate Refill", "Disabled");
	data10.put("Archive Completed Treatments After", "925");
	data10.put("Delete Archived Treatments After", "1545");
	data10.put("Emergency Contact Country Code", "+49");
	data10.put("Emergency Contact Number", "3026003110");
	data10.put("Emergency Contact Title", "SpreeCare Emergency Assistance Desk");
	data10.put("Emergency Contact Description", "Contact this assistance desk for urgent patient-support needs involving an active treatment or unexpected care-related concern.");
	data10.put("Emergency Disclaimer", "Emergency assistance through the portal does not replace immediate evaluation by emergency medical professionals.");

	TreeMap<String, String> data11 = new TreeMap<String, String>();
	data11.put("Portal Name", "TaunusMed Care Portal");
	data11.put("Portal URL", "patients.rheincare-medizin.de");
	data11.put("Status", "Inactive");
	data11.put("Description", "TaunusMed Care Portal supports patients with secure online access to treatment information, digital care services, healthcare resources, and patient communication.");
	data11.put("Enable Search Engine Indexing", "Disabled");
	data11.put("Login Method", "Magic Link (Email + Order ID)");
	data11.put("Two-Factor Authentication", "Available with Email & Password only");
	data11.put("Cancellation Offer", "Enabled");
	data11.put("Discount Amount", "22");
	data11.put("Offer Cooldown", "925");
	data11.put("Automatic Approval", "Enabled");
	data11.put("Approval Timing", "Immediately");
	data11.put("Maximum Extension", "640");
	data11.put("Maximum Reduction", "550");
	data11.put("Request Immediate Refill", "Enabled");
	data11.put("Archive Completed Treatments After", "975");
	data11.put("Delete Archived Treatments After", "1640");
	data11.put("Emergency Contact Country Code", "+49");
	data11.put("Emergency Contact Number", "6126003111");
	data11.put("Emergency Contact Title", "TaunusMed Urgent Health Support");
	data11.put("Emergency Contact Description", "Patients requiring rapid assistance for treatment-related health concerns may contact the TaunusMed urgent support service.");
	data11.put("Emergency Disclaimer", "Critical medical conditions should always be handled immediately through appropriate emergency healthcare services.");

	TreeMap<String, String> data12 = new TreeMap<String, String>();
	data12.put("Portal Name", "BalticHealth Patient Center");
	data12.put("Portal URL", "patients.rheincare-medizin.de");
	data12.put("Status", "Inactive");
	data12.put("Description", "BalticHealth Patient Center offers centralized access to treatment activity, digital healthcare information, patient resources, and ongoing care-management support.");
	data12.put("Enable Search Engine Indexing", "Enabled");
	data12.put("Login Method", "Magic Link (Email + Order ID)");
	data12.put("Two-Factor Authentication", "Available with Email & Password only");
	data12.put("Cancellation Offer", "Enabled");
	data12.put("Discount Amount", "13");
	data12.put("Offer Cooldown", "980");
	data12.put("Automatic Approval", "Enabled");
	data12.put("Approval Timing", "Immediately");
	data12.put("Maximum Extension", "665");
	data12.put("Maximum Reduction", "570");
	data12.put("Request Immediate Refill", "Disabled");
	data12.put("Archive Completed Treatments After", "1025");
	data12.put("Delete Archived Treatments After", "1740");
	data12.put("Emergency Contact Country Code", "+49");
	data12.put("Emergency Contact Number", "45126003112");
	data12.put("Emergency Contact Title", "BalticHealth Emergency Care Line");
	data12.put("Emergency Contact Description", "Use this emergency care contact when an urgent treatment issue requires timely assistance from the patient-support team.");
	data12.put("Emergency Disclaimer", "If a medical situation requires immediate intervention, contact emergency services instead of relying solely on portal communication.");

	TreeMap<String, String> data13 = new TreeMap<String, String>();
	data13.put("Portal Name", "OderCare Digital Access");
	data13.put("Portal URL", "patients.rheincare-medizin.de");
	data13.put("Status", "Inactive");
	data13.put("Description", "OderCare Digital Access provides patients with a secure online destination for treatment management, healthcare information, patient services, and care resources.");
	data13.put("Enable Search Engine Indexing", "Disabled");
	data13.put("Login Method", "Magic Link (Email + Order ID)");
	data13.put("Two-Factor Authentication", "Available with Email & Password only");
	data13.put("Cancellation Offer", "Enabled");
	data13.put("Discount Amount", "20");
	data13.put("Offer Cooldown", "1035");
	data13.put("Automatic Approval", "Enabled");
	data13.put("Approval Timing", "Immediately");
	data13.put("Maximum Extension", "690");
	data13.put("Maximum Reduction", "590");
	data13.put("Request Immediate Refill", "Enabled");
	data13.put("Archive Completed Treatments After", "1075");
	data13.put("Delete Archived Treatments After", "1845");
	data13.put("Emergency Contact Country Code", "+49");
	data13.put("Emergency Contact Number", "33526003113");
	data13.put("Emergency Contact Title", "OderCare Immediate Patient Support");
	data13.put("Emergency Contact Description", "This contact offers prompt support for urgent concerns involving active treatments, unexpected symptoms, or patient-care instructions.");
	data13.put("Emergency Disclaimer", "Emergency medical services should be contacted immediately whenever a patient's condition may be life-threatening.");

	TreeMap<String, String> data14 = new TreeMap<String, String>();
	data14.put("Portal Name", "SaaleMed Patient Connect");
	data14.put("Portal URL", "patients.rheincare-medizin.de");
	data14.put("Status", "Inactive");
	data14.put("Description", "SaaleMed Patient Connect delivers protected digital access to healthcare information, treatment services, care-management tools, and patient-support functionality.");
	data14.put("Enable Search Engine Indexing", "Enabled");
	data14.put("Login Method", "Magic Link (Email + Order ID)");
	data14.put("Two-Factor Authentication", "Available with Email & Password only");
	data14.put("Cancellation Offer", "Enabled");
	data14.put("Discount Amount", "25");
	data14.put("Offer Cooldown", "1090");
	data14.put("Automatic Approval", "Enabled");
	data14.put("Approval Timing", "Immediately");
	data14.put("Maximum Extension", "715");
	data14.put("Maximum Reduction", "610");
	data14.put("Request Immediate Refill", "Enabled");
	data14.put("Archive Completed Treatments After", "1125");
	data14.put("Delete Archived Treatments After", "1945");
	data14.put("Emergency Contact Country Code", "+49");
	data14.put("Emergency Contact Number", "34526003114");
	data14.put("Emergency Contact Title", "SaaleMed Emergency Response Line");
	data14.put("Emergency Contact Description", "Contact the emergency response line when an urgent healthcare or treatment concern requires rapid patient-support assistance.");
	data14.put("Emergency Disclaimer", "For severe or potentially life-threatening emergencies, seek immediate assistance from emergency medical professionals.");

	TreeMap<String, String> data15 = new TreeMap<String, String>();
	data15.put("Portal Name", "EifelHealth Care Network");
	data15.put("Portal URL", "patients.rheincare-medizin.de");
	data15.put("Status", "Inactive");
	data15.put("Description", "EifelHealth Care Network provides patients with secure access to digital treatment information, healthcare services, care resources, and support functionality.");
	data15.put("Enable Search Engine Indexing", "Disabled");
	data15.put("Login Method", "Magic Link (Email + Order ID)");
	data15.put("Two-Factor Authentication", "Available with Email & Password only");
	data15.put("Cancellation Offer", "Enabled");
	data15.put("Discount Amount", "10");
	data15.put("Offer Cooldown", "1145");
	data15.put("Automatic Approval", "Enabled");
	data15.put("Approval Timing", "Immediately");
	data15.put("Maximum Extension", "740");
	data15.put("Maximum Reduction", "630");
	data15.put("Request Immediate Refill", "Disabled");
	data15.put("Archive Completed Treatments After", "1175");
	data15.put("Delete Archived Treatments After", "2045");
	data15.put("Emergency Contact Country Code", "+49");
	data15.put("Emergency Contact Number", "65126003115");
	data15.put("Emergency Contact Title", "EifelHealth Urgent Care Contact");
	data15.put("Emergency Contact Description", "Use this contact when an urgent treatment-related concern requires timely patient-support guidance.");
	data15.put("Emergency Disclaimer", "Portal-based assistance should not replace emergency medical evaluation when a serious condition is suspected.");

	TreeMap<String, String> data16 = new TreeMap<String, String>();
	data16.put("Portal Name", "LahnCare Patient Services");
	data16.put("Portal URL", "patients.rheincare-medizin.de");
	data16.put("Status", "Inactive");
	data16.put("Description", "LahnCare Patient Services enables secure management of treatment information, healthcare resources, patient-support interactions, and ongoing digital care activities.");
	data16.put("Enable Search Engine Indexing", "Enabled");
	data16.put("Login Method", "Magic Link (Email + Order ID)");
	data16.put("Two-Factor Authentication", "Available with Email & Password only");
	data16.put("Cancellation Offer", "Enabled");
	data16.put("Discount Amount", "18");
	data16.put("Offer Cooldown", "1195");
	data16.put("Automatic Approval", "Enabled");
	data16.put("Approval Timing", "Immediately");
	data16.put("Maximum Extension", "765");
	data16.put("Maximum Reduction", "650");
	data16.put("Request Immediate Refill", "Enabled");
	data16.put("Archive Completed Treatments After", "1225");
	data16.put("Delete Archived Treatments After", "2145");
	data16.put("Emergency Contact Country Code", "+49");
	data16.put("Emergency Contact Number", "64126003116");
	data16.put("Emergency Contact Title", "LahnCare Emergency Patient Assistance");
	data16.put("Emergency Contact Description", "Patients requiring urgent help with treatment-related healthcare concerns may use this dedicated assistance contact.");
	data16.put("Emergency Disclaimer", "Contact local emergency services immediately for serious symptoms requiring urgent medical intervention.");

	TreeMap<String, String> data17 = new TreeMap<String, String>();
	data17.put("Portal Name", "RuhrMedi Health Portal");
	data17.put("Portal URL", "patients.rheincare-medizin.de");
	data17.put("Status", "Inactive");
	data17.put("Description", "RuhrMedi Health Portal provides secure online access to treatment details, patient healthcare resources, digital service functionality, and ongoing care support.");
	data17.put("Enable Search Engine Indexing", "Disabled");
	data17.put("Login Method", "Magic Link (Email + Order ID)");
	data17.put("Two-Factor Authentication", "Available with Email & Password only");
	data17.put("Cancellation Offer", "Enabled");
	data17.put("Discount Amount", "12");
	data17.put("Offer Cooldown", "1245");
	data17.put("Automatic Approval", "Enabled");
	data17.put("Approval Timing", "Immediately");
	data17.put("Maximum Extension", "790");
	data17.put("Maximum Reduction", "670");
	data17.put("Request Immediate Refill", "Disabled");
	data17.put("Archive Completed Treatments After", "1275");
	data17.put("Delete Archived Treatments After", "2245");
	data17.put("Emergency Contact Country Code", "+49");
	data17.put("Emergency Contact Number", "20126003117");
	data17.put("Emergency Contact Title", "RuhrMedi Urgent Patient Desk");
	data17.put("Emergency Contact Description", "Use this urgent patient desk when treatment complications or unexpected healthcare concerns require prompt support.");
	data17.put("Emergency Disclaimer", "Immediate medical emergencies must be directed to professional emergency-response services rather than portal support.");

	TreeMap<String, String> data18 = new TreeMap<String, String>();
	data18.put("Portal Name", "HavelCare Patient Link");
	data18.put("Portal URL", "patients.rheincare-medizin.de");
	data18.put("Status", "Inactive");
	data18.put("Description", "HavelCare Patient Link offers patients a secure digital connection to healthcare resources, treatment-management tools, patient services, and care support.");
	data18.put("Enable Search Engine Indexing", "Enabled");
	data18.put("Login Method", "Magic Link (Email + Order ID)");
	data18.put("Two-Factor Authentication", "Available with Email & Password only");
	data18.put("Cancellation Offer", "Enabled");
	data18.put("Discount Amount", "24");
	data18.put("Offer Cooldown", "1295");
	data18.put("Automatic Approval", "Enabled");
	data18.put("Approval Timing", "Immediately");
	data18.put("Maximum Extension", "815");
	data18.put("Maximum Reduction", "690");
	data18.put("Request Immediate Refill", "Enabled");
	data18.put("Archive Completed Treatments After", "1325");
	data18.put("Delete Archived Treatments After", "2345");
	data18.put("Emergency Contact Country Code", "+49");
	data18.put("Emergency Contact Number", "33126003118");
	data18.put("Emergency Contact Title", "HavelCare Emergency Health Support");
	data18.put("Emergency Contact Description", "Urgent concerns involving ongoing treatment or patient-care services can be directed to this dedicated health-support contact.");
	data18.put("Emergency Disclaimer", "Patients with severe or critical symptoms should immediately contact local emergency healthcare professionals.");

	TreeMap<String, String> data19 = new TreeMap<String, String>();
	data19.put("Portal Name", "DonauHealth Digital Care");
	data19.put("Portal URL", "patients.rheincare-medizin.de");
	data19.put("Status", "Inactive");
	data19.put("Description", "DonauHealth Digital Care connects patients with secure treatment-management services, healthcare information, digital care resources, and patient-support capabilities.");
	data19.put("Enable Search Engine Indexing", "Disabled");
	data19.put("Login Method", "Magic Link (Email + Order ID)");
	data19.put("Two-Factor Authentication", "Available with Email & Password only");
	data19.put("Cancellation Offer", "Enabled");
	data19.put("Discount Amount", "29");
	data19.put("Offer Cooldown", "1345");
	data19.put("Automatic Approval", "Enabled");
	data19.put("Approval Timing", "Immediately");
	data19.put("Maximum Extension", "840");
	data19.put("Maximum Reduction", "710");
	data19.put("Request Immediate Refill", "Enabled");
	data19.put("Archive Completed Treatments After", "1375");
	data19.put("Delete Archived Treatments After", "2445");
	data19.put("Emergency Contact Country Code", "+49");
	data19.put("Emergency Contact Number", "94126003119");
	data19.put("Emergency Contact Title", "DonauHealth Immediate Care Desk");
	data19.put("Emergency Contact Description", "This immediate care desk provides urgent assistance for treatment-related concerns requiring timely support from the patient-care team.");
	data19.put("Emergency Disclaimer", "Do not wait for portal support when emergency medical evaluation or immediate professional intervention is required.");

	TreeMap<String, String> data20 = new TreeMap<String, String>();
	data20.put("Portal Name", "HarzMed Patient Horizon");
	data20.put("Portal URL", "patients.rheincare-medizin.de");
	data20.put("Status", "Inactive");
	data20.put("Description", "HarzMed Patient Horizon provides patients with secure digital access to healthcare services, treatment information, patient resources, and ongoing care-management functionality.");
	data20.put("Enable Search Engine Indexing", "Enabled");
	data20.put("Login Method", "Magic Link (Email + Order ID)");
	data20.put("Two-Factor Authentication", "Available with Email & Password only");
	data20.put("Cancellation Offer", "Enabled");
	data20.put("Discount Amount", "20");
	data20.put("Offer Cooldown", "1395");
	data20.put("Automatic Approval", "Enabled");
	data20.put("Approval Timing", "Immediately");
	data20.put("Maximum Extension", "865");
	data20.put("Maximum Reduction", "730");
	data20.put("Request Immediate Refill", "Disabled");
	data20.put("Archive Completed Treatments After", "1425");
	data20.put("Delete Archived Treatments After", "2545");
	data20.put("Emergency Contact Country Code", "+49");
	data20.put("Emergency Contact Number", "39426003120");
	data20.put("Emergency Contact Title", "HarzMed Emergency Patient Support");
	data20.put("Emergency Contact Description", "Use this emergency patient-support contact when an urgent care or treatment issue requires prompt guidance.");
	data20.put("Emergency Disclaimer", "For acute, severe, or potentially life-threatening conditions, immediately contact the appropriate local emergency service.");

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


@Test(dataProvider="Patient_Portal_Combined_Data")
public void Patient_Portal_Create(TreeMap<String, String> Patient_Portal_data, TreeMap<String, String> FAQ_data) throws Exception {

	Channel_Module_Locaters p = new Channel_Module_Locaters(d);
	Repeat rp = new Repeat(d);

	String Portal_Name = Patient_Portal_data.get("Portal Name");

	try {

		System.out.println();
		System.out.println("============================================================");
		System.out.println("                PATIENT PORTAL CREATION");
		System.out.println("============================================================");
		System.out.println("Portal : " + Portal_Name);
		System.out.println();

		Report_Listen.log_print_in_report().info("---------------- PATIENT PORTAL CREATION ----------------");
		Report_Listen.log_print_in_report().info("Portal: " + Portal_Name);

		System.out.println("---------------- CHANNEL ACCESS ----------------");
		System.out.println("Action : Open Channels module");

		Report_Listen.log_print_in_report().info("Action: Open Channels module");

		Channel_Module_Accessor();

		System.out.println("Result : PASS");
		System.out.println();

		Report_Listen.log_print_in_report().pass("Channels module opened successfully.");

		WebElement Patient_portal_section_in_list = p.Patient_Portal_section();

		Thread.sleep(800);

		rp.Scroll_to_Bottom_of_Page();

		Thread.sleep(800);

		System.out.println("---------------- EXISTING PORTAL CHECK ----------------");
		System.out.println("Action : Check for existing Patient Portal configuration");

		Report_Listen.log_print_in_report().info("Action: Check for existing Patient Portal configuration");

		List<WebElement> Config_Buttons = Patient_portal_section_in_list.findElements(By.xpath(".//*[text()='Configuration']/.."));

		Boolean is_visible = false;
		WebElement Config_Button = null;

		if(!Config_Buttons.isEmpty()){

			Config_Button = Config_Buttons.get(0);

			is_visible = rp.check_element_visibility(Config_Button, 4);
		}

		if(is_visible==false){

			System.out.println("Existing Portal : NO");
			System.out.println("Action          : Create new Patient Portal");
			System.out.println();

			Report_Listen.log_print_in_report().info("Existing Patient Portal: NO");
			Report_Listen.log_print_in_report().info("Action: Create new Patient Portal");

			System.out.println("---------------- NEW PORTAL CREATION ----------------");

			WebElement Add_Button = p.Patient_Portal_Create_Button();

			rp.movetoelement(Add_Button);

			Add_Button.click();

			System.out.println("Action : Enter Portal Name");

			p.Portal_Name_Input().sendKeys(Portal_Name);

			System.out.println("Portal Name : " + Portal_Name);

			WebElement Submit = p.Create_Button();

			System.out.println("Action : Submit Patient Portal creation");

			Submit.click();

			rp.wait_for_invisibilty_of_theElement(Submit);

			System.out.println("Result : PASS");
			System.out.println();

			Report_Listen.log_print_in_report().pass("New Patient Portal created successfully: " + Portal_Name);

			System.out.println("---------------- PORTAL CONFIGURATION ----------------");
			System.out.println("Action : Open Patient Portal configuration");

			Report_Listen.log_print_in_report().info("Action: Open Patient Portal configuration");

			WebElement Refetched_Patient_portal_section_in_list = p.Patient_Portal_section();

			rp.wait_for_theElement(Refetched_Patient_portal_section_in_list);

			WebElement New_Config_Button = Refetched_Patient_portal_section_in_list.findElement(By.xpath(".//*[text()='Configuration']/.."));

			rp.wait_for_theElement(New_Config_Button);

			patient_portal_form_editor(Patient_Portal_data, New_Config_Button, FAQ_data);

			System.out.println("Result : PASS");
			System.out.println();

			Report_Listen.log_print_in_report().pass("Patient Portal configured successfully.");

			System.out.println("---------------- PORTAL VALIDATION ----------------");
			System.out.println("Action : Validate saved Patient Portal configuration");

			Report_Listen.log_print_in_report().info("Action: Validate saved Patient Portal configuration");

			patient_portal_configuration_validator(Patient_Portal_data, FAQ_data);

			System.out.println("Result : PASS");
			System.out.println();

			Report_Listen.log_print_in_report().pass("Patient Portal validation completed successfully.");
		}
		else{

			System.out.println("Existing Portal : YES");
			System.out.println("Action          : Delete existing Portal and create new Portal");
			System.out.println();

			Report_Listen.log_print_in_report().info("Existing Patient Portal: YES");
			Report_Listen.log_print_in_report().info("Action: Delete existing Portal and create new Portal");

			System.out.println("---------------- EXISTING PORTAL DELETION ----------------");

			List<WebElement> ThreeDot_Buttons = Patient_portal_section_in_list.findElements(By.xpath(".//*[contains(@class,'ant-dropdown-trigger')] "));

			rp.wait_for_theElement(ThreeDot_Buttons);

			Three_Dot_Menu_Option_Selector(ThreeDot_Buttons, "Delete");

			System.out.println("Result : PASS");
			System.out.println();

			Report_Listen.log_print_in_report().pass("Existing Patient Portal deleted successfully.");

			System.out.println("---------------- NEW PORTAL CREATION ----------------");

			WebElement Add_Button = p.Patient_Portal_Create_Button();

			rp.movetoelement(Add_Button);

			Add_Button.click();

			p.Portal_Name_Input().sendKeys(Portal_Name);

			System.out.println("Portal Name : " + Portal_Name);
			System.out.println("Action      : Submit Patient Portal creation");

			WebElement Submit = p.Create_Button();

			Submit.click();

			rp.wait_for_invisibilty_of_theElement(Submit);

			System.out.println("Result : PASS");
			System.out.println();

			Report_Listen.log_print_in_report().pass("New Patient Portal created successfully.");

			System.out.println("---------------- PORTAL CONFIGURATION ----------------");
			System.out.println("Action : Open Patient Portal configuration");

			Report_Listen.log_print_in_report().info("Action: Open Patient Portal configuration");

			WebElement Refetched_Patient_portal_section_in_list = p.Patient_Portal_section();

			rp.wait_for_theElement(Refetched_Patient_portal_section_in_list);

			WebElement ConfigButton = Refetched_Patient_portal_section_in_list.findElement(By.xpath(".//*[text()='Configuration']/.."));

			rp.wait_for_theElement(ConfigButton);

			patient_portal_form_editor(Patient_Portal_data, ConfigButton, FAQ_data);

			System.out.println("Result : PASS");
			System.out.println();

			Report_Listen.log_print_in_report().pass("Patient Portal configured successfully.");

			System.out.println("---------------- PORTAL VALIDATION ----------------");
			System.out.println("Action : Validate saved Patient Portal configuration");

			Report_Listen.log_print_in_report().info("Action: Validate saved Patient Portal configuration");

			patient_portal_configuration_validator(Patient_Portal_data, FAQ_data);

			System.out.println("Result : PASS");
			System.out.println();

			Report_Listen.log_print_in_report().pass("Patient Portal validation completed successfully.");
		}

		System.out.println("============================================================");
		System.out.println("          PATIENT PORTAL CREATION COMPLETED");
		System.out.println("============================================================");
		System.out.println("Portal : " + Portal_Name);
		System.out.println("Result : PASS");
		System.out.println();

		Report_Listen.log_print_in_report().pass("---------------- PATIENT PORTAL CREATION COMPLETED ----------------");
		Report_Listen.log_print_in_report().pass("Patient Portal creation and configuration completed successfully: " + Portal_Name);
	}
	catch(Exception e){

		System.out.println();
		System.out.println("---------------- PATIENT PORTAL CREATION FAILED ----------------");
		System.out.println("Portal : " + Portal_Name);
		System.out.println("Result : FAIL");
		System.out.println("Reason : " + e.getMessage());
		System.out.println();

		Report_Listen.log_print_in_report().fail("Patient Portal creation failed: " + Portal_Name);
		Report_Listen.log_print_in_report().fail("Reason: " + e.getMessage());

		throw e;
	}
}

public void patient_portal_configuration_validator(TreeMap<String, String> Form_data, TreeMap<String, String> FAQ) throws Exception{

	Channel_Module_Locaters p = new Channel_Module_Locaters(d);
	Repeat rp = new Repeat(d);
	SoftAssert softAssert = new SoftAssert();

	String Portal_Name = Form_data.get("Portal Name");
	String Portal_URL = Form_data.get("Portal URL");
	String Status = Form_data.get("Status");
	String Description = Form_data.get("Description");
	String Search_Engine_Indexing = Form_data.get("Enable Search Engine Indexing");
	String Login_Method = Form_data.get("Login Method");
	String Two_Factor_Authentication = Form_data.get("Two-Factor Authentication");
	String Cancellation_Offer = Form_data.get("Cancellation Offer");
	String Discount_Amount = Form_data.get("Discount Amount");
	String Offer_Cooldown = Form_data.get("Offer Cooldown");
	String Automatic_Approval = Form_data.get("Automatic Approval");
	String Approval_Timing = Form_data.get("Approval Timing");
	String Emergency_Contact_Country_Code = Form_data.get("Emergency Contact Country Code");
	String Emergency_Contact_Number = Form_data.get("Emergency Contact Number");
	String Emergency_Contact_Title = Form_data.get("Emergency Contact Title");
	String Emergency_Contact_Description = Form_data.get("Emergency Contact Description");
	String Emergency_Disclaimer = Form_data.get("Emergency Disclaimer");
	String Maximum_Extension = Form_data.get("Maximum Extension");
	String Maximum_Reduction = Form_data.get("Maximum Reduction");
	String Archive_Completed_Treatments_After = Form_data.get("Archive Completed Treatments After");
	String Delete_Archived_Treatments_After = Form_data.get("Delete Archived Treatments After");

	System.out.println();
	System.out.println("============================================================");
	System.out.println("            PATIENT PORTAL VALIDATION");
	System.out.println("============================================================");
	System.out.println("Portal : " + Portal_Name);
	System.out.println();

	Report_Listen.log_print_in_report().info("---------------- PATIENT PORTAL VALIDATION ----------------");
	Report_Listen.log_print_in_report().info("Portal: " + Portal_Name);

	WebElement Patient_portal_section_in_list = p.Patient_Portal_section();
	Thread.sleep(800);

	WebElement Cnfig_Button = Patient_portal_section_in_list.findElement(By.xpath(".//*[text()='Configuration']/.."));
	Boolean Visibility_Status = rp.check_element_visibility(Cnfig_Button, 3);

	if(Visibility_Status!=true){

		WebElement Save_Settings = p.Save_Settings_Button();
		Save_Settings.click();

		WebElement Confirmation_Message = p.Success_Toast();
		String Confirmation_Message_Text = Confirmation_Message.getText().trim();

		System.out.println("---------------- CONFIGURATION SAVE ----------------");
		System.out.println("Message : " + Confirmation_Message_Text);
		System.out.println("Result  : PASS");
		System.out.println();

		Report_Listen.log_print_in_report().info("Confirmation Message: " + Confirmation_Message_Text);
		Report_Listen.log_print_in_report().pass("Patient Portal configuration saved successfully.");

		WebElement new_config_button = p.Configuration_Button();
		Cnfig_Button = new_config_button;
	}

	System.out.println("---------------- PORTAL NAME VALIDATION ----------------");

	WebElement Portal_name_inlist = Cnfig_Button.findElement(By.xpath("./../..//span[contains(@class,'text-dark')]"));
	rp.wait_for_theElement(Portal_name_inlist);

	String Actual_Portal_Name = Portal_name_inlist.getText().trim();
	Boolean Portal_Name_Matched = Actual_Portal_Name.equalsIgnoreCase(Portal_Name);

	System.out.println("Expected : " + Portal_Name);
	System.out.println("Actual   : " + Actual_Portal_Name);

	if(Portal_Name_Matched){

		System.out.println("Result   : PASS");
		System.out.println();

		Report_Listen.log_print_in_report().info("Expected Portal Name: " + Portal_Name);
		Report_Listen.log_print_in_report().info("Actual Portal Name: " + Actual_Portal_Name);
		Report_Listen.log_print_in_report().pass("Portal Name validation passed.");
	}
	else{

		System.out.println("Result   : FAIL");
		System.out.println("Reason   : Portal Name does not match.");
		System.out.println();

		Report_Listen.log_print_in_report().fail("Expected Portal Name: " + Portal_Name);
		Report_Listen.log_print_in_report().fail("Actual Portal Name: " + Actual_Portal_Name);

		softAssert.assertEquals(Actual_Portal_Name, Portal_Name, "Patient Portal Name validation failed.");
	}

	Cnfig_Button.click();

	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(d).withTimeout(Duration.ofSeconds(80)).pollingEvery(Duration.ofMillis(500)).ignoring(NoSuchElementException.class).ignoring(StaleElementReferenceException.class);
	WebElement Form = wait.until(driver -> p.Form());

	WebElement Treatment_Management_Section = p.Treatment_management_Section();
	rp.wait_for_theElement(Treatment_Management_Section);
	rp.Scroll_to_element(Treatment_Management_Section);
	Thread.sleep(500);

	System.out.println("---------------- GENERAL CONFIGURATION VALIDATION ----------------");

	List<WebElement> dropdown_fields = p.Patient_Portal_config_Form_Dropdown_fields(Form);

	for(WebElement Field : dropdown_fields){

		String Feild_Value = Field.getText().trim();

		WebElement Label_name = Field.findElement(By.xpath("./../../../../..//label"));
		rp.wait_for_theElement(Label_name);

		String Label_Text = Label_name.getText().trim();

		if(Label_Text.contains("Login Method")){

			System.out.println("Field    : Login Method");
			System.out.println("Expected : " + Login_Method);
			System.out.println("Actual   : " + Feild_Value);

			if(Feild_Value.contains("Magic Link (Email + Order ID)")){

				System.out.println("Result   : PASS");
				System.out.println();

				Report_Listen.log_print_in_report().pass("Login Method validation passed. Expected: " + Login_Method + " | Actual: " + Feild_Value);
			}
			else{

				System.out.println("Result   : FAIL");
				System.out.println();

				Report_Listen.log_print_in_report().fail("Login Method validation failed. Expected: " + Login_Method + " | Actual: " + Feild_Value);

				softAssert.assertEquals(Feild_Value, Login_Method, "Login Method validation failed.");
			}
		}

		if(Label_Text.contains("Status")){

			System.out.println("Field    : Status");
			System.out.println("Expected : " + Status);
			System.out.println("Actual   : " + Feild_Value);

			if(Feild_Value.contains("Inactive")){

				System.out.println("Result   : PASS");
				System.out.println();

				Report_Listen.log_print_in_report().pass("Status validation passed. Expected: " + Status + " | Actual: " + Feild_Value);
			}
			else{

				System.out.println("Result   : FAIL");
				System.out.println();

				Report_Listen.log_print_in_report().fail("Status validation failed. Expected: " + Status + " | Actual: " + Feild_Value);

				softAssert.assertEquals(Feild_Value, Status, "Patient Portal Status validation failed.");
			}
		}
	}

	List<WebElement> Cards = Treatment_Management_Section.findElements(By.xpath(".//*[contains(@class,'ant-typography text-dark')]/../../.."));
	rp.wait_for_theElement(Cards);

	for(WebElement Card : Cards){

		WebElement Card_Text_element = Card.findElement(By.xpath(".//*[contains(@class,'ant-typography text-dark')]"));
		rp.wait_for_theElement(Card_Text_element);

		String Card_Text = Card_Text_element.getText().trim();

		if(Card_Text.contains("Cancel Treatment")){

			System.out.println("---------------- CANCEL TREATMENT VALIDATION ----------------");

			WebElement Toggle_Button = Card.findElement(By.xpath(".//button"));
			rp.wait_for_theElement(Toggle_Button);
			Thread.sleep(500);
			Toggle_Button.click();

			WebElement pop_up_form = p.Popup_Form();

			List<WebElement> popup_toggles = pop_up_form.findElements(By.xpath(".//button[@role='switch']"));
			rp.wait_for_theElement(popup_toggles);

			WebElement First_Toggle = popup_toggles.get(0);
			rp.wait_for_theElement(First_Toggle);

			String Cancellation_Toggle_Value = First_Toggle.getAttribute("aria-checked");
			String Expected_Cancellation_Toggle_Value = Cancellation_Offer.equalsIgnoreCase("Enabled") ? "true" : "false";

			System.out.println("Cancellation Offer");
			System.out.println("Expected : " + Expected_Cancellation_Toggle_Value);
			System.out.println("Actual   : " + Cancellation_Toggle_Value);

			if(Cancellation_Toggle_Value.equalsIgnoreCase(Expected_Cancellation_Toggle_Value)){

				System.out.println("Result   : PASS");
				Report_Listen.log_print_in_report().pass("Cancellation Offer validation passed.");
			}
			else{

				System.out.println("Result   : FAIL");
				Report_Listen.log_print_in_report().fail("Cancellation Offer validation failed. Expected: " + Expected_Cancellation_Toggle_Value + " | Actual: " + Cancellation_Toggle_Value);

				softAssert.assertEquals(Cancellation_Toggle_Value, Expected_Cancellation_Toggle_Value, "Cancellation Offer validation failed.");
			}

			List<WebElement> pop_up_inputs = pop_up_form.findElements(By.xpath(".//input[@id='discount_percent' or @id='offer_cooldown_days']"));
			rp.wait_for_theElement(pop_up_inputs);

			String Discount_val = pop_up_inputs.get(0).getAttribute("value");
			String Cooldown_val = pop_up_inputs.get(1).getAttribute("value");

			System.out.println();
			System.out.println("Discount Amount");
			System.out.println("Expected : " + Discount_Amount);
			System.out.println("Actual   : " + Discount_val);

			if(Discount_val.equalsIgnoreCase(Discount_Amount)){

				System.out.println("Result   : PASS");
				Report_Listen.log_print_in_report().pass("Discount Amount validation passed.");
			}
			else{

				System.out.println("Result   : FAIL");
				Report_Listen.log_print_in_report().fail("Discount Amount validation failed. Expected: " + Discount_Amount + " | Actual: " + Discount_val);

				softAssert.assertEquals(Discount_val, Discount_Amount, "Discount Amount validation failed.");
			}

			System.out.println();
			System.out.println("Offer Cooldown");
			System.out.println("Expected : " + Offer_Cooldown);
			System.out.println("Actual   : " + Cooldown_val);

			if(Cooldown_val.equalsIgnoreCase(Offer_Cooldown)){

				System.out.println("Result   : PASS");
				Report_Listen.log_print_in_report().pass("Offer Cooldown validation passed.");
			}
			else{

				System.out.println("Result   : FAIL");
				Report_Listen.log_print_in_report().fail("Offer Cooldown validation failed. Expected: " + Offer_Cooldown + " | Actual: " + Cooldown_val);

				softAssert.assertEquals(Cooldown_val, Offer_Cooldown, "Offer Cooldown validation failed.");
			}

			System.out.println();

			p.Modal_close_button().click();
		}

		if(Card_Text.contains("Change Refill Date")){

			System.out.println("---------------- CHANGE REFILL DATE VALIDATION ----------------");

			WebElement Toggle_Button = Card.findElement(By.xpath(".//button"));
			rp.wait_for_theElement(Toggle_Button);
			Thread.sleep(800);
			Toggle_Button.click();

			WebElement pop_up_form = p.Popup_Form();

			List<WebElement> pop_up_inputs = pop_up_form.findElements(By.xpath(".//input[@id='max_extension_days' or @id='max_reduction_days']"));
			rp.wait_for_theElement(pop_up_inputs);

			WebElement Max_Extension = pop_up_inputs.get(0);
			String Max_ext_value = Max_Extension.getAttribute("value");

			System.out.println("Maximum Extension");
			System.out.println("Expected : " + Maximum_Extension);
			System.out.println("Actual   : " + Max_ext_value);

			if(Max_ext_value.equalsIgnoreCase(Maximum_Extension)){

				System.out.println("Result   : PASS");
				Report_Listen.log_print_in_report().pass("Maximum Extension validation passed.");
			}
			else{

				System.out.println("Result   : FAIL");
				Report_Listen.log_print_in_report().fail("Maximum Extension validation failed. Expected: " + Maximum_Extension + " | Actual: " + Max_ext_value);

				softAssert.assertEquals(Max_ext_value, Maximum_Extension, "Maximum Extension validation failed.");
			}

			WebElement MaximumReduction = pop_up_inputs.get(1);
			String Maximum_Reduction_Value = MaximumReduction.getAttribute("value");

			System.out.println();
			System.out.println("Maximum Reduction");
			System.out.println("Expected : " + Maximum_Reduction);
			System.out.println("Actual   : " + Maximum_Reduction_Value);

			if(Maximum_Reduction_Value.equalsIgnoreCase(Maximum_Reduction)){

				System.out.println("Result   : PASS");
				Report_Listen.log_print_in_report().pass("Maximum Reduction validation passed.");
			}
			else{

				System.out.println("Result   : FAIL");
				Report_Listen.log_print_in_report().fail("Maximum Reduction validation failed. Expected: " + Maximum_Reduction + " | Actual: " + Maximum_Reduction_Value);

				softAssert.assertEquals(Maximum_Reduction_Value, Maximum_Reduction, "Maximum Reduction validation failed.");
			}

			System.out.println();

			p.Modal_close_button().click();
		}

		if(Card_Text.contains("Emergency Contact Widget")){

			System.out.println("---------------- EMERGENCY CONTACT VALIDATION ----------------");

			WebElement Toggle_Button = Card.findElement(By.xpath(".//button"));
			rp.wait_for_theElement(Toggle_Button);
			Thread.sleep(500);
			Toggle_Button.click();

			WebElement pop_up_form = p.Popup_Form();

			List<WebElement> pop_up_inputs = pop_up_form.findElements(By.xpath(".//input[@id='contact_number']"));
			rp.wait_for_theElement(pop_up_inputs);

			List<WebElement> pop_up_Textareas = pop_up_form.findElements(By.xpath(".//textarea[@id='title' or @id='description' or @id='disclaimer']"));
			rp.wait_for_theElement(pop_up_Textareas);

			WebElement Emergency_Contact_Number_Field = pop_up_inputs.get(0);
			String Emergency_Contact_Number_Value = Emergency_Contact_Number_Field.getAttribute("value");

			System.out.println("Emergency Contact Number");
			System.out.println("Expected : " + Emergency_Contact_Number);
			System.out.println("Actual   : " + Emergency_Contact_Number_Value);

			if(Emergency_Contact_Number_Value.equalsIgnoreCase(Emergency_Contact_Number)){

				System.out.println("Result   : PASS");
				Report_Listen.log_print_in_report().pass("Emergency Contact Number validation passed.");
			}
			else{

				System.out.println("Result   : FAIL");
				Report_Listen.log_print_in_report().fail("Emergency Contact Number validation failed. Expected: " + Emergency_Contact_Number + " | Actual: " + Emergency_Contact_Number_Value);

				softAssert.assertEquals(Emergency_Contact_Number_Value, Emergency_Contact_Number, "Emergency Contact Number validation failed.");
			}

			WebElement Emergency_Contact_Title_Field = pop_up_Textareas.get(0);
			String Emergency_Contact_Title_Value = Emergency_Contact_Title_Field.getDomProperty("value").trim();

			System.out.println();
			System.out.println("Emergency Contact Title");
			System.out.println("Expected : " + Emergency_Contact_Title);
			System.out.println("Actual   : " + Emergency_Contact_Title_Value);

			if(Emergency_Contact_Title_Value.equalsIgnoreCase(Emergency_Contact_Title)){

				System.out.println("Result   : PASS");
				Report_Listen.log_print_in_report().pass("Emergency Contact Title validation passed.");
			}
			else{

				System.out.println("Result   : FAIL");
				Report_Listen.log_print_in_report().fail("Emergency Contact Title validation failed. Expected: " + Emergency_Contact_Title + " | Actual: " + Emergency_Contact_Title_Value);

				softAssert.assertEquals(Emergency_Contact_Title_Value, Emergency_Contact_Title, "Emergency Contact Title validation failed.");
			}

			WebElement Emergency_Contact_Description_Field = pop_up_Textareas.get(1);
			String Emergency_Contact_Description_Value = Emergency_Contact_Description_Field.getDomProperty("value").trim();

			System.out.println();
			System.out.println("Emergency Contact Description");
			System.out.println("Expected : " + Emergency_Contact_Description);
			System.out.println("Actual   : " + Emergency_Contact_Description_Value);

			if(Emergency_Contact_Description_Value.equalsIgnoreCase(Emergency_Contact_Description)){

				System.out.println("Result   : PASS");
				Report_Listen.log_print_in_report().pass("Emergency Contact Description validation passed.");
			}
			else{

				System.out.println("Result   : FAIL");
				Report_Listen.log_print_in_report().fail("Emergency Contact Description validation failed.");

				softAssert.assertEquals(Emergency_Contact_Description_Value, Emergency_Contact_Description, "Emergency Contact Description validation failed.");
			}

			WebElement Emergency_Disclaimer_Field = pop_up_Textareas.get(2);
			String Emergency_Disclaimer_Value = Emergency_Disclaimer_Field.getDomProperty("value").trim();

			System.out.println();
			System.out.println("Emergency Disclaimer");
			System.out.println("Expected : " + Emergency_Disclaimer);
			System.out.println("Actual   : " + Emergency_Disclaimer_Value);

			if(Emergency_Disclaimer_Value.equalsIgnoreCase(Emergency_Disclaimer)){

				System.out.println("Result   : PASS");
				Report_Listen.log_print_in_report().pass("Emergency Disclaimer validation passed.");
			}
			else{

				System.out.println("Result   : FAIL");
				Report_Listen.log_print_in_report().fail("Emergency Disclaimer validation failed.");

				softAssert.assertEquals(Emergency_Disclaimer_Value, Emergency_Disclaimer, "Emergency Disclaimer validation failed.");
			}

			System.out.println();

			p.Modal_close_button().click();
		}

		if(Card_Text.contains("Archived Treatments")){

			System.out.println("---------------- ARCHIVED TREATMENTS VALIDATION ----------------");

			WebElement Toggle_Button = Card.findElement(By.xpath(".//button"));
			rp.wait_for_theElement(Toggle_Button);
			Thread.sleep(500);
			Toggle_Button.click();

			WebElement pop_up_form = p.Popup_Form();

			List<WebElement> pop_up_inputs = pop_up_form.findElements(By.xpath(".//input[@id='archive_after_days' or @id='delete_after_days']"));
			rp.wait_for_theElement(pop_up_inputs);

			WebElement Archive_Completed_Treatments_After_Field = pop_up_inputs.get(0);
			String Archive_Completed_Treatments_After_Value = Archive_Completed_Treatments_After_Field.getAttribute("value");

			System.out.println("Archive Completed Treatments After");
			System.out.println("Expected : " + Archive_Completed_Treatments_After);
			System.out.println("Actual   : " + Archive_Completed_Treatments_After_Value);

			if(Archive_Completed_Treatments_After_Value.equalsIgnoreCase(Archive_Completed_Treatments_After)){

				System.out.println("Result   : PASS");
				Report_Listen.log_print_in_report().pass("Archive Completed Treatments After validation passed.");
			}
			else{

				System.out.println("Result   : FAIL");
				Report_Listen.log_print_in_report().fail("Archive Completed Treatments After validation failed. Expected: " + Archive_Completed_Treatments_After + " | Actual: " + Archive_Completed_Treatments_After_Value);

				softAssert.assertEquals(Archive_Completed_Treatments_After_Value, Archive_Completed_Treatments_After, "Archive Completed Treatments After validation failed.");
			}

			WebElement Delete_Archived_Treatments_After_Field = pop_up_inputs.get(1);
			String Delete_Archived_Treatments_After_Value = Delete_Archived_Treatments_After_Field.getAttribute("value");

			int Integer_Delete_Archived_Treatments_After = Integer.parseInt(Delete_Archived_Treatments_After);
			int New_Integer_Delete_Archived_Treatments_After = (Integer_Delete_Archived_Treatments_After)>2190 ?2190:Integer_Delete_Archived_Treatments_After;
			String New_Integer_Delete_Archived_Treatments_After_String = String.valueOf(New_Integer_Delete_Archived_Treatments_After);

			System.out.println();
			System.out.println("Delete Archived Treatments After");
			System.out.println("Expected : " + New_Integer_Delete_Archived_Treatments_After_String);
			System.out.println("Actual   : " + Delete_Archived_Treatments_After_Value);

			if(Delete_Archived_Treatments_After_Value.equalsIgnoreCase(New_Integer_Delete_Archived_Treatments_After_String)){

				System.out.println("Result   : PASS");
				Report_Listen.log_print_in_report().pass("Delete Archived Treatments After validation passed.");
			}
			else{

				System.out.println("Result   : FAIL");
				Report_Listen.log_print_in_report().fail("Delete Archived Treatments After validation failed. Expected: " + New_Integer_Delete_Archived_Treatments_After_String + " | Actual: " + Delete_Archived_Treatments_After_Value);

				softAssert.assertEquals(Delete_Archived_Treatments_After_Value, New_Integer_Delete_Archived_Treatments_After_String, "Delete Archived Treatments After validation failed.");
			}

			System.out.println();

			p.Modal_close_button().click();
		}
	}

	System.out.println("---------------- FAQ VALIDATION ----------------");
	System.out.println("FAQ Group : " + FAQ.get("Group Name"));
	System.out.println();

	Report_Listen.log_print_in_report().info("Validating FAQ Group: " + FAQ.get("Group Name"));

	Patient_Portal_FAQ_Validator(FAQ, softAssert);

	softAssert.assertAll();

	System.out.println("============================================================");
	System.out.println("        PATIENT PORTAL VALIDATION COMPLETED");
	System.out.println("============================================================");
	System.out.println("Portal : " + Portal_Name);
	System.out.println("Result : PASS");
	System.out.println();

	Report_Listen.log_print_in_report().pass("---------------- PATIENT PORTAL VALIDATION COMPLETED ----------------");
	Report_Listen.log_print_in_report().pass("Patient Portal configuration validation completed successfully.");
}
	
	
	


public void patient_portal_form_editor(TreeMap<String, String> Form_data, WebElement Config_button, TreeMap<String, String> FAQ) throws Exception {

	Channel_Module_Locaters p = new Channel_Module_Locaters(d);
	Repeat rp = new Repeat(d);
	Product_Module_Locaters pd = new Product_Module_Locaters(d);

	String Portal_Name = Form_data.get("Portal Name");
	String Portal_URL = Form_data.get("Portal URL");
	String Status = Form_data.get("Status");
	String Description = Form_data.get("Description");
	String Search_Engine_Indexing = Form_data.get("Enable Search Engine Indexing");
	String Login_Method = Form_data.get("Login Method");
	String Two_Factor_Authentication = Form_data.get("Two-Factor Authentication");
	String Cancellation_Offer = Form_data.get("Cancellation Offer");
	String Discount_Amount = Form_data.get("Discount Amount");
	String Offer_Cooldown = Form_data.get("Offer Cooldown");
	String Automatic_Approval = Form_data.get("Automatic Approval");
	String Approval_Timing = Form_data.get("Approval Timing");
	String Emergency_Contact_Country_Code = Form_data.get("Emergency Contact Country Code");
	String Emergency_Contact_Number = Form_data.get("Emergency Contact Number");
	String Emergency_Contact_Title = Form_data.get("Emergency Contact Title");
	String Emergency_Contact_Description = Form_data.get("Emergency Contact Description");
	String Emergency_Disclaimer = Form_data.get("Emergency Disclaimer");
	String Maximum_Extension = Form_data.get("Maximum Extension");
	String Maximum_Reduction = Form_data.get("Maximum Reduction");
	String Archive_Completed_Treatments_After = Form_data.get("Archive Completed Treatments After");
	String Delete_Archived_Treatments_After = Form_data.get("Delete Archived Treatments After");

	int Integer_Delete_Archived_Treatments_After = Integer.parseInt(Delete_Archived_Treatments_After);
	int New_Integer_Delete_Archived_Treatments_After = (Integer_Delete_Archived_Treatments_After)>2190 ?2190:Integer_Delete_Archived_Treatments_After;
	String New_Integer_Delete_Archived_Treatments_After_String = String.valueOf(New_Integer_Delete_Archived_Treatments_After);

	try {

		System.out.println();
		System.out.println("============================================================");
		System.out.println("             PATIENT PORTAL CONFIGURATION");
		System.out.println("============================================================");
		System.out.println("Portal : " + Portal_Name);
		System.out.println();

		Report_Listen.log_print_in_report().info("---------------- PATIENT PORTAL CONFIGURATION ----------------");
		Report_Listen.log_print_in_report().info("Portal: " + Portal_Name);

		System.out.println("---------------- CONFIGURATION DATA ----------------");
		System.out.println("Portal URL             : " + Portal_URL);
		System.out.println("Status                 : " + Status);
		System.out.println("Search Engine Indexing : " + Search_Engine_Indexing);
		System.out.println("Login Method           : " + Login_Method);
		System.out.println("Two-Factor Auth        : " + Two_Factor_Authentication);
		System.out.println();

		Report_Listen.log_print_in_report().info("Portal URL: " + Portal_URL);
		Report_Listen.log_print_in_report().info("Status: " + Status);
		Report_Listen.log_print_in_report().info("Login Method: " + Login_Method);

		System.out.println("---------------- OPEN CONFIGURATION ----------------");
		System.out.println("Action : Open Patient Portal configuration");

		Report_Listen.log_print_in_report().info("Action: Open Patient Portal configuration");

		Config_button.click();

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(d).withTimeout(Duration.ofSeconds(80)).pollingEvery(Duration.ofMillis(500)).ignoring(NoSuchElementException.class).ignoring(StaleElementReferenceException.class);
		WebElement Form = wait.until(driver -> p.Form());

		System.out.println("Result : PASS");
		System.out.println();

		Report_Listen.log_print_in_report().pass("Patient Portal configuration opened successfully.");

		WebElement Treatment_Management_Section = p.Treatment_management_Section();
		rp.wait_for_theElement(Treatment_Management_Section);
		rp.Scroll_to_element(Treatment_Management_Section);
		Thread.sleep(500);

		List<WebElement> dropdown_fields = p.Patient_Portal_config_Form_Dropdown_fields(Form);

		for(WebElement dropdown_field : dropdown_fields){

			String Field_Value = dropdown_field.getText().trim();
			Report_Listen.log_print_in_report().info("Configured Dropdown Value: " + Field_Value);
		}

		System.out.println("---------------- PORTAL DESCRIPTION ----------------");
		System.out.println("Action : Enter Portal description");

		p.Textarea_Description_Field().sendKeys(Description);

		System.out.println("Result : PASS");
		System.out.println();

		Report_Listen.log_print_in_report().pass("Portal Description entered successfully.");

		System.out.println("============================================================");
		System.out.println("             FEATURE DEFAULT VALIDATION");
		System.out.println("============================================================");

		Report_Listen.log_print_in_report().info("---------------- FEATURE DEFAULT VALIDATION ----------------");

		List<WebElement> Cards = Treatment_Management_Section.findElements(By.xpath(".//*[contains(@class,'ant-typography text-dark')]/../../.."));
		rp.wait_for_theElement(Cards);

		for(WebElement Card : Cards){

			WebElement Card_Text_element = Card.findElement(By.xpath(".//*[contains(@class,'ant-typography text-dark')]"));
			rp.wait_for_theElement(Card_Text_element);

			String Card_Text = Card_Text_element.getText().trim();

			WebElement Feature_Toggle_Button = Card.findElement(By.xpath(".//button[@role='switch']"));
			rp.wait_for_theElement(Feature_Toggle_Button);

			String Toggle_State = Feature_Toggle_Button.getAttribute("aria-checked");
			String Actual_State = Toggle_State.equals("true") ? "ON" : "OFF";
			String Expected_State = null;

			if(Card_Text.contains("Cancel Treatment")){
				Expected_State = "ON";
			}

			if(Card_Text.contains("Doctor Consultation")){
				Expected_State = "ON";
			}

			if(Card_Text.contains("Change Refill Date")){
				Expected_State = "OFF";
			}

			if(Card_Text.contains("Swap Treatment")){
				Expected_State = "ON";
			}

			if(Card_Text.contains("Renew Treatment")){
				Expected_State = "ON";
			}

			if(Card_Text.contains("Incomplete Treatments")){
				Expected_State = "OFF";
			}

			if(Card_Text.contains("Archived Treatments")){
				Expected_State = "ON";
			}

			if(Card_Text.contains("Emergency Contact Widget")){
				Expected_State = "OFF";
			}

			if(Card_Text.contains("Treatment FAQs")){
				Expected_State = "OFF";
			}

			if(Card_Text.contains("Support Consultation")){
				Expected_State = "ON";
			}

			if(Expected_State!=null){

				System.out.println("Feature  : " + Card_Text);
				System.out.println("Expected : " + Expected_State);
				System.out.println("Actual   : " + Actual_State);

				Report_Listen.log_print_in_report().info("Feature: " + Card_Text);
				Report_Listen.log_print_in_report().info("Expected: " + Expected_State);
				Report_Listen.log_print_in_report().info("Actual: " + Actual_State);

				if(Actual_State.equals(Expected_State)){

					System.out.println("Result   : PASS");
					System.out.println();

					Report_Listen.log_print_in_report().pass("Result: PASS");
				}
				else{

					System.out.println("Result   : FAIL");
					System.out.println("Reason   : Feature default does not match PRD.");
					System.out.println();

					Report_Listen.log_print_in_report().fail("Result: FAIL");
					Report_Listen.log_print_in_report().fail("Reason: Feature default does not match PRD.");
				}
			}

			if(Card_Text.contains("Cancel Treatment")){

				System.out.println("---------------- CANCEL TREATMENT CONFIGURATION ----------------");

				if(Toggle_State.equals("true")){

					System.out.println("Action : Open Settings");

					WebElement Settings_Button = Card.findElement(By.xpath(".//button[not(@role='switch')]"));
					rp.wait_for_theElement(Settings_Button);
					Settings_Button.click();
				}
				else{

					System.out.println("Action : Enable Cancel Treatment");

					rp.wait_for_theElement(Feature_Toggle_Button);
					Thread.sleep(500);
					Feature_Toggle_Button.click();
				}

				WebElement pop_up_form = p.Popup_Form();

				List<WebElement> popup_toggles = pop_up_form.findElements(By.xpath(".//button[@role='switch']"));
				rp.wait_for_theElement(popup_toggles);

				WebElement First_Toggle = popup_toggles.get(0);
				rp.wait_for_theElement(First_Toggle);
				First_Toggle.click();

				List<WebElement> pop_up_inputs = pop_up_form.findElements(By.xpath(".//input[@id='discount_percent' or @id='offer_cooldown_days']"));
				rp.wait_for_theElement(pop_up_inputs);

				pop_up_inputs.get(0).sendKeys(Discount_Amount);
				pop_up_inputs.get(1).sendKeys(Offer_Cooldown);

				p.Modal_Save_Settings_Button().click();

				System.out.println("Cancellation Offer : " + Cancellation_Offer);
				System.out.println("Discount Amount    : " + Discount_Amount);
				System.out.println("Offer Cooldown     : " + Offer_Cooldown);
				System.out.println("Result             : PASS");
				System.out.println();

				Report_Listen.log_print_in_report().info("Cancellation Offer: " + Cancellation_Offer);
				Report_Listen.log_print_in_report().info("Discount Amount: " + Discount_Amount);
				Report_Listen.log_print_in_report().info("Offer Cooldown: " + Offer_Cooldown);
				Report_Listen.log_print_in_report().pass("Cancel Treatment configuration saved successfully.");
			}

			if(Card_Text.contains("Change Refill Date")){

				System.out.println("---------------- CHANGE REFILL DATE CONFIGURATION ----------------");

				if(Toggle_State.equals("false")){

					System.out.println("Action : Enable Change Refill Date");

					rp.wait_for_theElement(Feature_Toggle_Button);
					Thread.sleep(500);
					Feature_Toggle_Button.click();
				}
				else{

					System.out.println("Action : Open Settings");

					WebElement Settings_Button = Card.findElement(By.xpath(".//button[not(@role='switch')]"));
					rp.wait_for_theElement(Settings_Button);
					Settings_Button.click();
				}

				WebElement pop_up_form = p.Popup_Form();

				List<WebElement> pop_up_inputs = pop_up_form.findElements(By.xpath(".//input[@id='max_extension_days' or @id='max_reduction_days']"));
				rp.wait_for_theElement(pop_up_inputs);

				WebElement Max_Extension = pop_up_inputs.get(0);
				Max_Extension.sendKeys(Maximum_Extension);

				WebElement MaximumReduction = pop_up_inputs.get(1);
				MaximumReduction.sendKeys(Maximum_Reduction);

				p.Modal_Save_Settings_Button().click();

				System.out.println("Maximum Extension : " + Maximum_Extension);
				System.out.println("Maximum Reduction : " + Maximum_Reduction);
				System.out.println("Result            : PASS");
				System.out.println();

				Report_Listen.log_print_in_report().info("Maximum Extension: " + Maximum_Extension);
				Report_Listen.log_print_in_report().info("Maximum Reduction: " + Maximum_Reduction);
				Report_Listen.log_print_in_report().pass("Change Refill Date configuration saved successfully.");
			}

			if(Card_Text.contains("Emergency Contact Widget")){

				System.out.println("---------------- EMERGENCY CONTACT CONFIGURATION ----------------");

				if(Toggle_State.equals("false")){

					System.out.println("Action : Enable Emergency Contact Widget");

					rp.wait_for_theElement(Feature_Toggle_Button);
					Thread.sleep(500);
					Feature_Toggle_Button.click();
				}
				else{

					System.out.println("Action : Open Settings");

					WebElement Settings_Button = Card.findElement(By.xpath(".//button[not(@role='switch')]"));
					rp.wait_for_theElement(Settings_Button);
					Settings_Button.click();
				}

				WebElement pop_up_form = p.Popup_Form();

				List<WebElement> pop_up_inputs = pop_up_form.findElements(By.xpath(".//input[@id='contact_number' or @id='contact_dial_code']"));
				rp.wait_for_theElement(pop_up_inputs);

				List<WebElement> pop_up_Textareas = pop_up_form.findElements(By.xpath(".//textarea[@id='title' or @id='description' or @id='disclaimer']"));
				rp.wait_for_theElement(pop_up_Textareas);

				WebElement Country_Code = pop_up_inputs.get(0);
				Country_Code.sendKeys(Emergency_Contact_Country_Code);

				WebElement Emergency_Contact_Number_Field = pop_up_inputs.get(1);

				WebElement Country_Code_list = pd.First_Virtual_List_holder();

				List<WebElement> Country_Code_list_options = Country_Code_list.findElements(By.xpath(".//*[contains(@class,'ant-select-item ant-select-item-option ant-select-item-option')]"));
				rp.wait_for_theElement(Country_Code_list_options);

				boolean Country_Code_Matched = false;

				for(WebElement Country_Code_option : Country_Code_list_options){

					String Country_Code_option_text = Country_Code_option.getText().trim();

					if(Country_Code_option_text.contains(Emergency_Contact_Country_Code)){

						Country_Code_option.click();
						Country_Code_Matched = true;

						break;
					}
				}

				if(!Country_Code_Matched){

					System.out.println("Country Code");
					System.out.println("Expected : " + Emergency_Contact_Country_Code);
					System.out.println("Actual   : Not Found");
					System.out.println("Result   : FAIL");
					System.out.println();

					Report_Listen.log_print_in_report().fail("Emergency Contact Country Code was not found: " + Emergency_Contact_Country_Code);
				}

				Emergency_Contact_Number_Field.sendKeys(Emergency_Contact_Number);

				WebElement Emergency_Contact_Title_Field = pop_up_Textareas.get(0);
				Emergency_Contact_Title_Field.sendKeys(Emergency_Contact_Title);

				WebElement Emergency_Contact_Description_Field = pop_up_Textareas.get(1);
				Emergency_Contact_Description_Field.sendKeys(Emergency_Contact_Description);

				WebElement Emergency_Disclaimer_Field = pop_up_Textareas.get(2);
				Emergency_Disclaimer_Field.sendKeys(Emergency_Disclaimer);

				p.Modal_Save_Settings_Button().click();

				System.out.println("Country Code : " + Emergency_Contact_Country_Code);
				System.out.println("Number       : " + Emergency_Contact_Number);
				System.out.println("Title        : " + Emergency_Contact_Title);
				System.out.println("Result       : PASS");
				System.out.println();

				Report_Listen.log_print_in_report().info("Emergency Contact Country Code: " + Emergency_Contact_Country_Code);
				Report_Listen.log_print_in_report().info("Emergency Contact Number: " + Emergency_Contact_Number);
				Report_Listen.log_print_in_report().pass("Emergency Contact Widget configuration saved successfully.");
			}

			if(Card_Text.contains("Archived Treatments")){

				System.out.println("---------------- ARCHIVED TREATMENTS CONFIGURATION ----------------");

				if(Toggle_State.equals("true")){

					System.out.println("Action : Open Settings");

					WebElement Settings_Button = Card.findElement(By.xpath(".//button[not(@role='switch')]"));
					rp.wait_for_theElement(Settings_Button);
					Settings_Button.click();
				}
				else{

					System.out.println("Action : Enable Archived Treatments");

					rp.wait_for_theElement(Feature_Toggle_Button);
					Thread.sleep(500);
					Feature_Toggle_Button.click();
				}

				WebElement pop_up_form = p.Popup_Form();

				List<WebElement> pop_up_inputs = pop_up_form.findElements(By.xpath(".//input[@id='archive_after_days' or @id='delete_after_days']"));
				rp.wait_for_theElement(pop_up_inputs);

				WebElement Archive_Completed_Treatments_After_Field = pop_up_inputs.get(0);
				WebElement Delete_Archived_Treatments_After_Field = pop_up_inputs.get(1);

				String Default_Archive_Value = Archive_Completed_Treatments_After_Field.getAttribute("value").trim();
				String Default_Delete_Value = Delete_Archived_Treatments_After_Field.getAttribute("value").trim();

				System.out.println("Default Archive Duration");
				System.out.println("Expected : 30");
				System.out.println("Actual   : " + Default_Archive_Value);
				System.out.println("Result   : " + (Default_Archive_Value.equals("30") ? "PASS" : "FAIL"));

				Report_Listen.log_print_in_report().info("Archive Default | Expected: 30 | Actual: " + Default_Archive_Value);

				if(Default_Archive_Value.equals("30")){
					Report_Listen.log_print_in_report().pass("Archive default validation passed.");
				}
				else{
					Report_Listen.log_print_in_report().fail("Archive default validation failed.");
				}

				System.out.println();
				System.out.println("Default Delete Duration");
				System.out.println("Expected : 365");
				System.out.println("Actual   : " + Default_Delete_Value);
				System.out.println("Result   : " + (Default_Delete_Value.equals("365") ? "PASS" : "FAIL"));
				System.out.println();

				Report_Listen.log_print_in_report().info("Delete Default | Expected: 365 | Actual: " + Default_Delete_Value);

				if(Default_Delete_Value.equals("365")){
					Report_Listen.log_print_in_report().pass("Delete default validation passed.");
				}
				else{
					Report_Listen.log_print_in_report().fail("Delete default validation failed.");
				}

				Archive_Completed_Treatments_After_Field.click();
				Archive_Completed_Treatments_After_Field.sendKeys(Keys.CONTROL + "a");
				Archive_Completed_Treatments_After_Field.sendKeys(Keys.BACK_SPACE);
				Archive_Completed_Treatments_After_Field.sendKeys(Archive_Completed_Treatments_After);

				Delete_Archived_Treatments_After_Field.click();
				Delete_Archived_Treatments_After_Field.sendKeys(Keys.CONTROL + "a");
				Delete_Archived_Treatments_After_Field.sendKeys(Keys.BACK_SPACE);
				Delete_Archived_Treatments_After_Field.sendKeys(New_Integer_Delete_Archived_Treatments_After_String);

				WebElement Save_Butt = p.Modal_Save_Settings_Button();
				Save_Butt.click();
				rp.wait_for_invisibilty_of_theElement(Save_Butt);

				System.out.println("Configured Archive Duration : " + Archive_Completed_Treatments_After);
				System.out.println("Configured Delete Duration  : " + New_Integer_Delete_Archived_Treatments_After_String);
				System.out.println("Result                      : PASS");
				System.out.println();

				Report_Listen.log_print_in_report().info("Archive Completed Treatments After: " + Archive_Completed_Treatments_After);
				Report_Listen.log_print_in_report().info("Delete Archived Treatments After: " + New_Integer_Delete_Archived_Treatments_After_String);
				Report_Listen.log_print_in_report().pass("Archived Treatments configuration saved successfully.");
			}
		}

		System.out.println("---------------- FAQ CONFIGURATION ----------------");
		System.out.println("FAQ Group : " + FAQ.get("Group Name"));
		System.out.println();

		Report_Listen.log_print_in_report().info("Configuring FAQ Group: " + FAQ.get("Group Name"));

		Patient_Portal_FAQ_Add(FAQ);

		System.out.println("============================================================");
		System.out.println("       PATIENT PORTAL CONFIGURATION COMPLETED");
		System.out.println("============================================================");
		System.out.println("Portal : " + Portal_Name);
		System.out.println("Result : PASS");
		System.out.println();

		Report_Listen.log_print_in_report().pass("---------------- PATIENT PORTAL CONFIGURATION COMPLETED ----------------");
		Report_Listen.log_print_in_report().pass("Patient Portal configuration completed successfully: " + Portal_Name);
	}
	catch(Exception e){

		System.out.println("---------------- PATIENT PORTAL CONFIGURATION FAILED ----------------");
		System.out.println("Portal : " + Portal_Name);
		System.out.println("Result : FAIL");
		System.out.println("Reason : " + e.getMessage());
		System.out.println();

		Report_Listen.log_print_in_report().fail("Patient Portal configuration failed: " + Portal_Name);
		Report_Listen.log_print_in_report().fail("Reason: " + e.getMessage());

		throw e;
	}
}


}
