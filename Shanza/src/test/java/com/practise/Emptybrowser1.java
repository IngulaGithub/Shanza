package com.practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Emptybrowser1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		
		//launching the URL
		driver.get("https://www.flipkart.com/");
		
		//maximize screen
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//minimize screen
		driver.manage().window().minimize();
		
		//printing the title of the WebPage
		String data = driver.getTitle();
		System.out.println(data);
		
		//prints current URL of the Application
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		//prints sourcecode of the page
		String source = driver.getPageSource();
		System.out.println(source);
		//close method closes the current focusing window
		// driver.close();
		
		//closes all the windows
		driver.quit();

	}

}
