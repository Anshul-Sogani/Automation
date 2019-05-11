package com.automation.qa.test;

import com.automaiton.qa.pages.HomePage;
import com.automaiton.qa.pages.LoginPage;
import com.automation.qa.base.TestBase;

import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest extends TestBase {
	
	HomePage homepage;

	LoginPage loginpage;

	public LoginTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		loginpage = new LoginPage();
	}

	@Test(priority = 2)
	public void LoginPageTitleTest() {
		String Title = loginpage.validateLoginPageTitle();
		Assert.assertEquals(Title, "CRM");
	}

	@Test(priority = 1)
	public void loginTest() {
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
