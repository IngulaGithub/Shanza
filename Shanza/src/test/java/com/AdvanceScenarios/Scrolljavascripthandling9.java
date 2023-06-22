package com.AdvanceScenarios;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Scrolljavascripthandling9 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		 
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(int i=0;i<3;i++)
		{
			js.executeScript("window.scrollBy(0,800)");
		}
		Thread.sleep(2000);
		for(int i=0;i<3;i++)
		{
			js.executeScript("window.scrollBy(0,-800)");
		}
		
		

	}

}
