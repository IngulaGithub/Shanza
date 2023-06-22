package com.Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {

	public static void main(String[] args) throws Throwable  {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
        
		WebElement data = driver.findElement(By.xpath("//div[contains(@class,'popup_menu_button popup_menu_button_se')]"));
		Thread.sleep(1000);
		data.click();
		driver.findElement(By.xpath("//a[.='Types of Work']")).click();
		
		driver.findElement(By.xpath("//span[.='Create Type of Work']")).click();
		driver.findElement(By.cssSelector("#name")).sendKeys("nyle");
		driver.findElement(By.xpath("//input[@value='      Cancel      ']")).click();
		
		Alert alt = driver.switchTo().alert();
		//alt.accept();
		alt.dismiss();

	}

}
