package com.automaiton.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.qa.base.TestBase;

public class LoginPage extends TestBase {

	// page factory

	@FindBy(name = "email")
	WebElement email;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//button[contains(text(),'Login')]")
	WebElement LoginBtn;

	@FindBy(xpath = "//button[contains(text(),'Sign Up')]")
	WebElement SignUpBtn;

	// initializing page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	public HomePage login(String ur , String pwd) {
		email.sendKeys(ur);
		password.sendKeys(pwd);
		LoginBtn.sendKeys(Keys.ENTER);
		
		return new HomePage();
		
	}

}
