package com.AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingmultipleelements1 {

	public static void main(String[] args) {
		  WebDriver driver=new ChromeDriver();
          driver.get("https://www.flipkart.com/");
          driver.manage().window().maximize();
          driver.findElement(By.xpath("//button[.='✕']")).click();
          List<WebElement> ad = driver.findElements(By.xpath("//a"));
          int count=0;
          for( WebElement wb:ad)
          {
       	   System.out.println(wb.getText());
       	   count++;
          }
          System.out.println("Total no of links:"+count);

	}

}
