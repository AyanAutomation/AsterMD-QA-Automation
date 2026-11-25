package Cucumber.Step.Definition.Java.Classes;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Locaters.Login_Locaters;
import io.cucumber.java.en.Given;

public class Cucumber_Login {

	@Given("Cucumber Positive login")
	public void login_by_cucumber() throws IOException {
		WebDriver d = Base_Cucumber.d;
		String url = Base_Cucumber.Target_url;
		Login_Locaters lg = new Login_Locaters(d);
		Data_Fetcher_Cucumber f = new Data_Fetcher_Cucumber();
		String Login_id = f.Data_Fetcher("Login_id");
		String Pass = f.Data_Fetcher("Pass");

		d.get(url);
		lg.Landed_in_Login_Page();
		WebElement Login_ID_Field = lg.id_field();
		Login_ID_Field.sendKeys(Login_id);
		WebElement Password_Field = lg.password_field();
		Password_Field.sendKeys(Pass);
		WebElement Login_Button = lg.Login_button();
		Login_Button.click();
		lg.login_confirmation();
	}
}
