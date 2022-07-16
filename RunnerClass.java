package com.facebooklogin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v100.browser.Browser;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RunnerClass extends BaseClass {
	
	@Given("user must launch the facebook")
	public void user_must_launch_the_facebook() {
		browser("https://www.facebook.com/login/");
	    
	}

	@When("use must enters username and password")
	public void use_must_enters_username_and_password() {
		FaceBookPOM fb=new FaceBookPOM();
		WebElement username = fb.getUsername();
		WebElement password = fb.getPassword();
		enterText(username, "dini");
		enterText(password, "212345");
	    
	}

	@And("user click the login button")
	public void user_click_the_login_button() {
	    
	}

	@Then("user validates the home page")
	public void user_validates_the_home_page() {
	    
	}

}
