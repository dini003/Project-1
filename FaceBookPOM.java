package com.facebooklogin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class FaceBookPOM extends BaseClass {

	public FaceBookPOM() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement username;
	 
	@FindBy(id="pass")
	private WebElement password;
		
 
	public WebElement getUsername() {
		return username;
	}

	public void setUsername(WebElement username) {
		this.username = username;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getLogin() {
		return login;
	}

	public void setLogin(WebElement login) {
		this.login = login;
	}
	@FindBy(name="login")
	private WebElement login;
		

	}

	