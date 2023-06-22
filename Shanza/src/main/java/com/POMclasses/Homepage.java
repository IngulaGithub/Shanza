package com.POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "View Time-Track")
	private WebElement Viewtimetracklink;
	
	@FindBy(linkText = "Enter Time-Track")
	private WebElement EnterTimeTracklink;
	
	@FindBy(linkText = "Lock Time-Track")
	private WebElement LockTimeTracklink;
	
	@FindBy(xpath = "//a[@href='/administration/approve_tt.do']")
	private WebElement Approvetimetracklink;

	public WebElement getViewtimetracklink() {
		return Viewtimetracklink;
	}

	public WebElement getEnterTimeTracklink() {
		return EnterTimeTracklink;
	}

	public WebElement getLockTimeTracklink() {
		return LockTimeTracklink;
	}

	public WebElement getApprovetimetracklink() {
		return Approvetimetracklink;
	}
	
	public void view()
	{
		Viewtimetracklink.click();
	}
	public void enter()
	{
		EnterTimeTracklink.click();
	}
	public void lock()
	{
		LockTimeTracklink.click();
	}
	public void approve()
	{
		Approvetimetracklink.click();
	}
	

}
