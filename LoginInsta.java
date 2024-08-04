package com.insta.pagaobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginInsta {
	
	WebDriver ldriver;
	public LoginInsta(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@CacheLookup
	@FindBy(xpath = "//input[@name='username']")
	WebElement username;

	@CacheLookup
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	@CacheLookup
	@FindBy(xpath = "//button[contains(@class,' _acan _acap _acas _aj1- _ap30')]")
	WebElement loginbtn;

	public void setusername(String mail) {
		username.sendKeys(mail);
	}

	public void setpassword(String psd) {
		password.sendKeys(psd);
	}

	public void clickbtn() {
		loginbtn.click();
	}
}
