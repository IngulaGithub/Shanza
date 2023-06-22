package com.AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keys3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		//driver.findElement(By.id("username")).sendKeys("admin");
		//WebElement data = driver.findElement(By.name("pwd"));-----------1
		//data.sendKeys("manager");
		//data.sendKeys(Keys.ENTER);
		
		//driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);-------------2
		
		//driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);-------3
		
		//checking checkbox
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.SPACE);

	}

}
