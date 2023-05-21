package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	WebDriver hpdriver;
	
	
	public homepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.hpdriver = driver;
	
	}
	
	@FindBy(xpath = "//input[@name='username']")
	WebElement un;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement pw;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submit;

	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
	WebElement forgotpw;

	public DashBoardPage login_to_app_using_correct_credentials() {
		un.sendKeys("Admin");
		pw.sendKeys("admin123");
		submit.click();
		return new DashBoardPage(hpdriver);

	}
	
	public void click_on_forgot_pw() {
		forgotpw.click();
	}
	
	
}
