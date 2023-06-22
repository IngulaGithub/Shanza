package com.AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestionsandalsosvg2{

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		  driver.findElement(By.xpath("//button[.='✕']")).click();
		  
		  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("puma");
		  List<WebElement> data = driver.findElements(By.tagName("li")); 
		  for(WebElement wb:data) 
		  {
		//or we can write sop here //System.out.println(wb.getText());
		  if(wb.getText().contains(" slippers men")) 
		  {
		  System.out.println(wb.getText()); 
		  Thread.sleep(1000); 
		  wb.click(); 
		  break; 
		 } 
		  }*/
		  
		  driver.get("https://www.google.com/");
		  driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[name()='svg' and @class='gb_h']")).click();

	}

}
