package com.practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Dummy {
@Test
	public void dummy() throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin"); 
		driver.findElement(By.name("pwd")).sendKeys("manager");  
		driver.findElement(By.className("initial")).click();
		 Thread.sleep(1000);
		driver.findElement(By.linkText("View Time-Track")).click();
       
        driver.findElement(By.linkText("Enter Time-Track")).click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
        driver.findElement(By.linkText("Lock Time-Track")).click();
        driver.findElement(By.xpath("//a[@href='/administration/approve_tt.do']")).click();

	}

}
