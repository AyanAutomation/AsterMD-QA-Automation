package AsterMD.Project.AsterMD;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.TreeMap;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Listerners.Report_Listen;
import Locaters.Channel_Module_Locaters;

import Repeatative_codes.Repeat;

import Locaters.Channel_Module_Locaters;

public class Channels_Module extends Patient_Module{
	
	public WebElement Channel_Module_Accessor() throws Exception {

		Channel_Module_Locaters p = new Channel_Module_Locaters(d);

		try {

			Report_Listen.log_print_in_report().info("──────────────────── 👥 Channel MODULE ACCESS ────────────────────");
			Report_Listen.log_print_in_report().info("<b>Action:</b> Navigate to the Channels module through the application Side Menu.");

			System.out.println("👥 Channel MODULE ACCESS");
			System.out.println();

			System.out.println("🔹 Navigating to the Channels module through the Side Menu.");
			System.out.println();

			Side_Menu_Navigation("Channels");

			Report_Listen.log_print_in_report().pass("✅ Channels module navigation completed successfully.");
			System.out.println("✅ Channels module navigation completed successfully.");
			System.out.println();

			Report_Listen.log_print_in_report().info("──────────────────── ➕ Channel ADD ACCESS ────────────────────");
			Report_Listen.log_print_in_report().info("<b>Action:</b> Retrieve the Channel Add button from the Channels module.");

			System.out.println("➕ Channel ADD ACCESS");
			System.out.println();

			System.out.println("🔹 Retrieving the Channel Add button.");
			System.out.println();

			WebElement Add_Button = p.Channel_Add_Button();

			Report_Listen.log_print_in_report().pass("✅ Channel Add button retrieved successfully.");
			System.out.println("✅ Channel Add button retrieved successfully.");
			System.out.println();

			return Add_Button;

		} catch(Exception e) {

			if(Report_Listen.log_print_in_report() != null) Report_Listen.log_print_in_report().fail("❌ Channel Module access failed. Failure reason: " + e.getMessage());

			System.out.println("❌ Channel Module access failed.");
			System.out.println();

			System.out.println("❌ Failure reason: " + e.getMessage());
			System.out.println();

			throw e;
		}
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
	data1.put("Group Name", "Account and Login");
	data1.put("Icon", "User");
	data1.put("Group Description", "Common questions about creating an account, signing in, passwords, verification, and accessing the patient portal.");
	data1.put("Question 1", "How do I create a patient portal account?");
	data1.put("Answer 1", "Use the registration option provided by your healthcare organization and complete the required personal information.");
	data1.put("Question 2", "How do I log in to my account?");
	data1.put("Answer 2", "Enter your registered email address and password on the patient portal login page.");
	data1.put("Question 3", "What should I do if I forgot my password?");
	data1.put("Answer 3", "Select Forgot Password and follow the instructions sent to your registered email address.");
	data1.put("Question 4", "Why am I unable to log in?");
	data1.put("Answer 4", "Check that your email and password are correct and confirm that your account is active.");
	data1.put("Question 5", "Can I change my login email?");
	data1.put("Answer 5", "You can update your email from your account settings when this option is available.");
	data1.put("Question 6", "Why did I not receive the verification email?");
	data1.put("Answer 6", "Check your spam folder and confirm that the email address entered during registration is correct.");
	data1.put("Question 7", "Can I resend my verification email?");
	data1.put("Answer 7", "Yes, use the resend verification option available on the verification screen.");
	data1.put("Question 8", "What happens if my account becomes locked?");
	data1.put("Answer 8", "Follow the account recovery instructions or contact the support team for assistance.");
	data1.put("Question 9", "Can I use the same account on multiple devices?");
	data1.put("Answer 9", "Yes, you can access your account from supported devices using the same login credentials.");
	data1.put("Question 10", "Can family members use my account?");
	data1.put("Answer 10", "Your account should only be used by authorized individuals according to the portal access policy.");
	data1.put("Question 11", "How can I sign out?");
	data1.put("Answer 11", "Select the logout or sign-out option from your patient portal account menu.");
	data1.put("Question 12", "Does my session expire automatically?");
	data1.put("Answer 12", "The portal may automatically sign you out after a period of inactivity for security.");
	data1.put("Question 13", "Can I save my login information?");
	data1.put("Answer 13", "Your browser may offer this feature, but use it only on a trusted personal device.");
	data1.put("Question 14", "How do I update my password?");
	data1.put("Answer 14", "Open your account security settings and select the option to change your password.");
	data1.put("Question 15", "What should I do if someone accessed my account?");
	data1.put("Answer 15", "Change your password immediately and contact support if you notice unauthorized activity.");
	data1.put("Question 16", "Why am I being asked to verify my identity?");
	data1.put("Answer 16", "Identity verification helps protect your medical and personal information.");
	data1.put("Question 17", "Can I register with a different email address?");
	data1.put("Answer 17", "Use an email address that you control and that meets the portal registration requirements.");
	data1.put("Question 18", "Why does my login link expire?");
	data1.put("Answer 18", "Login and verification links may expire after a limited period for security.");
	data1.put("Question 19", "Can I reactivate an inactive account?");
	data1.put("Answer 19", "Account reactivation options depend on your healthcare organization's portal settings.");
	data1.put("Question 20", "Who should I contact for account access problems?");
	data1.put("Answer 20", "Contact the patient portal support team when normal account recovery options do not resolve the issue.");

	TreeMap<String, String> data2 = new TreeMap<String, String>();
	data2.put("Group Name", "Profile and Personal Information");
	data2.put("Icon", "User");
	data2.put("Group Description", "Information about managing personal details, contact information, addresses, and patient profile settings.");
	data2.put("Question 1", "How can I update my personal information?");
	data2.put("Answer 1", "Open your profile settings and edit the personal information fields that are available.");
	data2.put("Question 2", "Can I change my first or last name?");
	data2.put("Answer 2", "Name changes may require verification depending on your healthcare organization's policy.");
	data2.put("Question 3", "How can I update my phone number?");
	data2.put("Answer 3", "Edit your phone number from the contact information section of your profile.");
	data2.put("Question 4", "How do I change my home address?");
	data2.put("Answer 4", "Open your profile and update the address fields with your current information.");
	data2.put("Question 5", "Can I add a second address?");
	data2.put("Answer 5", "Additional address information can be entered when the portal provides an Address Line 2 field.");
	data2.put("Question 6", "Why is accurate contact information important?");
	data2.put("Answer 6", "Current information helps ensure important healthcare and account communications reach you.");
	data2.put("Question 7", "Can I update my city and state?");
	data2.put("Answer 7", "Yes, update your address information using the available profile fields.");
	data2.put("Question 8", "How do I change my ZIP code?");
	data2.put("Answer 8", "Edit the ZIP or postal code in your address section and save the changes.");
	data2.put("Question 9", "Can I change my country?");
	data2.put("Answer 9", "Country availability depends on the locations supported by your healthcare organization.");
	data2.put("Question 10", "How can I review my saved information?");
	data2.put("Answer 10", "Open your profile page to review the information currently associated with your account.");
	data2.put("Question 11", "Why can I not edit some profile fields?");
	data2.put("Answer 11", "Certain information may be restricted and require assistance from the healthcare organization.");
	data2.put("Question 12", "How do I correct incorrect personal information?");
	data2.put("Answer 12", "Edit the information when allowed or contact support if the field cannot be changed.");
	data2.put("Question 13", "Can I add a middle name?");
	data2.put("Answer 13", "Enter your middle name in the available Middle Name field when applicable.");
	data2.put("Question 14", "How quickly are profile changes applied?");
	data2.put("Answer 14", "Most saved profile changes should appear after the update is successfully submitted.");
	data2.put("Question 15", "Can my provider see my updated information?");
	data2.put("Answer 15", "Updated information may be available to authorized members of your healthcare team.");
	data2.put("Question 16", "Can I update my preferred contact information?");
	data2.put("Answer 16", "Use the profile or communication settings available within the portal.");
	data2.put("Question 17", "What happens if I enter an incorrect address?");
	data2.put("Answer 17", "Incorrect address information may affect communications or deliveries, so correct it as soon as possible.");
	data2.put("Question 18", "Can I update my profile from a mobile device?");
	data2.put("Answer 18", "Yes, when profile management is supported on the mobile version of the portal.");
	data2.put("Question 19", "Is my profile information private?");
	data2.put("Answer 19", "Profile information is intended to be accessible only according to authorized portal permissions.");
	data2.put("Question 20", "Do I need to save after editing my profile?");
	data2.put("Answer 20", "Yes, use the available save or update action to apply your changes.");

	TreeMap<String, String> data3 = new TreeMap<String, String>();
	data3.put("Group Name", "Appointments");
	data3.put("Icon", "User");
	data3.put("Group Description", "Questions about scheduling, reviewing, rescheduling, and managing healthcare appointments.");
	data3.put("Question 1", "How do I schedule an appointment?");
	data3.put("Answer 1", "Use the appointment scheduling option available in your patient portal.");
	data3.put("Question 2", "How can I view my upcoming appointments?");
	data3.put("Answer 2", "Open the appointments section to review your scheduled visits.");
	data3.put("Question 3", "Can I reschedule an appointment?");
	data3.put("Answer 3", "Use the reschedule option when it is available for the selected appointment.");
	data3.put("Question 4", "How do I cancel an appointment?");
	data3.put("Answer 4", "Open the appointment details and select the cancellation option if permitted.");
	data3.put("Question 5", "Can I choose my healthcare provider?");
	data3.put("Answer 5", "Provider selection depends on the appointment options available within your care program.");
	data3.put("Question 6", "How do I know whether my appointment is confirmed?");
	data3.put("Answer 6", "The appointment status displayed in the portal indicates whether the visit is confirmed.");
	data3.put("Question 7", "Can I book a same-day appointment?");
	data3.put("Answer 7", "Same-day availability depends on provider schedules and available appointment slots.");
	data3.put("Question 8", "Where can I see the appointment time?");
	data3.put("Answer 8", "The appointment date and time are displayed in the appointment details.");
	data3.put("Question 9", "Can I receive appointment reminders?");
	data3.put("Answer 9", "Reminder availability depends on your notification settings and portal configuration.");
	data3.put("Question 10", "What should I do if I am late?");
	data3.put("Answer 10", "Contact the care team or follow the instructions provided for your scheduled visit.");
	data3.put("Question 11", "Can I see previous appointments?");
	data3.put("Answer 11", "Past visits may be available in your appointment history.");
	data3.put("Question 12", "Why is an appointment slot unavailable?");
	data3.put("Answer 12", "The slot may already be booked or unavailable according to the provider's schedule.");
	data3.put("Question 13", "Can appointment times change?");
	data3.put("Answer 13", "Changes may occur when a provider schedule is updated.");
	data3.put("Question 14", "How will I know if my appointment is changed?");
	data3.put("Answer 14", "Updated appointment information may appear in the portal and through configured notifications.");
	data3.put("Question 15", "Can I book appointments for multiple services?");
	data3.put("Answer 15", "Available appointment types depend on services configured for your patient account.");
	data3.put("Question 16", "What information is shown in appointment details?");
	data3.put("Answer 16", "Appointment details may include the date, time, provider, visit type, and current status.");
	data3.put("Question 17", "Can I add appointment notes?");
	data3.put("Answer 17", "Additional information can be provided when the appointment workflow includes a notes field.");
	data3.put("Question 18", "Why was my appointment cancelled?");
	data3.put("Answer 18", "Review the appointment status or contact the healthcare team for specific cancellation details.");
	data3.put("Question 19", "Can I book another appointment after cancellation?");
	data3.put("Answer 19", "Yes, you can select another available appointment slot when scheduling is enabled.");
	data3.put("Question 20", "Who should I contact for scheduling assistance?");
	data3.put("Answer 20", "Contact the healthcare organization when you cannot complete scheduling through the portal.");

	TreeMap<String, String> data4 = new TreeMap<String, String>();
	data4.put("Group Name", "Telehealth Visits");
	data4.put("Icon", "User");
	data4.put("Group Description", "Information about online consultations, virtual appointments, connection requirements, and telehealth visits.");
	data4.put("Question 1", "What is a telehealth visit?");
	data4.put("Answer 1", "A telehealth visit allows you to meet with an authorized healthcare provider remotely.");
	data4.put("Question 2", "How do I join my telehealth appointment?");
	data4.put("Answer 2", "Open the scheduled appointment and use the available join option.");
	data4.put("Question 3", "What device can I use?");
	data4.put("Answer 3", "Use a supported computer, tablet, or mobile device with internet access.");
	data4.put("Question 4", "Do I need a camera?");
	data4.put("Answer 4", "Video appointments generally require a functioning camera when video consultation is used.");
	data4.put("Question 5", "Do I need a microphone?");
	data4.put("Answer 5", "A microphone is needed for voice communication during a video consultation.");
	data4.put("Question 6", "What happens if my internet disconnects?");
	data4.put("Answer 6", "Reconnect to the visit or follow the communication instructions provided by your care team.");
	data4.put("Question 7", "Can I join from my phone?");
	data4.put("Answer 7", "Yes, when the telehealth platform supports your mobile device and browser.");
	data4.put("Question 8", "When should I join the appointment?");
	data4.put("Answer 8", "Join according to the appointment instructions and scheduled time shown in the portal.");
	data4.put("Question 9", "Can I test my device before the appointment?");
	data4.put("Answer 9", "Use any available device or connection test offered by the telehealth platform.");
	data4.put("Question 10", "Why can I not see the Join button?");
	data4.put("Answer 10", "The join option may only become available within the configured appointment window.");
	data4.put("Question 11", "Can I cancel a telehealth appointment?");
	data4.put("Answer 11", "Use the appointment cancellation option when cancellation is permitted.");
	data4.put("Question 12", "Can my provider send instructions during the visit?");
	data4.put("Answer 12", "Your provider may provide treatment or follow-up instructions during the consultation.");
	data4.put("Question 13", "Are telehealth visits private?");
	data4.put("Answer 13", "Telehealth sessions should be accessed only through the authorized patient platform.");
	data4.put("Question 14", "Can I use headphones during my visit?");
	data4.put("Answer 14", "Yes, headphones can help improve privacy and audio quality.");
	data4.put("Question 15", "What if my camera does not work?");
	data4.put("Answer 15", "Check device permissions and follow the technical support options provided by the platform.");
	data4.put("Question 16", "Can I switch devices during the appointment?");
	data4.put("Answer 16", "This depends on the capabilities of the telehealth system being used.");
	data4.put("Question 17", "Can another person join my visit?");
	data4.put("Answer 17", "Additional participants should only join when permitted by you and your healthcare provider.");
	data4.put("Question 18", "Can I access telehealth from another location?");
	data4.put("Answer 18", "Access may depend on healthcare service availability and applicable location requirements.");
	data4.put("Question 19", "Will I receive a telehealth reminder?");
	data4.put("Answer 19", "You may receive reminders when appointment notifications are enabled.");
	data4.put("Question 20", "What should I do if the telehealth visit fails?");
	data4.put("Answer 20", "Contact your care team or technical support using the available portal support options.");

	TreeMap<String, String> data5 = new TreeMap<String, String>();
	data5.put("Group Name", "Prescriptions and Medications");
	data5.put("Icon", "User");
	data5.put("Group Description", "Patient questions related to prescriptions, medication information, treatment instructions, and active medications.");
	data5.put("Question 1", "Where can I see my active prescriptions?");
	data5.put("Answer 1", "Open the prescriptions or medications section of your patient portal.");
	data5.put("Question 2", "How do I know if a prescription is active?");
	data5.put("Answer 2", "Check the status displayed with the prescription details.");
	data5.put("Question 3", "Can I request a new prescription?");
	data5.put("Answer 3", "Prescription availability depends on your treatment and provider evaluation.");
	data5.put("Question 4", "Can I request a refill?");
	data5.put("Answer 4", "Use the refill option when it is available for your prescription.");
	data5.put("Question 5", "Where can I see medication instructions?");
	data5.put("Answer 5", "Review the medication or prescription details provided in the portal.");
	data5.put("Question 6", "Can I stop a medication through the portal?");
	data5.put("Answer 6", "Medication changes should follow instructions from your healthcare provider.");
	data5.put("Question 7", "Why is my prescription pending?");
	data5.put("Answer 7", "A pending prescription may still require clinical review, approval, or processing.");
	data5.put("Question 8", "What does prescription expired mean?");
	data5.put("Answer 8", "The prescription is no longer active according to its configured validity period.");
	data5.put("Question 9", "Can I see previous prescriptions?");
	data5.put("Answer 9", "Prescription history may be available in your patient account.");
	data5.put("Question 10", "Can a prescription be changed?");
	data5.put("Answer 10", "Prescription changes require appropriate review by an authorized healthcare provider.");
	data5.put("Question 11", "Why was my prescription declined?");
	data5.put("Answer 11", "Review available status information or contact your care team for details.");
	data5.put("Question 12", "Can I have multiple active prescriptions?");
	data5.put("Answer 12", "This depends on the products, treatment rules, and clinical decisions associated with your care.");
	data5.put("Question 13", "Can I download prescription information?");
	data5.put("Answer 13", "Download availability depends on the features enabled for your patient portal.");
	data5.put("Question 14", "How will I know when a prescription is approved?");
	data5.put("Answer 14", "The prescription status should update after approval and may also generate a notification.");
	data5.put("Question 15", "Can I ask questions about my medication?");
	data5.put("Answer 15", "Use available messaging or consultation options to contact your healthcare team.");
	data5.put("Question 16", "Can I update my pharmacy?");
	data5.put("Answer 16", "Pharmacy selection can be updated when this functionality is enabled.");
	data5.put("Question 17", "What should I do if medication information looks incorrect?");
	data5.put("Answer 17", "Contact your healthcare team before making changes based on incorrect information.");
	data5.put("Question 18", "Can I reorder prescribed medication?");
	data5.put("Answer 18", "Reordering depends on prescription status and available refill options.");
	data5.put("Question 19", "Where can I see prescription dates?");
	data5.put("Answer 19", "Relevant dates are displayed within the prescription details when available.");
	data5.put("Question 20", "Who can approve my prescription?");
	data5.put("Answer 20", "Prescription approval is handled by an appropriately authorized healthcare provider.");

	TreeMap<String, String> data6 = new TreeMap<String, String>();
	data6.put("Group Name", "Pharmacy and Refills");
	data6.put("Icon", "User");
	data6.put("Group Description", "Information about pharmacy selection, prescription processing, medication refills, and pharmacy-related status.");
	data6.put("Question 1", "How do I select a pharmacy?");
	data6.put("Answer 1", "Choose an available pharmacy through the pharmacy selection option in your portal.");
	data6.put("Question 2", "Can I change my pharmacy?");
	data6.put("Answer 2", "You can change the selected pharmacy when the portal allows pharmacy updates.");
	data6.put("Question 3", "How do I request a medication refill?");
	data6.put("Answer 3", "Open the eligible prescription and select the available refill option.");
	data6.put("Question 4", "Why is my refill unavailable?");
	data6.put("Answer 4", "The prescription may not currently be eligible for another refill.");
	data6.put("Question 5", "How do I know whether the pharmacy received my prescription?");
	data6.put("Answer 5", "Check the prescription or pharmacy status shown in your portal.");
	data6.put("Question 6", "Can I use a different pharmacy for each prescription?");
	data6.put("Answer 6", "This depends on pharmacy configuration and available prescription options.");
	data6.put("Question 7", "What does pharmacy processing mean?");
	data6.put("Answer 7", "It means the prescription is being handled by the selected pharmacy.");
	data6.put("Question 8", "Can I see pharmacy contact information?");
	data6.put("Answer 8", "Pharmacy details may be displayed with your prescription information.");
	data6.put("Question 9", "Can I cancel a refill request?");
	data6.put("Answer 9", "Cancellation availability depends on the current processing status.");
	data6.put("Question 10", "Why was my refill request rejected?");
	data6.put("Answer 10", "The refill may require additional review or may not meet current prescription requirements.");
	data6.put("Question 11", "Can my provider authorize another refill?");
	data6.put("Answer 11", "Your provider may review refill eligibility when additional authorization is needed.");
	data6.put("Question 12", "Can the pharmacy change my medication?");
	data6.put("Answer 12", "Medication changes should follow applicable prescription and provider requirements.");
	data6.put("Question 13", "How long does pharmacy processing take?");
	data6.put("Answer 13", "Processing time depends on the pharmacy and prescription status.");
	data6.put("Question 14", "Can I track pharmacy status?");
	data6.put("Answer 14", "Available pharmacy status information can be reviewed within your portal.");
	data6.put("Question 15", "Why is my pharmacy not listed?");
	data6.put("Answer 15", "Only pharmacies supported by the current platform configuration may be available.");
	data6.put("Question 16", "Can I add my own pharmacy?");
	data6.put("Answer 16", "This depends on whether custom pharmacy selection is supported.");
	data6.put("Question 17", "Can I refill an expired prescription?");
	data6.put("Answer 17", "An expired prescription may require provider review before another prescription is issued.");
	data6.put("Question 18", "Can I see my refill history?");
	data6.put("Answer 18", "Previous refill information may appear in your prescription history.");
	data6.put("Question 19", "Will I be notified when my refill is ready?");
	data6.put("Answer 19", "Notifications depend on the pharmacy workflow and your communication settings.");
	data6.put("Question 20", "Who should I contact about pharmacy problems?");
	data6.put("Answer 20", "Contact the pharmacy or your healthcare team based on the type of issue.");

	TreeMap<String, String> data7 = new TreeMap<String, String>();
	data7.put("Group Name", "Orders and Delivery");
	data7.put("Icon", "User");
	data7.put("Group Description", "Questions related to patient orders, order status, shipping information, delivery addresses, and tracking.");
	data7.put("Question 1", "Where can I see my orders?");
	data7.put("Answer 1", "Open the orders section of your patient portal.");
	data7.put("Question 2", "How do I check my order status?");
	data7.put("Answer 2", "The current status is displayed within your order details.");
	data7.put("Question 3", "Can I track my shipment?");
	data7.put("Answer 3", "Tracking information may become available after an order has shipped.");
	data7.put("Question 4", "Can I change my delivery address?");
	data7.put("Answer 4", "Address changes depend on the current order processing stage.");
	data7.put("Question 5", "What does processing mean?");
	data7.put("Answer 5", "The order is being prepared before shipment or fulfillment.");
	data7.put("Question 6", "What does shipped mean?");
	data7.put("Answer 6", "The order has been transferred to the delivery carrier.");
	data7.put("Question 7", "What does delivered mean?");
	data7.put("Answer 7", "The carrier has marked the shipment as delivered.");
	data7.put("Question 8", "Why has my order not shipped yet?");
	data7.put("Answer 8", "The order may still require processing, payment confirmation, or other required steps.");
	data7.put("Question 9", "Can I cancel my order?");
	data7.put("Answer 9", "Cancellation availability depends on the current order status.");
	data7.put("Question 10", "Can I reorder a previous item?");
	data7.put("Answer 10", "Reordering is available when the product and treatment remain eligible.");
	data7.put("Question 11", "Where can I see my delivery address?");
	data7.put("Answer 11", "Review the shipping information shown in your order details.");
	data7.put("Question 12", "Can I have different delivery addresses?");
	data7.put("Answer 12", "Available delivery address options depend on the portal and order configuration.");
	data7.put("Question 13", "What should I do if my package is delayed?");
	data7.put("Answer 13", "Review tracking information and contact support when additional assistance is needed.");
	data7.put("Question 14", "What if my package is marked delivered but missing?");
	data7.put("Answer 14", "Check the delivery location and contact the carrier or support team if you cannot locate it.");
	data7.put("Question 15", "Can I see my previous orders?");
	data7.put("Answer 15", "Completed orders may be available in your order history.");
	data7.put("Question 16", "Will I receive shipping notifications?");
	data7.put("Answer 16", "Shipping notifications may be sent when configured for your account.");
	data7.put("Question 17", "Can an order contain multiple products?");
	data7.put("Answer 17", "This depends on the ordering and fulfillment configuration.");
	data7.put("Question 18", "Why is my order on hold?");
	data7.put("Answer 18", "An order may require additional review or information before processing continues.");
	data7.put("Question 19", "How do I report a delivery problem?");
	data7.put("Answer 19", "Use the available support channel and provide the relevant order information.");
	data7.put("Question 20", "Where can I find my order number?");
	data7.put("Answer 20", "The order identifier is displayed within your order details.");

	TreeMap<String, String> data8 = new TreeMap<String, String>();
	data8.put("Group Name", "Payments and Billing");
	data8.put("Icon", "User");
	data8.put("Group Description", "Common questions about payments, charges, billing status, payment methods, and transaction information.");
	data8.put("Question 1", "How do I pay for an order?");
	data8.put("Answer 1", "Use an available payment method during the patient checkout process.");
	data8.put("Question 2", "Which payment methods are accepted?");
	data8.put("Answer 2", "Available payment methods are displayed during checkout.");
	data8.put("Question 3", "How do I know whether payment succeeded?");
	data8.put("Answer 3", "Check the payment or order status shown after the transaction.");
	data8.put("Question 4", "Why did my payment fail?");
	data8.put("Answer 4", "Confirm the payment information and contact your payment provider when necessary.");
	data8.put("Question 5", "Can I retry a failed payment?");
	data8.put("Answer 5", "Retry the payment when the portal provides another payment attempt.");
	data8.put("Question 6", "Can I change my payment method?");
	data8.put("Answer 6", "Select another available payment method before completing the transaction.");
	data8.put("Question 7", "Where can I see payment history?");
	data8.put("Answer 7", "Payment or transaction history may be available within your account.");
	data8.put("Question 8", "Can I download a receipt?");
	data8.put("Answer 8", "Receipt download availability depends on the billing features enabled.");
	data8.put("Question 9", "Why do I see a pending charge?");
	data8.put("Answer 9", "A pending transaction may still be awaiting final processing.");
	data8.put("Question 10", "Can I update my billing information?");
	data8.put("Answer 10", "Billing information can be updated when the payment workflow provides this option.");
	data8.put("Question 11", "Will I receive a payment confirmation?");
	data8.put("Answer 11", "A confirmation may appear in the portal or be sent through configured communications.");
	data8.put("Question 12", "Can I pay using a different card?");
	data8.put("Answer 12", "Use another supported payment method when available during checkout.");
	data8.put("Question 13", "What should I do about an incorrect charge?");
	data8.put("Answer 13", "Contact support and provide the relevant payment and order information.");
	data8.put("Question 14", "Can I remove a saved payment method?");
	data8.put("Answer 14", "Saved payment methods can be managed when this feature is enabled.");
	data8.put("Question 15", "Is my payment information secure?");
	data8.put("Answer 15", "Payment information should only be submitted through the authorized checkout process.");
	data8.put("Question 16", "Can I make a partial payment?");
	data8.put("Answer 16", "Partial-payment availability depends on the billing configuration.");
	data8.put("Question 17", "Why does my order still show unpaid?");
	data8.put("Answer 17", "The payment may still be processing or may not have completed successfully.");
	data8.put("Question 18", "Can I use the same payment method again?");
	data8.put("Answer 18", "Yes, when the payment method remains supported and valid.");
	data8.put("Question 19", "Can a completed payment be reversed?");
	data8.put("Answer 19", "Refund and reversal eligibility depends on the applicable order and refund policy.");
	data8.put("Question 20", "Who can help with billing questions?");
	data8.put("Answer 20", "Contact the billing or patient support team for transaction-related assistance.");

	TreeMap<String, String> data9 = new TreeMap<String, String>();
	data9.put("Group Name", "Insurance and Coverage");
	data9.put("Icon", "User");
	data9.put("Group Description", "Information about insurance details, healthcare coverage, eligibility information, and patient insurance records.");
	data9.put("Question 1", "Can I add insurance information?");
	data9.put("Answer 1", "Enter insurance information when insurance fields are available in your patient account.");
	data9.put("Question 2", "How do I update my insurance?");
	data9.put("Answer 2", "Use the available insurance management section or contact support.");
	data9.put("Question 3", "Can I add more than one insurance plan?");
	data9.put("Answer 3", "Multiple coverage options depend on the patient portal configuration.");
	data9.put("Question 4", "How do I know if my treatment is covered?");
	data9.put("Answer 4", "Coverage depends on your insurance plan and the services being provided.");
	data9.put("Question 5", "Does the portal verify insurance automatically?");
	data9.put("Answer 5", "Verification functionality depends on the healthcare organization's configuration.");
	data9.put("Question 6", "Why was my insurance information rejected?");
	data9.put("Answer 6", "Confirm that the entered insurance information is accurate and current.");
	data9.put("Question 7", "Can I remove old insurance information?");
	data9.put("Answer 7", "Old insurance records can be managed when removal or replacement is supported.");
	data9.put("Question 8", "Where can I see my insurance details?");
	data9.put("Answer 8", "Review the insurance or billing section of your patient profile.");
	data9.put("Question 9", "Can insurance information expire?");
	data9.put("Answer 9", "Coverage information should be updated when your insurance policy changes or expires.");
	data9.put("Question 10", "Do I need insurance to use the portal?");
	data9.put("Answer 10", "Portal access requirements depend on the services offered by your healthcare organization.");
	data9.put("Question 11", "Can I pay without insurance?");
	data9.put("Answer 11", "Self-payment options depend on the services and payment methods available.");
	data9.put("Question 12", "Can I change my primary insurance?");
	data9.put("Answer 12", "Update the applicable insurance record when the portal supports this change.");
	data9.put("Question 13", "What if my insurance information is incorrect?");
	data9.put("Answer 13", "Correct the information or contact support when the field cannot be edited.");
	data9.put("Question 14", "Can my provider see my insurance details?");
	data9.put("Answer 14", "Authorized healthcare and administrative personnel may access necessary insurance information.");
	data9.put("Question 15", "Why is insurance verification pending?");
	data9.put("Answer 15", "Verification may require additional processing or review.");
	data9.put("Question 16", "Can I upload an insurance card?");
	data9.put("Answer 16", "Document upload availability depends on the enabled portal features.");
	data9.put("Question 17", "Can I use insurance from another state?");
	data9.put("Answer 17", "Coverage eligibility is determined by your insurance policy and healthcare service requirements.");
	data9.put("Question 18", "Will insurance affect my payment amount?");
	data9.put("Answer 18", "Patient costs may depend on the applicable coverage and billing arrangements.");
	data9.put("Question 19", "Where can I ask insurance questions?");
	data9.put("Answer 19", "Contact your insurer or the appropriate healthcare billing support team.");
	data9.put("Question 20", "Should I update insurance after changing plans?");
	data9.put("Answer 20", "Yes, keep your insurance information current to avoid processing problems.");

	TreeMap<String, String> data10 = new TreeMap<String, String>();
	data10.put("Group Name", "Lab Tests");
	data10.put("Icon", "User");
	data10.put("Group Description", "Questions covering laboratory tests, test methods, appointments, results, processing, and patient lab information.");
	data10.put("Question 1", "Where can I see my laboratory tests?");
	data10.put("Answer 1", "Open the lab tests section of your patient portal.");
	data10.put("Question 2", "How do I order a lab test?");
	data10.put("Answer 2", "Select an eligible test and follow the available ordering workflow.");
	data10.put("Question 3", "What is a walk-in lab test?");
	data10.put("Answer 3", "A walk-in test is completed at the designated laboratory location.");
	data10.put("Question 4", "What is a home visit lab test?");
	data10.put("Answer 4", "A home visit test involves sample collection at an eligible patient location.");
	data10.put("Question 5", "What is a test kit?");
	data10.put("Answer 5", "A test kit provides materials required for the configured sample collection process.");
	data10.put("Question 6", "Where can I see the price of a lab test?");
	data10.put("Answer 6", "The test price is displayed with the lab test information when available.");
	data10.put("Question 7", "How do I know which test method is available?");
	data10.put("Answer 7", "The configured method is shown in the lab test details.");
	data10.put("Question 8", "Can I cancel a lab test?");
	data10.put("Answer 8", "Cancellation availability depends on the current order and processing status.");
	data10.put("Question 9", "Can I reschedule a laboratory visit?");
	data10.put("Answer 9", "Rescheduling depends on the selected laboratory service and appointment availability.");
	data10.put("Question 10", "Where can I see lab results?");
	data10.put("Answer 10", "Results may appear in the patient portal after they are released.");
	data10.put("Question 11", "Why are my results pending?");
	data10.put("Answer 11", "The laboratory may still be processing or reviewing the test.");
	data10.put("Question 12", "Can I download my test results?");
	data10.put("Answer 12", "Result download availability depends on the enabled patient portal functionality.");
	data10.put("Question 13", "Who reviews my test results?");
	data10.put("Answer 13", "Results may be reviewed by an authorized member of your healthcare team.");
	data10.put("Question 14", "Can I order multiple tests?");
	data10.put("Answer 14", "Multiple lab tests may be ordered when supported by your treatment workflow.");
	data10.put("Question 15", "What should I do before a test?");
	data10.put("Answer 15", "Follow any preparation instructions provided for the selected laboratory test.");
	data10.put("Question 16", "Can lab results affect my treatment?");
	data10.put("Answer 16", "Your healthcare provider may use laboratory information when evaluating treatment.");
	data10.put("Question 17", "What if my lab information is incorrect?");
	data10.put("Answer 17", "Contact your healthcare team or support before relying on incorrect information.");
	data10.put("Question 18", "Will I receive a notification when results are ready?");
	data10.put("Answer 18", "A notification may be provided when result notifications are enabled.");
	data10.put("Question 19", "Can I see previous lab tests?");
	data10.put("Answer 19", "Previous tests may be available in your laboratory history.");
	data10.put("Question 20", "Who should I contact about a lab test?");
	data10.put("Answer 20", "Contact the relevant laboratory or healthcare support team for assistance.");

	TreeMap<String, String> data11 = new TreeMap<String, String>();
	data11.put("Group Name", "Home Test Kits");
	data11.put("Icon", "User");
	data11.put("Group Description", "Information regarding patient test kits, kit delivery, sample collection, return procedures, and test-kit status.");
	data11.put("Question 1", "How do I receive my test kit?");
	data11.put("Answer 1", "The kit will follow the delivery process configured for the selected laboratory test.");
	data11.put("Question 2", "Who provides my test kit?");
	data11.put("Answer 2", "The provider information depends on the configuration of the selected test.");
	data11.put("Question 3", "What is included in the kit?");
	data11.put("Answer 3", "Kit contents depend on the specific test and required sample.");
	data11.put("Question 4", "How do I use the test kit?");
	data11.put("Answer 4", "Follow the collection instructions supplied with the kit.");
	data11.put("Question 5", "Can I request another kit?");
	data11.put("Answer 5", "Contact support if the original kit cannot be used.");
	data11.put("Question 6", "What should I do if my kit is damaged?");
	data11.put("Answer 6", "Do not use damaged collection materials and contact support for assistance.");
	data11.put("Question 7", "How do I return my sample?");
	data11.put("Answer 7", "Follow the return or shipping instructions supplied with the test kit.");
	data11.put("Question 8", "Can I track the test kit?");
	data11.put("Answer 8", "Tracking may be available when the kit is shipped using a tracked delivery service.");
	data11.put("Question 9", "Can I change my kit delivery address?");
	data11.put("Answer 9", "Changes depend on whether the kit has already entered the fulfillment process.");
	data11.put("Question 10", "When should I collect my sample?");
	data11.put("Answer 10", "Follow the timing instructions provided for your specific test.");
	data11.put("Question 11", "What happens after I return the sample?");
	data11.put("Answer 11", "The sample is processed according to the laboratory workflow.");
	data11.put("Question 12", "Where can I see kit status?");
	data11.put("Answer 12", "Relevant status information may appear in your lab test or order details.");
	data11.put("Question 13", "What if my kit never arrives?");
	data11.put("Answer 13", "Check available tracking information and contact support if the shipment is delayed.");
	data11.put("Question 14", "Can I reuse a test kit?");
	data11.put("Answer 14", "Use the kit only according to the instructions supplied for that test.");
	data11.put("Question 15", "Can another person use my kit?");
	data11.put("Answer 15", "A patient-specific test kit should only be used according to its assigned instructions.");
	data11.put("Question 16", "Does a test kit expire?");
	data11.put("Answer 16", "Use the kit within any expiration or collection period shown on the supplied materials.");
	data11.put("Question 17", "Can I cancel a kit order?");
	data11.put("Answer 17", "Cancellation depends on the current fulfillment status.");
	data11.put("Question 18", "How are my results delivered?");
	data11.put("Answer 18", "Results may be provided through the patient portal after laboratory processing.");
	data11.put("Question 19", "What if my sample cannot be processed?");
	data11.put("Answer 19", "You may receive instructions regarding recollection or another required step.");
	data11.put("Question 20", "Who do I contact about my kit?");
	data11.put("Answer 20", "Use the available patient support channel for kit-related assistance.");

	TreeMap<String, String> data12 = new TreeMap<String, String>();
	data12.put("Group Name", "Medical Records");
	data12.put("Icon", "User");
	data12.put("Group Description", "Questions related to viewing patient records, clinical history, documents, medical information, and record access.");
	data12.put("Question 1", "Where can I view my medical records?");
	data12.put("Answer 1", "Open the medical records or health information section of your portal.");
	data12.put("Question 2", "Can I download my records?");
	data12.put("Answer 2", "Downloading is available when this functionality is enabled.");
	data12.put("Question 3", "Can I see my treatment history?");
	data12.put("Answer 3", "Available treatment history may appear within your patient record.");
	data12.put("Question 4", "Can I see previous prescriptions?");
	data12.put("Answer 4", "Prescription history may be included in your patient account.");
	data12.put("Question 5", "Can I see previous lab results?");
	data12.put("Answer 5", "Released historical laboratory results may be available in the portal.");
	data12.put("Question 6", "Can I edit my medical records?");
	data12.put("Answer 6", "Clinical records are generally managed by authorized healthcare personnel.");
	data12.put("Question 7", "What should I do if a record is incorrect?");
	data12.put("Answer 7", "Contact your healthcare organization to report information that may require correction.");
	data12.put("Question 8", "Who can access my records?");
	data12.put("Answer 8", "Access should be limited according to authorized patient and healthcare permissions.");
	data12.put("Question 9", "Can I share my records?");
	data12.put("Answer 9", "Record-sharing options depend on the patient portal functionality.");
	data12.put("Question 10", "Are old records removed?");
	data12.put("Answer 10", "Record retention depends on applicable healthcare and organizational requirements.");
	data12.put("Question 11", "When are new records added?");
	data12.put("Answer 11", "New information may appear after it has been entered, reviewed, or released.");
	data12.put("Question 12", "Can I access records from my phone?");
	data12.put("Answer 12", "Yes, when medical record access is supported on the mobile portal.");
	data12.put("Question 13", "Why is a recent record missing?");
	data12.put("Answer 13", "The information may not yet have been completed or released.");
	data12.put("Question 14", "Can I print my records?");
	data12.put("Answer 14", "Printing may be available through download or browser functionality.");
	data12.put("Question 15", "Can my provider update my record?");
	data12.put("Answer 15", "Authorized healthcare users may update clinical information as part of your care.");
	data12.put("Question 16", "Are medical records secure?");
	data12.put("Answer 16", "Patient records should only be accessed through authorized and protected systems.");
	data12.put("Question 17", "Can I search my medical history?");
	data12.put("Answer 17", "Search availability depends on the record-management features enabled.");
	data12.put("Question 18", "Can I view records from previous treatments?");
	data12.put("Answer 18", "Historical information may be available when retained in your patient account.");
	data12.put("Question 19", "Why can I not open a medical document?");
	data12.put("Answer 19", "Check your connection and document availability or contact support.");
	data12.put("Question 20", "Who can help me obtain a medical record?");
	data12.put("Answer 20", "Contact your healthcare organization's patient records or support team.");

	TreeMap<String, String> data13 = new TreeMap<String, String>();
	data13.put("Group Name", "Treatment Plans");
	data13.put("Icon", "User");
	data13.put("Group Description", "Information regarding patient treatment plans, treatment status, recommendations, follow-up, and ongoing care.");
	data13.put("Question 1", "Where can I see my treatment plan?");
	data13.put("Answer 1", "Open the treatment section of your patient account when a plan has been assigned.");
	data13.put("Question 2", "Who creates my treatment plan?");
	data13.put("Answer 2", "An authorized healthcare provider determines the appropriate treatment plan.");
	data13.put("Question 3", "Can my treatment plan change?");
	data13.put("Answer 3", "Your provider may adjust treatment based on clinical review and your response.");
	data13.put("Question 4", "How do I know whether treatment is active?");
	data13.put("Answer 4", "Review the treatment status displayed in your patient portal.");
	data13.put("Question 5", "Can I request a different treatment?");
	data13.put("Answer 5", "Discuss treatment concerns or alternatives with your healthcare provider.");
	data13.put("Question 6", "What happens after treatment is approved?");
	data13.put("Answer 6", "Follow the next steps and instructions provided within your care workflow.");
	data13.put("Question 7", "Can treatment require laboratory tests?");
	data13.put("Answer 7", "Your provider may require laboratory testing when appropriate for the treatment.");
	data13.put("Question 8", "Can treatment require a follow-up appointment?");
	data13.put("Answer 8", "Follow-up requirements depend on your individual care plan.");
	data13.put("Question 9", "Where can I find treatment instructions?");
	data13.put("Answer 9", "Instructions may appear within your treatment or prescription details.");
	data13.put("Question 10", "Can my treatment be paused?");
	data13.put("Answer 10", "Treatment changes should be reviewed with your healthcare provider.");
	data13.put("Question 11", "Can my treatment be discontinued?");
	data13.put("Answer 11", "An authorized provider may discontinue treatment when clinically appropriate.");
	data13.put("Question 12", "Why is my treatment pending?");
	data13.put("Answer 12", "Additional review, information, or clinical action may still be required.");
	data13.put("Question 13", "Can I have multiple treatments?");
	data13.put("Answer 13", "Multiple treatment plans depend on clinical suitability and portal configuration.");
	data13.put("Question 14", "How do I report treatment concerns?");
	data13.put("Answer 14", "Use your available care-team communication or consultation channel.");
	data13.put("Question 15", "Will I receive treatment reminders?");
	data13.put("Answer 15", "Reminders may be provided when configured for your treatment.");
	data13.put("Question 16", "Can I see previous treatment plans?");
	data13.put("Answer 16", "Historical treatments may be available in your patient record.");
	data13.put("Question 17", "What does treatment completed mean?");
	data13.put("Answer 17", "The configured treatment workflow has reached its completed status.");
	data13.put("Question 18", "Can a completed treatment be restarted?");
	data13.put("Answer 18", "Restarting treatment requires appropriate provider evaluation.");
	data13.put("Question 19", "Can I download my treatment information?");
	data13.put("Answer 19", "Download options depend on the features available in the portal.");
	data13.put("Question 20", "Who should I contact about my treatment?");
	data13.put("Answer 20", "Contact your assigned healthcare team for treatment-specific questions.");

	TreeMap<String, String> data14 = new TreeMap<String, String>();
	data14.put("Group Name", "Intake Forms and Health Questions");
	data14.put("Icon", "User");
	data14.put("Group Description", "Guidance for completing patient intake forms, health questionnaires, required questions, answers, and submission.");
	data14.put("Question 1", "Why do I need to complete an intake form?");
	data14.put("Answer 1", "The form collects information needed for appropriate clinical evaluation.");
	data14.put("Question 2", "Where can I find my intake form?");
	data14.put("Answer 2", "The form may appear as part of your treatment or consultation workflow.");
	data14.put("Question 3", "Do I have to answer every question?");
	data14.put("Answer 3", "Questions marked as required must be completed before submission.");
	data14.put("Question 4", "Can I save my intake form and finish later?");
	data14.put("Answer 4", "This depends on whether draft saving is supported.");
	data14.put("Question 5", "Can I change an answer?");
	data14.put("Answer 5", "Answers can be changed before submission when the form permits editing.");
	data14.put("Question 6", "What should I do if I entered the wrong answer?");
	data14.put("Answer 6", "Correct it before submission or contact your care team if the form has already been submitted.");
	data14.put("Question 7", "Why are additional questions appearing?");
	data14.put("Answer 7", "Some questions may appear based on answers you provided earlier.");
	data14.put("Question 8", "Can I skip an optional question?");
	data14.put("Answer 8", "Optional questions can generally be left unanswered.");
	data14.put("Question 9", "Can my provider see my answers?");
	data14.put("Answer 9", "Authorized healthcare personnel may review submitted intake information.");
	data14.put("Question 10", "Can I submit the form from my phone?");
	data14.put("Answer 10", "Yes, when the form is supported by the mobile patient portal.");
	data14.put("Question 11", "Why can I not submit the form?");
	data14.put("Answer 11", "Check whether all required fields and questions have been completed.");
	data14.put("Question 12", "Can I view submitted answers?");
	data14.put("Answer 12", "Submitted information may be available depending on portal configuration.");
	data14.put("Question 13", "Can I submit the same intake form twice?");
	data14.put("Answer 13", "Repeated submission depends on the treatment and intake workflow.");
	data14.put("Question 14", "What happens after I submit the form?");
	data14.put("Answer 14", "The submitted information becomes available for the next configured step in your care.");
	data14.put("Question 15", "Why does my form contain medical questions?");
	data14.put("Answer 15", "Medical information helps the care team evaluate treatment eligibility and safety.");
	data14.put("Question 16", "Can answers affect treatment eligibility?");
	data14.put("Answer 16", "Healthcare providers may consider submitted information when evaluating treatment.");
	data14.put("Question 17", "Is my intake information private?");
	data14.put("Answer 17", "Submitted health information should only be available according to authorized access.");
	data14.put("Question 18", "Can I attach information to an intake form?");
	data14.put("Answer 18", "Attachments are available only when the form supports file uploads.");
	data14.put("Question 19", "Why has my intake form expired?");
	data14.put("Answer 19", "A form may have a configured validity period or be replaced by a newer request.");
	data14.put("Question 20", "Who should I contact about an intake form?");
	data14.put("Answer 20", "Contact your healthcare team or patient portal support for assistance.");

	TreeMap<String, String> data15 = new TreeMap<String, String>();
	data15.put("Group Name", "Privacy and Security");
	data15.put("Icon", "User");
	data15.put("Group Description", "Questions about account protection, privacy, secure access, sessions, passwords, and protecting patient information.");
	data15.put("Question 1", "How is my patient account protected?");
	data15.put("Answer 1", "Use your account only through authorized portal access and keep your credentials private.");
	data15.put("Question 2", "Should I share my password?");
	data15.put("Answer 2", "No, do not share your patient portal password with unauthorized individuals.");
	data15.put("Question 3", "What makes a strong password?");
	data15.put("Answer 3", "Use a unique password that follows the password requirements displayed by the portal.");
	data15.put("Question 4", "Why does the portal automatically log me out?");
	data15.put("Answer 4", "Automatic logout helps protect your information after periods of inactivity.");
	data15.put("Question 5", "Can I access the portal on a public computer?");
	data15.put("Answer 5", "Avoid accessing sensitive healthcare information on devices you do not trust.");
	data15.put("Question 6", "What should I do after using a shared computer?");
	data15.put("Answer 6", "Sign out completely and avoid saving your login credentials.");
	data15.put("Question 7", "What should I do if my password is exposed?");
	data15.put("Answer 7", "Change your password immediately and review your account activity.");
	data15.put("Question 8", "How do I know I am using the correct portal?");
	data15.put("Answer 8", "Access the patient portal using the official link provided by your healthcare organization.");
	data15.put("Question 9", "Can someone access my account without permission?");
	data15.put("Answer 9", "Report suspected unauthorized account access immediately.");
	data15.put("Question 10", "Why am I asked to verify my account?");
	data15.put("Answer 10", "Verification helps confirm that access is being requested by the correct user.");
	data15.put("Question 11", "Is my medical information visible to other patients?");
	data15.put("Answer 11", "Patient records should only be available according to authorized account permissions.");
	data15.put("Question 12", "Can support ask for my password?");
	data15.put("Answer 12", "You should not disclose your password through normal support communications.");
	data15.put("Question 13", "What should I do if I receive a suspicious email?");
	data15.put("Answer 13", "Do not provide login information through suspicious links or messages.");
	data15.put("Question 14", "Can I change my password regularly?");
	data15.put("Answer 14", "Yes, use the password management option within your account settings.");
	data15.put("Question 15", "Should I sign out after every session?");
	data15.put("Answer 15", "Signing out is recommended, especially when using a shared or accessible device.");
	data15.put("Question 16", "What happens when my session expires?");
	data15.put("Answer 16", "You will need to authenticate again before accessing protected information.");
	data15.put("Question 17", "Can I review login activity?");
	data15.put("Answer 17", "Account activity information depends on the security features enabled.");
	data15.put("Question 18", "Can I use browser autofill for my password?");
	data15.put("Answer 18", "Only use credential-saving functionality on a secure personal device.");
	data15.put("Question 19", "How do I report a security problem?");
	data15.put("Answer 19", "Contact the authorized patient portal support channel immediately.");
	data15.put("Question 20", "Why is portal security important?");
	data15.put("Answer 20", "The patient portal contains sensitive personal and healthcare information that requires protected access.");

	TreeMap<String, String> data16 = new TreeMap<String, String>();
	data16.put("Group Name", "Notifications and Messages");
	data16.put("Icon", "User");
	data16.put("Group Description", "Information related to patient notifications, email alerts, reminders, healthcare messages, and communication preferences.");
	data16.put("Question 1", "Where can I see my notifications?");
	data16.put("Answer 1", "Open the notifications area available in your patient portal.");
	data16.put("Question 2", "Why did I receive an email notification?");
	data16.put("Answer 2", "The portal may send emails for configured account or healthcare events.");
	data16.put("Question 3", "Can I disable notifications?");
	data16.put("Answer 3", "Notification preferences can be changed when the portal provides configurable settings.");
	data16.put("Question 4", "Can I receive appointment reminders?");
	data16.put("Answer 4", "Appointment reminders may be sent when enabled.");
	data16.put("Question 5", "Can I receive prescription updates?");
	data16.put("Answer 5", "Prescription status notifications may be available according to your portal settings.");
	data16.put("Question 6", "Can I receive order updates?");
	data16.put("Answer 6", "Order notifications may be generated when important order status changes occur.");
	data16.put("Question 7", "Can I receive lab-result notifications?");
	data16.put("Answer 7", "You may receive a notification after results become available.");
	data16.put("Question 8", "Why am I not receiving emails?");
	data16.put("Answer 8", "Check your registered email address, spam folder, and available communication settings.");
	data16.put("Question 9", "Can I change my notification email?");
	data16.put("Answer 9", "Update your registered email information when profile editing is available.");
	data16.put("Question 10", "Where can I read provider messages?");
	data16.put("Answer 10", "Open the patient messaging or communication area if available.");
	data16.put("Question 11", "Can I reply to a provider message?");
	data16.put("Answer 11", "Replies are available when two-way messaging is enabled.");
	data16.put("Question 12", "How do I know I have a new message?");
	data16.put("Answer 12", "The portal may display an unread indicator or send a configured notification.");
	data16.put("Question 13", "Can I delete notifications?");
	data16.put("Answer 13", "Notification management options depend on the patient portal features.");
	data16.put("Question 14", "Can I mark a notification as read?");
	data16.put("Answer 14", "Read-status controls may be available within the notification interface.");
	data16.put("Question 15", "Are healthcare messages private?");
	data16.put("Answer 15", "Use only the authorized patient messaging system for sensitive healthcare communication.");
	data16.put("Question 16", "Can I send attachments in messages?");
	data16.put("Answer 16", "Attachment functionality depends on the enabled messaging features.");
	data16.put("Question 17", "Can I receive SMS notifications?");
	data16.put("Answer 17", "SMS availability depends on communication configuration and your registered phone number.");
	data16.put("Question 18", "Can I change communication preferences?");
	data16.put("Answer 18", "Use the communication or notification settings when these options are available.");
	data16.put("Question 19", "Why is a notification still unread?");
	data16.put("Answer 19", "Open the notification or use the available read-status control.");
	data16.put("Question 20", "Who should I contact if notifications do not work?");
	data16.put("Answer 20", "Contact patient portal support if your configured notifications are consistently unavailable.");

	TreeMap<String, String> data17 = new TreeMap<String, String>();
	data17.put("Group Name", "Cancellations and Refunds");
	data17.put("Icon", "User");
	data17.put("Group Description", "Information regarding cancellation requests, orders, appointments, refunds, payment reversals, and refund status.");
	data17.put("Question 1", "Can I cancel an order?");
	data17.put("Answer 1", "Order cancellation depends on whether fulfillment has already started.");
	data17.put("Question 2", "Can I cancel an appointment?");
	data17.put("Answer 2", "Use the appointment cancellation option when permitted.");
	data17.put("Question 3", "Can I cancel a lab test?");
	data17.put("Answer 3", "Lab-test cancellation depends on the current processing status.");
	data17.put("Question 4", "How do I request a refund?");
	data17.put("Answer 4", "Use the applicable support process for the order or payment.");
	data17.put("Question 5", "How will I know whether my refund is approved?");
	data17.put("Answer 5", "Check available refund status information or support communications.");
	data17.put("Question 6", "How is a refund returned?");
	data17.put("Answer 6", "Approved refunds are generally processed according to the original payment workflow.");
	data17.put("Question 7", "Can every order be refunded?");
	data17.put("Answer 7", "Refund eligibility depends on the applicable product, order, and fulfillment conditions.");
	data17.put("Question 8", "Why was my refund rejected?");
	data17.put("Answer 8", "The request may not meet the applicable refund requirements.");
	data17.put("Question 9", "Can I cancel after an order ships?");
	data17.put("Answer 9", "Cancellation may no longer be possible after shipment has occurred.");
	data17.put("Question 10", "Can I cancel only part of an order?");
	data17.put("Answer 10", "Partial cancellation depends on the order-management functionality.");
	data17.put("Question 11", "Will I receive cancellation confirmation?");
	data17.put("Answer 11", "Confirmation may be displayed or sent after a successful cancellation.");
	data17.put("Question 12", "Where can I see cancellation status?");
	data17.put("Answer 12", "Review the related order, appointment, or request details.");
	data17.put("Question 13", "Can I undo a cancellation?");
	data17.put("Answer 13", "You may need to create a new order or appointment after cancellation.");
	data17.put("Question 14", "Can I request a refund for a duplicate payment?");
	data17.put("Answer 14", "Report duplicate transactions to patient billing support for review.");
	data17.put("Question 15", "What information is needed for a refund request?");
	data17.put("Answer 15", "Provide the relevant order and payment information requested by support.");
	data17.put("Question 16", "Can a refund be partial?");
	data17.put("Answer 16", "Partial refund availability depends on the applicable billing workflow.");
	data17.put("Question 17", "What happens to a cancelled prescription order?");
	data17.put("Answer 17", "Further processing depends on the prescription and order status at cancellation.");
	data17.put("Question 18", "Can I request another order after cancellation?");
	data17.put("Answer 18", "Yes, when the product and treatment remain available and eligible.");
	data17.put("Question 19", "Why is my refund still pending?");
	data17.put("Answer 19", "The refund may still be processing through the applicable payment system.");
	data17.put("Question 20", "Who should I contact regarding a refund?");
	data17.put("Answer 20", "Contact the patient billing or support team for refund-related assistance.");

	TreeMap<String, String> data18 = new TreeMap<String, String>();
	data18.put("Group Name", "Technical Support");
	data18.put("Icon", "User");
	data18.put("Group Description", "Help for common technical problems involving browsers, portal pages, mobile devices, forms, loading issues, and account functionality.");
	data18.put("Question 1", "What should I do if the portal does not load?");
	data18.put("Answer 1", "Check your internet connection and refresh the page before trying again.");
	data18.put("Question 2", "Which browser should I use?");
	data18.put("Answer 2", "Use a current supported browser for the best portal experience.");
	data18.put("Question 3", "Can I use the portal on my phone?");
	data18.put("Answer 3", "Yes, when the patient portal supports mobile browser access.");
	data18.put("Question 4", "Why is a button not responding?");
	data18.put("Answer 4", "Refresh the page and retry the action before contacting support.");
	data18.put("Question 5", "Why is a page blank?");
	data18.put("Answer 5", "A connection or loading issue may have prevented the page from displaying correctly.");
	data18.put("Question 6", "What should I do if the portal freezes?");
	data18.put("Answer 6", "Refresh or reopen the portal and retry the operation.");
	data18.put("Question 7", "Why can I not submit a form?");
	data18.put("Answer 7", "Check for required fields, validation messages, and connection problems.");
	data18.put("Question 8", "Why does the page keep loading?");
	data18.put("Answer 8", "Check your network connection and retry after refreshing the page.");
	data18.put("Question 9", "Can I access the portal on a tablet?");
	data18.put("Answer 9", "Tablet access is available when the device and browser are supported.");
	data18.put("Question 10", "What should I do if a dropdown does not open?");
	data18.put("Answer 10", "Refresh the page and retry before reporting the problem.");
	data18.put("Question 11", "Why did my form information disappear?");
	data18.put("Answer 11", "Unsaved information may be lost if the page reloads or the session expires.");
	data18.put("Question 12", "Why was I logged out unexpectedly?");
	data18.put("Answer 12", "Your session may have expired because of inactivity or another security condition.");
	data18.put("Question 13", "Can browser extensions affect the portal?");
	data18.put("Answer 13", "Some extensions may interfere with normal webpage functionality.");
	data18.put("Question 14", "Should I clear browser cache?");
	data18.put("Answer 14", "Clearing cached browser data can sometimes resolve loading or display issues.");
	data18.put("Question 15", "Why does the portal look different on mobile?");
	data18.put("Answer 15", "The layout may adapt to smaller screens while providing the same core functionality.");
	data18.put("Question 16", "Why can I not upload a file?");
	data18.put("Answer 16", "Check whether the file type and size meet the portal requirements.");
	data18.put("Question 17", "Why can I not download a document?");
	data18.put("Answer 17", "Check browser download settings and confirm that the document is available.");
	data18.put("Question 18", "What information should I provide when reporting a bug?");
	data18.put("Answer 18", "Describe the problem, affected page, action performed, and any displayed error message.");
	data18.put("Question 19", "Can I retry an action after an error?");
	data18.put("Answer 19", "Retry once the page is stable unless the action could create a duplicate transaction.");
	data18.put("Question 20", "How do I contact technical support?");
	data18.put("Answer 20", "Use the patient portal support option provided by your healthcare organization.");

	TreeMap<String, String> data19 = new TreeMap<String, String>();
	data19.put("Group Name", "Care Team and Providers");
	data19.put("Icon", "User");
	data19.put("Group Description", "Questions about healthcare providers, assigned care teams, provider communication, consultations, and clinical support.");
	data19.put("Question 1", "Where can I see my healthcare provider?");
	data19.put("Answer 1", "Provider information may be displayed within your appointments or treatment details.");
	data19.put("Question 2", "Can I choose my provider?");
	data19.put("Answer 2", "Provider selection depends on your healthcare organization's available options.");
	data19.put("Question 3", "Can I change my provider?");
	data19.put("Answer 3", "Provider changes depend on treatment availability and organizational rules.");
	data19.put("Question 4", "How do I contact my provider?");
	data19.put("Answer 4", "Use the communication options provided within your patient portal.");
	data19.put("Question 5", "Can I send my provider a message?");
	data19.put("Answer 5", "Messaging is available when enabled for your care workflow.");
	data19.put("Question 6", "Who reviews my intake form?");
	data19.put("Answer 6", "Authorized healthcare personnel may review submitted patient information.");
	data19.put("Question 7", "Who approves my treatment?");
	data19.put("Answer 7", "An appropriately authorized healthcare provider handles clinical treatment decisions.");
	data19.put("Question 8", "Can my provider view my lab results?");
	data19.put("Answer 8", "Authorized providers may review relevant laboratory information.");
	data19.put("Question 9", "Can my provider view my prescriptions?");
	data19.put("Answer 9", "Authorized care-team members may access relevant prescription information.");
	data19.put("Question 10", "Can I schedule a follow-up with my provider?");
	data19.put("Answer 10", "Use available appointment scheduling options for eligible follow-up visits.");
	data19.put("Question 11", "What is a care team?");
	data19.put("Answer 11", "A care team consists of authorized healthcare personnel involved in your treatment.");
	data19.put("Question 12", "Can multiple providers manage my care?");
	data19.put("Answer 12", "Multiple authorized providers may participate when required by your care plan.");
	data19.put("Question 13", "Can I see provider availability?");
	data19.put("Answer 13", "Available scheduling times may be displayed during appointment booking.");
	data19.put("Question 14", "What should I do if my provider changes?");
	data19.put("Answer 14", "Review updated appointment or treatment information in your patient portal.");
	data19.put("Question 15", "Can I ask medication questions?");
	data19.put("Answer 15", "Use your available provider communication channel for medication-related questions.");
	data19.put("Question 16", "Can I request another consultation?");
	data19.put("Answer 16", "Additional consultations may be scheduled when permitted by your treatment workflow.");
	data19.put("Question 17", "Who reviews treatment progress?");
	data19.put("Answer 17", "Your authorized healthcare team evaluates relevant treatment progress.");
	data19.put("Question 18", "Can I see provider notes?");
	data19.put("Answer 18", "Provider-note visibility depends on what information is released through the patient portal.");
	data19.put("Question 19", "Can support answer clinical questions?");
	data19.put("Answer 19", "Clinical questions should be directed to an appropriately qualified healthcare provider.");
	data19.put("Question 20", "What if I cannot contact my provider?");
	data19.put("Answer 20", "Use another available care-team or patient support communication option.");

	TreeMap<String, String> data20 = new TreeMap<String, String>();
	data20.put("Group Name", "Patient Portal General Help");
	data20.put("Icon", "User");
	data20.put("Group Description", "General patient portal questions covering navigation, available services, account usage, patient information, and common portal actions.");
	data20.put("Question 1", "What can I do in the patient portal?");
	data20.put("Answer 1", "Available functionality may include managing healthcare information, treatments, orders, appointments, and communications.");
	data20.put("Question 2", "Where is the patient dashboard?");
	data20.put("Answer 2", "The dashboard is generally displayed after successfully signing in.");
	data20.put("Question 3", "How do I navigate between portal sections?");
	data20.put("Answer 3", "Use the available menu or navigation controls.");
	data20.put("Question 4", "Can I use the portal at any time?");
	data20.put("Answer 4", "Portal access is generally available whenever the service is operational.");
	data20.put("Question 5", "Can I access the portal from outside my home?");
	data20.put("Answer 5", "You can access the portal from supported locations and devices when permitted.");
	data20.put("Question 6", "Can I use the portal on multiple devices?");
	data20.put("Answer 6", "Yes, use your authorized account credentials on supported devices.");
	data20.put("Question 7", "Where can I find my patient information?");
	data20.put("Answer 7", "Open your profile or patient information section.");
	data20.put("Question 8", "Where can I see my current treatment?");
	data20.put("Answer 8", "Open the applicable treatment or prescription section.");
	data20.put("Question 9", "Where can I see my recent activity?");
	data20.put("Answer 9", "Recent information may appear on the dashboard or within individual portal modules.");
	data20.put("Question 10", "Can I update information myself?");
	data20.put("Answer 10", "Editable information can be updated through the available patient profile controls.");
	data20.put("Question 11", "How do I return to the dashboard?");
	data20.put("Answer 11", "Use the dashboard or home option in the main navigation.");
	data20.put("Question 12", "Why are some features unavailable?");
	data20.put("Answer 12", "Features may depend on your account, treatment, healthcare organization, and portal configuration.");
	data20.put("Question 13", "Can I search within the portal?");
	data20.put("Answer 13", "Search functionality is available only in modules where it has been enabled.");
	data20.put("Question 14", "Can I view the portal on a small screen?");
	data20.put("Answer 14", "The portal may provide a responsive layout for supported mobile devices.");
	data20.put("Question 15", "How do I refresh my information?");
	data20.put("Answer 15", "Reload the relevant page when updated information does not appear automatically.");
	data20.put("Question 16", "Can I print portal information?");
	data20.put("Answer 16", "Printing depends on the page, document type, and browser functionality.");
	data20.put("Question 17", "How do I know an action was successful?");
	data20.put("Answer 17", "Look for confirmation messages, updated statuses, or the expected saved information.");
	data20.put("Question 18", "What should I do if I see an error?");
	data20.put("Answer 18", "Review the displayed message, retry when appropriate, or contact support.");
	data20.put("Question 19", "Can portal information change after I log in?");
	data20.put("Answer 19", "Information may update as healthcare, order, payment, or treatment statuses change.");
	data20.put("Question 20", "Where can I get additional portal help?");
	data20.put("Answer 20", "Use the patient support information provided by your healthcare organization.");

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
		{ data20 }  */
	};
}	
	
