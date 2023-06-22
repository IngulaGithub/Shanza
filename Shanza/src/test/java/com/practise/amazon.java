package com.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class amazon {

	@Test
	public void amaz() throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ ");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Fashion")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Watches")).click();
		driver.findElement(By.cssSelector("[class='sl-sobe-carousel-sub-card-footer']")).click();
		String Price=driver.findElement(By.cssSelector("[class='a-price-whole']")).getText();
		System.out.println(Price);
		
			}

}
