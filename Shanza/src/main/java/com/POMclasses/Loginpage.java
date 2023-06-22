package com.POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	//initialization
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Declaration
	@FindBy(id="username")
	private WebElement Usernametextfield;
	
	@FindBy(name="pwd")
	private WebElement passwordtextfield;
	
	@FindBy(className="initial")
	private WebElement Loginbutton;

	//getter methods
	public WebElement getUsernametextfield() {
		return Usernametextfield;
	}

	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}

	public WebElement getLoginbutton() {
		return Loginbutton;
	}
	
	//Bussiness Logics
	public void Login(String username,String password) 
	{
		Usernametextfield.sendKeys(username);
		passwordtextfield.sendKeys(password);
		Loginbutton.click();
		
	}
	
	
	
	

}
