
package com.AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass5 {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
		

  /*driver.get("https://www.flipkart.com/"); 
  driver.findElement(By.xpath("//button[.='✕']")).click();
  WebElement data = driver.findElement(By.xpath("//div[text()='Fashion']"));
  Actions act=new Actions(driver);
   act.moveToElement(data).perform();
  act.contextClick(data).perform(); //rightclick of mouse */
 


    /*driver.get("https://demo.guru99.com/test/simple_context_menu.html ");
    driver.manage().window().maximize(); 
    WebElement data1=driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
    Actions act=new Actions(driver); 
    act.doubleClick(data1).perform();*/
 
 


  /*driver.get("https://jqueryui.com/resources/demos/droppable/default.html ");
  driver.manage().window().maximize(); 
  WebElement drag =driver.findElement(By.cssSelector("[id='draggable']")); 
  WebElement drop =driver.findElement(By.cssSelector("[id='droppable']")); 
  Actions act=new Actions(driver); 
  //act.dragAndDrop(drag, drop).perform();
  act.clickAndHold(drag).perform();
  act.release(drop).perform();*/
 
 
	
	  driver.get("https://demo.actitime.com/login.do") ;
	  driver.manage().window().maximize(); 
	  WebElement id =driver.findElement(By.id("username")); 
	  WebElement pwd =driver.findElement(By.name("pwd")); 
	  Actions act=new Actions(driver); 
	  //act.sendKeys(id, "admin").perform(); 
	  //act.sendKeys(pwd,"manager").perform();
	  act.sendKeys(id, "admin").sendKeys(pwd, "manager").build().perform();
	 
		  
	}

}
