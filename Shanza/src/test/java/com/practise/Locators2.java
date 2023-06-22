package com.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) throws Throwable  {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("admin"); //Locators using id()
		driver.findElement(By.name("pwd")).sendKeys("manager");  //Locators using name()
		driver.findElement(By.className("initial")).click();     //Locators using classname()
		
		Thread.sleep(1000);
		driver.findElement(By.linkText("View Time-Track")).click();  //Locators using Linktext()
		driver.findElement(By.partialLinkText("Lock Time")).click();  //Locators using partiallinktext)

	}

}