@Test(dataProvider="Channel_Create_Data")
public void Channel_Add(TreeMap<String, String> Channel_data) throws Exception{
		
	Channel_Module_Locaters p = new Channel_Module_Locaters(d);
	Repeat rp = new Repeat(d);
		
	String Channel_Name = Channel_data.get("Channel Name");
	String Access_Rule = Channel_data.get("Access Rule");
	String API_Contact_Mail = Channel_data.get("API Contact Email");
	
	
		
	WebElement Channel_Add_Button = Channel_Module_Accessor();
	Channel_Add_Button.click();	
	
	WebElement Popup = p.Popup_Modal();
	List<WebElement> Cards = Popup.findElements(By.xpath(".//*[contains(@class,'_channelTypeCard')]"));
	WebElement API_Channel = Cards.get(0);
	API_Channel.click();
	
	WebElement Next_Button = p.Next_Button();
	rp.movetoelement(Next_Button);
	Next_Button.click();
	
	WebElement Channel_Form = p.Popup_Form();
	List<WebElement> Inputs;

	try {
		Inputs = p.Channel_Add_Form_Inputs(Channel_Form);
	} 
	catch(Exception e) {
		Thread.sleep(800);

		Report_Listen.log_print_in_report().warning("⚠️ Initial Channel form input retrieval failed. Retrying field retrieval.");

		System.out.println("⚠️ Initial Channel form input retrieval failed. Retrying.");
		System.out.println();

		Inputs = p.Channel_Add_Form_Inputs(Channel_Form);
	}
	
	WebElement Channel_Name_Input_Field = Inputs.get(0);
	Channel_Name_Input_Field.sendKeys(Channel_Name);
	
	
	
	if(Channel_data.containsKey("Whitelist IP Address 1")&&Access_Rule.contains("Allow access from whitelisted IP addresses only")){
		
		
		int Whitelist_IP_Count = 0;
		
		for(String Key : Channel_data.keySet()) {
			if(Key.contains("Whitelist IP Address")) {
				Whitelist_IP_Count++;
			}
		}
		
		
		System.out.println("Total IP Indexes: " + Whitelist_IP_Count);
		
		WebElement Whitelist_IP_Addresses_Input_Field = Inputs.get(1);
		
		for(int i=1;i<=Whitelist_IP_Count;i++) {
			
			String Ip_Address = Channel_data.get("Whitelist IP Address " + i);
			
			Whitelist_IP_Addresses_Input_Field.sendKeys(Ip_Address);
			Whitelist_IP_Addresses_Input_Field.sendKeys(Keys.ENTER);
			
			System.out.println("Whitelist IP Address " + i + ": " + Ip_Address);}}
	
	if(Access_Rule.contains("Allow access from any IP address")){
		
		WebElement Allow_Any_Ip= p.Allow_Any_IP_Radio_Button();
		rp.movetoelement(Allow_Any_Ip);
		Allow_Any_Ip.click();}
	
	WebElement Submit_Button = p.Next_Button();
	Submit_Button.click();
	WebElement Generate_Button= p.Generate_API_Token_Button();
	rp.movetoelement(Generate_Button);
	Generate_Button.click();
	WebElement ClientIdLabel= p.CLient_Id_Label();
	WebElement Client_Id_Label_Value = ClientIdLabel.findElement(By.xpath("./../..//input"));
	rp.wait_for_theElement(Client_Id_Label_Value);
	String Client_Id = Client_Id_Label_Value.getAttribute("value");
	System.out.println("Client_Id : " + Client_Id);
	System.out.println();
	WebElement API_Mail_Input = p.API_Contact_Mail_input();
	API_Mail_Input.sendKeys(API_Contact_Mail);
	p.Done_Button().click();
	WebElement Confirmation_Message = p.Success_Toast();
	String Confirmation_Message_Text = Confirmation_Message.getText().trim();

	Report_Listen.log_print_in_report().pass("✅ Confirmation Message: " + Confirmation_Message_Text);
	System.out.println("✅ Confirmation message displayed: " + Confirmation_Message_Text);
	System.out.println();

	Report_Listen.log_print_in_report().pass("✅ Channel creation completed successfully for Product: " + Channel_Name);
	System.out.println("✅ Channel creation completed successfully for Product: " + Channel_Name);
	System.out.println();
	List<WebElement> Card_texts=p.First_channel_card_text_in_list();
	boolean Channel_Found = false;
	for(WebElement Card_text:Card_texts){
		
		String Text = Card_text.getText().trim();
		Channel_Found = Text.contains(Channel_Name) ? true : Channel_Found;
		
	}

	String Verification_Message = Channel_Found ? "✅ Newly created Channel found in the Channel list: " + Channel_Name : "❌ Newly created Channel was not found in the Channel list: " + Channel_Name;

	Report_Listen.log_print_in_report().log(Channel_Found ? Status.PASS : Status.FAIL, Verification_Message);
	System.out.println(Verification_Message);
	System.out.println();

	
}

