package com.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements5 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		//xpath by contains Attribute
		WebElement font = driver.findElement(By.xpath("//img[contains(@class,'vu img')]"));
		//cssValue (WebElement)
		String data = font.getCssValue("font-size");
		System.out.println(data);
		WebElement value = driver.findElement(By.xpath("//input[@name='email']"));
		String data1 = value.getCssValue("color");
		System.out.println(data1);
		
		
		
		
		driver.get("https://demo.actitime.com/login.do");
		WebElement UN = driver.findElement(By.id("username"));
		UN.sendKeys("admin");
		UN.clear();
		Thread.sleep(1000);
		// UN.clear();
		//isdisplayed()
		WebElement data2 = driver.findElement(By.xpath("//div[@class='atLogoImg']"));
		if(data2.isDisplayed())
		{
		System.out.println("logo is displayed");
		}
		else
		{
		System.out.println("logo is not displayed");
		}
		//isenabled()
		WebElement data3 = driver.findElement(By.id("username"));
		if(data3.isEnabled())
		{
		data3.sendKeys("admin");
		}
		else
		{
		System.out.println("not enabled");
		}
		//isSelected()
		WebElement data4= driver.findElement(By.xpath("//input[@type='checkbox']"));
		data4.click();
		if(data4.isSelected())
		{
		System.out.println("checkbox selected");
		}
		else
		{
		System.out.println("checkbox not selected");
		}
		
		}

}
