package com.AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {

	public static void main(String[] args) throws Throwable {
		
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.google.com/");           //--------1
			driver.manage().window().maximize();
			driver.findElement(By.cssSelector("[class='gLFyf']")).sendKeys("selenium");
			Thread.sleep(1000);
			List<WebElement> data = driver.findElements(By.tagName("li"));
			for(WebElement wb:data)
			{
				if(wb.getText().contains("m testing"))
				{
					System.out.println(wb.getText());
					Thread.sleep(1000);
					wb.click();
					break;
				}
			}
			
			/*driver.get("https://www.amazon.in/");      //-------2
			driver.manage().window().maximize();
			driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("bluetooth");
			Thread.sleep(2000);
			List<WebElement> data1 = driver.findElements(By.xpath("//div[@class='autocomplete-results-container']/child::div"));
			for(WebElement wb:data1)
			{
				Thread.sleep(2000);
			if(wb.getText().contains(" earphones wireless"))	
			{
				System.out.println(wb.getText());
				Thread.sleep(2000);
				wb.click();
				break;
			}
			}*/
			
			
			/*driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.name("q")).sendKeys("selenium");
			Thread.sleep(2000);
			List<WebElement> list = driver.findElements(By.tagName("li"));
			for(WebElement wb:list)
			{
			if(wb.getText().contains("m testing"))
			{
			System.out.println(wb.getText());
			Thread.sleep(1000);
			wb.click();
			break;
			}
			}*/

	}

}
