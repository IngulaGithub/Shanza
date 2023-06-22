package com.practise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		
		
		WebElement Beauty = driver.findElement(By.xpath("//div[text()='Beauty, Toys & More']"));
		
		Actions act=new  Actions(driver);
		act.moveToElement(Beauty).perform();
		WebElement Books =driver.findElement(By.xpath("//a[text()='Books']"));
	    act.moveToElement(Books).perform();
		  driver.findElement(By.xpath("//a[text()='Academics']")).click();
		  
		  JavascriptExecutor jse=(JavascriptExecutor)driver;
		  for(int i=0;i<2;i++)
		  {
			jse.executeScript("window.scrollBy(0,200)") ;
		  }
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//div[text()='Class 11 Books']")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//a[text()='Biology Simplified Ncert Class Xi']")).click();
		  Set<String> allwin = driver.getWindowHandles();
		  Iterator<String> id = allwin.iterator();
		  while(id.hasNext())
		  {
			  driver.switchTo().window(id.next());
			  String title = driver.getTitle();
			  if(title.contains("Biology Simplified Ncert Class Xi"))
			  {
				  break;
			  }
		  }
		  driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		  Thread.sleep(1000);
		  driver.close();
          
		  Set<String> allwinn = driver.getWindowHandles();
		  for(String idd:allwinn)
		  {
			  driver.switchTo().window(idd);
			  String titlee = driver.getTitle();
			  if(titlee.contains("Class 11"))
			  {
				  break;
			  }
		  }
		  driver.findElement(By.xpath("//a[text()='CBSE Chapterwise Notes-Class 11']")).click();
		  Set<String> allwin1 = driver.getWindowHandles();
		  Iterator<String> id1 = allwin1.iterator();
		  while(id1.hasNext())
		  {
			  driver.switchTo().window(id1.next());
			  String title1 = driver.getTitle();
			  System.out.println(title1);
			  if(title1.contains("CBSE Chapterwise Notes"))
			  {
				  break;
			  }
		  }
		  driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		  Thread.sleep(1000);
		  driver.close();
		  Set<String> allwinn1 = driver.getWindowHandles();
		  for(String idd1:allwinn1)
		  {
			  driver.switchTo().window(idd1);
			  String titlee1 = driver.getTitle();
			  if(titlee1.contains("Class 11"))
			  {
				  break;
			  }
		  }
		 
		  driver.findElement(By.xpath("//a[.='Cart']")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("(//div[text()='Remove'])[last()-1]")).click();
		  driver.findElement(By.xpath("(//div[.='Remove'])[1]")).click();
		
		

	}

}
