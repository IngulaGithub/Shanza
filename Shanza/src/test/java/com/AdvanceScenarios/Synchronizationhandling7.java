package com.AdvanceScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronizationhandling7 {

public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		
		//explicitly wait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
		 
		 //syntax
		/* FluentWait wait=new FluentWait(driver);
		    wait.pollingEvery(Duration.ofSeconds(20));	
		    wait.until(ExpectedConditions.elementToBeClickable(Element));*/
	}

}
