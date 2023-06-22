package com.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allelements {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//WebElement font = driver.findElement(By.xpath("//img[contains(@class,'fb_logo ')]"));
		WebElement font = driver.findElement(By.cssSelector("#email"));
		System.out.println(font.getCssValue("font-size"));
		System.out.println(font.getCssValue("color"));
		System.out.println(font.getSize());
		System.out.println(font.getLocation());
		System.out.println(font.getTagName());
		System.out.println(font.getAccessibleName());
		System.out.println(font.getAriaRole());
		System.out.println(font.getAttribute("class"));
		if(font.isDisplayed())
		{
			System.out.println("i am there");
		}
	    Rectangle data = font.getRect();
		System.out.println(data.getHeight());
		System.out.println(data.getWidth());
		System.out.println(data.getX());
		System.out.println(data.getY());
		System.out.println(data.getPoint());
		System.out.println(data.getDimension());
		
		System.out.println(font.getDomAttribute("class"));
		System.out.println(font.getDomProperty("class"));
		if(font.isEnabled())
		{
		font.sendKeys("addyyy");
		font.clear();
		font.sendKeys("admin");
		}
		else
		{
			System.out.println("noooooooo");
		}
		
}

}
