package com.AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectclass6 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[.='Create new account']")).click();
		Thread.sleep(1000);
		
		WebElement daylist = driver.findElement(By.cssSelector("#day"));
		Select ms=new Select(daylist);
		ms.selectByIndex(7);
		
		WebElement monthlist = driver.findElement(By.cssSelector("#month"));
		Select msn=new Select(monthlist);
		msn.selectByValue("5");
		
		WebElement yearlist = driver.findElement(By.cssSelector("#year"));
		Select msne=new Select(yearlist);
		msne.selectByVisibleText("2018");
		
		
		

	}

}
