package com.ohrms.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
	
	
	@CacheLookup
	@FindBy(name = "txtUsername")
	private WebElement username;

	@FindBy(name = "txtPassword")
	private WebElement password;
	
	@FindBy(name = "Submit")
	private WebElement login;
	
	public LoginPage (WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void logintoapplication(String username,String password) {
		elementcontrol.settext(this.username, username);
		elementcontrol.settext(this.password, password);
		elementcontrol.clickElement(login);
		
	}
}
