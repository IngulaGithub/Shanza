package com.Popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windownaukri {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		WebElement data = driver.findElement(By.xpath("//a[@title='Search Jobs']"));
		Actions act=new Actions(driver);
		act.moveToElement(data).perform();
		driver.findElement(By.xpath("//div[.='Jobs by skill']")).click();
		driver.findElement(By.xpath("//div[.='Services']")).click();
		Set<String> me = driver.getWindowHandles();
		for(String you:me)
		{
			driver.switchTo().window(you);
			String y = driver.getTitle();
			System.out.println(y);
			if(y.contains("Resume"))
			{
				break;
			}
		}
		Set<String> me1 = driver.getWindowHandles();
		for(String you:me1)
		{
			driver.switchTo().window(you);
			String y = driver.getTitle();
			System.out.println(y);
			if(y.contains("Browse Jobs"))
			{
				break;
			}
		}

	}

}
