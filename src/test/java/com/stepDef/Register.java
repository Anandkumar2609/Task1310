package com.stepDef;

import org.openqa.selenium.WebDriver;
import com.baseclass.RegisterBase;
import com.pageObj.Pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register extends RegisterBase {
	WebDriver driver;
	Pages p;

	@Given("Enter into demoWebShop")
	public void enter_into_demo_web_shop() {
		driver = launchbrowser();
		p = new Pages(driver);
		openurl("https://demowebshop.tricentis.com/");
		maxi();
		impWait(10);
	}

	@When("Click register icon")
	public void click_register_icon() {
		tap(p.getRegister());
	}
	
	@When("Enter personal details")
	public void enter_personal_details() {
		tap(p.getGender());
		send(p.getFirstname(), "Anand");
		send(p.getLastname(), "Kumar");
		send(p.getEmail(), "akashanand2609@gmail.com");
		send(p.getPassword(), "Anand@2609");
		send(p.getConfirmpassword(), "Anand@2609");
	}

	 @Then("Click register button and continue")
	 public void click_register_button_and_continue() {
		    tap(p.getSave());
	 }
	 @When("Click login button")
		public void click_login_button() {
		   tap(p.getLogin());
		}

		@When("Enter the credentials and login")
		public void enter_the_credentials_and_login() {
			send(p.getEmail(), "akashanand2609@gmail.com");
			send(p.getPassword(), "Anand@2609");
			tap(p.getLoginMail());
		}


}
