package com.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		//cssSelector using id() [AttributeName='AttributeValue']
		// driver.findElement(By.cssSelector("[id='username']")).sendKeys("admin");
		//driver.findElement(By.cssSelector("#username")).sendKeys("admin");
		
		// htmltag[AttributeName='AttributeValue']
		// driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
		
		//cssSector using classname()
		//[AttributeName='AttributeValue']
		//driver.findElement(By.cssSelector("[class='textField pwdfield']")).sendKeys("manager");
		// driver.findElement(By.cssSelector(".pwdfield")).sendKeys("manager");
		
		// htmltag[AttributeName='AttributeValue']
		// driver.findElement(By.cssSelector("input[class='textField pwdfield']")).sendKeys("manager");
		driver.findElement(By.cssSelector("input.pwdfield")).sendKeys("manager");

	}

}
