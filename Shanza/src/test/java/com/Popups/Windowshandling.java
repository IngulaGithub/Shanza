package com.Popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Windowshandling {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Open New Seperate Windows']")).click();
		driver.findElement(By.xpath("//button[.='click']")).click();
		Thread.sleep(10000);
		Set<String> set = driver.getWindowHandles();
		for(String string:set)
		{
			driver.switchTo().window(string);
			String title = driver.getTitle();
			System.out.println(title);
			Thread.sleep(5000);
			if(title.contains("Selenium"))
			{
				break;
			}
		}
		
		driver.findElement(By.xpath("//a[text()='Watch the Videos']")).click();
		
		
		  Set<String> set1 = driver.getWindowHandles(); 
		  for(String string:set1) 
		  {
		  driver.switchTo().window(string); 
		  String title = driver.getTitle();
		  System.out.println(title); 
		  if(title.contains("Frames")); 
		  { 
			  break; 
	      } 
		  }
		 
	}

}