@Test(dataProvider="FAQ_Section_Create_Data")
public void Patient_Portal_FAQ_Add(TreeMap<String, String> FAQ_data) throws Exception{
	
	Channel_Module_Locaters p = new Channel_Module_Locaters(d);
	Repeat rp = new Repeat(d);
	JavascriptExecutor js = (JavascriptExecutor)d;
	
	String Group_Title=FAQ_data.get("Group Name");
	String Group_Description=FAQ_data.get("Group Description");
	
	Channel_Module_Accessor();
	WebElement Patient_portal_section_in_list = p.Patient_Portal_section();
	rp.Scroll_to_element(Patient_portal_section_in_list);
	Thread.sleep(500);
	
	List<WebElement> Buttons = Patient_portal_section_in_list.findElements(By.xpath(".//button[contains(@class,'ant-btn-variant-outlined')]"));
	rp.wait_for_theElement(Buttons);
	WebElement Config_Button=Buttons.get(0);
	Config_Button.click();
	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(d).withTimeout(Duration.ofSeconds(80)).pollingEvery(Duration.ofMillis(500)).ignoring(NoSuchElementException.class).ignoring(StaleElementReferenceException.class);
    WebElement Form = wait.until(driver -> p.Form());
	WebElement Treatment_Management_Section = p.Treatment_management_Section();
	rp.wait_for_theElement(Treatment_Management_Section);
	rp.Scroll_to_element(Treatment_Management_Section);
	rp.Scroll_up();
	Thread.sleep(500);
	List<WebElement> Cards = Treatment_Management_Section.findElements(By.xpath(".//*[contains(@class,'ant-typography text-dark')]/../../.."));
	rp.wait_for_theElement(Cards);
	for(WebElement Card:Cards){
    	 WebElement Card_Text_element=Card.findElement(By.xpath(".//*[contains(@class,'ant-typography text-dark')]"));
    	 rp.wait_for_theElement(Card_Text_element);
    	 String Card_Text=Card_Text_element.getText().trim();
    	 if(Card_Text.contains("Treatment FAQs")){
    		 WebElement Toggle_Button=Card.findElement(By.xpath(".//button"));
    		 rp.wait_for_theElement(Toggle_Button);
    		 rp.Scroll_to_element(Toggle_Button);
    		 Thread.sleep(500);
    		 Toggle_Button.click();
    		 break; }}
	FluentWait<WebDriver> newwait = new FluentWait<WebDriver>(d).withTimeout(Duration.ofSeconds(80)).pollingEvery(Duration.ofMillis(500)).ignoring(NoSuchElementException.class).ignoring(StaleElementReferenceException.class);
    WebElement Popup_Frm= newwait.until(driver -> p.Popup_Form());
	List<WebElement> input_fields=p.FAQ_Add_Form_Inputs(Popup_Frm);
	WebElement GroupName_input = input_fields.get(0);
	WebElement Group_Description_input = input_fields.get(1);
	
	GroupName_input.clear();
	GroupName_input.sendKeys(Group_Title);
	Group_Description_input.clear();
    js.executeScript("const el=arguments[0]; const value=arguments[1]; const setter=Object.getOwnPropertyDescriptor(HTMLTextAreaElement.prototype,'value').set; setter.call(el,value); el.dispatchEvent(new Event('input',{bubbles:true})); el.dispatchEvent(new Event('change',{bubbles:true}));", Group_Description_input, Group_Description);
	
	ArrayList<String> Questions = new ArrayList<String>();
	ArrayList<String> Answers = new ArrayList<String>();
	
	int Question_Answer_Count = 0;
	
	for(String Key : FAQ_data.keySet()){
		if(Key.contains("Question ")){
			Question_Answer_Count++;
		}
	}
	
	for(int b=1;b<=Question_Answer_Count;b++){
		Questions.add(FAQ_data.get("Question " + b));
		Answers.add(FAQ_data.get("Answer " + b));
	}
	
	for(int k=1;k<Question_Answer_Count;k++){
		WebElement Add_Question_Button = p.Add_Question_Button();
		rp.Scroll_to_element(Add_Question_Button);
		Add_Question_Button.click();
	}
	
	List<WebElement> All_Question_input = p.All_Question_fields();
	List<WebElement> All_Answers_input = p.All_Answers_fields();
	
	for(int m=0;m<Question_Answer_Count;m++){
		
		WebElement Questioninput = All_Question_input.get(m);
		Questioninput.clear();
		WebElement Answerinput = All_Answers_input.get(m);
		Answerinput.clear();
		String Input_question = Questions.get(m);
		String Input_Answer = Answers.get(m);
		
		js.executeScript("const el=arguments[0]; const value=arguments[1]; const setter=Object.getOwnPropertyDescriptor(HTMLInputElement.prototype,'value').set; setter.call(el,value); el.dispatchEvent(new Event('input',{bubbles:true})); el.dispatchEvent(new Event('change',{bubbles:true}));", Questioninput, Input_question);
		
		js.executeScript("const el=arguments[0]; const value=arguments[1]; const setter=Object.getOwnPropertyDescriptor(HTMLTextAreaElement.prototype,'value').set; setter.call(el,value); el.dispatchEvent(new Event('input',{bubbles:true})); el.dispatchEvent(new Event('change',{bubbles:true}));", Answerinput, Input_Answer);
		
		System.out.println("✅ Question " + (m+1) + " and Answer " + (m+1) + " entered successfully.");
	}
	
   WebElement Modal_Save_Button = p.Save_Button();
   rp.Scroll_to_element(Modal_Save_Button);
   Modal_Save_Button.click();
   WebElement Save_Settings=p.Save_Settings_Button();
   Save_Settings.click();
   WebElement Confirmation_Message = p.Success_Toast();
	String Confirmation_Message_Text = Confirmation_Message.getText().trim();

	Report_Listen.log_print_in_report().pass("✅ Confirmation Message: " + Confirmation_Message_Text);
	System.out.println("✅ Confirmation message displayed: " + Confirmation_Message_Text);
	System.out.println();
    Report_Listen.log_print_in_report().pass("✅ Paiteint Portal Saved successfully for Product: ");
	System.out.println("✅Paiteint Portal Saved successfully ");
	System.out.println();
}	





}
